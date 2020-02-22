
public class Ficha
{
    private int valor;
    private Coordenada coordenada;
    public Ficha(int valor, Coordenada coordenada)
    {
        // initialise instance variables
        this.valor = valor;
        this.coordenada = coordenada;
      
    }
    
    public int getValor(){
        return valor;
    }
    
    public Coordenada getCoordenada(){
        return coordenada;
    }
    
    

    
}
