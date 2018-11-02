
package aprendizajenotable;




public class Puntos {
 
   private static String nombre;
   
   private static int acieros, errores;

    public static String getNombre() {
        return nombre;
    }

    public static int getAcieros() {
        return acieros;
    }

    public static int getErrores() {
        return errores;
    }

    public static void setNombre(String nombre) {
        Puntos.nombre+= nombre;
    }

    public static void setAcieros(int acieros) {
        Puntos.acieros+= acieros;
    }

    public static void setErrores(int errores) {
        Puntos.errores+= errores;
    }

    
    
    
   
   
   
   
   
   
    
}
