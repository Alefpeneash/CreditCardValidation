package classes.card;

/*
class which is a pseudo database from which we can in particular
obtain information about the parameters of the defining
*/

class ListOfTypes{
  private static  TypeCardFormat[] tcfArr = new TypeCardFormat[4];
  //initializing instances of a class
  public static void init(){
    int[] bon = new int[] {34, 37};
    int[] len = new int[] {15};
    TypeCardFormat amex = new TypeCardFormat("AMEX", bon, len);
    tcfArr[0] = amex;

    bon = new int[] {6011};
    len = new int[] {16};
    TypeCardFormat discover = new TypeCardFormat("Discover", bon, len);
    tcfArr[1] = discover;

    bon = new int[] {51, 52, 53, 54, 55};
    len = new int[] {16};
    TypeCardFormat mastercard = new TypeCardFormat("MasterCard", bon, len);
    tcfArr[2] = mastercard;

    bon = new int[] {4};
    len = new int[] {13, 16};
    TypeCardFormat visa = new TypeCardFormat("Visa", bon, len);
    tcfArr[3] = visa;
  }
  //method that is used to retrieve information from a pseudo database
  public static TypeCardFormat[] get(){
    return tcfArr;
  }
}
