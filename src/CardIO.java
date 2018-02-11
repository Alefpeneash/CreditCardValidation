package classes.card;

// Input-Output class.
class CardIO{
  public static void main(String[] args) {
    String cardInputId = args[0];

// In if called general validation method
    if (CardValdation.validation(cardInputId)){
// Create an card object with given card number
      Card card = new Card(cardInputId);
      System.out.println(card.toString());
    }
    else{
      System.out.println("Input error");
    }
  }
}
