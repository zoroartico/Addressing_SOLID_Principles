package solved.OCP;

class Wizard implements ICharacter {
    private final String title = "Wizard";
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
        System.out.println(title+" uses "+item+"!");
    }
}
