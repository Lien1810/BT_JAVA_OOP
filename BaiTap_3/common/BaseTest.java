package BaiTap_3.common;

public class BaseTest extends Constants {
    public static void createDriver() {
        //hien thi cac thong tin: browser, report, getHeadless
        setBrowser("https://cms.anhtester.com/login");
        setReport(true);
        setHeadless(false);
        System.out.println(getBrowser());
        System.out.println(getReport());
        System.out.println(getHeadless());
    }

    public static void closeDriver() {
        //Hàm closeDriver hiển thị thông tin "Closed browser: " và truyền Browser vào
        System.out.println("Closed browser: " +getBrowser());
    }
}
