package aed;

class ArregloRedimensionableDeRecordatorios {
    
    private int longitud;
    private Recordatorio[] arreglo;

    public ArregloRedimensionableDeRecordatorios() {
        // Implementar
        this.longitud = 0;
        this.arreglo = new Recordatorio[0];
    
    }

    public int longitud() {
        // Implementar
        return longitud;
    }

    public void agregarAtras(Recordatorio i) {
        // Implementar
        longitud = longitud + 1;

        Recordatorio[] arreglo_nuevo = new Recordatorio[longitud];

        for (int e = 0; e < longitud - 1; e++) {
            
            arreglo_nuevo[e] = arreglo[e];

            arreglo = arreglo_nuevo;
        }
        arreglo_nuevo[longitud - 1] = i;
        arreglo = arreglo_nuevo;

    }

    public Recordatorio obtener(int i) {
        // Implementar
        return arreglo[i];
    }

    public void quitarAtras() {
        // Implementar
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        // Implementar
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        // Implementar
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        // Implementar
        return null;
    }
}
