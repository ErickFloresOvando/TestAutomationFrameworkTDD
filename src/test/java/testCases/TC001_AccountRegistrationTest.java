package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;


public class TC001_AccountRegistrationTest extends BaseClass  {



    @Test(groups = {"Regression","Master"})
    public void verify_account_registration() {
        try{
            logger.info("**** Starting TC001_AccountRegistrationTest ****");

            HomePage hp = new HomePage(driver);
            hp.clickMyAccount();
            logger.info("Clicked on MyAccount Link");

            hp.clickRegister();
            logger.info("Clicked on Register Link");

            AccountRegistrationPage regpage = new AccountRegistrationPage(driver);

            regpage.setFirstName(randomeString().toUpperCase());
            regpage.setLastName(randomeString().toUpperCase());
            regpage.setEmail(randomeString()+"@gmail.com");
            regpage.setTelephone(randomeNumber());

            String password = randomAlphaNumeric();
            regpage.setPassword(password);
            regpage.setConfirmPassword(password);

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
        logger.info("**** Finished TC001_AccountRegistrationTest ****");

    }

    //Test Case 2

    //Test Case 3


}
