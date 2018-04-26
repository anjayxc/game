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
        assertEquals(0, game.frame());
    }

    @Test
    public void oneRoll_10() {
        Game game = new Game();
        game.roll(5);
        assertEquals(5, game.score());
        assertEquals(0, game.frame());
    }

    @Test
    public void twoRoll_1_4() {
        Game game = new Game();
        game.roll(1);
        game.roll(4);
        assertEquals(5, game.score());
        assertEquals(0, game.frame());
    }

    @Test
    public void twoRoll_10_4() {
        Game game = new Game();
        game.roll(10);
        game.roll(4);
        assertEquals(1, game.frame());
        assertEquals(18, game.score());
    }

    @Test
    public void threeRoll_4_3_5() {
        Game game = new Game();
        game.roll(4);
        game.roll(3);
        game.roll(5);
        assertEquals(1, game.frame());
        assertEquals(12, game.score());
    }

    @Test
    public void threeRoll_4_6_5() {
        Game game = new Game();
        game.roll(4);
        game.roll(6);
        game.roll(5);
        assertEquals(1, game.frame());
        assertEquals(20, game.score());
    }

    @Test
    public void threeRoll_10_3_5() {
        Game game = new Game();
        game.roll(10);
        game.roll(3);
        game.roll(5);
        assertEquals(1, game.frame());
        assertEquals(26, game.score());
    }

    @Test
    public void fourRoll_3_4_3_4() {
        Game game = new Game();
        game.roll(3);
        game.roll(4);
        game.roll(3);
        game.roll(4);
        assertEquals(1, game.frame());
        assertEquals(14, game.score());
    }

}
