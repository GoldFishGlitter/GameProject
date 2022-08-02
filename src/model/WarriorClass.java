package model;

public class WarriorClass implements BasicClassesInterface{
    public WarriorClass() {

        System.out.println("Creating a Warrior.");
    }

    @Override
    public void basicAttack() {
        System.out.println("Warrior has attacked.");
    }

    @Override
    public void basicParry() {
        System.out.println("Warrior has parried.");
    }

    @Override
    public void basicDefense() {
        System.out.println("Warrior has defended.");
    }
}
