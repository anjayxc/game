package dojo;

import com.sodacar.dojo.Game;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void oneRoll_0() {
        Game game = new Game();
        game.roll(0);
        assertEquals(0, game.score());
    }

    @Test
    public void oneRoll_10() {
        Game game = new Game();
        game.roll(5);
        assertEquals(5, game.score());
    }

    @Test
    public void twoRoll_1_4() {
        Game game = new Game();
        game.roll(1);
        game.roll(4);
        assertEquals(5, game.score());
    }

   

}
