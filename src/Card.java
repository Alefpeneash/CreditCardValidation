import java.io.*;

class Card{
  private String num;
  private String type;

  Card(String num){
    this.num = num;
    this.type = typeDefine();
  }
  private String typeDefine(){
    int len = this.num.length();
    String firstTwoLet = this.num.substring(0,2);
    String type;
    // System.out.println(len);
    // System.out.println(firstTwoLet);
    //temporary
    switch(len){
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

  @Override
  public String toString(){
    return "Card: " + this.num + " Type: " + this.type;
  }

}
