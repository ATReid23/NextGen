package Pages;

import Utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class defaultPage {

    public defaultPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
