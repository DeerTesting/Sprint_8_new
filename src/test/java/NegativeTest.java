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
    public void NamePrintTest(){
        Account account = new Account(name);
        Assert.assertFalse(account.checkNameToEmboss());
    }



}