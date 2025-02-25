import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('Page Home_Non Login/span_Book Cart-Home'), 0)

WebUI.verifyElementVisible(findTestObject('Page Home_Non Login/span_Book Cart-Home'))

WebUI.verifyElementVisible(findTestObject('Filter Category/span_All Categories'))

WebUI.click(findTestObject('Page Home_Non Login/span_btn-Login'))

WebUI.waitForElementVisible(findTestObject('Page_Login/mat-label-login'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Login/mat-label-login'), 0)

WebUI.click(findTestObject('Page_Login/span_btn-Register'))

WebUI.sendKeys(findTestObject('Page_Register/Page Register/input_First name'), 'Andri')

WebUI.sendKeys(findTestObject('Page_Register/Page Register/input_Last name'), 'Pratama')

// Ambil data dari Data Files -> Data User
TestData dataUser = findTestData('Data User')

// Looping untuk menjalankan test case dengan semua data yang ada
for (int i = 1; i <= dataUser.getRowNumbers(); i++) {
	String username = dataUser.getValue('username', i)
	String password = dataUser.getValue('password', i)

WebUI.sendKeys(findTestObject('Page_Register/Page Register/input_User name'), username)

WebUI.sendKeys(findTestObject('Page_Register/Page Register/input_Password'), password)

WebUI.click(findTestObject('Page_Register/Page Register/input_Gender_male'))

WebUI.check(findTestObject('Page_Register/Page Register/input_Gender_male'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Register/Page Register/span_btnRegister'))

}