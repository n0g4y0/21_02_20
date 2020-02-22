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
        
        
        ArrayList<Coordenada> movimientosPosibles = new ArrayList<Coordenada>();
        movimientosPosibles.add(new Coordenada(-1,0));
        movimientosPosibles.add(new Coordenada(1,0));
        movimientosPosibles.add(new Coordenada(0,1));
        movimientosPosibles.add(new Coordenada(0,-1));
        
        
        for(Coordenada auxiliar: movimientosPosibles ){
            
            int nuevaCoordenadaX = fichaInicialActual.getValorX() + auxiliar.getValorX();
            int nuevaCoordenadaY = fichaInicialActual.getValorY() + auxiliar.getValorY();
            
            if (nuevaCoordenadaX >= limiteMinimoTablero && nuevaCoordenadaX <= limiteMaximoTablero){
                
                           if (nuevaCoordenadaY >= limiteMinimoTablero && nuevaCoordenadaY <= limiteMaximoTablero){
                               
                                resultado.add(new Coordenada(nuevaCoordenadaX,nuevaCoordenadaY));
                            
                            }     
            
            }
        
        }
        

        return resultado;
    
  }
  
  
  public String aplicarMovidaValidaTablero(Coordenada FichaInicial, Coordenada movidaValida){
      String resultado = "";
      int valorFichaTemporal = -1;
      
      for(int i=0; i<tablero.length; i++){
    
        for(int j=0; j<tablero[0].length; j++ ){
            
            
            
            if(movidaValida.getValorX() == i && movidaValida.getValorY() == j){
                
                valorFichaTemporal = tablero[i][j].getValor();
                tablero[i][j].setValor(valorFichaTemporal);
                
                tablero[FichaInicial.getValorX()][FichaInicial.getValorY()].setValor(valorFichaTemporal);
                
            
            }
            
        
        }
        
        
    }
      
      
    
      return mostrarTableroOrdenadoFormateado();
      
    }
    
    
    
    

    
}
