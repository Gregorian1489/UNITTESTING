import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


class ListTest {
    int[] array1;
    int[] array2;
    int[] array3;
    Lists lists;
    Lists listsMock;
    double averageArray;
    double averageArray1;

    @BeforeEach
    void setUp() {
        lists = new Lists();
        listsMock = mock(Lists.class);
        array1 = new int[]{1,1,1,1,1};
        array2 = new int[]{1,1,1,1,1};
        array3 = new int[]{1,2,1,3,4};
        averageArray = 1.0;
        averageArray1 = 2.0;
    }

    // Mock-тест - проверка метода сравнения средних значений двух списков (средние значения равны)
    @Test
    void compareArray() {
        double average1 = lists.averageArray(array2);
        double average2 = lists.averageArray(array1);
        lists.compareArray(average1, average2);
    }

    // Тест на проверку метода вычисления среднего значения
    @Test
    void averageArray() {
        assertThat(lists.averageArray(array3)).isEqualTo(2.0);
    }
    // Тест на проверку метода создания списка
    @Test
    void createArray() {
        //проверка на ограничение длины списка равное 10
        assertThat(lists.createArray().length).isEqualTo(10);
    }


    //  Тест на проверку создания нового списка в классе Lists

    @Test
    void createMyList(){
        when(listsMock.createArray()).thenReturn(new int[]{1,1,1,1,1});
    }
}
