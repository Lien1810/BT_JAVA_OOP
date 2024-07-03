package BaiTap_3.testcases;

import BaiTap_3.common.BaseTest;


public class TestCases extends BaseTest {
    //2 hàm TC từ class TestCases sẽ kế thừa lại class BaseTest và mỗi TC phải có thông tin createDriver và closeDriver
    public static void Login(){
        //moi TC co thong tin createDriver & closeDriver, tao cac step trong cac TC
        createDriver();
        System.out.println("Step 1: Navigate to login page");
        System.out.println("Step 2: Enter username and password");
        System.out.println("Step 3: Click login button");
        System.out.println("Step 4: Verify login");
        closeDriver();
    }
    public static void AddCategory(){
        createDriver();
        System.out.println("Step 1: Navigate to add category page");
        System.out.println("Step 2: Enter category details");
        System.out.println("Step 3: Click add category button");
       System.out.println("Step 4: Verify category added");
        closeDriver();
    }

    public static void main(String[] args) {
        Login();
        AddCategory();
    }

}
