package violated.OCP;

class Character {
    String type;

    public Character(String type) {
        this.type = type;
    }

    //more Characters could be added but that violates OCP
    public void chooseClass() {
        switch (type) {
            case "Wizard" -> System.out.println("Selecting Wizard");
            case "Warrior" -> System.out.println("Selecting Warrior");
            case "Spell Sword" -> System.out.println("Selecting Spell Sword");
            default -> {System.out.println("Invalid selection, setting type to Classless");
                        this.type = "Classless";}

        }
    }
}


