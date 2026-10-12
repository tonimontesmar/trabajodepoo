package VECTERIN;

public class Macotas {
    private String nombre;
    private int edad;
    private String especie;
    private double peso;

    public Macotas(String nombre , int edad , String especie , double peso)
    {

        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        if (edad < 0) {
            System.out.println("la edad no puede ser un valor negativo");
        }
        return;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        if (peso < 0  ){
            System.out.println("el peso no puede ser cero" +peso+ "kg");
            return;
        }
    }
    int valorConsulta;
    public int getValorConsulta() {

        if (peso < 10)
        {valorConsulta = 35000;}

        else if (peso > 10)
        {
        valorConsulta = 45000;}

        if (peso > 25 )
        {valorConsulta  =45000;}
        else if(edad > 8 ){
            valorConsulta  =45000 + 12000;
        }
        return valorConsulta;
    }


}
