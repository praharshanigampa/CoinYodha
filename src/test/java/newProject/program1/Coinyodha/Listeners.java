package newProject.program1.Coinyodha;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName()+ " Test Started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName()+ " Test is successfully executed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()+ " Test failed");
    }
}
