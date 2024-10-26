import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Circus hse = new Circus("VPI23", "Nizhniy Novgorod", LocalDate.parse("2023-09-30"), 1839600, 83500);

        System.out.println(hse);

        hse.setAuthor("HSE");
        hse.setGenre("Software Design");
        hse.setActors(28);

        System.out.println(hse);
    }
}
