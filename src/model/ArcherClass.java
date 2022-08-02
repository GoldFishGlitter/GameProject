package model;

public class ArcherClass extends StartingClass implements BasicClassesInterface{
    int archerBaseATK = 35;
    int archerBaseHP = 80;
    int archerBaseMP = 25;

    public ArcherClass(final String name) {

        super(name);
        System.out.println("Creating an Archer.");
    }

    public ArcherClass() {

    }

    @Override
    public void basicAttack() {
        System.out.println("Archer " + getName() + " has attacked.");
    }

    @Override
    public void basicParry() {
        System.out.println("Archer " + getName() + " has parried.");
    }

    @Override
    public void basicDefense() {
        System.out.println("Archer " + getName() + " has defended.");
    }
}
