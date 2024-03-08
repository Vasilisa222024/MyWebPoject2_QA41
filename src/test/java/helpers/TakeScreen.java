package helpers;

import io.qameta.allure.Attachment;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static config.BaseTest.getDriver;

public class TakeScreen {
    @Attachment(value = "Failure screenshot", type = "image/png")
    public static byte[] takeScreenshot(String testName) {
        try {
            String screenshotName = testName + "_" + System.currentTimeMillis() + ".png";
            File screenshotFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
             FileUtil.copyFile(screenshotFile, new File("screenshot/" + screenshotFile));
return Files.readAllBytes(Paths.get("screenchots\\"+screenshotName));

        }
        catch (IOException e) {
            return null;
        }
    }
}