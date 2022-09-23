package lab1_tp3_directorio_V1;

public class Domicilio {

    private String nombreCiudad;

    private String calle;

    private int altura;

    public Domicilio() {
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
        return "Domicilio{" + "nombreCiudad=" + nombreCiudad + ", calle=" + calle + ", altura=" + altura + '}';
    }
    
    
}
