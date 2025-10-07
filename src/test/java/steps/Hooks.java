package steps;

import base.BaseTests;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTests {

    @Before
    public void beforeSceanrio() {
        setUp();
    }

    @After
    public void afterSceanrio() {
        tearDown();
    }
}
