package model;

public class HealerClass extends MageClass{
    int healerBaseATK = 10;
    int healerBaseHP = 105;
    int healerBaseMP = 35;

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

    public void healSkill() {
        System.out.println(getName() + " has used the heal skill.");
    }
}
