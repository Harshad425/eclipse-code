public class Frame {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        // Navigate to login page
        driver.get("http://hrmdev.pixlogixservice.com/login");
        
        // Perform login
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bidizymu@mailinator.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#Sagar@307");
        driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();
        System.out.println("Successful log in");
        
        // Wait for 5 seconds
        Thread.sleep(5000);
        
        // Navigate to openings page
        driver.get("http://hrmdev.pixlogixservice.com/recruitment-tool/openings");
        Thread.sleep(5000);
        
        // Click on the button to add new opening
        driver.findElement(By.xpath("//a[@class='ms-auto ms-sm-0 btn btn-md btn-primary']")).click();
        Thread.sleep(5000);
        
        // Fill the form fields
        WebElement field1 = driver.findElement(By.xpath("//form[@id='add-form']//input[@name='designation']"));
        field1.sendKeys("john");
        Thread.sleep(5000);
        
        WebElement field2 = driver.findElement(By.xpath("//form[@id='add-form']//input[@name='openings_count']"));
        field2.sendKeys("453");
        
        /*
        WebElement k = driver.findElement(By.xpath("(//span[@class='select2-selection__placeholder'][normalize-space()='Stage'])[1]"));
        Select m = new Select(k);
        m.selectByVisibleText("Wordpress Development");

        WebElement o = driver.findElement(By.xpath("(//span[@role='combobox'])[3]"));
        Select z = new Select(o);
        z.selectByVisibleText("High");
        
        WebElement l = driver.findElement(By.xpath("(//span[@class='select2-selection__placeholder'][normalize-space()='Experience'])[1]"));
        Select y = new Select(l);
        y.selectByVisibleText("Fresher");
        */
        
        // Submit the form
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        
        // Quit the driver
        driver.quit();
    }
}
