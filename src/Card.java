import java.io.*;

class Card{
  private String num;
  private String type;
  private boolean luhnRes;
  private int length;

  Card(String num){
    this.num = num;
    this.length = this.num.length();
    this.type = typeDefine();
    this.luhnRes = luhnCheck();
  }
  private String typeDefine(){
    String firstTwoLet = this.num.substring(0,2);
    String type;
    // System.out.println(len);
    // System.out.println(firstTwoLet);
    //temporary
    switch(this.length){
      case 13:
        type = "Visa";
        break;
      case 15:
        type = "AMEX";
        break;
      case 16:
        switch(firstTwoLet.substring(0,1)){
          case "4":
            type = "Visa";
            break;
          case "5":
            type = "MasterCard";
            break;
          case "6":
            type = "Discover";
            break;
          default:
            type = "Unknown";
            break;
        }
        break;
      default:
        type = "Unknown";
        break;
    }
    //temporary

    return type;
  }

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

  @Override
  public String toString(){
    return "Card: " + this.num + " Type: " + this.type + " Luhn check: " + (luhnRes ? "valid" : "invalid");
  }

}
