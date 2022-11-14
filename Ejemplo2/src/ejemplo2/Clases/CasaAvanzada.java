
package ejemplo2.Clases;

//CONSTRUCTORES ESPECÍFICOS

public class CasaAvanzada extends ejemplo2.Clases.CasaBuilder{

    @Override
    public void buildParedes() {
        casa.setParedes(12);
    }

    @Override
    public void buildPuertas() {
       casa.setPuertas(6);
    }

    @Override
    public void buildVentanas() {
        casa.setVentanas(5);
    }
    
    @Override
    public void ToString() {
        System.out.println("""
                           Casa{
                           puertas=""" + casa.puertas + ", \nventanas=" + casa.ventanas + ", \nparedes=" + casa.paredes + '}' + "\n\n");
    }
    
    
    
}
