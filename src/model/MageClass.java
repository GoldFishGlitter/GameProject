package model;

public class MageClass extends StartingClass implements BasicClassesInterface{
    int mageBaseATK = 10;
    int mageBaseHP = 95;
    int mageBaseMP = 40;

    public MageClass(final String name) {

        super(name);
        System.out.println("Creating a Mage.");
    }

    public MageClass() {

    }

    @Override
    public void basicAttack() {
        System.out.println("Mage " + getName() + " has attacked.");
    }

    @Override
    public void basicParry() {
        System.out.println("Mage " + getName() + " has parried.");
    }

    @Override
    public void basicDefense() {
        System.out.println("Mage " + getName() + " has defended.");
    }
}
