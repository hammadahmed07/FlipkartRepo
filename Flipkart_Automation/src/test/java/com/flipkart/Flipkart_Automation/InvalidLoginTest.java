package com.flipkart.Flipkart_Automation;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class InvalidLoginTest extends TestClass {

	@Test
	public void testLoginWithInvalidCredentials() throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook("TestRunner.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		String excelExecutionStatus = sheet.getRow(5).getCell(1).getStringCellValue();
		logger.info("Execution Status from Excel: " + excelExecutionStatus);

		if (excelExecutionStatus.equalsIgnoreCase("Yes")) {
			String flipkartURL = config.getProperty("flipkart.url");
			driver.get(flipkartURL);
			homePage.clickLogin();
			loginPage.enterUsername(config.getProperty("invalid.username"));
			loginPage.enterPassword(config.getProperty("invalid.password"));
			loginPage.clickLogin();

		}
		else {
			// If Execution Required is set to "No" in Excel, mark the test as failed
			org.testng.Assert.fail("Execution not required for this test case.");
		}
	}
}
