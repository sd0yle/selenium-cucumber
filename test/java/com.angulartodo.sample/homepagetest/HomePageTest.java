package com.angulartodo.sample.homepagetest;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

public class HomePageTest {
    @RunWith(Cucumber.class)
    @CucumberOptions(features = {"src/test/resources/com/angulartodo/sample/Home_page.feature"},
            strict = false, plugin = {"pretty",
            "json:target/cucumber_json_reports/home-page.json",
            "html:target/home-page-html"},
            glue = {"com.angulartodo.sample.driver",
                    "com.angulartodo.sample.homepage"})
    public class HomePageTest {
    }

}
