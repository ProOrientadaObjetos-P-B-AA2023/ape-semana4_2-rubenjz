package problema4;

class Cheques {
    private String nombrecliente;
    private String nombrebanco;
    private double valorcheque;
    private double comision;
    private Cliente cliente;
    private Banco banco;

    public Cheques(String nombrecliente, String nombrebanco, double valorcheque, Cliente cliente, Banco banco) {
        this.nombrecliente = nombrecliente;
        this.nombrebanco = nombrebanco;
        this.valorcheque = valorcheque;
        this.cliente = cliente;
        this.banco = banco;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public void setNombrebanco(String nombrebanco) {
        this.nombrebanco = nombrebanco;
    }

    public void setValorcheque(double valorcheque) {
        this.valorcheque = valorcheque;
    }

    public void CalcularComision() {
        this.comision = this.valorcheque * 0.003;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public String getNombrebanco() {
        return nombrebanco;
    }

    public double getValorcheque() {
        return valorcheque;
    }

    public double getComision() {
        return comision;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    @Override
    public String toString() {
        return "Cheques{" + "nombrecliente=" + nombrecliente + ", nombrebanco=" + nombrebanco + ", valorcheque=" + valorcheque + ", comision=" + comision + ", cliente=" + cliente + ", banco=" + banco + '}';
    }
    
}

class Cliente {
    private String nombrescliente;
    private String apellidoscliente;
    private String cedulacliente;

    public Cliente() {
    }

    public Cliente(String nombrescliente, String apellidoscliente, String cedulacliente) {
        this.nombrescliente = nombrescliente;
        this.apellidoscliente = apellidoscliente;
        this.cedulacliente = cedulacliente;
    }

    public void setNombrescliente(String nombrescliente) {
        this.nombrescliente = nombrescliente;
    }

    public void setApellidoscliente(String apellidoscliente) {
        this.apellidoscliente = apellidoscliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public String getNombrescliente() {
        return nombrescliente;
    }

    public String getApellidoscliente() {
        return apellidoscliente;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombrescliente=" + nombrescliente + ", apellidoscliente=" + apellidoscliente + ", cedulacliente=" + cedulacliente + '}';
    }
    
}

class Banco {
    private String nombrebanco;
    private int numsucursales;

    public Banco() {
    }

    public Banco(String nombrebanco, int numsucursales) {
        this.nombrebanco = nombrebanco;
        this.numsucursales = numsucursales;
    }

    public void setNombrebanco(String nombrebanco) {
        this.nombrebanco = nombrebanco;
    }

    public void setNumsucursales(int numsucursales) {
        this.numsucursales = numsucursales;
    }

    public String getNombrebanco() {
        return nombrebanco;
    }

    public int getNumsucursales() {
        return numsucursales;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombrebanco=" + nombrebanco + ", numsucursales=" + numsucursales + '}';
    }
    
}

public class Problema4 {

    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco de Loja",15);
        Cliente cliente1 = new Cliente("Ruben Nicolai","Jimenez Lanchi","110548758");
        Cheques cheque1 = new Cheques("Pablo","Banco de Loja",10000,cliente1,banco1);
        cheque1.CalcularComision();
        System.out.println(cheque1);
    }
    
}
