package me2;

abstract class Vehicle {
  private String color;

  // abstract methods
  public abstract void portArea();
  public abstract void makeSound();
  
  public abstract void whoamI();

  // getters & setters
  public void setColor(String color) {
    this.color = color;
  }
  public String getColor() {
    return this.color;
  }

  public final void separator() {
    System.out.println("+++++++++++++++++");
  }
}
