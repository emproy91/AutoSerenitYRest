package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityLoginPage {
  public static final Target TXT_USER = Target.the("txt")
          .located(By.name("username-input")); //xpath("//input[@id='username-input']"));
  public static final Target TXT_PASS = Target.the("txt")
          .located(By.name("password-input")); //xpath("//input[@id='LoginPanel0_Password']"));
  public static final Target BTN_SUBMIT = Target.the("txt")
          .located(By.id("login-submit")); //xpath("//button[@id='LoginPanel0_LoginButton']"));
  public static final Target TXT_VALIDATION = Target.the("txt")
          .located(By.cssSelector(".h1") ); //xpath("//*[@id=\"main\"]/div/div/div[2]/div/form/div/div/div[1]"));

}