package com.co.choucair.tasks;

import com.co.choucair.models.UserLoombokData;
import com.co.choucair.userinterfaces.SerenityLoginPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.userinterfaces.SerenityLoginPage.TXT_PASS;
import static com.co.choucair.userinterfaces.SerenityLoginPage.TXT_USER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    UserLoombokData userLoombokData;

    public Login(UserLoombokData userLoombokData) {
        this.userLoombokData = userLoombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USER, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(TXT_USER),
                SendKeys.of(userLoombokData.getUser()).into(SerenityLoginPage.TXT_USER),
                //Enter.theValue(userLoombokData.getUser()).into(SerenityLoginPage.TXT_USER),
                Click.on(TXT_PASS),
                SendKeys.of(userLoombokData.getPass()).into(SerenityLoginPage.TXT_PASS),
                JavaScriptClick.on(SerenityLoginPage.BTN_SUBMIT),
                WaitUntil.the(SerenityLoginPage.TXT_VALIDATION, isVisible()).forNoMoreThan(20).seconds()
        );
    }

    public static Login onTheSite(UserLoombokData userLoombokData){
        return Instrumented.instanceOf(Login.class).withProperties(userLoombokData);
    }
}
