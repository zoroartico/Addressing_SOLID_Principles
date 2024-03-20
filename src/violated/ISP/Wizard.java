package violated.ISP;

public class Wizard implements IBattleActions {
    public void attack() {
        System.out.println("Wizard casts fireball spell!");
    }

    public void defend() {
        System.out.println("Wizard erects a magical barrier for defense!");
    }

    public void castSpell() {
        System.out.println("Wizard casts another spell!");
    }

    public void useItem() {
        System.out.println("Wizard uses an item!");
    }
}
