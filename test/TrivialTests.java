import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1() {
        Game sut = new Game();
        sut.agregar("María");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de María es 1";

        String actual = sut.nuevaPosicionJugador();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void noMasDeSeisTest() throws ArrayIndexOutOfBoundsException{
        Game juego = new Game();
        try {
            juego.agregar("Nerea");
            juego.agregar("Lidia");
            juego.agregar("Rocio");
            juego.agregar("Nacho");
            juego.agregar("Mary");
            juego.agregar("Jorge");

            Boolean expected = false;
            Boolean actual = juego.esJugable();
            Assertions.assertEquals(expected, actual);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No puede haber más de 6 jugadores");
        }
    }
}
