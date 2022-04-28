import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (weightOfSuitcases() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        } else {
            return;
        }
    }

    public int weightOfSuitcases() {
        int weight = 0;

        for (Suitcase e : suitcases) {
            weight += e.totalWeight();
        }
        return weight;
    }

    public void printItems() {

        for (Suitcase e : suitcases) {

            e.printItems();

        }

    }

    public String toString() {
        String weightOutput = " (" + weightOfSuitcases() + "kg)";
        String suitcaseOutput = "";

        if (suitcases.isEmpty()) {
            suitcaseOutput = "no suitcases";
        } else if (suitcases.size() == 1) {
            suitcaseOutput = "1 suitcase";
        } else {
            suitcaseOutput = suitcases.size() + " suitcases";
        }

        return suitcaseOutput + weightOutput;

    }
}
