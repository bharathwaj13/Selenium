package week5day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReports {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/week5day2result.html");
		html.setAppendExisting(false);
		ExtentReports extents=new ExtentReports();
		extents.attachReporter(html);
		ExtentTest firsttestcase = extents.createTest("TC001_Create Lead", "Create a New Lead");
		firsttestcase.assignCategory("smoke");
		firsttestcase.assignAuthor("Bharath");
		firsttestcase.pass("Lead created successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img.png").build());
		ExtentTest secondtestcase = extents.createTest("TC002_Edit Lead", "Edit a New Lead");
		secondtestcase.assignCategory("sanity");
		secondtestcase.assignAuthor("Viswa");
		secondtestcase.fail("Lead edited unsuccessfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		secondtestcase.pass("Lead edited successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		extents.flush();
	}

}
