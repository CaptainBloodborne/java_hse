import java.time.LocalDate;

import CircusManager.*;

public class Main {
    public static void main(String[] args) {

        String username = System.getProperty("user.name"); 

        System.out.println("Hello, " + username + "!");


    }

    static void task_1() {

    }

    static void task_2() {
        
    }

    static void task_3() {
        
    }

    static void task_4() {
        
    }

    static void task_5() {
        Circus hse = new Circus("VPI23", "Nizhniy Novgorod", LocalDate.parse("2023-09-30"), 1839600, 83500);

        hse.setAuthor("HSE");
        hse.setGenre("Software Design");
        hse.setActors(28);

        AcrobaticPerfomance shapito = new AcrobaticPerfomance("Shapito", "Moscow", LocalDate.parse("2024-02-25"), 7200, 9999, "rope walking");

        shapito.addItemToInventory("rope");

        Taming koshki = new Taming("Kuklachev", "Kstovo", LocalDate.parse("2024-05-12"), 36000, 5000, 11, "Cats");

        Trick blaine = new Trick("David Blain", "Los Angeles", LocalDate.parse("2009-08-08"), 3600, 20000, "Making faces");

        blaine.addItemToInventory("playing cards");

        PerfomanceList list = new PerfomanceList();

        list.addNewPerfomance(blaine);
        list.addNewPerfomance(shapito);
        list.addNewPerfomance(koshki);

        list.Print();
    }

    static void task_6() {
        
    }
}
