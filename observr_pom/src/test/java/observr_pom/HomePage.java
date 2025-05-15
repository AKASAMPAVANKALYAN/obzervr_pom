package observr_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
    	return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[2]/a[1]"));
    }
    public WebElement getbooksession() {
    	return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[2]/a[2]"));
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
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[3]/a[2]"));
	}
    
    public boolean inspectionsenabled() {
		return inspections().isEnabled();
	}
    
    public WebElement complains() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[3]/a[2]"));
	}
    
    public boolean complainsenebled() {
		return complains().isEnabled();
	}
    public WebElement bussinessintelligence() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[3]/a[2]"));
	}
    
    public boolean bussinessenabled() {
		return bussinessintelligence().isEnabled();
	}
    
    public WebElement features() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[3]/a[2]"));
	}
    
    public boolean featuresenabled() {
		return features().isEnabled();
	}
    
    public WebElement security() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[3]/a[2]"));
	}
    
    public boolean securityenebled() {
		return security().isEnabled();
	}
    
    public WebElement integration() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[3]/a[2]"));
	}
    
    public boolean integrationenabled() {
		return integration().isEnabled();
	}
    
    public WebElement templates() {
		return driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/div[3]/a[2]"));
	}
    
    public boolean templatesenebled() {
		return templates().isEnabled();
	}
}