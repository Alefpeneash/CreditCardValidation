final class CardIO{
  public static void main(String[] args) {
    String cardInputId = args[0];

    if (CardValdation.validation(cardInputId)){
      Card card = new Card(cardInputId);

      
      System.out.println(card.toString());
    }
    else{
      System.out.println("fuck you");
    }
  }
}