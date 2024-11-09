package test;
class Motor{
    int numeroCilindros;
    String tipo;
    int registro;
    static void cambiarRegistro(int reg){
        this.registro = reg;
    }
    static void asignarTipo(String tipo){
        Sring tip = tipo.toLowerCase();
        if (tip == "electrico"){
            this.tipo = tip;
        }else if (tip == "gasolina"){
            this.tipo = tip;
        }else{
            System.out.println("Ese tipo no existe")
        }
    }
}