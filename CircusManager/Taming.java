package CircusManager;

import java.time.LocalDate;

public class Taming extends Circus {
    private int animals;

    private String tamingKind;
    
    public Taming(String perfomanceName, String city, LocalDate openingDate, int perfomanceDuration, int ticketPrice, int animals, String tamingKind) {
        super(perfomanceName, city, openingDate, perfomanceDuration, ticketPrice);

        this.animals = animals;
        this.tamingKind = tamingKind;

    }

    public void setAnimals(int animals) {
        this.animals = animals;
    }

    public int getAnimals() {
        return animals;
    }

    @Override public String toString()
    {
        return (super.toString() + "\nДрессировка:"
                + "\nВид дрессировки: " + tamingKind +"\n");
    }
}
