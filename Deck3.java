/**
 * Representation of a Deck of cards. 
 * Initialized to a standard 52 card deck.
 *
 * @author Jackie Horton
 */
import java.util.Random;
import java.util.ArrayList;

public class Deck3 extends CardPile
{
   /**
      NUMBER of cards in standard deck {@value #CARDS_IN_DECK}
   **/
   final int CARDS_IN_DECK = 52;

    
   /**
    * Constructs a regular 52-card deck.  Initially, the cards
    * are in a sorted order.  The shuffle() method can be called to
    * randomize the order. 
    */
   public Deck3()
   {
      super();
      freshDeck();
   }
   /**
   * Create a new collection of 52 cards, in sorted order
    */
   public void freshDeck()
   {

      for (int r = Card.ACE; r<=Card.KING;r++)
      {
         for (int s=Card.SPADES;s<=Card.DIAMONDS;s++)
         {
           add(new Card(s,r));
         }
      }
   }
   /**
     * Remove and return the top Card on the Deck
     * @return A reference to a Card that was top on the Deck
     */
   public Card dealCard()
   {
      Card c = remove(0);  //  remove it (returns removed object)
      return c;
   }
   /**
     * Return current number of Cards in Deck
     * @return number of Cards in Deck
     */

   public int cardsRemaining()
   { 
      return size();
   }
   /**
     * Randomize the order of Cards in Deck
     */

   public void shuffle()
   {
      int randNum;
      Card temp;
      Random r = new Random();
      for (int i = 0; i < size(); i++)
      {
         randNum = r.nextInt(size());
         temp = get(i);
         set(i,get(randNum));
         set(randNum,temp);
      }     
   }
   /**
     * Determine if Deck is empty
     * @return true if there are no more cards, false otherwise
     */
  
   public boolean isEmpty()
   {
      return (size() == 0);
   }
   
}

  
  
 


