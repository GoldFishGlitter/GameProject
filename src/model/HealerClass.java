package model;

public class HealerClass extends StartingClass implements BasicClassesInterface{
    public HealerClass(final String name) {

        super(name);
        System.out.println("Creating a Healer.");
    }

    public HealerClass() {

    }

    @Override
    public void basicAttack() {
        System.out.println("Healer " + getName() + " has attacked.");
    }

    @Override
    public void basicParry() {
        System.out.println("Healer " + getName() + " has parried.");
    }

    @Override
    public void basicDefense() {
        System.out.println("Healer " + getName() + " has defended.");
    }
}
