package solved.SRP;

import lombok.Data;

@Data
public class Character {
    private final String title;
    public void attack(String primarySlot) {
        System.out.println(title+" attacks with "+primarySlot+"!");
    }
}
