package test;
class Motor{
    int numeroCilindros;
    String tipo;
    int registro;
    void cambiarRegistro(int reg){
        this.registro = reg;
    }
    void asignarTipo(String tipo){
        String tip = tipo.toLowerCase();
        if (tip.equals("electrico")){
            this.tipo = tip;
        }else if (tip.equals("gasolina")){
            this.tipo = tip;
        }
    }
}