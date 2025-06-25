package observr_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCompanyLogo() {
        return driver.findElement(By.className("company-logo"));  
    }

    public boolean isLogoDisplayed() {
        return getCompanyLogo().isDisplayed();
    }
    
    public WebElement getMainTextElement() {
        return driver.findElement(By.xpath("/html/body/div/div[1]/div/div/h1/span")); 
    }

    public String getMainText() {
        return getMainTextElement().getText();
    }

    public WebElement getvideobtn() {
    	return driver.findElement(By.xpath("/html/body/div/div[1]/div/div/a"));
    }
    public WebElement getloadmorebtn() {
    	return driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/a[1]"));
    }
    
    public boolean loadmorebtnenabled() {
		return getloadmorebtn().isEnabled();
	}
    public WebElement getbooksession() {
    	return driver.findElement(By.linkText("Book Discovery Session"));
    }
    
    public WebElement mining() {
		return driver.findElement(By.xpath("//div[@class='footer-links']/a[@href='/industry/mining']"));
	}
    
    public boolean miningenebled() {
		return mining().isEnabled();
	}
    
    public WebElement manufacturing() {
		return driver.findElement(By.xpath("//div[@class='footer-links']/a[@href='/industry/manufacturing']"));
	}
    
    public boolean manufacturingenebled() {
		return manufacturing().isEnabled();
	}
    
    public WebElement oilandgas() {
		return driver.findElement(By.xpath("//div[@class='footer-links']/a[@href='/industry/oilandgas']"));
	}
    
    public boolean oilandgasenebled() {
		return oilandgas().isEnabled();
	}
    
    public WebElement bulkhandlingports() {
		return driver.findElement(By.xpath("//div[@class='footer-links']/a[@href='/industry/bulk-handling-ports']"));
	}
    
    public boolean bulkingportsenebled() {
		return bulkhandlingports().isEnabled();
	}
    
    public WebElement Rail() {
		return driver.findElement(By.xpath("//div[@class='footer-links']/a[@href='/industry/rail']"));
	}
    
    public boolean railenebled() {
		return Rail().isEnabled();
	}
    
    public WebElement assesmaintainance() {
    	return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[3]/a[1]"));
    }
    
    public boolean assesenebled() {
		return assesmaintainance().isEnabled();
	}
    
    public WebElement safety() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[3]/a[2]"));
	}
    
    public boolean safetyenable() {
		return safety().isEnabled();
	}
    
    public WebElement inspections() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[3]/a[3]"));
	}
    
    public boolean inspectionsenabled() {
		return inspections().isEnabled();
	}
    
    public WebElement complains() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[3]/a[4]"));
	}
    
    public boolean complainsenebled() {
		return complains().isEnabled();
	}
    public WebElement bussinessintelligence() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[3]/a[5]"));
	}
    
    public boolean bussinessenabled() {
		return bussinessintelligence().isEnabled();
	}
    
    public WebElement features() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[4]/a[1]"));
	}
    
    public boolean featuresenabled() {
		return features().isEnabled();
	}
    
    public WebElement security() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[4]/a[2]"));
	}
    
    public boolean securityenebled() {
		return security().isEnabled();
	}
    
    public WebElement integration() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[4]/a[3]"));
	}
    
    public boolean integrationenabled() {
		return integration().isEnabled();
	}
    
    public WebElement templates() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[4]/a[4]"));
	}
    
    public boolean templatesenebled() {
		return templates().isEnabled();
	}
    
    
    
    public WebElement googplay() {
		return driver.findElement(By.className("google-play"));
	}
    
    public boolean googpalyenebled() {
		return googplay().isEnabled();
	}
    
    public WebElement appleplay() {
		return driver.findElement(By.className("apple-store"));
	}
    
    public boolean appleplayenebled() {
		return appleplay().isEnabled();
	}
    
    public WebElement winstore() {
		return driver.findElement(By.className("windows-store"));
	}
    
    public boolean winstoreenabled() {
		return winstore().isEnabled();
	}
    
    public WebElement terms() {
		return driver.findElement(By.xpath("//a[@href='/terms-of-use']"));
	}
    
    public boolean termsenabled() {
		return terms().isEnabled();
		
		
	}public WebElement privacy() {
		return driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
	}
    
    public boolean privacyenabled() {
		return privacy().isEnabled();
	}
    
    public WebElement youtube() {
		return driver.findElement(By.xpath("//img[@class='social-icon' and contains(@src, 'XMLID_30_')]"));
	}
    
    public boolean youtubeenebled() {
		return youtube().isEnabled();
	}
    
    public WebElement linkedin() {
		return driver.findElement(By.xpath("//img[@class='social-icon' and contains(@src, 'XMLID_16_')]"));
	}
    
    public boolean linkedenabled() {
		return linkedin().isEnabled();
	}
}