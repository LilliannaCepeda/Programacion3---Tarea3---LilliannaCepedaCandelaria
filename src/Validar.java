public class Validar{

    public static void validarUsuario(String nombre, int edad, String correo, double salarioMens) throws Exception{

        //valiar el nombre

        if(nombre.isEmpty())
            throw new NombreInvalidoException("El nombre no puede estar vacio");
        if(nombre.length() < 3)
            throw new NombreInvalidoException("EL nombre debe tener al menos 3 caracteres");


        //validar edad 

        if(edad < 18)
            throw new EdadInvalidaException("La edad debe ser mayor o igual a 18");

        if(edad > 100)
            throw new EdadInvalidaException("La edad debe ser menor o igual a 100");


        //validar Correo electronico

        if(!correo.contains("@") || !correo.contains("."))
            throw new CorreoInvalidoException("El correo debe contener @ y . ");


        //validar Salario mensual

        if(salarioMens <= 0)
            throw new SalarioInvalidoException("El salario debe ser mayor que 0");

    }
}