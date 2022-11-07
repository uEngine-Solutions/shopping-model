package shopping.model.domain;

import shopping.model.domain.*;
import shopping.model.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ProductRegistered extends AbstractEvent {

    private Long id;
    private String name;
    private Long qty;

    public ProductRegistered( aggregate){
        super(aggregate);
    }
    public ProductRegistered(){
        super();
    }
}
