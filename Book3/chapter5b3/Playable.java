public interface Playable
{
 void play();
}

private void startGame(Dealable deck, String game)
{
 if (game.equals("Poker"))
 deck.deal(5);
 else if (game.equals("Hearts"))
 deck.deal(13);
 else if (game.equals("Gin"))
 deck.deal(10);
}

private void startGame(Dealable deck, String game)
{
 if (game.equals("Poker"))
 deck.deal(5);
 else if (game.equals("Hearts"))
 deck.deal(13);
 else if (game.equals("Gin"))
 deck.deal(10);
}

CardDeck d = new CardDeck();
startGame(d, "Hearts");
