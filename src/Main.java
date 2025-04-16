//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personal empleado1=new Personal("pedro","perez", (byte) 4,"3");
        Nominas n=new Nominas(empleado1,169,9.76);
        n.ImprimirNominas();




    }
}