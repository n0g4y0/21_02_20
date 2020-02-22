

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class JuegoPiezasTest
{
    /**
     * Default constructor for test class JuegoPiezasTest
     */
    public JuegoPiezasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void devolverTableroOrdenadoFormateadoTest(){
        
        Ficha tableroDemo[][] = {
                                    {new Ficha(1,new Coordenada(0,0)),new Ficha(2,new Coordenada(0,1)), new Ficha(3,new Coordenada(0,2)), new Ficha(4,new Coordenada(0,3)) },
                                    {new Ficha(5,new Coordenada(1,0)),new Ficha(6,new Coordenada(1,1)), new Ficha(7,new Coordenada(1,2)), new Ficha(8,new Coordenada(1,3))},
                                    {new Ficha(9,new Coordenada(2,0)),new Ficha(10,new Coordenada(2,1)), new Ficha(11,new Coordenada(2,2)), new Ficha(12,new Coordenada(2,3))},
                                    {new Ficha(13,new Coordenada(3,0)),new Ficha(14,new Coordenada(3,1)), new Ficha(15,new Coordenada(3,2)), new Ficha(16,new Coordenada(3,3))}
   
                                    };
                                    
        Tablero tableroTest = new Tablero(tableroDemo);
        
        
        String resultado = tableroTest.mostrarTableroOrdenadoFormateado();
        
        String esperado = "1   2   3   4   \n5   6   7   8   \n9   10   11   12   \n13   14   15   16   \n";
        
        assertEquals(esperado,resultado);
        
        // tableroDemo = new tableroDemo[4][4];
   
    
    }
    
    
    
}
