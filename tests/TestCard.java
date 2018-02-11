package classes.testcard;

import classes.card.*;
import org.junit.Test;
import junit.framework.Assert;
import static junit.framework.Assert.*;


public class TestCard{
    @Test
  	public void typeTest() {
      Card visaTest = new Card("4276550033998892");
      Card masterCardTest = new Card("5265055996136803");

      assertTrue(visaTest.getType() == "Visa");
      assertTrue(masterCardTest.getType() == "MasterCard");
    }

    @Test
    public void luhnCheckTest() {
      Card visaTest = new Card("4276550033998892");
      Card masterCardTest = new Card("5265055996136803");

      assertTrue(visaTest.getLuhnCheck());
      assertTrue(masterCardTest.getLuhnCheck());
    }

    @Test
    public void firstValidationCheck(){
      assertTrue(CardValdation.validation("4126350333194892"));
      assertFalse(CardValdation.validation("abc"));
    }

}
