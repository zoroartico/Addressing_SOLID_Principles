package solved.SRP;
import lombok.Data;

import java.util.List;

@Data
public class Inventory {
    private Character owner;
    private List<Item> inventory;
    public void addItem(Item item) {
        inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }
}
