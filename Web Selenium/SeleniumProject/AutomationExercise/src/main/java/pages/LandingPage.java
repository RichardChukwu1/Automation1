package pages;

public class LandingPage {
    WebDriver driver;
    public LandingPage(WebDriver driver){
        this.driver=driver;
        PageFactor.initElements(driver,this);
    }

    @FindBy(id = "findFriendsNav")
    private webElement findItems;

    public void checkingItemIcon(){
        findItemIcon.isDisplayed();
    }
}
