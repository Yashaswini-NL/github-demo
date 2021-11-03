package com.elocalshops.utilities;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import com.elocalshops.reusablecomponents.BaseClass;

public class Screenshot2 extends BaseClass{

	public void takeScreenshot(String result) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("./Screenshot/screenshot "+ result + getCurrentDateTime()+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static String getCurrentDateTime() {
		DateFormat textFormat = new SimpleDateFormat("MM_dd_yyyy__HH_mm_ss");
		
		Date currentDate = new Date();
		
		return textFormat.format(currentDate);
	}
}
