package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "";

    assertThat(greeter.greet(someone), containsString(someone));
    fail();
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
    fail();
  }
}
