package lt.justinas.pom.utils;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestListner implements ITestListener {
    private void takeScreenshot() {
        TakesScreenshot screenshot = (TakesScreenshot) Driver.getChromeDriver();
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

        String directory = "./screenshots/";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd_HH_mm_ss_SSS");
        File saveFile = new File("%s%s_screenshot.png".formatted(directory,
                LocalDateTime.now().format(dateTimeFormatter)));

        try {
            FileUtils.copyFile(screenshotFile, saveFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }


}