package classes.card;

import java.io.*;
import java.util.ArrayList;

public class Card{
  private String num;
  private String type;
  private boolean luhnRes;//Luhn algorithm result
  private int length;//lenth of card number

  public Card(String num){
    this.num = num;
    this.length = this.num.length();
    this.type = typeDefine();
    this.luhnRes = luhnCheck();
  }

//Method that determines the type
//checks against data received from a pseudo database.
//This approach is used to avoid hardcode and for greater flexibility of the program.
//So to add new types of cards we don't need to change the code here but simply add
//a new type to the database.
  private String typeDefine(){
    String mfulNums;
    String type;

    boolean lenCheck;
    boolean mfulNumsCheck;

    ListOfTypes.init();
    TypeCardFormat[] tcfArr = ListOfTypes.get();

    for(int i = 0; i < tcfArr.length; i++){
      mfulNums = this.num.substring(0,tcfArr[i].getMfulNumQuan());
      lenCheck = false;
      mfulNumsCheck = false;

      int[] bon = tcfArr[i].getBeginsOfNum();
      for(int j = 0; j < bon.length; j++){
        if(Integer.toString(bon[j]).equals(mfulNums)){
            mfulNumsCheck = true;
            break;
        }
      }

      int[] lens = tcfArr[i].getLengths();
      for(int k = 0; k < lens.length; k++){
        if(this.length == lens[k]){
            lenCheck = true;
            break;
        }
      }

      if(mfulNumsCheck && lenCheck){
        return tcfArr[i].getTypeName();
      }
    }

    return "Unknown";
  }

//Private method for validation by Luhn algorithm
  private boolean luhnCheck(){
    String numArr[]  = num.split("");
    int numIntArr[] = new int[this.length];
    int sum = 0;

    for (int i = 0; i < this.length; i++) {
      numIntArr[i] = Integer.parseInt(numArr[i]);
    }

    for (int i = 0; i < this.length; i++) {
      int val = numIntArr[this.length - i - 1];

      if (i % 2 == 1) {
        val *= 2;
      }
      sum += val > 9 ? val - 9 : val;
    }

    return sum % 10 == 0;
  }

  public boolean getLuhnCheck(){
    return this.luhnRes;
  }

  public String getNum(){
    return this.num;
  }

  public String getType(){
    return this.type;
  }

  @Override
  public String toString(){
    return "Card: " + this.num + "; Type: " + this.type + "; Luhn check: " + (luhnRes ? "valid" : "invalid");
  }

}
