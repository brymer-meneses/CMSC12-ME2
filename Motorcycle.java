package me2;

public class Motorcycle extends LandVehicle{

  public int numOfWheels() {
    return 2;
  }

  public void makeSound() {
    System.out.println("brummm");
  }

  public void whoamI() {
    System.out.println("I am class Motorcycle");
  }
}
