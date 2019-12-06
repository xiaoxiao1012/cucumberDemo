package com;

import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import login.LoginTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver driver;

    @当("^我打开163网站$")
    public void openURL() {
        //System.out.println("我打开163网站");
        System.setProperty("webdriver.chrome.driver","E:\\IDEA\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://mail.163.com");
    }
    @并且("^我在email文本框输入\"(.*?)\"$")
    public void senkEmail(String email) {
        System.out.println("我输入了emails"+email);
    }
    @并且("^我在密码框输入\"(.*?)\"$")
    public void senkPwd(String pwd){
        System.out.println("我输入了密码"+pwd);
    }
    @当("^我点击登录按钮$")
    public void loginClick() {
        System.out.println("我点击登录按钮");
    }
    @那么("^我登录成功$")
    public void loginSuccess() {
        System.out.println("登录成功");
    }

    @假如("^我用\"(.*?)\"账号,密码\"(.*?)\"登录$")
    public void login(String email, String pwd) {
        LoginTest.login(driver,email,pwd);
    }

    @当("^关闭网站$")
    public void close() {
        driver.quit();
    }
}
