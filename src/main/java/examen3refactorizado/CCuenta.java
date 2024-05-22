package examen3refactorizado;
/**
 * 
 * @author Sergio Pérez Celada 22/5/2024
 */


/**
 * 
 * @see CCuenta es la clase en la que se basa este programa tiene dos propiedades dSaldo y nombre
 * se utilizan getters y setters para establecer valores.
 */
public class CCuenta {
   
    // Propiedades de la Clase Cuenta
    public double dSaldo;
    public String nombre;
/**
 * 
 * @return el valor de dSaldo
 */
    public double getdSaldo() {
        return dSaldo;
    }
/**
 * 
 * @param dSaldo establece el valor de dSaldo
 */
    public void setdSaldo(double dSaldo) {
        this.dSaldo = dSaldo;
    }

    /**
     * 
     * @return el valor de nombre
     */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre establece el nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @param args es el main
 */
    public static void main(String[] args) {

        operativa_cuenta(0);
    }
/**
 * @see operativa_cuenta realiza las operaciones de los métodos "ingresar" y "retirar"
 * @param cantidad es el parámetro que utiliza operativa_cuenta para realizar las operaciones.
 */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1 = new CCuenta();
        
        System.out.println("Saldo Incial: " + cuenta1.dSaldo + " euros");
        cuenta1.ingresar(-100);
        System.out.println("Saldo Incial: " + cuenta1.dSaldo + " euros");
        cuenta1.ingresar(100);
        System.out.println("Saldo tras ingreso: " + cuenta1.dSaldo + " euros");
        cuenta1.ingresar(2000);
        System.out.println("Saldo tras ingreso: " + cuenta1.dSaldo + " euros");

        cuenta1.ingresar(300);
        System.out.println("Saldo tras ingreso: " + cuenta1.dSaldo + " euros");
        cuenta1.retirar(50);
        System.out.println("Saldo tras retirada: " + cuenta1.dSaldo + " euros");
    }

    /* Metodo para ingresar cantidades en la cuenta. Modifica el saldo. */
    /**
     * @see ingresar se utiliza para establecer los ingresos en la cuenta
     * @param cantidad es usado para establecer la cantidad ingresada
     * @return iCodErr 
     */
    public int ingresar(double cantidad) {
        int iCodErr;

        if (cantidad < 0 || cantidad > 3000) {
            System.out.println("No se puede ingresar una cantidad negativa ni superior a 3000€ (sin ser notificada con formulario)");
            iCodErr = 1;
        } else if (cantidad == 3000) {
            System.out.println(
                    "Le recordamos que estamos obligados a notificar a Hacienda dicho ingreso por ser igual a 3000€");
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        } else {
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }

        return iCodErr;
    }

    /*
     * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
     */
    
    /**
     * @see retirar se utiliza para relalizar las retiradas de la cuenta
     * @param cantidad establece la cantidad que se utiliza
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (dSaldo < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            dSaldo = dSaldo - cantidad;
            System.out.println("Le quedan " + dSaldo + " en cuenta");
        }
    }
}
