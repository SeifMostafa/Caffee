package com.azizax.justjava.model;

/**
 * Created by azizax on 17/11/17.
 */

public class Item {
    String name;
    float price;
    Category category;

    public Item(String name, float price,Category c) {
        this.name = name;
        this.price = price;
        this.category =c;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + ": " + price ;
    }
}
