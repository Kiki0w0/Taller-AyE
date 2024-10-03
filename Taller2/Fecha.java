package aed;

public class Fecha {
    
    private int dia;
    private int mes;
    
    public Fecha(int dia, int mes) {
        // Implementar
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        // Implementar
        this.dia = fecha.dia;
        this.mes = fecha.mes;
    }

    public Integer dia() {
        // Implementar
        return dia;
    }

    public Integer mes() {
        // Implementar
        return mes;
    }

    public String toString() {
        // Implementar
        String res = Integer.toString(dia)+'/'+Integer.toString(mes);
        
        return res;
    }

    @Override
    public boolean equals(Object otra) {
        // Implementar

        boolean otroEsNull = (otra == null);
        
        boolean claseDistinta = otra.getClass() != this.getClass();
        
        if (otroEsNull || claseDistinta) {
        
            return false;
        }
        
        Fecha otraFecha = (Fecha) otra;
    
        return dia == otraFecha.dia && mes == otraFecha.mes;

    }

    public void incrementarDia() {
        // Implementar
        
        dia += 1;

        if (dia > diasEnMes(mes)){
            dia = 1;
            mes += 1; 
        } 
        if (mes > 12) {
            mes = 1;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
