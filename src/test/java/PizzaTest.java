

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PizzaTest {

    @Test

    public void testAddPizzaShoppingCart() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1));
        driver.get(PizzaPage.URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1));
        WebElement BTN_MENU_ELEMENT = driver.findElement(By.xpath(PizzaPage.BTN_MENU));
        BTN_MENU_ELEMENT.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1));
        WebElement MENU_PIZZA_ELEMENT = driver.findElement(By.xpath(PizzaPage.MENU_PIZZA));
        MENU_PIZZA_ELEMENT.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1));
        WebElement BTN_ADD_BASKET_MARGARITA_ELEMENT = driver.findElement(By.xpath(PizzaPage.BTN_ADD_BASKET_MARGARITA));
        BTN_ADD_BASKET_MARGARITA_ELEMENT.click();
        driver.quit();
        // WebElement BTN_ADD_BASKET_MARGARITA_ELEMENT = driver.findElement(By.xpath(TerrapizzaPage.BTN_ADD_BASKET_MARGARITA));
        // BTN_ADD_BASKET_MARGARITA_ELEMENT.click();
        //driver.quit();
    }
}
