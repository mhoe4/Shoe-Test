import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Story1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\cartu\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "http://shoestore-manheim.rhcloud.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testStory1() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("January")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"jimmy_choo_jimmy_choo'kendall'crystal_pump\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"jimmy_choo_jimmy_choo'kendall'crystal_pump\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"brian_atwood_brian_atwood'tribeca_laser'sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"brian_atwood_brian_atwood'tribeca_laser'sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"sergio_rossi_sergio_rossi'mermaid'caged_sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"sergio_rossi_sergio_rossi'mermaid'caged_sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"charlotte_olympia_charlotte_olympia'priscilla'genuine_python_pump\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"charlotte_olympia_charlotte_olympia'priscilla'genuine_python_pump\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"jimmy_choo_jimmy_choo'diva'sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"jimmy_choo_jimmy_choo'diva'sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("February")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"jimmy_choo_jimmy_choo'kera'platform_sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"jimmy_choo_jimmy_choo'kera'platform_sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"valentino_valentino'camo_rockstud'pump\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"valentino_valentino'camo_rockstud'pump\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("March")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"miu_miu_miu_miu_ankle_strap_platform_sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"miu_miu_miu_miu_ankle_strap_platform_sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"valentino_valentino'camo_rockstud'flat\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"valentino_valentino'camo_rockstud'flat\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("April")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"jimmy_choo_jimmy_choo'kalpa'sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"jimmy_choo_jimmy_choo'kalpa'sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"sergio_rossi_sergio_rossi'murmansk'sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"sergio_rossi_sergio_rossi'murmansk'sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("May")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"brian_atwood_brian_atwood'maia'sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"brian_atwood_brian_atwood'maia'sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"lanvin_lanvin_lucite®wedge_sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"lanvin_lanvin_lucite®wedge_sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("June")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"old_gringo_old_gringo'diego_swarovski'boot\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"old_gringo_old_gringo'diego_swarovski'boot\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"lanvin_lanvin_pointy_toe_python_pump\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"lanvin_lanvin_pointy_toe_python_pump\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("July")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"prada_prada_crystal_platform_sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"prada_prada_crystal_platform_sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"lanvin_lanvin_metal_heel_boot\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"lanvin_lanvin_metal_heel_boot\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("August")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"sergio_rossi_sergio_rossi'mermaid'bootie\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"sergio_rossi_sergio_rossi'mermaid'bootie\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"gucci_gucci'noah'crystald'orsay_pump\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"gucci_gucci'noah'crystald'orsay_pump\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("September")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"prada_prada_ankle_cuff_sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"prada_prada_ankle_cuff_sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"old_gringo_old_gringo'eagle_swarovski'boot\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"old_gringo_old_gringo'eagle_swarovski'boot\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("October")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"charlotte_olympia_charlotte_olympia'cherie'sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"charlotte_olympia_charlotte_olympia'cherie'sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"jimmy_choo_jimmy_choo'kalpa'sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"jimmy_choo_jimmy_choo'kalpa'sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("November")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"charlotte_olympia_charlotte_olympia'parisienne'sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"charlotte_olympia_charlotte_olympia'parisienne'sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"jimmy_choo_jimmy_choo'lola'ankle_strap_sandal\"]/div/table/tbody/tr[4]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//img[contains(@src,'.jpg')]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//li[@id=\"jimmy_choo_jimmy_choo'lola'ankle_strap_sandal\"]/div/table/tbody/tr[3]/td[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
