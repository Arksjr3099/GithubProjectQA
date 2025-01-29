package GithubWeb;


import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {

    @Test
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);

        login.openGitUr();
        login.clickOnSignInBtn();
    }

    @Test
    public void SignUpMethod() throws InterruptedException {
        LoginPages SignUp = new LoginPages(driver);
        SignUp.openGitUr();
        SignUp.clickOnSignUpBtn();
        Thread.sleep(400);
        SignUp.clickOnTermsBtn();
        Thread.sleep(400);
    }

    @Test
    public void SignUpPrivacyMethod() throws InterruptedException {
        LoginPages SignUp = new LoginPages(driver);
        SignUp.openGitUr();
        SignUp.clickOnSignUpBtn();
        Thread.sleep(300);
        SignUp.githubPrivacy();
        Thread.sleep(3000);
    }

    @Test
    public void SignUpStatMethod() throws InterruptedException {
        LoginPages SignUp = new LoginPages(driver);
        SignUp.openGitUr();
        SignUp.clickOnSignUpBtn();
        Thread.sleep(300);
        SignUp.githubStat();
        Thread.sleep(4000);
    }
}