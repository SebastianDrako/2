package Principal;

public class IM {
    private String Nombre;
    private String Tipo;
    private double Precio;
    
    public IM(String Nombre,String Tipo,double Precio){
        this.Nombre=Nombre;
        this.Tipo=Tipo;
        this.Precio=Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Instrumento Musical:" + "Nombre=" + Nombre + ", Tipo=" + Tipo + ", Precio=" + Precio;
    }
    
    
}
