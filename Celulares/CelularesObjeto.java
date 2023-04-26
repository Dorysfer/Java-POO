/*
 * Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo.
 */
package Celulares;

/**
 *
 * @author Home
 */
public class CelularesObjeto {
    private String marca, modelo;
    private int memoriaRam,almacenamiento;
    private double precio;
    @SuppressWarnings("FieldMayBeFinal")
    private int[] codigo =new int[7]; //Es mejor no ponerle private final int[]

    public CelularesObjeto() {
    }

    public CelularesObjeto(String marca, String modelo, int memoriaRam, int almacenamiento, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    
    
    }

    
