package com.flipkart.Flipkart_Automation;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NoProductViewTest extends TestClass {

	@Test
	public void testProductView() throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook("TestRunner.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		String excelExecutionStatus = sheet.getRow(7).getCell(1).getStringCellValue();
		logger.info("Execution Status from Excel: " + excelExecutionStatus);

		if (excelExecutionStatus.equalsIgnoreCase("Yes")) {
			String flipkartURL = config.getProperty("flipkart.url");

			driver.get(config.getProperty("flipkart.url"));

			HomePage homePage = new HomePage(driver);

			String productToSearch = config.getProperty("product.to.search");
			homePage.searchProduct(productToSearch);

			By firstSearchResult = By.xpath("(//div[@class='_4rR01T'])[1]//a");
			driver.findElement(firstSearchResult).click();

		}
		else {
			// If Execution Required is set to "No" in Excel, mark the test as failed
			org.testng.Assert.fail("Execution not required for this test case.");
		}
	}
}
