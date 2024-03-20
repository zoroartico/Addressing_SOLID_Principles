package solved.ISP;

import solved.ISP.rpgClasses.IWizard;

public class Wizard implements IWizard {
    private final String title = "Wizard";

    @Override
    public void attack() {
        System.out.println(title+" casts fireball spell!");
    }

    @Override
    public void defend() {
        System.out.println(title+" erects a magical barrier for defense!");
    }

    @Override
    public void useMana() {
        System.out.println(title+" uses mana for a spell!");
    }

    @Override
    public void useItem() {
        System.out.println(title+" used an Item!");
    }
}
