import java.time.LocalDate;

public class persona{
    private String nombre;
    private String apellido;
    
    private int edad;
    private LocalDate cumpleaños;
    private int dni;
    private int sexo;
    //femenino = 1, masculino = 0
    private double peso;
    private double altura;
    cumpleaños = LocalDate.of(2000, Month.JANUARY, 1);

    public persona(int dni) {
        this.dni = dni;
    }
    public persona(int dni, String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public persona(int dni, String nombre, String apellido, LocalDate cumpleaños) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cumpleaños = cumpleaños;
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public LocalDate getCumpleaños() {
        return cumpleaños;
    }
    public void setCumpleaños(LocalDate cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public int getSexo() {
        return sexo;
    }
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
public double calcular_imc(double peso, double altura){
    return peso/(altura*altura);
}