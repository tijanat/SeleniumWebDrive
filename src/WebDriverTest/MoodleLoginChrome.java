package WebDriverTest;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MoodleLoginChrome {
	private WebDriver driver;
	private String baseUrl;

	// private boolean acceptNextAlert = true;
	// private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:/Selenium/Chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.moodle.tum.de/");
		baseUrl = "https://www.moodle.tum.de/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void testWebDriver() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.linkText("I have a TUM ID")).click();
		driver.findElement(By.name("j_username")).clear();
		driver.findElement(By.name("j_username")).sendKeys(
				"albert.aalmann@tum.de");
		driver.findElement(By.name("j_password")).clear();
		driver.findElement(By.name("j_password")).sendKeys("Ss00000!");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("Automated Testing Tijana")).click();
		driver.findElement(By.xpath("//input[@value='Bearbeiten einschalten']")).click();	
		//driver.findElement(By.cssSelector("div.singlebutton > form > div > input[type=\"submit\"]")).click();
										
		
		// Abstimmung anlegen
		
		driver.findElement(By.cssSelector("span.section-modchooser-text"))
				.click();
		driver.findElement(By.id("module_choice")).click();
		driver.findElement(By.name("submitbutton")).click();
		driver.findElement(By.id("id_name")).click();
		driver.findElement(By.id("id_name")).clear();
		driver.findElement(By.id("id_name")).sendKeys("Abstimmung");

		// For Firefox id of this element has different name
		driver.findElement(By.id("id_introeditoreditable")).click();
		driver.findElement(By.id("id_introeditoreditable")).clear();
		driver.findElement(By.id("id_introeditoreditable")).sendKeys(
				"Test Abstimmung");
		driver.findElement(By.id("id_option_0")).click();
		driver.findElement(By.id("id_option_0")).clear();
		driver.findElement(By.id("id_option_0")).sendKeys("Gut");
		driver.findElement(By.id("id_option_1")).click();
		driver.findElement(By.id("id_option_1")).clear();
		driver.findElement(By.id("id_option_1")).sendKeys("Schlecht");
		driver.findElement(By.id("id_option_2")).click();
		driver.findElement(By.id("id_option_2")).clear();
		driver.findElement(By.id("id_option_2")).sendKeys("Ok");
		driver.findElement(By.id("id_submitbutton")).click();
		// Abstimmung nutzen
		driver.findElement(By.id("choice_2")).click();
		driver.findElement(By.cssSelector("input.button")).click();

		// Aktivität "Aufgabe" anlegen
		driver.findElement(By.cssSelector("a[title=\"Automated Testing Tijana\"]")).click();
		//driver.findElement(By.linkText("Automated Testing Tijana")).click();
		driver.findElement(By.cssSelector("span.section-modchooser-text"))
				.click();
		driver.findElement(By.id("module_assign")).click();
		driver.findElement(By.name("submitbutton")).click();
		driver.findElement(By.id("id_name")).click();
		driver.findElement(By.id("id_name")).clear();
		driver.findElement(By.id("id_name")).sendKeys("Aufgabe");
		driver.findElement(By.id("id_introeditoreditable")).click();
		driver.findElement(By.id("id_introeditoreditable")).clear();
		driver.findElement(By.id("id_introeditoreditable")).sendKeys(
				"Test Aufgabe");
		driver.findElement(By.id("id_submitbutton")).click();

		// Aktivität "Bescheinigung" anlegen
		driver.findElement(By.linkText("Automated Testing Tijana")).click();
		driver.findElement(By.cssSelector("span.section-modchooser-text"))
				.click();
		driver.findElement(By.id("module_certificate")).click();
		driver.findElement(By.name("submitbutton")).click();
		driver.findElement(By.id("id_name")).click();
		driver.findElement(By.id("id_name")).clear();
		driver.findElement(By.id("id_name")).sendKeys("Bescheinigung");
		driver.findElement(By.id("id_submitbutton")).click();

		// Aktivität "Chat" anlegen
		driver.findElement(By.linkText("Automated Testing Tijana")).click();
		driver.findElement(By.cssSelector("span.section-modchooser-text"))
				.click();
		driver.findElement(By.id("module_chat")).click();
		driver.findElement(By.name("submitbutton")).click();
		driver.findElement(By.id("id_name")).click();
		driver.findElement(By.id("id_name")).clear();
		driver.findElement(By.id("id_name")).sendKeys("Chat");
		driver.findElement(By.id("id_introeditoreditable")).click();
		driver.findElement(By.id("id_introeditoreditable")).clear();
		driver.findElement(By.id("id_introeditoreditable")).sendKeys(
				"Test Chat");
		driver.findElement(By.id("id_submitbutton")).click();

		// Aktivität "Datenbank" anlegen
		driver.findElement(By.linkText("Automated Testing Tijana")).click();
		driver.findElement(By.cssSelector("span.section-modchooser-text"))
				.click();
		driver.findElement(By.id("module_data")).click();
		driver.findElement(By.name("submitbutton")).click();
		driver.findElement(By.id("id_name")).click();
		driver.findElement(By.id("id_name")).clear();
		driver.findElement(By.id("id_name")).sendKeys("Datenbank");
		driver.findElement(By.id("id_introeditoreditable")).click();
		driver.findElement(By.id("id_introeditoreditable")).clear();
		driver.findElement(By.id("id_introeditoreditable")).sendKeys("Test Datenbank");
		driver.findElement(By.id("id_submitbutton")).click();
		
		
	    // Felder in Datenbank definieren: Funktioniert noch nicht -> deswegen auskommentiert    
		// 
		/* Bild Feld
		driver.findElement(By.name("newtype")).click();
	    new Select(driver.findElement(By.name("newtype"))).selectByVisibleText("Bild");
	    driver.findElement(By.name("newtype")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("Bildfeld");
	    driver.findElement(By.cssSelector("div.mdl-align > input[type=\"submit\"]")).click();
	    // Dateifeld
	    driver.findElement(By.name("newtype")).click();
	    new Select(driver.findElement(By.name("newtype"))).selectByVisibleText("Datei");
	    driver.findElement(By.name("newtype")).click();
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("Dateifeld");
	    driver.findElement(By.cssSelector("div.mdl-align > input[type=\"submit\"]")).click();
	    // URL Feld
	    driver.findElement(By.name("newtype")).click();
	    new Select(driver.findElement(By.name("newtype"))).selectByVisibleText("URL");
	    driver.findElement(By.name("newtype")).click();
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("URL Feld");
	    driver.findElement(By.cssSelector("div.mdl-align > input[type=\"submit\"]")).click();
	    // Textbereich
	    driver.findElement(By.name("newtype")).click();
	    new Select(driver.findElement(By.name("newtype"))).selectByVisibleText("Textbereich");
	    driver.findElement(By.name("newtype")).click();
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("Textbereichsfeld");
	    driver.findElement(By.cssSelector("div.mdl-align > input[type=\"submit\"]")).click();
	    */
	    
		// Aktivität "EtherpadLite" anlegen
		
	    driver.findElement(By.linkText("Automated Testing Tijana")).click();
	    driver.findElement(By.cssSelector("span.section-modchooser-text")).click();
	    driver.findElement(By.id("module_etherpadlite")).click();
	    driver.findElement(By.name("submitbutton")).click();
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("EtherpadLite");
	    driver.findElement(By.id("id_introeditoreditable")).click();
	    driver.findElement(By.id("id_introeditoreditable")).clear();
	    driver.findElement(By.id("id_introeditoreditable")).sendKeys("Test EtherpadLite");
	    driver.findElement(By.name("submitbutton")).click();
	 	// Aktivität "Externes Tool" anlegen
	    driver.findElement(By.linkText("Automated Testing Tijana")).click();
	    driver.findElement(By.cssSelector("span.section-modchooser-text")).click();
	    driver.findElement(By.id("module_lti")).click();
	    driver.findElement(By.name("submitbutton")).click();
	    driver.findElement(By.id("id_name")).click();
	    driver.findElement(By.id("id_name")).clear();
	    driver.findElement(By.id("id_name")).sendKeys("Externes Tool");
	    driver.findElement(By.name("submitbutton")).click();
	   
	 	//Aktivität "Forum" anlegen
	    driver.findElement(By.linkText("Automated Testing Tijana")).click();
	    driver.findElement(By.cssSelector("span.section-modchooser-text")).click();
	    driver.findElement(By.id("module_forum")).click();
	    driver.findElement(By.name("submitbutton")).click();
	    driver.findElement(By.id("id_name")).click();
	    driver.findElement(By.id("id_name")).clear();
	    driver.findElement(By.id("id_name")).sendKeys("Forum");
	    driver.findElement(By.id("id_introeditoreditable")).click();
	    driver.findElement(By.id("id_introeditoreditable")).clear();
	    driver.findElement(By.id("id_introeditoreditable")).sendKeys("Test Forum");
	    driver.findElement(By.id("id_submitbutton")).click();
	    // Neues Thema im Forum hizufügen
	    driver.findElement(By.cssSelector("#newdiscussionform > div > input[type=\"submit\"]")).click();
	    driver.findElement(By.id("id_subject")).click();
	    driver.findElement(By.id("id_subject")).clear();
	    driver.findElement(By.id("id_subject")).sendKeys("Hello World");
	    driver.findElement(By.id("id_messageeditable")).click();
	    driver.findElement(By.id("id_messageeditable")).clear();
	    driver.findElement(By.id("id_messageeditable")).sendKeys("Test message");
	    driver.findElement(By.id("id_submitbutton")).click();
	    driver.findElement(By.linkText("Weiter")).click();
	    // Antwort in Forum Thema schreiben
	    driver.findElement(By.linkText("Hello World")).click();
	    driver.findElement(By.linkText("Antworten")).click();
	    driver.findElement(By.id("id_messageeditable")).click();
	    driver.findElement(By.id("id_messageeditable")).clear();
	    driver.findElement(By.id("id_messageeditable")).sendKeys("Reply to Hello World Topic");
	    driver.findElement(By.id("id_submitbutton")).click();
	    driver.findElement(By.linkText("Weiter")).click();
	   
	    // Aktivität "Feedback" anlegen
	    driver.findElement(By.linkText("Automated Testing Tijana")).click();
	    driver.findElement(By.cssSelector("span.section-modchooser-text")).click();
	    driver.findElement(By.id("module_feedback")).click();
	    driver.findElement(By.name("submitbutton")).click();
	    driver.findElement(By.id("id_name")).click();
	    driver.findElement(By.id("id_name")).clear();
	    driver.findElement(By.id("id_name")).sendKeys("Feedback");
	    driver.findElement(By.id("id_introeditoreditable")).click();
	    driver.findElement(By.id("id_introeditoreditable")).clear();
	    driver.findElement(By.id("id_introeditoreditable")).sendKeys("Test Feedback");
	    driver.findElement(By.linkText("Verfügbarkeit")).click();
	    driver.findElement(By.name("timeopen[enabled]")).click();
	    driver.findElement(By.id("id_submitbutton")).click();
	    // Elemente bearbeiten -> Inhalt hinzüfugen
	    driver.findElement(By.cssSelector("a[title=\"Elemente bearbeiten\"]")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=id_typ | ]]
	    new Select(driver.findElement(By.name("typ"))).selectByVisibleText("Multiple-Choice");
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("Gefällt Ihnen diesen Kurs?");
	    driver.findElement(By.name("values")).click();
	    driver.findElement(By.name("values")).clear();
	    driver.findElement(By.name("values")).sendKeys("Ja, sehr!\nJa!\nNeutral\nNein\nNein, gar nicht!");
	    driver.findElement(By.name("save_item")).click();
	    
	    // Feedback ausfüllen: funktioniert nicht
	    /*driver.findElement(By.linkText("Automated Testing")).click();
	    driver.findElement(By.xpath("//div[@id='settingsnav']/ul/li[2]/p")).click();
	    driver.findElement(By.linkText("Student")).click();
	    driver.findElement(By.linkText("Feedback")).click();
	    driver.findElement(By.linkText("Formular ausfüllen...")).click();
	    driver.findElement(By.xpath("//li[3]/span/input")).click();
	    driver.findElement(By.name("savevalues")).click();
	    driver.findElement(By.cssSelector("div.continuebutton > form > div > input[type=\"submit\"]")).click();
	    driver.findElement(By.linkText("Zurück zur Ausgangsrolle")).click();
	    driver.findElement(By.cssSelector("div.singlebutton > form > div > input[type=\"submit\"]")).click();
	    */
	    
	    // Aktivität "Glossar" anlegen
	    driver.findElement(By.linkText("Automated Testing Tijana")).click();
	    driver.findElement(By.cssSelector("span.section-modchooser-text")).click();
	    driver.findElement(By.id("module_glossary")).click();
	    driver.findElement(By.name("submitbutton")).click();
	    driver.findElement(By.id("id_name")).click();
	    driver.findElement(By.id("id_name")).clear();
	    driver.findElement(By.id("id_name")).sendKeys("Glossar");
	    driver.findElement(By.id("id_introeditoreditable")).click();
	    driver.findElement(By.id("id_introeditoreditable")).clear();
	    driver.findElement(By.id("id_introeditoreditable")).sendKeys("Test Glossar");
	    driver.findElement(By.id("id_submitbutton")).click();
	    // Einträge hinzufügen
	    // Begriff: Acceptance
	    driver.findElement(By.cssSelector("#newentryform > div > input[type=\"submit\"]")).click();
	    driver.findElement(By.name("concept")).click();
	    driver.findElement(By.name("concept")).clear();
	    driver.findElement(By.name("concept")).sendKeys("Acceptance");
	    driver.findElement(By.id("id_definition_editoreditable")).click();
	    driver.findElement(By.id("id_definition_editoreditable")).clear();
	    driver.findElement(By.id("id_definition_editoreditable")).sendKeys("Acceptance in human psychology is a person's assent to the reality of a situation, recognizing a process or condition");
	    driver.findElement(By.name("submitbutton")).click();
	    // Begriff: Software
	    driver.findElement(By.cssSelector("#newentryform > div > input[type=\"submit\"]")).click();
	    driver.findElement(By.name("concept")).click();
	    driver.findElement(By.name("concept")).clear();
	    driver.findElement(By.name("concept")).sendKeys("Software");
	    driver.findElement(By.id("id_definition_editoreditable")).click();
	    driver.findElement(By.id("id_definition_editoreditable")).clear();
	    driver.findElement(By.id("id_definition_editoreditable")).sendKeys("Software is any set of machine-readable instructions that directs a computer's processor to perform specific operations.");
	    driver.findElement(By.name("submitbutton")).click();
		
	    // Gruppen anlegen: Nutzer/innen -> Gruppen -> Automatisch anlegen
	    driver.findElement(By.linkText("Automated Testing Tijana")).click();
	    driver.findElement(By.xpath("//li[4]/p/span")).click();
	    driver.findElement(By.linkText("Gruppen")).click();
	    driver.findElement(By.name("act_showautocreategroupsform")).click();
	    driver.findElement(By.name("groupby")).click();
	    new Select(driver.findElement(By.name("groupby"))).selectByVisibleText("Mitgliedern pro Gruppe");
	    driver.findElement(By.xpath("//select[@id='id_groupby']/option[2]")).click();
	    driver.findElement(By.name("number")).click();
	    driver.findElement(By.name("number")).clear();
	    driver.findElement(By.name("number")).sendKeys("1");
	    driver.findElement(By.name("submitbutton")).click();
	    
	    // Aktivität "Gruppenwahl" anlegen: Problem mit double click
	    /*
	    driver.findElement(By.linkText("Automated Testing")).click();
	    driver.findElement(By.cssSelector("span.section-modchooser-text")).click();
	    driver.findElement(By.id("module_choicegroup")).click();
	    driver.findElement(By.name("submitbutton")).click();
	    driver.findElement(By.id("id_name")).click();
	    driver.findElement(By.id("id_name")).clear();
	    driver.findElement(By.id("id_name")).sendKeys("GR");
	    driver.findElement(By.id("id_introeditoreditable")).click();
	    driver.findElement(By.id("id_introeditoreditable")).clear();
	    driver.findElement(By.id("id_introeditoreditable")).sendKeys("No");
	    driver.findElement(By.id("addGroupButton")).click();
	    driver.findElement(By.id("id_submitbutton2")).click();
	    */
		
	    // Aktivität "Lektion" anlegen
	    driver.findElement(By.linkText("Automated Testing Tijana")).click();
	    driver.findElement(By.cssSelector("span.section-modchooser-text")).click();
	    driver.findElement(By.id("module_lesson")).click();
	    driver.findElement(By.name("submitbutton")).click();
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("Lektion");
	    driver.findElement(By.name("submitbutton2")).click();    
	    
	}

}
