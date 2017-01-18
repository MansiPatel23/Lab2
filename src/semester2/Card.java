
package semester2;

/**
 *
 * @author Mansi
 */
public class Card {
    private String faceName,suit;
    private int faceValue;
    
    public Card(String face,String suit,int value)
    {
        faceName=face;
        setSuit(suit);
        setValue(value);
    }
    
    /**
     * This method will return a string to represent the card
     */
    
    @Override
    public String toString()
    {
        return faceName+" of "+suit;
    }
/**
 * This method will validate if the suit is valid(i.e. hearts, diamonds,space or clubs)
 */
    private void setSuit(String suit)
    {
        if(suit.equalsIgnoreCase("hearts")||suit.equalsIgnoreCase("diamonds")||suit.equalsIgnoreCase("clubs")||suit.equalsIgnoreCase("spades"))
        {
            this.suit=suit;
        }
        else
        throw new IllegalArgumentException("suit must be hearts,diamonds, clubs or spades");
    }
    
    /**
    *This will validate that the input is between 2-14 and set the card value accordingly
    */
    private void setValue(int value)
    {
        if(value<2||value>14)
        {
            throw new IllegalArgumentException("Face value must be 2-14 inclusive");
        }
        else
            faceValue=value;
    }
    
    public String getFaceName()
    {
        return faceName;
    }
    public int getFaceValue()
    {
        return faceValue;
    }
    
  public String suit()
  {
      return suit;
  }
    
}
