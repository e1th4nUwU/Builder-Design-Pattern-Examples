
package ejemplo2.Clases;

// CLASE DIRECTOR

public class Director {
    
    public CasaBuilder construir;
    
    
    //set de atriburo construir
    public void setBuilder(CasaBuilder construir){
        this.construir = construir;
        
    }
    
    public Casa getCasa(){
        return construir.getCasa();
        
    }
    
    //Método que construye las casas
    
    public void construirCasa(){
        construir.crearCasa();
        construir.buildParedes();
        construir.buildPuertas();
        construir.buildVentanas();
        construir.ToString();
    }
}

