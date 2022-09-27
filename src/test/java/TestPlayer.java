import org.example.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;






public class TestPlayer {
    Player test1 = new Player(0, 20, 2, true);
    Player test2 = new Player(70, 20, 2, true);
    Player test3 = new Player(60, 40, 2, true);


    //    Player test2 = new Player(2,3,0, false);
    @Test
    @DisplayName("Test is player lose a live correctly")
    void playerLoseLiveOk() {
        test1.loseLive();

        assertEquals(1, test1.getLives());
        assertEquals(100, test1.getHealth());
    }

    @Test
    @DisplayName("Test player attack another player")
    void attackedMethodOk() {
        Player.attack(test2, test3);
        Player.attack(test3, test2);

        assertEquals(40, test3.getHealth());
        assertEquals(30, test2.getHealth());

    }
}
