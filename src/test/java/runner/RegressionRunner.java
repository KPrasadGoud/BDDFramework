package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue="steps",
//features="src\\test\\resources\\features\\regression\\ValidateLogin.feature",
features="src\\test\\resources\\features\\regression\\ValidateLogin2.feature",
dryRun = false,
//tags="@prasad12",
tags="@regression",
stepNotifications=true)
public class RegressionRunner {

}
