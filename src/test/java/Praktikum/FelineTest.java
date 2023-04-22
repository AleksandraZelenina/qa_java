package Praktikum;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {



    @Test
    public void felineGetFoodPositiveTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void felineGetFamilyPositiveTest() {
        String expected = "Кошачьи";
        Feline feline = new Feline();
        String actual = feline.getFamily();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void felineGetKittensPositiveTest() {
        int expected = 1;
        Feline feline = new Feline();
        int actual = feline.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void felineGetKittensKittensPositiveTest() {
        int expected = 10;
        Feline feline = new Feline();
        int actual = feline.getKittens(10);
        Assert.assertEquals(expected, actual);
    }
}

