package test;
class Asiento{
    String color;
    int precio;
    int registro;
    void cambiarColor(String colorP){
        String colorMinus = colorP.toLowerCase();
        if (colorMinus.equals("rojo")) {
            this.color = colorMinus;
        }else if (colorMinus.equals("verde")){
            this.color = colorMinus;
        }else if (colorMinus.equals("amarillo")) {
            this.color = colorMinus;
        }else if (colorMinus.equals("blanco")) {
            this.color = colorMinus;
        }else if (colorMinus.equals("negro")) {
            this.color = colorMinus;
        }
    }
}