import java.util.Scanner;

public class RecordsDelete {
    public static void records_delete(Notebook notebook, Scanner in) {
        System.out.print("Input id delete records \n");
        String id = in.next();
        if (Notebook.records_exist(id)){
            notebook.delete(id);
        }
        else {
            System.out.printf("Records with Id %s not found.\n ", id);
        }

    }
}
