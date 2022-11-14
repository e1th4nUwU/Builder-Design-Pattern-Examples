package inventario;

public class Director {
    private Builder builder;
    
    public Director(){

    }
    public Director(Builder builder){
        this.builder = builder;
    }
    public Director(String tipo) throws IllegalArgumentException{
        tipo = tipo.toLowerCase().trim();
        if(tipo.equals("barata")){
            this.builder = new ComputadoraBarataBuilder();
        }else if(tipo.equals("media")){
            this.builder = new ComputadoraMediaBuilder();
        }else if(tipo.equals("cara")){
            this.builder = new ComputadoraCaraBuilder();
        }else{
            throw new IllegalArgumentException("Tipo de computadora no reconocido");
        }
    }
    public void setBuilder(Builder builder){
        this.builder = builder;
    }
    public void setBuilder(String tipo) throws IllegalArgumentException{
        tipo = tipo.toLowerCase().trim();
        if(tipo.equals("barata")){
            this.builder = new ComputadoraBarataBuilder();
        }else if(tipo.equals("media")){
            this.builder = new ComputadoraMediaBuilder();
        }else if(tipo.equals("cara")){
            this.builder = new ComputadoraCaraBuilder();
        }else{
            throw new IllegalArgumentException("Tipo de computadora no reconocido");
        }
    }
    public void construirComputadora(){
        builder.reset();
        builder.buildMarca();
        builder.buildModelo();
        builder.buildProcesador();
        builder.buildSistemaOperativo();
        builder.buildGpu();
        builder.buildRam();
        builder.buildAlmacenamiento();
        builder.setPrecio();
    }
    public Computadora getComputadora(){
        return builder.getComputadora();
    } 
}
