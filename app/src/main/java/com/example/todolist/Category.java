package com.example.todolist;

public class Category {

    private String name;
    private String description;

    public static final Category[] categories = {
            new Category("Life", "Water Flowers\nWalk the dog\nBuy groceries"),
            new Category("Work", "Call client\nAttent meeting")
    };


    private Category(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return this.name;
    }

}
