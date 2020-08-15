
package polimorfismo2deber;

class Parametro_Friccion
{
    float CalcularPeso(float masa,float gravedad){
        return masa*gravedad;
    }
    double CalcularPeso(double masa,double gravedad){
        return masa*gravedad;
    }

     float CalcularFuerza_rozamiento(float u,float normal){
        return u*normal;
    }
    double CalcularFuerza_rozamiento(double u,double normal){
        return u*normal;
    }
    float CalcularTaza_momento(float fuerza,float distancia){
        return fuerza*distancia;
    }
    double CalcularTaza_momento(double fuerza,double distancia){
        return fuerza*distancia;
    }

    float CalcularPeriodo_muestreo(float frecuencia){
        return 1/frecuencia;
    }
    double CalcularPeriodo_muestreo(double frecuencia){
        return 1/frecuencia;
    }
}
public class Polimorfismo2Deber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Parametro_Friccion Objeto1= new  Parametro_Friccion();
       Parametro_Friccion Objeto2= new  Parametro_Friccion();
       Parametro_Friccion Objeto3= new  Parametro_Friccion();
       Parametro_Friccion Objeto4= new  Parametro_Friccion();
       Parametro_Friccion Objeto5= new  Parametro_Friccion();
       Parametro_Friccion Objeto6= new  Parametro_Friccion();
       Parametro_Friccion Objeto7= new  Parametro_Friccion();
       Parametro_Friccion Objeto8= new  Parametro_Friccion();
        System.out.println("      UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("MATERIA: PROGRAMACION");
        System.out.println("DOCENTE: ING.GUERRA LUIS");
        System.out.println("NRC: 7450");
        System.out.println("NOMBRE:LENIN IÑACAZA \n");

        float resultado1;
        Objeto1.CalcularPeso(250.5, 9.8);
        resultado1=(float) Objeto1.CalcularPeso(250.5, 9.8);
        System.out.println("El parametro peso tiene un valor de : " +resultado1);
        double resultado2;
        Objeto1.CalcularPeso(250.5, 9.8);
        resultado2=Objeto2.CalcularPeso(250.5, 9.8);
        System.out.println("El parametro peso tiene un valor de : " +resultado2);

        float resultado3;
        Objeto3.CalcularFuerza_rozamiento(0.3, 2454.9);
        resultado3=(float) Objeto3.CalcularFuerza_rozamiento(0.3, 2454.9);
        System.out.println("El parametro Fuerza de Rozamiento tiene un valor de : " +resultado3);
        double resultado4;
        Objeto4.CalcularFuerza_rozamiento(0.3, 2454.9);
        resultado4=Objeto4.CalcularFuerza_rozamiento(0.3, 2454.9);
        System.out.println("El parametro Fuerza de Rozamiento tiene un valor de : " +resultado4);

        float resultado5;
        Objeto5.CalcularTaza_momento(0.5, 5.1);
        resultado5=(float) Objeto5.CalcularTaza_momento(0.5, 5.1);
        System.out.println("El parametro Taza de Momento tiene un valor de : " +resultado5);
        double resultado6;
        Objeto6.CalcularTaza_momento(0.5, 5.1);
        resultado6=Objeto6.CalcularTaza_momento(0.5, 5.1);
        System.out.println("El parametro Taza de Momento tiene un valor de : " +resultado6);

        float resultado7;
        Objeto7.CalcularPeriodo_muestreo((float) 8);
        resultado7= Objeto7.CalcularPeriodo_muestreo((float) 8);
        System.out.println("El parametro Periodo de Muestreo tiene un valor de : " +resultado7);
        double resultado8;
        Objeto8.CalcularPeriodo_muestreo(8);
        resultado8= Objeto8.CalcularPeriodo_muestreo(8);
         System.out.println("El parametro Periodo de Muestreo tiene un valor de : " +resultado8);
    }

}
