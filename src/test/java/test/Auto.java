package test;
class Auto{
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    int cantidadAsientos(){
        int cantidad = 0;
        for (Asiento asiento: asientos){
            if (asiento != null){
                cantidad += 1;
            }
        }
        return cantidad;
    }
    String verificarIntegridad(){
        String verificar = "Auto original";
        if (this.registro != this.motor.registro) {
            verificar = "Las piezas no son originales";
        } else {
            for (Asiento asiento: this.asientos) {
                if (asiento != null) {
                    if (this.registro != asiento.registro) {
                        verificar = "Las piezas no son originales";
                        break;
                    }
                }
            }    
        }
        return verificar;
    }
}