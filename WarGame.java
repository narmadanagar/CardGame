// import 
import java.util.Scanner;
import java.util.ArrayList;

public class WarGame
{
   public static void main(String[] args) 
	{
      Scanner keyboard = new Scanner(System.in);
      //new WarGameGUI();
      Deck3 deck1 = new Deck3();
      CardPile player1 = new CardPile();
      CardPile player2 = new CardPile();
      
      //shuffles the cards
   	deck1.shuffle();
      //Checking the size of the Deck
   	System.out.println("size: " + deck1.size());
   
   	//Takes the deckOfCards and splits them up into 2 piles for Player1 and Player2
   	for(int i = 0; i < 26; i++)
   	{
   		player1.add(deck1.getTopCard());
   		player2.add(deck1.getTopCard());
   	}
               player1.shuffle();

        System.out.println(player1+"\n"+player2);
      
         while (player1.size() != 0 && player2.size() != 0)
         {  
            compareTop(player1,player2);
         }
        
        System.out.println(player1.size()+" "+player2.size());
        
         if (player1.size() > player2.size())
         {
            System.out.println("Player1 won!");
         }
         else
         {
            System.out.println("Player2 won!");
         }
     
      
     } //ends main
     
     
      /*
         compareTop method compares the ranks of the topmost card in the deck
      */
      public static void compareTop(CardPile player1,CardPile player2)
      {
         Card p1 = player1.getTopCard();
        // System.out.println(player1);
         Card p2 = player2.getTopCard();
        // System.out.println(player2);

         if (p1.getRank() > p2.getRank())
         {
            System.out.println("Player 1 got the card");
            player1.add(p1); // add cards to player 1
            player1.add(p2);
         }  
        
         else if(p1.getRank() < p2.getRank())
         {
           System.out.println("Player 2 got the card");
            //System.out.println(p2);
            player2.add(p1); // add cards to player 2
            player2.add(p2);
         }
        
         else
         { 

            // execute only of there are enough cards
            if (player1.size() >= 3 && player2.size() >=3)         
            {
               ArrayList<Card> tieCards = new ArrayList<Card>();
               war(player1,player2,tieCards,p1,p2);
            }
            else // if any of the player ran out of cards
            {
               if (player1.size() > player2.size())
               {
                  System.out.println("Player 1 won");
                  
                  System.exit(0);

               }
              
               else
               {
                  System.out.println("Player 2 won");
               
                  System.exit(0);
               }
            }
         }
       
      }// CompareTop method ends
     
      /*
         war method compares the cards in case a war occurs
      */
      public static void war(CardPile player1,CardPile player2,ArrayList<Card> tieCards,Card p1,Card p2)
      {        
          System.out.println("Both have same cards");
          // add cards of index 0 and 2 to the ArrayList
          
          tieCards.add(p1);
          tieCards.add(p2);
                  
          tieCards.add(player1.getTopCard());
          tieCards.add(player2.getTopCard());
         
         p1 = player1.getTopCard();
         p2 = player2.getTopCard();
          

         // in case a war occurs again         
         if (p1.getRank() == p2.getRank())
          {
               war(player1,player2,tieCards,p1,p2);
          }
         
          // if Player 1's index 2 is greater
          else if(p1.getRank() > p2.getRank())
          {
               tieCards.add(p1);
               tieCards.add(p2);


              System.out.println("Player 1 got the 3 cards");
               // add cards to the player 1's pile
               while (tieCards.size()!=0)
               {
                  for (int i=0; i<tieCards.size(); i++)
                  {
                     player1.add(tieCards.remove(0));
                  }
                 
               }
              
          }
         
          // if Player 2's index 2 is greater
          else
          {
               tieCards.add(p1);
               tieCards.add(p2);

               System.out.println("Player 2 got the 3 cards");
               
               // add cards to the player 2's pile
               while (tieCards.size()!=0)
               {
                  for (int i=0; i<tieCards.size(); i++)
                  {
                     player2.add(tieCards.remove(0));
                 }
                 
               }
          }
         
     }//War method ends

   
}//end of class
