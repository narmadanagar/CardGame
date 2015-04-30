/*
Nidhi Singh
CS 110 (Assignment #10)
CardPile Class - holds a "pile" of Cards and has methods to access them
*/
import java.util.ArrayList;

public class CardPile
{
	//uses an ArrayList of Cards to actually store cards
	private ArrayList<Card> pile;

	//constructor - creates the ArrayList that will be used
	public CardPile()
	{
		pile = new ArrayList<Card>();
	}
   
   
	//methods

	//add - puts a Card at the end ("bottom") of the pile.  It just uses the ArrayList method
	public void add(Card aCard)
	{
		pile.add(aCard);
	}

   //add - puts a Card at the end ("bottom") of the pile.  It just uses the ArrayList method
	public Card remove(int i)
	{
		return pile.remove(i);
      
	}

	//getTopCard - removes and returns the "top" card of the  pile.  It just uses the ArrayList method
	public Card getTopCard()
	{
		return pile.remove(0);
	}

	//toString - returns a String representation of the pile.  It just uses the ArrayList method
	public String toString()
	{
		return pile.toString();
	}
   
   public Card get(int i)
   {
      return pile.get(i);
   }
   
   public Card set(int i, Card card1)
   {
      return pile.set(i,card1);
   }


	//size - returns the size of the pile.  It just uses the ArrayList method
	public int size()
	{
		return pile.size();
	}

	//clear - empties the pile.  It just uses the ArrayList method
	public void clear()
	{
		pile.clear();
	}

      
   
}
