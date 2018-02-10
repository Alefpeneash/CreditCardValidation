package classes.card;

import java.io.*;
import java.lang.Iterable;


//Class that is needed for basic validation
class CardValdation{
  protected static boolean validation(String ID){
    boolean result = true;

    if (ID.length() > 16){
      result = false;
      return result;
    }

    try{
      long val =Long.parseLong(ID);
    }
    catch(NumberFormatException e){
      result = false;
      return result;
    }

    return result;
  }

}
