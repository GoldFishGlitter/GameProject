package model;

public class ArcherClass implements BasicClassesInterface{
    public ArcherClass() {

        System.out.println("Creating an Archer.");
    }

    @Override
    public void basicAttack() {
        System.out.println("Archer has attacked.");
    }

    @Override
    public void basicParry() {
        System.out.println("Archer has parried.");
    }

    @Override
    public void basicDefense() {
        System.out.println("Archer has defended.");
    }
}
