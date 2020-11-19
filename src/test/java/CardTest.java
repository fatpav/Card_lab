import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card playingCard;

    @Before
    public void before(){
        playingCard = new Card(SuitType.HEARTS);
    }

    @Test
    public void cardHasSuit(){
        assertEquals(SuitType.HEARTS, playingCard.getSuit());
    }
}
