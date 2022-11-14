
package ejemplo2.Clases;

// CLASE ABSTRACTA BUILDER

public abstract class CasaBuilder {
    
   public Casa casa;
    
    public Casa getCasa(){
        return casa;
    }
    
    public void crearCasa(){
        casa = new Casa();
        
    }
    
    public abstract void buildParedes();
    
    public abstract void buildPuertas();
    
    public abstract void buildVentanas();
    
    public abstract void ToString();
}
