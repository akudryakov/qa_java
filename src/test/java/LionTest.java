import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTest {

    Feline feline = new Feline();

    @Test
    public void getKittensReturnKittensCount() throws Exception {
        Lion lion = new Lion ("Самец", feline);
        Assert.assertEquals(1, lion.getKittens ());
    }

    @Test
    public void getKittensReturnFoodList() throws Exception {
        Lion lion = new Lion ("Самец", feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected,lion.getFood());
    }

   
    @Test(expected = Exception.class)
    public void lionInvalidValueOfSexExceptionTest() throws Exception {
        Lion lion = new Lion("Еще не определился", this.feline);
        lion.doesHaveMane();
    }
}