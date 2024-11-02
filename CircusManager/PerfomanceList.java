package CircusManager;

import java.util.ArrayList;

public class PerfomanceList {
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
    
}
