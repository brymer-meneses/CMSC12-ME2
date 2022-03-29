// Machine Exercise 2
// authors:
// Brymer Meneses
// James Soldao

package me2;

public class LandVehicle extends Vehicle {
  private String model;
  private String name;

  // getters & setters
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void portArea() {
    System.out.println("land terminal");
  }

  public void makeSound() {
    System.out.println("zooomm");
  }

  public void whoamI() {
    System.out.println("I am class Land Vehicle");
  }

  public int numOfWheels() {
    return 0;
  }
}
