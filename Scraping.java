package proyectoWeb;
import com.microsoft.playwright.*;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Scraping {
	
	public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	    	final BrowserType firefox = playwright.firefox();
            final Browser browser = firefox.launch();
            final Page page = browser.newPage();
	          page.navigate("https://twitter.com/Pavlov_Dev");
	          page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot" + ".png")));
	        
	      
	    }
	  }
    
}