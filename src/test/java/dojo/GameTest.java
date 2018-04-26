package dojo;

import com.sodacar.dojo.Game;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void one() {
        Game game = new Game();
        game.roll(0);
        assertEquals(0, game.score());
    }

    @Test
    public void oneTen() {
        Game game = new Game();
        game.roll(10);
        assertEquals(10, game.score());
    }

}
