import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationTest {

        @BeforeAll // вводим настройки перед тестом - открытый браузер, размер и ссылка
        static void beforeAll(){
            Configuration.holdBrowserOpen = true;
            Configuration.browserSize = "1920x1980";
            Configuration.baseUrl = "https://demoqa.com";
            Configuration.pageLoadStrategy = "eager";

        }
        @AfterEach //закрытие браузера после теста
        void afterEach(){
            Selenide.closeWindow();

        }

        @Test
        void RegistrationTest(){
            String userName = "Anna";
           open("/text-box"); // открываем страницу

        $("#userName").setValue(userName);
        $("#userEmail").setValue("Anna@ya.ru");
        $("#currentAddress").setValue("Street 1, house 3");
        $("#permanentAddress").setValue("Street 10, house 5");
        $("#submit").click();
        }

        @Test

        void CheckRegistration(){
            String userName = "Anna";
            open("/text-box");
            $("#userName").setValue(userName);
            $("#userEmail").setValue("Anna@ya.ru");
            $("#currentAddress").setValue("Street 1, house 3");
            $("#permanentAddress").setValue("Street 10, house 5");
            $("#submit").click();

        }

}




