public class Personal {
    String nombre;
    String apellido;
    static  int idGeneral=0;//solo se puede llamar en la clase
    private byte hijos;
    public Puesto puestoE;
    private  int idEmpleado=0;//se instancia con cada objeto de la clase

    public Personal(String nombre, String apellido, byte hijos,String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.hijos = hijos;
        this.puestoE = Puesto.getByCodigo(codigo);
        this.idEmpleado = ++idGeneral;
    }
//los getter y los setter

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getHijos() {
        return hijos;
    }

    public void setHijos(byte hijos) {
        this.hijos = hijos;
    }

    public Puesto getPuestoE() {
        return puestoE;
    }

    public void setPuestoE(Puesto puestoE) {
        this.puestoE = puestoE;
    }
    //metodo to String

    @Override
    public String toString() {
        return "IdEmpleado=" + idEmpleado +" | "+
                "Nombre " + nombre + " | " +
                "Apellido " + apellido + " | " +
                "Hijos " + hijos +" | "+
                "Puesto  " + puestoE ;
    }
}


