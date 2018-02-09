import java.util.ArrayList;

class CardIO{
  public static void main(String[] args) {
    String cardInputId = args[0];

    if (CardValdation.validation(cardInputId)){
      Card card = new Card(cardInputId);

      ArrayList<TypeCardFormat> ruleSet = new ArrayList<TypeCardFormat>();
      int beginsOfNum[];
      int lengths[];

      beginsOfNum[] = {34, 37};
      lengths[] = {15};
      ruleSet.add("AMEX", beginsOfNum[], lengths[]);

      beginsOfNum[] = {6011};
      lengths[] = {16};
      ruleSet.add("Discver", beginsOfNum[], lengths[]);

      beginsOfNum[] = {51, 52, 53, 54, 55};
      lengths[] = {16};
      ruleSet.add("MasterCard", beginsOfNum[], lengths[]);

      beginsOfNum[] = {4};
      lengths[] = {13, 16};
      ruleSet.add("Visa", beginsOfNum[], int[] lengths[]);

      System.out.println(card.toString());
    }
    else{
      System.out.println("fuck you");
    }
  }
}
