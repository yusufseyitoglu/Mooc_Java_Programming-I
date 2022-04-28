import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) <= maximumWeight) {
            items.add(item);
        } else {
            return;
        }
    }

    public int totalWeight() {
        int total_ = 0;
        for (Item item : items) {
            total_ += item.getWeight();
        }
        return total_;
    }

    public void printItems() {
        for (Item e : items)

            System.out.println(e);
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;

        }
        Item heaviestItem = this.items.get(0);

        for (Item e : items) {
            if (e.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = e;
            }


        }
        return heaviestItem;
    }

    public String toString() {

        String weightOutput = " (" + totalWeight() + " kg)";
        String itemOutput = "";

        if (items.isEmpty()) {
            itemOutput = "no items";
        } else if (items.size() == 1) {
            itemOutput = "1 item";
        } else {
            itemOutput = items.size() + " items";
        }

        return itemOutput + weightOutput;
    }
}
