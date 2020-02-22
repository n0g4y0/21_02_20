import java.util.*;


public class Tablero
{
    // ficha huequito = ficha inicial.
    
    private Ficha[][] tablero;
    
    public Tablero(Ficha[][] tablero){
        this.tablero = tablero;
        
    }
    
    public String mostrarTableroOrdenadoFormateado(){
        
        String resultado = "";
        
        for(int i=0; i<tablero.length; i++){
        
            for(int j=0; j<tablero[0].length; j++ ){
                
                resultado = resultado + tablero[i][j].getValor() + agregarFormato(resultado);
            
            }
            
            resultado = resultado + "\n";
        }
    
    
        return resultado;    
    }
    
    private String agregarFormato(String cadena){
            return "   ";
    }
    
    public Coordenada getCoordenadaFichaInicial(){
        Coordenada resultado = new Coordenada(-1,-1);
        
        for(int i=0; i<tablero.length; i++){
        
            for(int j=0; j<tablero[0].length; j++ ){
                
                if(tablero[i][j].getValor() == 0){
                    resultado = tablero[i][j].getCoordenada();
                }
                
            
            }
            
            
        }
        
        
        
        return resultado;
    }
    
    public ArrayList<Coordenada> listaMovimientosValidosFichaInicial(){
    
        ArrayList<Coordenada> resultado = null;
        
        Coordenada fichaInicialActual = getCoordenadaFichaInicial();
        
        int limiteMaximoTablero = tablero.length -1;
        int limiteMinimoTablero = 0;
        
        
        
        
        for(int i=0; i<tablero.length; i++){
        
            for(int j=0; j<tablero[0].length; j++ ){
                
                
                
            
            }
            
            
        }
        
        
        
        
        return resultado;
    
    }
    
    
    
    

    
}
