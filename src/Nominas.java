public class Nominas {
    private Personal p;
    private double numHoras;
    private double tarifaHoras;
    private double salarioBruto;
    //aparado de deducciones
    private final double D_SS1=3.46;
    private final double D_CC2=6.15;
    private final double D_M=0.95;
    private final double D_P=4.44;
    private final double D_PARO=3.05;
    private final double D_PENSSION_C=3.81;
    private final double D_JUBILACION=1.02;

    public Nominas(Personal p, double numHoras, double tarifaHoras) {
        this.p = p;
        this.numHoras = numHoras;
        this.tarifaHoras = tarifaHoras;
        calcularSalarioBruto();
    }
    //los getter y setter de horas y tarifas horas

    public double getNumHoras() {
        return numHoras;
    }
    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }
    public double getTarifaHoras() {
        return tarifaHoras;
    }
    public void setTarifaHoras(double tarifaHoras) {
        this.tarifaHoras = tarifaHoras;
    }
    public void calcularSalarioBruto() {
        double salarioBruto,horasNormales=169,horasExtra50,horasExtra60;
        if (this.numHoras<169){
            salarioBruto=this.numHoras*this.tarifaHoras;
        }else if (this.numHoras<=180){
            horasExtra50=this.numHoras-horasNormales;
            salarioBruto=horasNormales*this.tarifaHoras+horasExtra50*1.5;
        }else{
            horasExtra50=180-horasNormales;
            horasExtra60=this.numHoras-horasNormales;
            salarioBruto=horasNormales*this.tarifaHoras+horasExtra50*1.5+horasExtra60*1.6;
        }
        this.salarioBruto=salarioBruto;
    }
    public  double calcularPrimaFamiliar(){
        double primaFamiliar=0;
        if (this.p.getHijos()==1){
            primaFamiliar=20;
        }else if(p.getHijos()==2){
            primaFamiliar=50;
        }else if(p.getHijos()>2){
            primaFamiliar=70+(p.getHijos()-2)*20;
        }
        return primaFamiliar;
    }
    public double calculoDeduciones(Double porcentaje) {
        return (porcentaje/100)*this.salarioBruto;
    }

    public void ImprimirNominas(){
        double D_SS,D_CC,D_Medic,D_Pension,D_Paro,D_Pen_Comp,D_Jub_Ant,salarioNeto,deducionTotal;
        System.out.println(p.toString());
        System.out.println("/**********Salario Bruto**********/");
        System.out.println("Salario Bruto: "+this.salarioBruto);
        System.out.println("/**********Deducciones**********/");
        D_SS=this.calculoDeduciones(D_SS1);
        System.out.println("Deduccion Seguridad Social: "+D_SS);
        D_CC=this.calculoDeduciones(D_CC2);
        System.out.println("Deduccion Contingencias Comunes: "+D_CC);
        D_Medic=this.calculoDeduciones(D_M);
        System.out.println("Deduccion medico: "+D_Medic);
        D_Pension=this.calculoDeduciones(D_P);
        System.out.println("Deduccion pension: "+D_Pension);
        D_Paro=this.calculoDeduciones(D_PARO);
        System.out.println("Deduccion paro: "+D_Paro);
        D_Pen_Comp=this.calculoDeduciones(D_PENSSION_C);
        System.out.println("Deduccion pen_comp: "+D_Pen_Comp);
        D_Jub_Ant=this.calculoDeduciones(D_JUBILACION);
        System.out.println("Deduccion jub_ant: "+D_Jub_Ant);
        deducionTotal=D_SS+D_CC+D_Medic+D_Pension+D_Paro+D_Pen_Comp+D_Jub_Ant;
        salarioNeto=this.salarioBruto-deducionTotal;
        System.out.println("*********Total deducciones**********");
        System.out.println(deducionTotal);
        System.out.println("**********Salario Neto**********");
        System.out.println("Salario Neto:\n "+salarioNeto);
        System.out.println("******Prima Familiar********** "+calcularPrimaFamiliar());
        System.out.println("*********** Total A Ingresar **********");
        System.out.println(salarioNeto+calcularPrimaFamiliar()+"€");



    }
}
