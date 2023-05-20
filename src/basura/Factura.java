package basura;


public class Factura {
    private String fecha;
    private String usuario;
    private String nombreProducto;
    private int categoria;
    private float precio;

    public Factura(String fecha, String usuario, String nombreProducto, int categoria, float precio) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getFecha() {
        return this.fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return this.usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCategoria() {
        return this.categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return this.precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return fecha  + usuario  + nombreProducto + categoria  + precio;
    }
}

