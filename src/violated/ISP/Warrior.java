package violated.ISP;

class Warrior implements IBattleActions {
    public void attack() {
        System.out.println("Warrior attacks with sword!");
    }

    public void defend() {
        System.out.println("Warrior raises shield to defend!");
    }

    public void castSpell() {
        System.out.println("Warrior is impressed by the wizard and tries to cast a spell! " +
                            "\n...He's even dumber then you thought!");
    }

    public void useItem() {
        System.out.println("Warrior uses an item!");
    }
}