import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.checkerframework.checker.guieffect.qual.UI;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class allMiddleFeatures extends MyApp {
	
		public static void loginFirst() {
			
			//Login First Time	
			
			new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_button")));
			WebElement allowContact = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
			allowContact.click();
			
			new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/registerBtnId")));
			WebElement getStarted = driver.findElement(By.id("com.tad.bdkepler:id/registerBtnId"));
			getStarted.click();
			
			new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/etPhoneNumber")));
			WebElement mobileNo = driver.findElement(By.id("com.tad.bdkepler:id/etPhoneNumber"));
			mobileNo.click();
			mobileNo.sendKeys("01550703244");
			
			//Select mobileOperator = new Select(driver.findElement(By.id("com.tad.bdkepler:id/tvOperator")));
			
			new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnNext")));
			WebElement nextPage = driver.findElement(By.id("com.tad.bdkepler:id/btnNext"));
			nextPage.click();
			
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/etPin")));
			WebElement password = driver.findElement(By.id("com.tad.bdkepler:id/etPin"));
			password.sendKeys("1234");
		
			
			new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnNext")));
			WebElement confirm = driver.findElement(By.id("com.tad.bdkepler:id/btnNext"));
			confirm.click();
			
			new WebDriverWait(driver, Duration.ofSeconds(180)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(".//android.widget.Button[@text='Allow']")));
			//Thread.sleep(10000);
			driver.findElement(By.xpath(".//android.widget.Button[@text='Allow']")).click();
			
			new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnNext")));
			WebElement confirmOTP = driver.findElement(By.id("com.tad.bdkepler:id/btnNext"));
			confirmOTP.click();
			
			//Wait at Home max 5 seconds
			new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/txtVwTitle")));
			new WebDriverWait(driver, Duration.ofSeconds(5));
			
		}
	
		public static void allMiddleItems(String moduleName) {	
			
		//All modules on above Homepage
			
		Random random = new Random();
		int myRandomAmount = random.nextInt(10)*10;
	
		for(int i=0;i<100;i++) {
			//System.out.println("Value of the element is: "+ allMiddleName.get(i));
			List<WebElement> allMiddleName = driver.findElements(By.className("android.widget.TextView"));
			
			//Cash Out
			if(allMiddleName.get(i).getText().equals("Cash Out")&&moduleName=="Cash Out") {
				allMiddleName.get(i).click();
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/etPhoneNumber")));
				WebElement enterNumber = driver.findElement(By.id("com.tad.bdkepler:id/etPhoneNumber"));
				enterNumber.click();
				enterNumber.sendKeys("01883493757");
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/ivBtnNext")));
				WebElement nextAfterEnter = driver.findElement(By.id("com.tad.bdkepler:id/ivBtnNext"));
				nextAfterEnter.click();
				
				//driver.switchTo().defaultContent();
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.className("android.view.ViewGroup")));
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.className("android.widget.ScrollView")));
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.className("android.widget.EditText")));
				
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/etAmount")));
				WebElement amountCashout = driver.findElement(By.id("com.tad.bdkepler:id/etAmount"));
				amountCashout.click();
				amountCashout.sendKeys("120");

				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/tvAmountBtnText")));
				WebElement payAmount = driver.findElement(By.id("com.tad.bdkepler:id/tvAmountBtnText"));
				payAmount.click();
	
				//new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.className("android.view.ViewGroup")));
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.className("android.widget.ScrollView")));
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.className("android.widget.LinearLayout")));
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.className("android.widget.RelativeLayout")));
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnConfirmTransaction")));
				WebElement confirmTransaction = driver.findElement(By.id("com.tad.bdkepler:id/btnConfirmTransaction"));
				confirmTransaction.click();
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/etPin")));
				WebElement enterPin = driver.findElement(By.id("com.tad.bdkepler:id/etPin"));
				enterPin.sendKeys("1234");
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnConfirmPin")));
				WebElement confirmPin = driver.findElement(By.id("com.tad.bdkepler:id/btnConfirmPin"));
				confirmPin.click();
				
				new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnGoHome")));
				new WebDriverWait(driver, Duration.ofSeconds(5));
				WebElement goTohome =driver.findElement(By.id("com.tad.bdkepler:id/btnGoHome"));
				goTohome.click();
			}
			
			//Send Money
			if(allMiddleName.get(i).getText().equals("Send Money")&&moduleName=="Send Money") {
				allMiddleName.get(i).click();
				
				new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/etPhoneNumber")));
				WebElement enterNumber = driver.findElement(By.id("com.tad.bdkepler:id/etPhoneNumber"));
				enterNumber.click();
				enterNumber.sendKeys("01744880001");
				
				new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/ivBtnNext")));
				WebElement nextAfterEnter = driver.findElement(By.id("com.tad.bdkepler:id/ivBtnNext"));
				nextAfterEnter.click();
				
				new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/etAmount")));
				WebElement enterAmount = driver.findElement(By.id("com.tad.bdkepler:id/etAmount"));
				enterAmount.sendKeys("100");
				
				new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnConfirmAmount")));
				WebElement confirmAmount = driver.findElement(By.id("com.tad.bdkepler:id/btnConfirmAmount"));
				confirmAmount.click();
				
				new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnConfirmTransaction")));
				WebElement confirmTransaction = driver.findElement(By.id("com.tad.bdkepler:id/btnConfirmTransaction"));
				confirmTransaction.click();
				
				new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/etPin")));
				WebElement enterPin = driver.findElement(By.id("com.tad.bdkepler:id/etPin"));
				enterPin.sendKeys("1234");
				
				new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnConfirmPin")));
				WebElement confirmPin = driver.findElement(By.id("com.tad.bdkepler:id/btnConfirmPin"));
				confirmPin.click();
				
				new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnGoHome")));
				new WebDriverWait(driver, Duration.ofSeconds(3));
				WebElement goTohome =driver.findElement(By.id("com.tad.bdkepler:id/btnGoHome"));
				goTohome.click();
				
			}
			
			//Merchant payment
			if(allMiddleName.get(i).getText().equals("Make Payment")&&moduleName=="Merchant payment") {
				allMiddleName.get(i).click();
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/etPhoneNumber")));
				WebElement enterNumber = driver.findElement(By.id("com.tad.bdkepler:id/etPhoneNumber"));
				enterNumber.click();
				enterNumber.sendKeys("8801570100256");
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/ivBtnNext")));
				WebElement nextAfterEnter = driver.findElement(By.id("com.tad.bdkepler:id/ivBtnNext"));
				nextAfterEnter.click();
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/etAmount")));
				WebElement amountMerchant = driver.findElement(By.id("com.tad.bdkepler:id/etAmount"));
				amountMerchant.click();
				amountMerchant.sendKeys("122");

				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/tvAmountBtnText")));
				WebElement payMerchant = driver.findElement(By.id("com.tad.bdkepler:id/tvAmountBtnText"));
				payMerchant.click();
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/etPurpose")));
				WebElement purposeMerchant = driver.findElement(By.id("com.tad.bdkepler:id/etPurpose"));
				purposeMerchant.click();
				purposeMerchant.sendKeys("Tanjemul Test Auto");
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/tvAmountBtnText")));
				WebElement purposeNext = driver.findElement(By.id("com.tad.bdkepler:id/tvAmountBtnText"));
				purposeNext.click();
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnConfirmTransaction")));
				WebElement confirmTransaction = driver.findElement(By.id("com.tad.bdkepler:id/btnConfirmTransaction"));
				confirmTransaction.click();
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/etPin")));
				WebElement enterPin = driver.findElement(By.id("com.tad.bdkepler:id/etPin"));
				enterPin.sendKeys("1234");
				
				new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnConfirmPin")));
				WebElement confirmPin = driver.findElement(By.id("com.tad.bdkepler:id/btnConfirmPin"));
				confirmPin.click();
				
				new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.id("com.tad.bdkepler:id/btnGoHome")));
				new WebDriverWait(driver, Duration.ofSeconds(5));
				WebElement goTohome =driver.findElement(By.id("com.tad.bdkepler:id/btnGoHome"));
				goTohome.click();
			}
	
		} 
	
	}
}

