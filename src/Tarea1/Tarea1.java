package Tarea1;

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        String nombre = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();

        System.out.println("Bienvenido a Progra 2 2022 " + nombre);
    }
}
