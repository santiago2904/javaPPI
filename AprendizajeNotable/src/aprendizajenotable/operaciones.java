/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizajenotable;

import static aprendizajenotable.operaciones.datos;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class operaciones {

    static String datos[] = new String[100];

    static String usuario[] = new String[100];
    static String contras[] = new String[100];
    static Random lol = new Random();

    public static void setCargarDatos() {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = "dato" + i;

        }
    }

    public static void setCargarDatosMenu() {
        for (int i = 0; i < datos.length; i++) {
            usuario[i] = "usuario" + i;

        }
    }

    public static void setCargarContraseña() {
        for (int i = 0; i < datos.length; i++) {
            contras[i] = "1000" + i;

        }
    }

    public static boolean getComprobarContraseña(String contra) {
        boolean res = false;
        for (int i = 0; i < contra.length(); i++) {

            if (contras[i].equals(contra)) {
                res = true;

            }

        }

        return res;

    }
    
    public static boolean getVali(String usu, String contra)
    {
    boolean res=false;
    int usuI=0;
    int contraI=0;
    
        for (int i = 0; i < 10; i++) {
            
              if ((usuario[i].equals(usu) && contras[i].equals(contra))  ) {
            
                 res=true; 
                 
        }
            
        }
    
    
    return res;
    }
    
    
     public static boolean getComprobarUsuario(String user) {
        boolean res = false;
        for (int i = 0; i < usuario.length; i++) {

            if (usuario[i].equals(user)) {
                res = true;

            }

        }

        return res;

    }
    

    //buscar dato en arreglo por posicion
    public static String getDatosPorPosicion(int pos) {

        String respuesta = "";

        respuesta = "[" + pos + "]= " + datos[pos];

        return respuesta;
    }

    public static String getDatosPorResultado(String midato) {

        String res = "";

        for (int i = 0; i < datos.length; i++) {

            if (datos[i].equals(midato)) {

                res = "[" + i + "]= " + datos[i];

                i = datos.length;
            }

        }

        return res;
    }

    public static int setContarDatos() {
        int res = 0;

        for (int i = 0; i < datos.length; i++) {

            res++;

        }

        return res;
    }

    public static void SetEditarDato(String midato, String nuevodato) {
        for (int i = 0; i < datos.length; i++) {

            if (datos[i].equals(midato)) {

                datos[i] = nuevodato;

            }

        }

    }

    public static int setContarDatosRepetidos(String dato) {
        int res = 0;

        for (int i = 0; i < datos.length; i++) {

            if (datos[i].equals(dato)) {
                res++;
            }

        }

        return res;
    }

    public static void setRandom() {

        for (int i = 0; i < datos.length; i++) {

            datos[i] = "" + lol.nextInt(9);

            System.out.println("[" + i + "]= " + datos[i]);
        }

    }

    public static void main(String[] args) {

        setCargarDatos();
        //  SetImprimirDatos();
        //System.err.println(getDatosPorPsicion(20));
        // System.err.println(getDatosPorResultado("dato50"));
        //System.out.println(  ContarDatos());
        //  SetEditarDato("dato4", "santiago el mas lindo bb");
        //System.err.println(getDatosPorPsicion(4));
        //setRandom();

        SetEditarDato("dato4", "santiago el mas lindo bb");

        SetEditarDato("dato5", "loren la mas pirroba");

        SetEditarDato("dato9", "loren la mas pirroba");

        SetEditarDato("dato6", "oe loco");

        SetEditarDato("dato1", "oe loco");

        SetEditarDato("dato3", "santiago el mas lindo bb");

        System.out.println(setContarDatosRepetidos("santiago el mas lindo bb"));

        setContarDatosRepetidos("sloren la mas pirroba");

        setContarDatosRepetidos("oe loco");

    }

}
