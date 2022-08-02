import model.*;

public class Main {
    public static void main(String[] args) {
        ArcherClass archer1 = new ArcherClass("Robin");
        archer1.basicAttack();
        WarriorClass warrior1 = new WarriorClass("Arthur");
        warrior1.basicAttack();
        archer1.basicParry();
        WarriorClass warrior2 = new WarriorClass("Draco");
        warrior1.basicAttack();
        warrior2.basicDefense();

        
    }
}
