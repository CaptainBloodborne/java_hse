import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Scanner;

import CircusManager.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String username = System.getProperty("user.name");

        String helloMessage = String.format("""
            Hello, %s!
            Please select which task result you want to see:
                """, username);

            System.out.println(helloMessage);

        String userMenu = """
            1. Task 1 - Calculation
            2. Task 2 - Solve equation
            3. Task 3 - 1-dimension Array
            4. Task 4 - 2-dimension Array
            5. Task 5 - Build class and its heirs
            6. Task 6 - Sort collection
            7. Task 7 - Sort by date and sort by city
            8. Task 8 - Read and write data from and to file

            Enter '0' to exit""";

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println(userMenu);

            int userSelection = scanner.nextInt();

            switch (userSelection) {
                case 0:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                    
                case 1:
                    task_1(scanner);
                    break;

                case 2:
                    task_2(scanner);
                    break;

                case 3:
                    task_3();
                    break;

                case 4:
                    task_4();
                    break;

                case 5:
                    task_5();
                    break;

                case 6:
                    task_6(scanner);
                    break;

                case 7:
                    task_7(scanner);
                    break;

                case 8:
                    task_8(scanner);
                    break;
            
                default:
                    System.out.println("Task " + userSelection + " doesn't exist. Try again\n");
                    break;
            }

        }

        scanner.close();

    }

    static void task_1(Scanner scanner) {
        System.out.println("Task 1\nInput x: ");
        int x = scanner.nextInt();

        System.out.println("Input y: ");
        int y = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Result is: ");
        if (x * y > 30) {
            double ctg_a = 1.0 / Math.tan(x);
            System.out.println(ctg_a * 2);

        } else {
            System.out.println(x / 2);
        }

    }

    static void task_2(Scanner scanner) {
        System.out.println("Task 2\n Input a: ");
        int a = scanner.nextInt();

        System.out.println("Input b: ");
        int b = scanner.nextInt();

        scanner.close();
        double d = (Math.min(a, 3 * b) - 2 * Math.sqrt(Math.max(a, 3 * b))) / (Math.pow(4, 3) + Math.max(a, 3 * b) / Math.min(a, b));

        System.out.println("Result is: " + d);
    }

    static void task_3() throws Exception {


        System.out.println("Generating array size...");
        int boundaries[] = Array.getBoundaries();
        int min = boundaries[0];
        int max = boundaries[1];

        int array_size = Array.getRandomInt(min, max);

        System.out.println();

        int arr[] = new int[array_size];

        System.out.println("Generating array elements...");
        boundaries = Array.getBoundaries();
        min = boundaries[0];
        max = boundaries[1];

        int i;
        for (i = 0 ; i < array_size; i++) {
            arr[i] = Array.getRandomInt(min, max);
        }

        System.out.println();

        System.out.println("Generated array: ");
        Array.printArray(arr);

        System.out.println();

        int counter = 0;

        for (i = 1; i < array_size; i++) {
            if (arr[i] > arr[i - 1]) {
                counter++;
            }
        }

        System.out.println(String.format("%d elements of array are larger than previous element", counter));
        
    }

    static void task_4() throws Exception {

        System.out.println("Generating number of rows...");
        int boundaries[] = Array2D.getBoundaries();
        int min = boundaries[0];
        int max = boundaries[1];
        int rows = Array2D.getRandomInt(min, max);

        System.out.println();

        System.out.println("Generating number of columns...");
        boundaries = Array2D.getBoundaries();
        min = boundaries[0];
        max = boundaries[1];
        int cols = Array2D.getRandomInt(min, max);

        int arr[][] = new int[rows][cols];

        System.out.println();

        System.out.println("Generating matrix elements...");
        boundaries = Array2D.getBoundaries();
        min = boundaries[0];
        max = boundaries[1];

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Array2D.getRandomInt(min, max);
            }
        }

        System.out.println("Generated matrix: ");
        Array2D.printArray2D(arr);

        System.out.println();

        for (int j = 0; j < cols; j++) {
            int sum = 0;

            for (int i = 0 ; i < rows; i++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }

            System.out.printf("The sum of positive elements of column %d = %d\n",j, sum);
        }
        
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

    static void task_6(Scanner scanner) {

        AcrobaticPerfomance shapito = new AcrobaticPerfomance("Shapito", "Moscow", LocalDate.parse("2024-02-25"), 7200, 9999, "rope walking");

        shapito.addItemToInventory("rope");

        Taming koshki = new Taming("Kuklachev", "Kstovo", LocalDate.parse("2024-05-12"), 36000, 5000, 11, "Cats");

        Trick blaine = new Trick("David Blain", "Los Angeles", LocalDate.parse("2009-08-08"), 3600, 20000, "Making faces");

        blaine.addItemToInventory("playing cards");

        PerfomanceList list = new PerfomanceList();

        list.addNewPerfomance(blaine);
        list.addNewPerfomance(shapito);
        list.addNewPerfomance(koshki);

        String userMenu = """
                User menu:
                1. Print sorted perfomances
                2. Add an item
                
                Enter '0' to exit""";

        boolean exit = false;

        while (!exit) {

            System.out.println(userMenu);

            int userSelection = scanner.nextInt();

            switch (userSelection) {
                case 1:
                    list.sortPerfomances();
                    list.Print();
                    break;
                case 2:
                    Circus hse = new Circus("VPI23", "Nizhniy Novgorod", LocalDate.parse("2023-09-30"), 1839600, 83500);
    
                    hse.setAuthor("HSE");
                    hse.setGenre("Software Design");
                    hse.setActors(28);
    
                    list.addNewPerfomance(hse);
                case 0:
                    System.out.println("Exiting task 6...");
                    exit = true;
                    break;
                default:
                    System.out.println(userSelection + " doesn't exist. Try again");
                    break;
            }
        }


    }

    static void task_7(Scanner scanner) {
        AcrobaticPerfomance shapito = new AcrobaticPerfomance("Shapito", "Moscow", LocalDate.parse("2024-02-25"), 7200, 9999, "rope walking");

        shapito.addItemToInventory("rope");

        Taming koshki = new Taming("Kuklachev", "Kstovo", LocalDate.parse("2024-05-12"), 36000, 5000, 11, "Cats");

        Trick blaine = new Trick("David Blain", "Los Angeles", LocalDate.parse("2009-08-08"), 3600, 20000, "Making faces");

        blaine.addItemToInventory("playing cards");

        PerfomanceList list = new PerfomanceList();

        list.addNewPerfomance(blaine);
        list.addNewPerfomance(shapito);
        list.addNewPerfomance(koshki);

        String userMenu = """
                User menu:
                1. Print sorted perfomances
                2. Add an item
                3. Print sorted by city
                4. Print sorted by date
                
                Enter '0' to exit""";

        boolean exit = false;

        while (!exit) {
            int userSelection = scanner.nextInt();
            System.out.println(userMenu);

            switch (userSelection) {
                case 1:
                    list.sortPerfomances();
                    list.Print();
                    break;
                case 2:
                    Circus hse = new Circus("VPI23", "Nizhniy Novgorod", LocalDate.parse("2023-09-30"), 1839600, 83500);
    
                    hse.setAuthor("HSE");
                    hse.setGenre("Software Design");
                    hse.setActors(28);
    
                    list.addNewPerfomance(hse);
                    break;
                case 3:
                    list.SortByCity();
                    list.Print();
                    break;
                case 4:
                    list.sortByDate();
                    list.Print();
                    break;
                case 0:
                    System.out.println("Exiting task 7...");
                    exit = true;
                    break;
                default:
                    System.out.println(userSelection + " doesn't exist. Try again");
                    break;
            }

        }

    }

    static void task_8(Scanner scanner) throws Exception {

        AcrobaticPerfomance shapito = new AcrobaticPerfomance("Shapito", "Moscow", LocalDate.parse("2024-02-25"), 7200, 9999, "rope walking");

        shapito.addItemToInventory("rope");

        Taming koshki = new Taming("Kuklachev", "Kstovo", LocalDate.parse("2024-05-12"), 36000, 5000, 11, "Cats");

        Trick blaine = new Trick("David Blain", "Los Angeles", LocalDate.parse("2009-08-08"), 3600, 20000, "Making faces");

        blaine.addItemToInventory("playing cards");

        PerfomanceList list = new PerfomanceList();

        list.addNewPerfomance(blaine);
        list.addNewPerfomance(shapito);
        list.addNewPerfomance(koshki);

        String userMenu = """
                User menu:
                1. Print sorted perfomances
                2. Add an item
                3. Print sorted by city
                4. Print sorted by date
                5. Save to file
                6. Load from file
                
                Enter '0' to exit""";

        boolean exit = false;

        while (!exit) {
            System.out.println(userMenu);
            int userSelection = scanner.nextInt();

            switch (userSelection) {
                case 1:
                    list.sortPerfomances();
                    list.Print();
                    break;
                case 2:
                    Circus hse = new Circus("VPI23", "Nizhniy Novgorod", LocalDate.parse("2023-09-30"), 1839600, 83500);
    
                    hse.setAuthor("HSE");
                    hse.setGenre("Software Design");
                    hse.setActors(28);
    
                    list.addNewPerfomance(hse);
                    break;
                case 3:
                    list.SortByCity();
                    list.Print();
                    break;
                case 4:
                    list.sortByDate();
                    list.Print();
                    break;
                case 5:
                    FileOutputStream fileOutputStream= new FileOutputStream("perf_storage.txt");
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

                    objectOutputStream.writeObject(list);
                    objectOutputStream.flush();
                    objectOutputStream.close();

                    break;
                case 6:
                    FileInputStream fileInputStream  = new FileInputStream("perf_storage.txt");
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    PerfomanceList listReaded = (PerfomanceList) objectInputStream.readObject();
                    objectInputStream.close();

                    System.out.println("====== Readed List ========");
                    listReaded.Print();
                    System.out.println("==============");
                    break;
                case 0:
                    System.out.println("Exiting task 8...");
                    exit = true;
                    break;
                default:
                    System.out.println(userSelection + " doesn't exist. Try again");
                    break;
            }

        }
        
    }
    
}
