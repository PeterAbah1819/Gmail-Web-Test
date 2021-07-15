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

WebUI.navigateToUrl('https://accounts.google.com/signup')

WebUI.delay(7)

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_Create your Google Account_firstName'), 
    'Johnna')

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_Create your Google Account_lastName'), 
    'Doeson')

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_Create your Google Account_Username'), 
    'johnnadoesonn')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create your Google Account/input_Use my current email address instead_Passwd'), 
    '1CLVr/oaJYu0hL5vMluESw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create your Google Account/input_Use my current email address instead__f01a3e'), 
    '1CLVr/oaJYu0hL5vMluESw==')

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/input_Use 8 or more characters with a mix o_340e70'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/div_Show password'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_Zimbabwe_phoneNumberId'), '08127738594')

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_G-_code'), '137465')

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Verify'))

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_Zimbabwe_recoveryEmail'), 'peterabah1819@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_Well use it to keep your account secure_day'), 
    '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create your Google Account/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Page_Create your Google Account/input_Month_year'), '2001')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create your Google Account/select_FemaleMaleRather not sayCustom'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Skip'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Privacy and Terms'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/div_Data that we process when you use Google'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/div_Why we process it'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/div_Youre in control'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_I agree'))

WebUI.delay(2)

