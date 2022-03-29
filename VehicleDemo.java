// Machine Exercise 2
// authors:
// Brymer Meneses
// James Soldao

package me2;

public class VehicleDemo {
  public static void main(String args[]) {
    Vehicle av = new AirVehicle();

    av.whoamI();
    av.portArea();
    av.makeSound();
    System.out.println(av.getColor());
    av.separator();

    Vehicle lv = new LandVehicle();
    lv.whoamI();
    lv.portArea();
    lv.makeSound();
    lv.separator();

    LandVehicle lvs = new SUV();
    lvs.setName("Bumblebee");
    lvs.setColor("yellow");
    lvs.setModel("Toyota");
    ((SUV) lvs).setEngineType("manual");

    lvs.whoamI();
    lvs.portArea();
    lvs.makeSound();

    System.out.println(lvs.getName());
    System.out.println(lvs.getColor());
    System.out.println(lvs.numOfWheels());
    System.out.println(lvs.getModel());
    System.out.println(((SUV) lvs).getEngineType());

    LandVehicleTester lvt = new LandVehicleTester();
    System.out.println("Starting engine...");
    lvt.startEngine(lvs);
    lvs.separator();

    Motorcycle lvm = new Motorcycle();

    lvm.setName("Mike");
    lvm.setColor("black");
    lvm.setModel("Harley-davidson");

    lvm.whoamI();
    lvm.portArea();

    System.out.println(lvm.getName());
    System.out.println(lvm.getColor());
    System.out.println(lvm.numOfWheels());
    System.out.println(lvm.getModel());
    System.out.println("Starting engine...");
    lvt.startEngine(lvm);
  }
}
