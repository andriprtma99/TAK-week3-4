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

WebUI.waitForElementVisible(findTestObject('Page_Login/span_profile-andripratamaa'), 0)

WebUI.verifyElementVisible(findTestObject('Page_Login/span_profile-andripratamaa'))

WebUI.click(findTestObject('Page_Login/span_profile-andripratamaa'))

WebUI.verifyElementVisible(findTestObject('Page Home Login/span_My Orders'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page Home Login/span_Logout'))

WebUI.click(findTestObject('Page Home Login/span_My Orders'))

WebUI.waitForElementVisible(findTestObject('Page Checkout/mat-label-verify_My Orders'), 0, FailureHandling.OPTIONAL)

