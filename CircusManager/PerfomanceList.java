package CircusManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.io.Serializable;

class CityComparator implements Comparator<Circus> {

    @Override
    public int compare(Circus c1, Circus c2) {

        return c1.getCity().compareTo(c2.getCity());
    }
}

class DateComparator implements Comparator<Circus> {

    @Override
    public int compare(Circus c1, Circus c2) {

        return c1.getOpeningDate().compareTo(c2.getOpeningDate());
    }
}

public class PerfomanceList implements Serializable{
    private ArrayList<Circus> perfomances;

    public PerfomanceList() {
        perfomances = new ArrayList<Circus>();
    }

    public void addNewPerfomance(Circus perfomance) {
        perfomances.add(perfomance);
    }

    public void Print() {
        for (Circus perf: perfomances) {
            System.out.println(perf);
        }
    }

    public void sortPerfomances() {
        perfomances.sort(null);
    }

    public void SortByCity() {
        perfomances.sort(new CityComparator());
    }

    public void sortByDate() {
        perfomances.sort(new DateComparator());
    }

    public void saveToFile(String filename) {
        
    }

    // static PerfomanceList readFromFile(String filepath) {

    // }
    
}
