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

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://portal.stage.fortisase.com/login')
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/button_SSO Login'))
WebUI.setText(findTestObject('Object Repository/Page_Fortinet SSO/input_Email_username'), ' test71112@qatest.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fortinet SSO/input_Password_password'), 'TNipMEz+js5U+fwi5+1+Eg==')
WebUI.click(findTestObject('Object Repository/Page_Fortinet SSO/input_Password_submit'))
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/span_20230112'))
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/span_Configuration'))
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/span_Users'))
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/span_Create'))
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/span_User Group_radio-control'))
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/span_Next'))
WebUI.setText(findTestObject('Object Repository/Page_FortiSASE/input_Email_ng-untouched ng-pristine ng-invalid'), 'test123@qatest.com')
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/svg'))
WebUI.setEncryptedText(findTestObject('Object Repository/Page_FortiSASE/input_Password_ng-untouched ng-valid ng-dirty'),
	'RigbBhfdqOBGNlJIWM1ClA==')
WebUI.click(findTestObject('Object Repository/Page_FortiSASE/svg_1'))
