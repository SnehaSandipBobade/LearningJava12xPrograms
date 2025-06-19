package ex_19_OOPs_Part2.inheritance.singleinheritance;

public class Lab175_TestCase2 extends  Lab172_CommonTOAllTest_base {
    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("Running TC2");
        closeBrowser();
    }


}
