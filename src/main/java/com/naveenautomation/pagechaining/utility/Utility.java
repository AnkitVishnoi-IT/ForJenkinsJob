package com.naveenautomation.pagechaining.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.naveenautomation.pagechaining.testbase.TestBase;

	public class Utility extends TestBase {

		public static void takeFailedTestScreenShot(String testCaseName) {
			// Get the current date and Time
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

			// Save the screen shot in a file
			File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			// Save the screenshot
			try {
				FileUtils.copyFile(screenShotFile, new File("./FailedScreenShot\\" + "_" + testCaseName + "_" + timeStamp + ".jpeg"));
			} catch (IOException e) {
				System.out.println("Unable to save or take screen shot of failed test " + testCaseName);

			}

		}

		public static String generateRandomEmail() {
//			String email = RandomStringUtils.randomNumeric(3);
			String emailID = "ankit" + RandomStringUtils.randomNumeric(2)  + "@gmail.com";
			return emailID;
			
		}

		public static int generateRandomInt(int length) {
//			Random random = new Random();
			return (int) (Math.random()*length);
		}

		public static String generateRandomString(int length) {

			return RandomStringUtils.random(length);
		}

		public static Date generateRandomDate() {
			return new Date();
		}

		public static String generateRandomPh() {
			return RandomStringUtils.randomNumeric(10);
		}
		
		public static String generateRandomAmount() {
			String amount = RandomStringUtils.randomNumeric(2);
			return amount;
		}
		
		public static String generateRandomPassword() {
			String randomStringForPassword = RandomStringUtils.randomNumeric(3);
			String password = "Manager@" + randomStringForPassword;
			return password;
		}
	
	public static void sleep(long milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	}
	