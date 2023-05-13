package problema3;

class Automotor {
    private String cedula;
    private String marca;
    private int anio;
    private double valorauto;
    private double valormatricula;
    private Fabricante fabricante;

    public Automotor() {
    }

    public Automotor(String cedula, String marca, int anio, double valorauto, Fabricante fabricante) {
        this.cedula = cedula;
        this.marca = marca;
        this.anio = anio;
        this.valorauto = valorauto;
        this.fabricante = fabricante;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setValorauto(double valorauto) {
        this.valorauto = valorauto;
    }

    public void CalcularValorMatricula() {
        this.valormatricula = (2023 - this.anio) * 0.002;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getCedula() {
        return cedula;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public double getValorauto() {
        return valorauto;
    }

    public double getValormatricula() {
        return valormatricula;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return "Automotor{" + "cedula=" + cedula + ", marca=" + marca + ", anio=" + anio + ", valorauto=" + valorauto + ", valormatricula=" + valormatricula + ", fabricante=" + fabricante + '}';
    }
    
}

class Fabricante {
    private String nombrefab;
    private String ciudadorigen;

    public Fabricante() {
    }

    public Fabricante(String nombrefab, String ciudadorigen) {
        this.nombrefab = nombrefab;
        this.ciudadorigen = ciudadorigen;
    }

    public String getNombrefab() {
        return nombrefab;
    }

    public void setNombrefab(String nombrefab) {
        this.nombrefab = nombrefab;
    }

    public String getCiudadorigen() {
        return ciudadorigen;
    }

    public void setCiudadorigen(String ciudadorigen) {
        this.ciudadorigen = ciudadorigen;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "nombrefab=" + nombrefab + ", ciudadorigen=" + ciudadorigen + '}';
    }
    
}

public class Problema3 {
    public static void main(String[] args) {
        Fabricante fabricante1 = new Fabricante("Pablo","Loja");
        Automotor auto1 = new Automotor("1104879586","Audi",2000,17000,fabricante1);
        auto1.CalcularValorMatricula();
        
        System.out.println(auto1);
    }
    
}
