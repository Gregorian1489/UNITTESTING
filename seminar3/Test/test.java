import Seminar3.Task1;
import Seminar3.Task2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class test {
    private Task1 task1;
    private Task2 task2;

    @BeforeEach
    public void setup(){
        task1 = new Task1();
        task2 = new Task2();
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 100})
    public void getTrue(int n){
        assertTrue(task1.evenOddNumber(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 15})
    public void getFalse(int n){
        assertFalse(task1.evenOddNumber(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {25, 40 , 99})
    public void getTrueInterval(int n){
        assertTrue(task2.numberInInterval(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {10, 101, -50})
    public void getFalseInterval(int n){
        assertFalse(task2.numberInInterval(n));
    }

}

