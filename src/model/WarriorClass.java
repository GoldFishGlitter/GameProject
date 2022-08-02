package model;

public class WarriorClass extends StartingClass implements BasicClassesInterface {
    int warriorBaseATK = 20;
    int warriorBaseHP = 150;
    int warriorBaseMP = 10;

    public WarriorClass(final String name) {

        super(name);
        System.out.println("Creating a Warrior.");
    }

    public WarriorClass() {

    }

    @Override
    public void basicAttack() {
        System.out.println("Warrior " + getName() + " has attacked.");
    }

    @Override
    public void basicParry() {
        System.out.println("Warrior " + getName() + " has parried.");
    }

    @Override
    public void basicDefense() {
        System.out.println("Warrior " + getName() + " has defended.");
    }
}