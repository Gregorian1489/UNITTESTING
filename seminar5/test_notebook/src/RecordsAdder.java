import java.util.Scanner;
public class RecordsAdder {
    public static void add_records(Notebook notebook, Scanner in) {
        String id, name, phone, info;
        System.out.print("Input ID record \n");
        id = in.next();
        System.out.print("input record name\n");
        name = in.next();
        System.out.print("input phone\n");
        phone = in.next();
        System.out.print("input info \n");
        info = in.next();
        notebook.add(new Records(id, name, phone, info));
    }
}
