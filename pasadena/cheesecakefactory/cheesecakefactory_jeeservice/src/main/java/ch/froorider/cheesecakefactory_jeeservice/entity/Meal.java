package ch.froorider.cheesecakefactory_jeeservice.entity;

public class Meal{

private String name;
private String description;
private int price;
private uuid identifier;

public Meal(){
}

public Meal(name, description, price){
    this.name = name;
    this.description = description;
    this.price = price;
    this.identifier = new UUID();
}
}