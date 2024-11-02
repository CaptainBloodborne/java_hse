package CircusManager;

import java.time.LocalDate;
import java.util.ArrayList;

public class AcrobaticPerfomance extends Circus{
    private String acrobaticsKind;

    private ArrayList<String> inventory = new ArrayList<>();

    public AcrobaticPerfomance(String perfomanceName, String city, LocalDate openingDate, int perfomanceDuration, int ticketPrice, String acrobaticsKind) {
        super(perfomanceName, city, openingDate, perfomanceDuration, ticketPrice);
        this.acrobaticsKind = acrobaticsKind;
    }

    public void addItemToInventory(String item) {
        inventory.add(item);
    }

    public void removeItemFromInventory(String item) {
        inventory.remove(item);
    }

    public String getAcrobaticsKind() {
        return acrobaticsKind;
    }

    public ArrayList<String> getInvetory() {
        return inventory;
    }

    @Override public String toString()
    {
        return (super.toString() + "\nАкробатические выступления:"
                + "\nВид акробатики: " + acrobaticsKind
                + "\nИнвентарь: " + inventory + "\n");
    }
}
