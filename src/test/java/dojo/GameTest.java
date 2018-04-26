package dojo;

import com.sodacar.dojo.Game;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void oneRoll_0() {
        Game game = new Game();
        game.roll(0);
        assertEquals(1, game.frame());
        assertEquals(0, game.score());
    }

    @Test
    public void oneRoll_10() {
        Game game = new Game();
        game.roll(5);
        assertEquals(1, game.frame());
        assertEquals(5, game.score());
    }

    @Test
    public void twoRoll_1_4() {
        Game game = new Game();
        game.roll(1);
        game.roll(4);
        assertEquals(1, game.frame());
        assertEquals(5, game.score());
    }

    @Test
    public void twoRoll_10_4() {
        Game game = new Game();
        game.roll(10);
        game.roll(4);
        assertEquals(2, game.frame());
        assertEquals(18, game.score());
    }

    @Test
    public void threeRoll_4_3_5() {
        Game game = new Game();
        game.roll(4);
        game.roll(3);
        game.roll(5);
        assertEquals(2, game.frame());
        assertEquals(12, game.score());
    }

    @Test
    public void threeRoll_4_6_5() {
        Game game = new Game();
        game.roll(4);
        game.roll(6);
        game.roll(5);
        assertEquals(2, game.frame());
        assertEquals(20, game.score());
    }

    @Test
    public void threeRoll_10_3_5() {
        Game game = new Game();
        game.roll(10);
        game.roll(3);
        game.roll(5);
        assertEquals(2, game.frame());
        assertEquals(26, game.score());
    }

    @Test
    public void fourRoll_3_4_3_4() {
        Game game = new Game();
        game.roll(3);
        game.roll(4);
        game.roll(3);
        game.roll(4);
        assertEquals(2, game.frame());
        assertEquals(14, game.score());
    }

    @Test
    public void fourRoll_3_7_3_4() {
        Game game = new Game();
        game.roll(3);
        game.roll(7);
        game.roll(3);
        game.roll(4);
        assertEquals(2, game.frame());
        assertEquals(20, game.score());
    }

    @Test
    public void fourRoll_10_4_6_4() {
        Game game = new Game();
        game.roll(10);
        game.roll(4);
        game.roll(6);
        game.roll(4);
        assertEquals(3, game.frame());
        assertEquals(38, game.score());
    }

    @Test
    public void sixRoll_10_4_6_10_3_3() {
        Game game = new Game();
        game.roll(10);
        game.roll(4);
        game.roll(6);
        game.roll(10);
        game.roll(3);
        game.roll(3);
        assertEquals(4, game.frame());
        assertEquals(62, game.score());
    }

    @Test
    public void tenRoll_all10_extra_10_10() {
        Game game = new Game();
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        assertEquals(10, game.frame());
        assertEquals(300, game.score());
    }

    @Test
    public void nineRoll_all10_and_3_5() {
        Game game = new Game();
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(3);
        game.roll(5);
        assertEquals(10, game.frame());
        assertEquals(259, game.score());
    }

    @Test
    public void nineRoll_all10_and_3_7_5() {
        Game game = new Game();
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(3);
        game.roll(7);
        game.roll(5);
        assertEquals(10, game.frame());
        assertEquals(268, game.score());
    }

    @Test
    public void case_from_contest() {
        Game game = new Game();
        game.roll(1);
        game.roll(4);
        game.roll(4);
        game.roll(5);
        game.roll(6);
        game.roll(4);
        game.roll(5);
        game.roll(5);
        game.roll(10);
        game.roll(0);
        game.roll(1);
        game.roll(7);
        game.roll(3);
        game.roll(6);
        game.roll(4);
        game.roll(10);
        game.roll(2);
        game.roll(8);
        game.roll(6);
        assertEquals(10, game.frame());
        assertEquals(133, game.score());
    }

}
