package testCases.accountManagement;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.DataProviders;


public class RegisterPageTest extends BaseClass  {


    /*
    //Test Case 1
    @Test(testName = "[TC-001] Registro exitoso con campos obligatorios", dataProvider = "RegisterPage", dataProviderClass = DataProviders.class, groups = {"Positive","RegisterPage"})
    public void successfulRegistrationWithMandatoryFields(String firstName, String lastName, String email, String telephone, String password,String confirmPassword) throws InterruptedException {
        try{
            logger.info("**** Starting [TC-001] Registro exitoso con campos obligatorios ****");

            HomePage hp = new HomePage(driver);
            hp.clickMyAccount();
            logger.info("Clicked on MyAccount Link");

            hp.clickRegister();
            logger.info("Clicked on Register Link");

            AccountRegistrationPage regpage = new AccountRegistrationPage(driver);

            regpage.setFirstName(firstName);
            regpage.setLastName(lastName);
            regpage.setEmail(email);
            regpage.setTelephone(telephone);

            regpage.setPassword(password);
            regpage.setConfirmPassword(confirmPassword);

            Thread.sleep(9000);
            regpage.setPrivacyPolicy();
            regpage.clickContinue();

            logger.info("Validating expected message...");
            String confmsg = regpage.getConfirmationMsg();
            if(confmsg.equals("Your Account Has Been Created!")){
                Assert.assertTrue(true);

            }else{
                logger.error("Test Failed");
                logger.debug("Debug logs..");
                Assert.assertTrue(false);
            }
            //Assert.assertEquals(confmsg, "Your Account Has Been Created!");

        }catch (Exception e){
            Assert.fail();
        }
        logger.info("**** Finished [TC-001] Registro exitoso con campos obligatorios ****");

}

*/


    //Test Case 2
    @Test(testName = "[TC-002] Registro fallido por email duplicado", dataProvider = "RegisterPage", dataProviderClass = DataProviders.class, groups = {"Negative","RegisterPage"})
    public void failedRegistrationWithDuplicateEmail(String firstName, String lastName, String email, String telephone, String password,String confirmPassword) throws InterruptedException {
        try{
            logger.info("**** Starting [TC-002] Registro fallido por email duplicado ****");

            HomePage hp = new HomePage(driver);
            hp.clickMyAccount();
            logger.info("Clicked on MyAccount Link");

            hp.clickRegister();
            logger.info("Clicked on Register Link");

            AccountRegistrationPage regpage = new AccountRegistrationPage(driver);

            regpage.setFirstName(firstName);
            regpage.setLastName(lastName);
            regpage.setEmail(email);
            regpage.setTelephone(telephone);

            regpage.setPassword(password);
            regpage.setConfirmPassword(confirmPassword);

            Thread.sleep(9000);
            regpage.setPrivacyPolicy();
            regpage.clickContinue();

            logger.info("Validating expected message...");
            String confmsg = regpage.getWarningMsg();
            if(confmsg.equals("Warning: E-Mail Address is already registered!")){
                Assert.assertTrue(true);

            }else{
                logger.error("Test Failed");
                logger.debug("Debug logs..");
                Assert.assertTrue(false);
            }
        }catch (Exception e){
            Assert.fail();
        }
        logger.info("**** Finished [TC-002] Registro fallido por email duplicado ****");

    }

    //Test Case 3














}



