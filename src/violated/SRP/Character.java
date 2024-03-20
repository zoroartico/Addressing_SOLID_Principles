package violated.SRP;
import lombok.Data;
import java.util.List;

@Data
public class Character {
    private String title;
    private List<String> inventory;
    public void attack(String primarySlot) {
        System.out.println(title+" attacks with "+primarySlot+"!");
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public void removeItem(String item) {
        inventory.remove(item);
    }

}

