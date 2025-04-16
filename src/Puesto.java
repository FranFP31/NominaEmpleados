public enum Puesto {
    Agente("1"), EOficina ("2"),Directivo ("3");;
   Puesto(String codigo) {
       this.codigo=codigo;
   }
   String codigo;
   public String getCodigo() {
       return codigo;
   }
   public void setCodigo(String codigo) {
       this.codigo = codigo;
   }
   public static Puesto getByCodigo(String codigo) {
       for (Puesto p : Puesto.values()) {
           if (p.codigo.equals(codigo)) {
               return p;
           }
       }
       return null;
   }

}
