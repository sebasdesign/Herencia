package herencia;

import javax.swing.JOptionPane;


public class Estudiante extends Persona {
/************************************/
/************************************/
/************************************/
//Atributos de la subclase
private String carnet;
private int numeroMaterias;
private double promedioNotas;
 
//contructor de la clase
public Estudiante() {
    
}
//Constructor de la subclase
public Estudiante(String nombre, String apellido, int edad, int peso,String carnet, int numeroMaterias, double promedioNotas) {
//Usamos el operador super para establecer el constructor
//de la superclase
super(nombre, apellido, edad, peso);
//Definimos los atributos propios de este objeto que hereda
this.carnet = carnet;
this.numeroMaterias = numeroMaterias;
this.promedioNotas = promedioNotas;
}
/************************************/
/************************************/
/************************************/
//Métodos de encapsulamiento
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
//Métodos propios del estudiante
/************************************/
/************************************/
//Método para calcular el promedio del estudiante

    public double calcularPromedio(int numeroMaterias ,double promedioNotas) {
    double notas = 0.0;  
    //double promedioNotas = 0;
    double temp = 0;
    int j=1;
    
    for (int i = 0; i < numeroMaterias; i++) {
        
        notas = leerDatoTipoReal("Ingrese la nota de la materia "+j++);
        
        temp+=notas;
    }
    
    promedioNotas=temp/numeroMaterias;
    
    JOptionPane.showMessageDialog(null,"El estudiante " + nombre + apellido +" tiene un promedio de " + promedioNotas);
    return (promedioNotas);
        
    }
    
 //Método para ingresar los datos del empleado
    public Estudiante ingresarDatosEstudiante (){
        Estudiante nuevoEstudiante = new Estudiante();  
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        String carnet = "";
        int numMaterias = 0;
        carnet = leerDatoTipoCadena("Ingrese el carnet del estudiante: ");
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
        numMaterias = leerDatoTipoEntero("Ingrese el numero de materias del estudiante: ");
        
        //Definimos los datos para el constructor
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setNumeroMaterias(numMaterias);
        //Retornamos el objeto
    return (nuevoEstudiante);
    }
    //Método para imprimir el reporte de status del empleado
public void imprimirReporteEstadoEstudiante(){
//Usamos nuevamente la herencia para llamar los métodos
//que imprimen los datos del empleado
imprimirDatosPersona();
//Ahora imprimimos los datos propios del estudiante
JOptionPane.showMessageDialog(null,"El carnet del estudiande es: " + carnet);
JOptionPane.showMessageDialog(null,"El numero de Materias del estudiande es: " + numeroMaterias);
calcularPromedio(numeroMaterias,promedioNotas);

}
    
}
