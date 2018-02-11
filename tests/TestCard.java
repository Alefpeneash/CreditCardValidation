package classes.testcard;

import classes.card.*;
import org.junit.Test;
//import org.junit.Assert.assertEquals;
import junit.framework.Assert;
import static junit.framework.Assert.*;
// package ru.javastudy.junit;
// import org.junit.*;
// import static org.junit.Assert.*;

public class TestCard{
    @Test
  	public void typeTest() {
      boolean check = true;

      Card visaTest = new Card("4276550033998892");
      Card masterCardTest = new Card("5525410414265870");

      assertTrue(visaTest.getType() == "Visa");
      assertTrue(masterCardTest.getType() == "MasterCard");
    }
}
