package solved.ISP;

import solved.ISP.rpgClasses.IWarrior;

public class Warrior implements IWarrior {
    private final String title = "Warrior";

    @Override
    public void attack() {
        System.out.println(title+" attacks with sword!");
    }

    @Override
    public void defend() {
        System.out.println(title+" raises shield to defend!");
    }

    @Override
    public void usePotion() {
        System.out.println(title+" drinks health potion!");
    }

    @Override
    public void useStamina() {
        System.out.println(title+" uses stamina for special attack!");
    }

}
