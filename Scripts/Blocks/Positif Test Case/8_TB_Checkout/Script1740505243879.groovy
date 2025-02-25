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

WebUI.click(findTestObject('Book Details/mat-btn-icon_shopping_cart1'))

WebUI.waitForElementVisible(findTestObject('Book Details/mat-label-Shopping-cart'), 0)

WebUI.verifyElementVisible(findTestObject('Book Details/mat-label-Shopping-cart'))

WebUI.verifyTextPresent('Harry Potter and the Chamber of Secrets', false)

WebUI.click(findTestObject('Book Details/span_btn-CheckOut'))

WebUI.waitForElementVisible(findTestObject('Page Checkout/mat-label-Check Out'), 0)

WebUI.verifyElementVisible(findTestObject('Page Checkout/mat-label-Check Out'))

WebUI.verifyElementVisible(findTestObject('Page Checkout/mat-label-Shipping address'))

WebUI.verifyElementVisible(findTestObject('Page Checkout/mat-label-Order Summary'))

WebUI.sendKeys(findTestObject('Page Checkout/input_Name'), 'Andri Pratama')

WebUI.sendKeys(findTestObject('Page Checkout/input_Address Line 1'), 'Rumah')

WebUI.sendKeys(findTestObject('Page Checkout/input_Address Line 2'), 'Kantor')

WebUI.sendKeys(findTestObject('Page Checkout/input_Pincode'), '123456')

WebUI.sendKeys(findTestObject('Page Checkout/input_State'), 'Jakarta')

WebUI.click(findTestObject('Page Checkout/span_btn-Place Order'))

WebUI.waitForElementVisible(findTestObject('Page Checkout/mat-label-verify_My Orders'), 0)

WebUI.verifyElementVisible(findTestObject('Page Checkout/mat-label-verify_My Orders'))

