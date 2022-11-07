package shopping.model.external;

import lombok.Data;
import java.util.Date;
@Data
public class Order {

    private Long id;
    private String productId;
    private Integer qty;
    private String address;
    private String status;
    private String options;
}


