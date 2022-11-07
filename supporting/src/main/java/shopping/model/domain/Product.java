package shopping.model.domain;

import shopping.model.domain.InventoryDeducted;
import shopping.model.domain.ProductRegistered;
import shopping.model.SupportingApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Product_table")
@Data

public class Product  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private Long qty;

    @PostPersist
    public void onPostPersist(){


        InventoryDeducted inventoryDeducted = new InventoryDeducted(this);
        inventoryDeducted.publishAfterCommit();



        ProductRegistered productRegistered = new ProductRegistered(this);
        productRegistered.publishAfterCommit();

    }

    public static ProductRepository repository(){
        ProductRepository productRepository = SupportingApplication.applicationContext.getBean(ProductRepository.class);
        return productRepository;
    }




    public static void deductStock(DeliveryStarted deliveryStarted){

        /** Example 1:  new item 
        Product product = new Product();
        repository().save(product);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(product->{
            
            product // do something
            repository().save(product);


         });
        */

        
    }


}
