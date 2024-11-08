package test;
class Asiento{
    String color;
    int precio;
    int registro;
    static String cambiarColor(String colorP){
        String colorMinus = colorP.toLowerCase();
        switch (colorMinus){
            case "rojo"{
                this.color = colorMinus;
                System.out.println("Su auto ahora es "+ colorMinus)
                break;
            }
            case "verde"{
                this.color = colorMinus;
                System.out.println("Su auto ahora es "+ colorMinus)
                break;
            }
            case "amarillo"{
                this.color = colorMinus;
                System.out.println("Su auto ahora es "+ colorMinus)
                break;
            }
            case "negro"{
                this.color = colorMinus;
                System.out.println("Su auto ahora es "+ colorMinus)
                break;
            }
            case "blanco"{
                this.color = colorMinus;
                System.out.println("Su auto ahora es "+ colorMinus)
                break;
            }
            default{
                System.out.println("No se puede pintar el auto de ese color")
            }

        }
    }
}