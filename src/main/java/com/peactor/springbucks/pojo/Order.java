package com.peactor.springbucks.pojo;

import javax.persistence.*;
import java.util.List;

/**
 * @ClassName Order
 * @Author Ifan
 * @Date 20-1-20
 **/
@Table(name = "order")
public class Order extends BaseEntity {

    private String customer;

    @ManyToMany
    @JoinTable(name = "order_coffee")
    @OrderBy("id")
    private List<Coffee> items;

    @Enumerated
    @Column(nullable = true)
    private OrderState state;

    public enum OrderState {
        INIT, PAID, BREWING, BREWED, TAKEN, CANCELLED
    }
}
