public class Controller {
    Lists lists;

    public Controller(){
        this.lists = new Lists();
    }

    public double averageArray(int[] array) {
        return lists.averageArray(array);
    }

    public void compareArray(double resultAverage1, double resultAverage2){
        lists.compareArray(resultAverage1, resultAverage2);
    }

    public int[] createArray() {
        return lists.createArray();
    }
}
