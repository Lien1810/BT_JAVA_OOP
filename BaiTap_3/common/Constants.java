package BaiTap_3.common;

public class Constants {
    //Tạo các biến static
    private static String browser;
    private static boolean report;
    private static boolean headless;

    // Tính đóng gói SD getter và setter
    public static String getBrowser(){
        return browser;
    }

    public static boolean getReport() {
        return report;
    }

    public static boolean getHeadless() {
        return headless;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }

    public static void setReport(boolean report) {
        Constants.report = report;
    }

    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }
}
