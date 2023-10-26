import java.util.Scanner;

public class Menu {

    public static void menu() {
        System.out.println("---Menu---");
        System.out.println("[1] Show all records");
        System.out.println("[2] Add records");
        System.out.println("[3] Delete records");
        System.out.println("[4] Exit");
    }
    public static void show(Notebook notebook) {
        boolean exit = false;

        while (!exit) {
            menu();
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    notebook.showAll();
                    break;
                case 2:
                    RecordsAdder.add_records(notebook, scan);
                    break;
                case 3:
                    RecordsDelete.records_delete(notebook,scan);
                    break;
                case 4:
                    System.out.println("exit");
                    scan.close();
                    exit = true;
                    break;
                default:
                    System.out.println("INVALID");
                    break;
            }
        }
    }
}
