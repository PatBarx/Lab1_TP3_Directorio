package lab1_tp3_directorio;

public class Domicilio {

    private String nombreCiudad;
    private String calle;
    private int altura;
    
    public Domicilio() {
    }  

    public Domicilio(String nombreCiudad, String calle, int altura) {
        this.nombreCiudad = nombreCiudad;
        this.calle = calle;
        this.altura = altura;
    }  
    public Domicilio(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    } 

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "\tCiudad: " + nombreCiudad /*+ "\nCalle: " + calle +" "+ altura + "\n"*/;
    }
    
    
}
