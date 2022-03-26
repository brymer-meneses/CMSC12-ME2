package me2;

public class AirVehicle extends Vehicle {

  public AirVehicle() {
    setColor("white");
  }

  public void makeSound() {
    System.out.println("whoosh");
  }

  public void portArea() {
    System.out.println("airport");
  }

  public void whoamI() {
    System.out.println(" I am class Air Vehicle");
  }
}
