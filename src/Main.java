import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personal empleado1=new Personal("pedro","perez", (byte) 4,"3");
        Personal empleado2=new Personal("pedro","jimenez", (byte) 2,"2");
        Personal empleado3=new Personal("pedro","Bad Bunny", (byte) 3,"1");
        Personal empleado4=new Personal("Rigoberto","Casares", (byte) 4,"3");
        Personal empleado5=new Personal("Rigoberto","Casares", (byte) 2,"2");
        Personal empleado6=new Personal("Pedro","Sanchez ", (byte) 3,"1");
        Nominas n=new Nominas(empleado1,169,9.76);
        Nominas n2=new Nominas(empleado2,200,9.25);
        Nominas n3=new Nominas(empleado3,150,8.75);
        Nominas n4=new Nominas(empleado4,300,9.76);
        Nominas n5=new Nominas(empleado5,200,9.25);
        Nominas n6=new Nominas(empleado6,550,9.76);


        ArrayList<Personal> empleados=new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);
        empleados.add(empleado6);

        ArrayList<Nominas>nominas=new ArrayList<Nominas>();
        nominas.add(n);
        nominas.add(n2);
        nominas.add(n3);
        nominas.add(n4);
        nominas.add(n5);
        nominas.add(n6);
        //todas las nominas

        ArrayList<Nominas> directivos=new ArrayList<Nominas>();
        directivos.add(n3);
        directivos.add(n6);

        //Nocion de subconjunto: se considera que un conjuto es un subconjunto de otro si todos sus elementos estan contenidos en el. Por Ejemplo, podemos decir que directivos  es un subconjunto de empleados y estan contenidos en el
        if (nominas.containsAll(directivos)) {
            System.out.println("La colleccion contiene las nominas de delos directivos");
        }   else{
            System.out.println("La colleccion no contiene no las nominas");
        }
        //Nocion de union: la union de dos conjuntos es el conjunto formado por todos los elementos contenidos en cada unos de ambos conjuntos. Podemos, por ejemplo, definir un conjunto llamado NominasEmpleados que sea la union de directivos y nominas.
        System.out.println("********adAll****");
        HashSet<Nominas> nominasEmpleados=new HashSet<>(directivos);
        nominasEmpleados.addAll(nominas);
        for (Nominas nomina:nominasEmpleados){
            System.out.println(nomina.getP().toString()+"Salario Bruto"+nomina.getSalarioBruto()+"€");

        }
        //Nota de interseccion: la inteseccion de dos conjuntos que estan formados por los elementos contenidsos a la vez en el primer y el segudno conjunto. En nuestro caso contiene aquellas personas que son,  directivos y tienen nominas
        System.out.println("***************RETAIN ALL***************");
        HashSet<Nominas>directivosConNomina=new HashSet<>(nominas);
        directivosConNomina.retainAll(directivos);
        for (Nominas nomina:directivosConNomina){

            System.out.println(nomina.getP().toString()+"Salario Bruto"+nomina.getSalarioBruto()+"€");
        }
        System.out.println("**********************REMOVE ALL");
        //Nocion de diferencia: la diferencia entre dos conjuntos esta formada por todos los elementos presentes en uno pero no en el otro. En nuestro caso, respresenta aquellas personas que son unicamente directivos y aquellas que son unicamente empelados
        HashSet<Nominas>nominasSinDirectivos=new HashSet<>(nominas);
        nominasSinDirectivos.removeAll(directivos);
        for (Nominas nomina:nominasSinDirectivos){
            System.out.println(nomina.getP().toString()+"Salario Bruto"+nomina.getSalarioBruto()+"€");
        }


        //impresion por bucle for
        /*for (Nominas nomina : nominas) {
            nomina.ImprimirNominas();
        }*/
        //se puede utilzar tanto en list como en set
        /*Iterator<Nominas>iterator=nominas.iterator();
        Nominas nom;
            while(iterator.hasNext()){
                nom=iterator.next();
                if (n.getP().getApellido().equals("Bad Bunny")){
                    iterator.remove();
                }
            }*/
        /*System.out.println("*** Sin Bad Bunny **");
            for (Nominas nomina: nominas) {
                nomina.ImprimirNominas();
            }*/

    }






    }
