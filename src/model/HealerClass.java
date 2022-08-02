package model;

public class HealerClass extends MageClass{
    public HealerClass(final String name) {

        super(name);
        System.out.println("Creating a Healer.");
    }

    public HealerClass() {

    }

    @Override
    public void basicAttack() {
        super.basicAttack();
    }

    @Override
    public void basicDefense() {
        super.basicDefense();
    }

    @Override
    public void basicParry() {
        super.basicParry();
    }
}
