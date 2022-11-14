package inventario;

class ComputadoraCaraBuilder implements Builder{
    private Computadora computadora = new Computadora();

    @Override
    public void reset() {
        computadora = new Computadora();
    }

    @Override
    public void buildMarca() {
        computadora.setMarca("Asus");
    }

    @Override
    public void buildModelo() {
        computadora.setModelo("Asus ROG Strix G15");
    }

    @Override
    public void buildProcesador() {
        computadora.setProcesador("Intel Core i7");
    }

    @Override
    public void buildSistemaOperativo() {
        computadora.setSistemaOperativo("Arch Linux");
    }

    @Override
    public void buildGpu() {
        computadora.setGpu("Nvidia GeForce RTX 3060");
    }

    @Override
    public void buildRam() {
        computadora.setRam(12);
    }

    @Override
    public void buildAlmacenamiento() {
        computadora.setAlmacenamiento(1024);
    }

    @Override
    public void setPrecio() {
        computadora.setPrecio(33854);
    }

    @Override
    public Computadora getComputadora() {
        return computadora;
    }
}
