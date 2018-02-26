package Tests;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;

import Pages.SearchPage;


public class SearchTest extends DriverManager {
	
	@Test
	public void serach() throws MalformedURLException {
		
		System.out.println("Test is started");
		driver = new DriverManager().getDriver("chrome");
		driver.get("http://www.google.pl");
		SearchPage searchPage = new SearchPage(driver);
		assertTrue(searchPage.isInitialized());
		searchPage.enterSearch("Dawid");
		searchPage.submit();
		
		assertTrue(searchPage.isInitialized());
		assertTrue(searchPage.confirmationHeader().contains("wikipedia"));
		System.out.println("Test is finished");
	}
}
