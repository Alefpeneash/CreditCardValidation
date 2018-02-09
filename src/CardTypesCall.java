import java.util.ArrayList;

class CardTypesCall{
  // private ArrayList<TypeCardFormat> ruleSet = new ArrayList<TypeCardFormat>();
  private TypeCardFormat[] ruleSet; // = new TypeCardFormat();

  CardTypesCall(){
    int[] beginsOfNum;
    int[] lengths;

    beginsOfNum = new int[] {34, 37};
    lengths = new int[] {15};
    TypeCardFormat amex = new TypeCardFormat("AMEX", beginsOfNum, lengths);
    ruleSet.add(amex);

    beginsOfNum = new int[] {6011};
    lengths = new int[] {16};
    TypeCardFormat discover = new TypeCardFormat("Discover", beginsOfNum, lengths);
    ruleSet.add(discover);

    beginsOfNum = new int[] {51, 52, 53, 54, 55};
    lengths = new int[] {16};
    TypeCardFormat mastercard = new TypeCardFormat("MasterCard", beginsOfNum, lengths);
    ruleSet.add(mastercard);

    beginsOfNum = new int[] {4};
    lengths = new int[] {13, 16};
    TypeCardFormat visa = new TypeCardFormat("Visa", beginsOfNum, lengths);
    ruleSet.add(visa);
  }


  public ArrayList<TypeCardFormat> getListOfTypes(){
    return this.ruleSet;
  }
}
