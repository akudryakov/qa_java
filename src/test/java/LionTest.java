import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {

    Feline feline = new Feline();

    @Test
    public void getKittensReturnKittensCount() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getKittensReturnFoodList() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, lion.getFood());
    }

    @Test(expected = Exception.class)
    public void lionInvalidValueOfSexExceptionTest() throws Exception {
        try {
            Lion lion = new Lion("Еще не определился", feline);
        } catch (Exception re) {
            String expected = "Используйте допустимые значения пола животного - самец или самка";
            assertEquals(expected, re.getMessage());
            throw re;
        }
    }
}