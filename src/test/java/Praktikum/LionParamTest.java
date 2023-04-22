package Praktikum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {

    private final String sex;

    private final boolean result;
    private Feline feline;


    public LionParamTest(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters(name = "Пол. Тестовые данные:{0}{1}")
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkSexLionWhenHasManeResult() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean hasMane = lion.doesHaveMane();
        assertEquals(result, hasMane);
    }
}


