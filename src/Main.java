import model.*;

public class Main {
    public static void main(String[] args) {
//        ArcherClass archer1 = new ArcherClass("Robin");
//        archer1.basicAttack();
//        WarriorClass warrior1 = new WarriorClass("Arthur");
//        warrior1.basicAttack();
//        archer1.basicParry();
//        WarriorClass warrior2 = new WarriorClass("Draco");
//        warrior1.basicAttack();
//        warrior2.basicDefense();

//        HealerClass healer1 = new HealerClass("Raphael");
//        healer1.basicAttack();

        BasicClassesInterface archer2 = new ArcherClass("Ryan");
        archer2.basicAttack();
        archer2 = new WarriorClass();
        archer2.basicDefense();
    }
}
