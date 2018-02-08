class CardIO{
  public static void main(String[] args) {
    String cardInputId = args[0];
    // There is some card validation
    Card card = new Card(cardInputId);
    // There is validation by task
    System.out.println(card.toString());
  }
}
