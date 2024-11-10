package test;
class Auto{
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;
    static int cantidadAsientos(Asiento[] asientos){
        int cantidad = asientos.length();
        return cantidad;
    }
    static void verificarIntegridad(Auto auto, Asiento[] asientos){
        if (auto.registro != auto.motor.registro){
            System.out.println("Las piezas no son originales");
            break;
        }
        for (Asiento asiento: asientos){
            if (auto.registro != auto.asiento.registro){
                System.out.println("Las piezas no son originales");
                break;
            }else{
                System.out.println("Auto original");
            }

        }
    }
}