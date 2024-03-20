package violated.OCP;

class Character {
    String type;

    public Character(String type) {
        this.type = type;
    }

    //more Characters could be added but that violates OCP
    public void draw() {
        switch (type) {
            case "Wizard" -> System.out.println("Creating Wizard");
            case "Warrior" -> System.out.println("Creating Warrior");
            case "Spell Sword" -> System.out.println("Creating Spell Sword");
        }
    }
}


