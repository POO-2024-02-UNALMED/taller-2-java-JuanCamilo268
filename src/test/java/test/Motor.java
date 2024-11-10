package test;
class Motor{
    int numeroCilindros;
    String tipo;
    int registro;
    static void cambiarRegistro(int reg){
        this.registro = reg;
    }
    static void asignarTipo(String tipo){
        String tip = tipo.toLowerCase();
        if (tip.equals("electrico")){
            this.tipo = tip;
        }else if (tip.equals("gasolina")){
            this.tipo = tip;
        }
    }
}