package model;

public class HealerClass extends StartingClass implements BasicClassesInterface{
    public HealerClass() {

        System.out.println("Creating a Healer.");
    }

    @Override
    public void basicAttack() {
        System.out.println("Healer has attacked.");
    }

    @Override
    public void basicParry() {
        System.out.println("Healer has parried.");
    }

    @Override
    public void basicDefense() {
        System.out.println("Healer has defended.");
    }
}
