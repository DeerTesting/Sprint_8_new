import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

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
    public void NamePrintTest(){
        Account account = new Account(name);
        Assert.assertTrue(account.checkNameToEmboss());
    }

}














