package ru.toofast.pizza.restaurant;

import com.google.common.collect.Lists;

import java.util.concurrent.CopyOnWriteArrayList;

public class Restaurant {

    public void servePizza(){

        CopyOnWriteArrayList<Object> objects = Lists.newCopyOnWriteArrayList();
        System.out.println(objects);
        System.out.println("Pizza baked");
    }

}
