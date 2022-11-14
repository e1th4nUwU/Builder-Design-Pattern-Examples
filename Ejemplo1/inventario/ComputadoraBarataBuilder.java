package inventario;

class ComputadoraBarataBuilder implements Builder{
    private Computadora computadora;
    
    @Override
    public void reset() {
        computadora = new Computadora();
    }
    @Override
    public void buildMarca() {
        computadora.setMarca("Spartan POS");
    }
    @Override
    public void buildModelo() {
        computadora.setModelo("Evolve Maestro");
    }
    @Override
    public void buildProcesador() {
        computadora.setProcesador("Intel Celeron");
    }
    @Override
    public void buildSistemaOperativo() {
        computadora.setSistemaOperativo(null);
    }
    @Override
    public void buildGpu() {
        computadora.setGpu(null);
    }
    @Override
    public void buildRam() {
        computadora.setRam(4);
    }
    @Override
    public void buildAlmacenamiento() {
        computadora.setAlmacenamiento(64);
    }
    @Override
    public void setPrecio() {
        computadora.setPrecio(2799);
    }
    @Override
    public Computadora getComputadora() {
        return computadora;
    }
}
