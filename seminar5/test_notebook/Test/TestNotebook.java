import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.Scanner;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestNotebook {

    @Test
    public void TestRecordsCreating(){
        // В этом тесте проверяем заполнение ArrayList с Records
        Notebook testNotebook = new Notebook();
        Scanner mock = mock(Scanner.class);
        when(mock.next()).thenReturn("1","Sam","8999","testinfo");
        RecordsAdder.add_records(testNotebook, mock);
        Records recordstest = new Records("1","Sam","8999","testinfo");
        assertThat(Objects.equals(testNotebook.notebook.get(0), recordstest)).isTrue();
    }
    @Test
    public void  TestRecordsDelete(){
        // Проверка на удаление записи
        Notebook testNotebook = new Notebook();
        Scanner mock = mock(Scanner.class);
        when(mock.next()).thenReturn("1","Sam","8999","testinfo");
        RecordsAdder.add_records(testNotebook, mock);
        Scanner mock2 = mock(Scanner.class);
        when(mock2.next()).thenReturn("1");
        RecordsDelete.records_delete(testNotebook, mock2);
        assertThat(Objects.equals(testNotebook.notebook.size(), 0)).isTrue();
    }
    @Test
    public void TestSearchRecords(){
        // Тест на поиск записи
        Notebook testNotebook = new Notebook();
        Scanner mock = mock(Scanner.class);
        when(mock.next()).thenReturn("1","Sam","8999","testinfo");
        RecordsAdder.add_records(testNotebook, mock);
        Scanner mock2 = mock(Scanner.class);
        when(mock2.next()).thenReturn("2","Tom","8888","testinfo2");
        RecordsAdder.add_records(testNotebook, mock);
        assertTrue(Notebook.records_exist("1"));
        assertFalse(Notebook.records_exist("3"));

    }
}
