import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(true);
    }
    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }
    @Test
    public void minimoDosJugadores() {
        Game trivial = new Game();
        trivial.esJugable();
        Assertions.assertTrue(true);
    }
}
