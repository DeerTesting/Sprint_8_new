import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class NegativeTest {

    private String name;

    public NegativeTest(String name){
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] getName(){
        return new Object[][]{
                {"CarloPenzo"},
                {" Carlo Penzo"},
                {"Carlo Penzo "},
                {"Carlo  Penzo"},
                {"F"},
                {"Margaritta Pizzalona"}
        };
    }

    @Test
    @DisplayName("Test negative scenarios")
    @Description("This test is for check that name cant be printed")
    public void NamePrintTest(){
        Account account = new Account(name);
        nameCheck(account);
    }

    @Step
    public void nameCheck(Account account){
        Assert.assertFalse(account.checkNameToEmboss());
    }



}