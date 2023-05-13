package com.mycompany.estudiantes1;
class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad universidad;

    public Estudiante() {
    }

    public Estudiante(String nombre, double nota1, double nota2, double nota3, Universidad universidad) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public void calcularPromedio() {
        this.promedio = (this.nota1 + this.nota2 + this.nota3)/ 3;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    
    public String toString() {
        String msj = String.format("PROMEDIO ESTUDIANTE"
                + "\nNombre Estudiante: %s"
                + "\nNota 1: %.2f"
                + "\nNota 2: %.2f"
                + "\nNota 3: %.2f"
                +"%nPROMEDIO: %.2f"
                + "\nNombre Universidad: %s",
                this.nombre,this.nota1,this.nota2,this.nota3,this.promedio,this.universidad);
        return msj;
    }
    
}

class Universidad {
    private String nombre;
    private String direccion;

    public Universidad() {
    }

    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String toString(){
        String msj=String.format("UNIVERSIDAD: "
                +"%nNombre: %s"
                +"%nDireccion: %s"
                ,this.nombre,this.direccion);
    return msj;
    }
}

public class Estudiantes1 {

    public static void main(String[] args) {
        Universidad universidad1 = new Universidad("UTPL", "San Cayetano");
        Estudiante estudiante1 = new Estudiante("Issac", 6, 10, 10, universidad1);
        estudiante1.calcularPromedio();
        System.out.println(estudiante1);
    }
}
