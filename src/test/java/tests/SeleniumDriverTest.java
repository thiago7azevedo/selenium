package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumDriverTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\App\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // espera 10 segundos antes de efetuar a pesquisa
		
		driver.get("https://mvnrepository.com/");
		
		WebElement caixaDeBusca = driver.findElement(By.id("query")); // pesquisa pelo id do elemento na página
		caixaDeBusca.sendKeys("selenium java"); // envia a string para pesquisa na página
		WebElement botaoBusca = driver.findElement(By.className("button"));
		botaoBusca.click();
		caixaDeBusca = driver.findElement(By.id("query")); // pesquisa pelo id do elemento na página
		caixaDeBusca.clear();
		caixaDeBusca.sendKeys("junit"); // envia a string para pesquisa na página
		botaoBusca = driver.findElement(By.className("button"));
		botaoBusca.click();
		caixaDeBusca = driver.findElement(By.id("query")); // pesquisa pelo id do elemento na página
		caixaDeBusca.clear();
		caixaDeBusca.sendKeys("selenium firefox"); // envia a string para pesquisa na página
		botaoBusca = driver.findElement(By.className("button"));
		botaoBusca.click();
		caixaDeBusca = driver.findElement(By.id("query")); // pesquisa pelo id do elemento na página
		caixaDeBusca.clear();
		caixaDeBusca.sendKeys("selenium chrome"); // envia a string para pesquisa na página
		botaoBusca = driver.findElement(By.className("button"));
		botaoBusca.click();
		caixaDeBusca = driver.findElement(By.id("query")); // pesquisa pelo id do elemento na página
		caixaDeBusca.clear();
		caixaDeBusca.sendKeys("maven"); // envia a string para pesquisa na página
		botaoBusca = driver.findElement(By.className("button"));
		botaoBusca.click();
		
		driver.findElement(By.linkText("Maven Plugin API")).click();//encontra pela classe
		//String resultado = resultadoPesquisa.getText(); // pega o resultado e coloca na variavel resultado
		System.out.println("Click OK");
		driver.findElement(By.linkText("3.6.2")).click();
		System.out.println("Last version Download Completed!");
		driver.close();
	}

}
