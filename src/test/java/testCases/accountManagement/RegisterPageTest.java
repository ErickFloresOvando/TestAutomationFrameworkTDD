package testCases.accountManagement;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.DataProviders;


public class RegisterPageTest extends BaseClass  {


  
    @Test(testName = "[TC-001] Registro exitoso con campos obligatorios", dataProvider = "RegisterPage", dataProviderClass = DataProviders.class, groups = {"Regression","Master"})
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

}

    //Test Case 2

    //Test Case 3



