import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class PositiveTest {

    private String name;

    public PositiveTest(String name){
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] getName(){
        return new Object[][]{
                {"Carlo Penzo"},
                {"Margaritta Pizzalon"},
                {"M S"}
        };
    }

    @Test
    @DisplayName("Test positive scenarios")
    @Description("This test is for check that name can be printed")
    public void namePrintTest(){
        Account account = new Account(name);
        nameCheck(account);
    }

    @Step
    public void nameCheck(Account account){
        Assert.assertTrue(account.checkNameToEmboss());
    }

}














