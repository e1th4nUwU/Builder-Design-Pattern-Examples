package inventario;

public class Computadora implements MetodosComputadora {
    static int contadorComputadoras=0;
    private String marca;
    private String modelo;
    private String procesador;
    private String sistemaOperativo;
    private String gpu;
    private int ram;
    private int almacenamiento;
    private double precio;

    Computadora(String marca, String modelo, String procesador, String sistemaOperativo, String gpu, int ram, int almacenamiento, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.gpu = gpu;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
        contadorComputadoras++;
    }
    Computadora(){
        contadorComputadoras++;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getProcesador() {
        return procesador;
    }
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    public String getGpu() {
        return gpu;
    }
    public int getRam() {
        return ram;
    }
    public int getAlmacenamiento() {
        return almacenamiento;
    }
    public double getPrecio() {
        return precio;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }
    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    void setGpu(String gpu) {
        this.gpu = gpu;
    }
    void setRam(int ram) {
        this.ram = ram;
    }
    void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return  
            "\tMarca: " + marca + 
            "\n\tModelo: " + modelo + 
            "\n\tProcesador: " + procesador + 
            "\n\tSistema Operativo: " + sistemaOperativo + 
            "\n\tGPU: " + gpu + 
            "\n\tRAM: " + ram + "GB" +
            "\n\tAlmacenamiento: " + almacenamiento + "GB" +
            "\n\tPrecio: $" + precio + "\n";
            
    }
    @Override
    public void probar() {
        System.out.println("\n\tHola mundo!\n");
    }

}
