package classes.card;

class CardIO{
  public static void main(String[] args) {
    String cardInputId = args[0];

    if (CardValdation.validation(cardInputId)){
      Card card = new Card(cardInputId);
      System.out.println(card.toString());
    }
    else{
      System.out.println("Input error");
    }
  }
}
