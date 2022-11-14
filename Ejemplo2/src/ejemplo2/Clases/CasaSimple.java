
package ejemplo2.Clases;

//CONSTRUCTORES ESPECÍFICOS

public class CasaSimple extends ejemplo2.Clases.CasaBuilder {

    @Override
    public void buildParedes() {
        casa.setParedes(4);
    }

    @Override
    public void buildPuertas() {
        casa.setPuertas(1);
        
    }

    @Override
    public void buildVentanas() {
        casa.setVentanas(2);
    }
    
    @Override
    public void ToString() {
        System.out.println("""
                           Casa{
                           puertas=""" + casa.puertas + ", \nventanas=" + casa.ventanas + ", \nparedes=" + casa.paredes + '}' + "\n\n");
    }
    
}
