package BaiTap_3.common;

public class BaseTest {
    public void createDriver(){     //Hàm createDriver hiển thị thông tin: Browser, Report, Headless
        System.out.println("Browser: "+ Constants.browser);
        System.out.println("Report: "+ Constants.report);
        System.out.println("Headless: "+Constants.headless);
    }
    public void closeDriver(){ //Hàm closeDriver hiển thị thông tin "Closed browser: " + browser và truyền Browser vào
        System.out.println("Closed browser:" + Constants.browser);
    }

}
