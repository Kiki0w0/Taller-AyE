package aed;

public class Recordatorio {

    private String mensaje;
    private Fecha fecha;
    private Horario horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        // Implementar
        this.mensaje = mensaje;
        this.horario = horario;
        this.fecha = new Fecha(fecha);
    }

    public Horario horario() {
        // Implementar
        return horario;
    }

    public Fecha fecha() {
        // Implementar
        Fecha fecha1 = new Fecha(fecha);
        return fecha1;
    }

    public String mensaje() {
        // Implementar
        return mensaje;
    }

    @Override
    public String toString() {
        // Implementar
        String res = mensaje + ' ' + '@' + ' ' + fecha + ' ' + horario;

        return res;
    }

    @Override
    public boolean equals(Object otro) {
        // Implementar
        boolean otroEsNull = (otro == null);
      
        boolean claseDistinta = this.getClass() != otro.getClass();
        
        if (otroEsNull || claseDistinta) {
        
            return false;
        }
        
        Recordatorio otroRecordatorio = (Recordatorio) otro;

        return this.mensaje.equals(otroRecordatorio.mensaje) && this.horario.equals(otroRecordatorio.horario) && this.fecha.equals(otroRecordatorio.fecha);
    }

}
