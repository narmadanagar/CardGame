/*
   Nidhi Singh
   CS 110(A)
   Assignment #5.3
   The Card Class
*/

/**
   The Card class stimulates the cards game
*/
public class Card
{
   //fields  
   public final static int SPADES = 0; // Codes for the 4 suits
   public final static int CLUBS = 1;
   public final static int HEARTS = 2;
   public final static int DIAMONDS = 3;
   public final static int ACE = 1;      // Codes for the non-numeric cards.
   public final static int JACK = 11;    //   Cards 2 through 10 have their
   public final static int QUEEN = 12;   //   numerical values for their codes.
   public final static int KING = 13;
   private int rank;
   private int suit;
  
   /* Constructor
      Card initilizes the suit and rank variable
      @param suit The number of the suit from the main method
      @param rank The rank of the cards
   **/
  
   public Card(int suit, int rank)
   {
      this.suit = suit;
      this.rank = rank;
   }
  
   /**
      the getSuit method returns the suit variable
      @return The int value associated with the variable suit
   */
   public int getSuit()
   {
      return suit;
   }
  
   /**
      the getRank method returns the rank variable
      @return The int value associated with the variable rank
   */

   public int getRank()
   {
      return rank;
   }
  
   /**
      the toString method returns the output as a string. It first finds a proper value for both the variables
      @return The String for the output
   */

   public String toString()
   {
      String suitName;
      if (suit == SPADES)
         suitName = "SPADES";
      else if (suit == CLUBS)
         suitName = "CLUBS";
      else if (suit == HEARTS)
         suitName = "HEARTS";
      else
         suitName = "DIAMONDS";

 //     String str1 = "The suit is " + suitName;
 //     String str2 = "The rank is " + getRank();
 
 //     return str1+"\n"+str2;
      return suitName + " " + getRank();
   }
  
   /**
      the equals method compares the two card numbers
      @return The boolean value for the comparison
   */

   public boolean equals(Card otherCard)
   {
      if (rank == otherCard.getRank())
         return true;
      else
         return false;
  }
  
  
  
}

