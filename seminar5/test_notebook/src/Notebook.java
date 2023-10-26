import java.util.ArrayList;

public class Notebook {

    public static ArrayList<Records> notebook = new ArrayList<Records>();

    public void showAll() {
        notebook.forEach(Records::show);
    }
    public void add(Records records){
        notebook.add(records);
    }
    public void delete(String id){
        notebook.removeIf(c -> c.id.equals(id));
    }
    static boolean records_exist(String id) {
        for (Records c: notebook) {
            if (c.id.equals(id)) {
                return true;
            }
        }
        return false;
    }

}
