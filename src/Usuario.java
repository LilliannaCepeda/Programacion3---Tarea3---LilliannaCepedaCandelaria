public class Usuario {

    private String nombre;
    private int edad;
    private String correoElect;
    private double salarioMensual;
    
    public Usuario(){

        setNombre("");
        setEdad(0);
        setCorreoElect("");
        setSalarioMens(0);

    }

    public Usuario(String nombre, int edad, String correoElect, double salarioMensual ){

        setNombre(nombre);
        setEdad(edad);
        setCorreoElect(correoElect);
        setSalarioMens(salarioMensual);

    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }  

    public String getCorreoElect(){
        return correoElect;
    }

    public double getSalarioMens(){
        return salarioMensual;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){

        this.edad = edad;
    }

    public void setCorreoElect(String correo){

        this.correoElect = correo;
    }

    public void setSalarioMens(double salarioMensual){

        this.salarioMensual = salarioMensual;

    }

    
}
