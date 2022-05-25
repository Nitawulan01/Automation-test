import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://dev.p2p.alamisharia.co.id/")
selenium.click("link=Daftar disini")
selenium.click("xpath=//img[@alt='benef']")
selenium.click("id=registerNamaBenef")
selenium.type("id=registerNamaBenef", ("Nita Wulan lagi").toString())
selenium.click("id=registerEmailBenef")
selenium.type("id=registerEmailBenef", ("nita.wulan04@gmail.com").toString())
selenium.click("id=BenefPhone")
selenium.type("id=BenefPhone", "08111128583")
selenium.click("id=showPassword")
selenium.type("id=showPassword", ("Luvylove1@").toString())
selenium.click("id=showPassword2")
selenium.type("id=showPassword2", ("Luvylove1@").toString())
selenium.click("id=registerReferralId")
selenium.select("id=registerReferralId", "label=Instagram")
selenium.click("id=daftarAlami")
selenium.click("id=registerEmailBenef")
selenium.click("id=registerEmailBenef")
selenium.type("id=registerEmailBenef", ("nita.wulan0@gmail.com").toString())
selenium.click("id=daftarAlami")
selenium.click("name=financingSize")
selenium.type("name=financingSize", ("10.000").toString())
selenium.type("name=financingSize", ("10.000").toString())
selenium.click("name=financingPayor")
selenium.type("name=financingPayor", ("PT.tidak").toString())
selenium.click("xpath=//form[@id='registerBenefForm']/div[8]/div/div/button")
selenium.click("link=PT")
selenium.click("name=companyName")
selenium.type("name=companyName", "hahaha")
selenium.click("xpath=//form[@id='registerBenefForm']/div[9]/div")
selenium.click("xpath=//body")
selenium.click("link=18")
selenium.click("xpath=//div[@id='dtp_7OWLJ']/div/div[2]/button[4]")
selenium.click("name=companyEstablishmentNumber")
selenium.type("name=companyEstablishmentNumber", "19")
selenium.click("xpath=//form[@id='registerBenefForm']/div[10]/div/div/div/button")
selenium.click("xpath=//form[@id='registerBenefForm']/div[10]/div/div/div/div/div/ul/li[5]/a/span")
selenium.select("name=companyProvince", "label=DI Yogyakarta")
selenium.click("xpath=//form[@id='registerBenefForm']/div[10]/div[2]/div/div/button")
selenium.click("xpath=//form[@id='registerBenefForm']/div[10]/div[2]/div/div/div/div/ul/li[3]/a/span")
selenium.select("name=companyCity", "label=Kab. Kulon Progo")
selenium.click("name=langganan")
selenium.click("id=setujuKebijakanBenef")
selenium.click("id=submitRegister2")
selenium.click("xpath=//form[@id='registerBenefForm']/div[6]/div[2]/div/div/button")
selenium.click("xpath=//form[@id='registerBenefForm']/div[6]/div[2]/div/div/div/div/ul/li[4]/a/span")
selenium.select("id=payorRelationship", "label=> 3 - 4 th")
selenium.click("name=companyNpwp")
selenium.click("id=companyNpwpFile")
selenium.type("id=companyNpwpFile", ("C:\\fakepath\\Application_Form- Nita.docx").toString())
selenium.click("name=companyIncomeAmount1")
selenium.type("name=companyIncomeAmount1", ("13.323").toString())
selenium.type("name=companyIncomeAmount1", ("13.323").toString())
selenium.click("name=companyIncomeAmount2")
selenium.type("name=companyIncomeAmount2", ("11.111").toString())
selenium.type("name=companyIncomeAmount2", ("11.111").toString())
selenium.click("id=financialReport")
selenium.type("id=financialReport", ("C:\\fakepath\\CV_Nita.pdf").toString())
selenium.click("xpath=//form[@id='registerBenefForm']/div[17]")
selenium.click("id=submitRegister2")
