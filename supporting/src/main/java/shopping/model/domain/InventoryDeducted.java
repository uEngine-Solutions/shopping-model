package shopping.model.domain;

import shopping.model.domain.*;
import shopping.model.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class InventoryDeducted extends AbstractEvent {

    private Long id;
    private String name;
    private Long qty;

    public InventoryDeducted(Product aggregate){
        super(aggregate);
    }
    public InventoryDeducted(){
        super();
    }
}
