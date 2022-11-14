package inventario;

interface Builder {
    void reset();
    void buildMarca();
    void buildModelo();
    void buildProcesador();
    void buildSistemaOperativo();
    void buildGpu();
    void buildRam();
    void buildAlmacenamiento();
    void setPrecio();
    Computadora getComputadora();
}
