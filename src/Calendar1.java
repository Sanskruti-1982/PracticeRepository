import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Applications//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//body/div/div/div[2]/div/div[2]/div/div[3]/label/span")).click();
		driver.manage().window().maximize();
		
		//Code to select Month
		
		while(!driver.findElement(By.cssSelector("div[class='DayPicker-Caption']")).getText().contains("November"))
		{
			driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
		}
		
		//Code to select Date
		
		driver.findElements(By.className("DayPicker-Day"));
		int count=driver.findElements(By.className("DayPicker-Day")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("DayPicker-Day")).get(i).getText();
			
			if(text.equalsIgnoreCase("29"))
			{
				driver.findElements(By.className("DayPicker-Day")).get(i).click();
				break;
			}
		}
		
	

	}

}

