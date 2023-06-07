package net.spring.demo.inventoryMGMTS;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Items{

    private int iID;
    private String iname;
    private int qty;
    private double price;
}