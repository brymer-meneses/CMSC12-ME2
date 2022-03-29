// Machine Exercise 2
// authors:
// Brymer Meneses
// James Soldao

package me2;

public class SUV extends LandVehicle {
  private String engineType;

  public void setEngineType(String engine) {
    engineType = engine;
  }

  public String getEngineType() {
    return engineType;
  }

  public int numOfWheels() {
    return 4;
  }

  public void makeSound() {
    System.out.println("vrooomm");
  }

  public void whoamI() {
    System.out.println("I am class SUV");
  }
}
