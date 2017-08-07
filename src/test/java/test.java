import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class test {
    @Test
    public void goTo(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        assertTrue(driver.getTitle().equals("Google"));
    }
}
