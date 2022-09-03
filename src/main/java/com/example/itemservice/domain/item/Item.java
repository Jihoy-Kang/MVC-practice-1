package com.example.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data // 데이터 애너테이션은 포함하고있는 기능이 많아서 예상치 못한 동작을 할 수도있어 위험함
public class Item {

    private long Id;
    private String itemName;
    private Integer price;
    private Integer quantity;


    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }


}
