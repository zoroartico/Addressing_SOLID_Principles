package solved.ISP;

import solved.ISP.rpgClasses.ISpellSword;

public class SpellSword implements ISpellSword {
    private final String title = "Spell Sword";
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
    @Override
    public void useMana() {
        System.out.println(title+" uses mana for a spell!");
    }
}
