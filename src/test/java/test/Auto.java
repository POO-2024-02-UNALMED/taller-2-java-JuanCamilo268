package test;
class Auto{
    String modelo;
    int precio;
    Asiento[] asientos = {null, null, null, null, null, null};
    String marca;
    Motor motor = null;
    int registro;
    static String cantidadCreados;
    static int cantidadAsientos(Asiento[] asientos){
        int cantidad = 0;
        for (Asiento asiento: asientos)
        return cantidad;
    }
    static void verificarIntegridad(){
        if (this.registro != this.motor.registro){
            System.out.println("Las piezas no son originales");
        }else{
            for (Asiento asiento: asientos){
                if (this.registro != asiento.registro){
                    System.out.println("Las piezas no son originales");
                    break;
                }else{
                    System.out.println("Auto original");
                }
            }    
        }
    }
}