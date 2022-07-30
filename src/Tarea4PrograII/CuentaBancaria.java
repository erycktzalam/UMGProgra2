package Tarea4PrograII;

public class CuentaBancaria {

    private static long correlativoNoCuenta = 100000;
    private long numeroCuenta;
    private String dpi;
    private double saldoActual;
    private double interesAnual;

    //Constructor por defecto

    public CuentaBancaria() {
    }

    //constructor con DPI, saldo e interés

    public CuentaBancaria(String dpi, double saldoActual, double interesAnual) {
        this.correlativoNoCuenta++;
        this.numeroCuenta = this.correlativoNoCuenta;
        this.dpi = dpi;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }

    //metodos getters

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getDpi() {
        return dpi;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    //metodos setters
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    //actualizará el saldo de la cuenta aplicándole el interés
    // diario (interés anual dividido entre 365 aplicado al saldo actual).

    public void actualizarSaldo(){
        double nuevoSaldo = saldoActual + saldoActual * (interesAnual/365);
        saldoActual = nuevoSaldo;

    }

    //permitirá realizar un crédito de una cantidad en la cuenta.

    public void ingresar(double monto){
        double nuevoSaldo = saldoActual + monto;
        saldoActual = nuevoSaldo;

    }

    //permitirá realizar un débito de una cantidad de la cuenta
    // (si y solo si tiene el saldo suficiente por lo que debe incluirlo).

    public void retirar(double retiro){
        double nuevoSaldo = 0;
        if (saldoActual < retiro){
            System.out.println("Saldo Insuficiente");
        }else {
            nuevoSaldo = saldoActual - retiro;
        }
        saldoActual = nuevoSaldo;
    }

    //Método que nos permita mostrar todos los datos de ls cuentas.

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta=" + numeroCuenta +
                ", dpi='" + dpi + '\'' +
                ", saldoActual=" + saldoActual +
                ", interesAnual=" + interesAnual +
                '}';
    }
}
