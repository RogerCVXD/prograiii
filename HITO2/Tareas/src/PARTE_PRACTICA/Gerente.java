package PARTE_PRACTICA;

public class Gerente extends Empleado{
    int Bono;
    int S;
    int ANT;

    public Gerente(){
    }
    public void Leer(){
        Empleado.Leer();
        System.out.println("Ingrese bono de Gerente");
        Bono = LEER.nextInt();
        System.out.println("Ingrese sueldo de Gerente");
        S = LEER.nextInt();
        System.out.println("Ingrese antiguedad de Gerente");
        ANT = LEER.nextInt();
    }
    public void Mostrar(){
        Empleado.Mostrar();
        System.out.println("Bono: "+ Bono);
        System.out.println("sueldo: "+ S);
        System.out.println("antiguedad: "+ ANT);
    }
}
