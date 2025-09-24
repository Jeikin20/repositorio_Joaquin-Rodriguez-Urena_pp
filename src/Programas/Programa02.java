
package Programas;
import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        String empleado;
        double ht, th, sb, d, sn;
        Scanner lectura = new Scanner (System.in);
        
        System.out.print("Nombre de primer empleado: ");
        empleado = lectura.next();
        System.out.print("Horas trabajadas: ");
        ht = lectura.nextDouble();
        System.out.print("Tarifa por hora: ");
        th = lectura.nextDouble();
        
        sb=ht*th;
        d=sb*0.13;
        sn=sb-d;
        
        System.out.println("El nombre del usuario es: "+empleado);
        System.out.println("El sueldo bruto es: "+sb);
        System.out.println("El descuento es: "+d);
        System.out.println("El sueldo neto es: "+sn);
    }
}
