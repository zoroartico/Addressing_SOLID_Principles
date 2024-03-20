package solved.OCP;

class SpellSword implements ICharacter {
    private final String title = "Spell Sword";
    @Override
    public void attack(String primarySlot) {
        System.out.println(title+" attacks with "+primarySlot+"!");
    }

    @Override
    public void defend(String secondarySlot) {
        System.out.println(title+" uses "+secondarySlot+" to defend!");
    }

    @Override
    public void useItem(String item) {
        System.out.println(title + " uses " + item + "!");
    }

}
