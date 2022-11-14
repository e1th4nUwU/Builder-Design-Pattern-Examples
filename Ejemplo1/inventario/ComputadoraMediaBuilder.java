package inventario;

class ComputadoraMediaBuilder implements Builder{
    private Computadora computadora = new Computadora();
    
    @Override
    public void reset() {
        computadora = new Computadora();
    }
    @Override
    public void buildMarca() {
        computadora.setMarca("Lenovo");
    }
    @Override
    public void buildModelo() {
        computadora.setModelo("Lenovo ThinkPad E14");
    }
    @Override
    public void buildProcesador() {
        computadora.setProcesador("Intel Core i5");
    }
    @Override
    public void buildSistemaOperativo() {
        computadora.setSistemaOperativo("Windows 10");
    }
    @Override
    public void buildGpu() {
        computadora.setGpu(null);
    }
    @Override
    public void buildRam() {
        computadora.setRam(8);
    }
    @Override
    public void buildAlmacenamiento() {
        computadora.setAlmacenamiento(256);
    }
    @Override
    public void setPrecio() {
        computadora.setPrecio(13799);
    }
    @Override
    public Computadora getComputadora() {
        return computadora;
    }
}
