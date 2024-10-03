package aed;

public class Horario {

    private int hora;
    private int minutos;

    public Horario(int hora, int minutos) {
        // Implementar
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        // Implementar
        return hora;
    }

    public int minutos() {
        // Implementar
        return minutos;
    }

    @Override
    public String toString() {
        // Implementar
        String res = Integer.toString(hora) +':'+Integer.toString(minutos); 
        
        return res;
    }

    @Override
    public boolean equals(Object otro) {
        // Implementar
        boolean otroEsNull = (otro == null);
        
        boolean claseDistinta = otro.getClass() != this.getClass();
        
        if (otroEsNull || claseDistinta) {
        
            return false;
        }
        
        Horario otroHorario = (Horario) otro; 
        

        return hora == otroHorario.hora && minutos == otroHorario.minutos;
    }

}
