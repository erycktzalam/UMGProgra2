package Tarea4PrograII;

public class Test {
    public static void main(String[] args) {

        //se crean las cuentas

        CuentaBancaria cuenta1 = new CuentaBancaria("1985476210101", 1000, 0.03);
        CuentaBancaria cuenta2 = new CuentaBancaria("2354897410101", 200, 0.05);
        CuentaBancaria cuenta3 = new CuentaBancaria("5987365410110", 700, 0.02);

        //mostramos la informacion de las cuentas actuales
        System.out.println("Informacion Actual de Cuentas");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());
        System.out.println("\n");

        //se realizan operaciones


        //creditos a cuenta
        cuenta1.ingresar(500);
        cuenta2.ingresar(300);
        cuenta3.ingresar(600);

        //debitos de cuenta
        cuenta1.retirar(150);
        cuenta2.retirar(275);
        cuenta3.retirar(380);

        //Calculo de intereses ganados
        cuenta1.actualizarSaldo();
        cuenta2.actualizarSaldo();
        cuenta3.actualizarSaldo();

        //mostramos los nuevos saldos
        System.out.println("Informacion Actualizada de Cuentas");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());

    }
}
