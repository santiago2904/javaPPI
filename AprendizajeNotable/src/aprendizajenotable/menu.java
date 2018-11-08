package aprendizajenotable;

import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import aprendizajenotable.AprendizajeNotable;
import aprendizajenotable.menu;
import aprendizajenotable.Nivel1;
import aprendizajenotable.Nivel2;
import aprendizajenotable.Nivel3;
import aprendizajenotable.Nivel4;
import aprendizajenotable.Nivel5;
import aprendizajenotable.Nivel6;
import aprendizajenotable.Nivel7;
import aprendizajenotable.Nivel8;
import aprendizajenotable.Nivel9;
import aprendizajenotable.Nivel10;
import aprendizajenotable.quienes_somos;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class menu extends JFrame implements ActionListener {

    private int contador = 0;
    String ruta = "/imagenes/";
    ImageIcon uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez;
    JMenuItem uno1, dos2, tres3, cuatro4, cinco5, seis6, nivel1,
            nivel2, nivel3, nivel4, nivel5, nivel6, nivel7, nivel8, nivel9, nivel10, video1, itemSalir, itemJuego, quienes__somos;

    public menu(String titulo, int ancho, int alto) {
        this.setUndecorated(true);
        setLayout(null);
        setTitle(titulo);
        setSize(ancho, alto);
        setLocationRelativeTo(this);

        ImageIcon img = new ImageIcon(getClass().getResource(ruta + "plant2.png"));
        uno = new ImageIcon(getClass().getResource(ruta + "11.png"));
        dos = new ImageIcon(getClass().getResource(ruta + "22.png"));
        tres = new ImageIcon(getClass().getResource(ruta + "33.png"));
        cuatro = new ImageIcon(getClass().getResource(ruta + "44.png"));
        cinco = new ImageIcon(getClass().getResource(ruta + "55.png"));
        seis = new ImageIcon(getClass().getResource(ruta + "66.png"));
        siete = new ImageIcon(getClass().getResource(ruta + "77.jpg"));
        ocho = new ImageIcon(getClass().getResource(ruta + "88.png"));
        nueve = new ImageIcon(getClass().getResource(ruta + "99.png"));
        diez = new ImageIcon(getClass().getResource(ruta + "10.jpg"));

        JLabel fondo = new JLabel(img);
        JLayeredPane layered = new JLayeredPane();// objeto para colocar imagen de fondo
        ((JPanel) getContentPane()).setOpaque(false);
//fondo.setBounds(200,0,248,238);
        fondo.setBounds(0, 25, img.getIconWidth(), img.getIconHeight());

        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);

        nivel1 = new JMenuItem("NIVEL", uno);
        nivel2 = new JMenuItem("NIVEL ", dos);
        nivel3 = new JMenuItem("NIVEL ", tres);
        nivel4 = new JMenuItem("NIVEL ", cuatro);
        nivel5 = new JMenuItem("NIVEL ", cinco);
        nivel6 = new JMenuItem("NIVEL ", seis);
        nivel7 = new JMenuItem("NIVEL ", siete);
        nivel8 = new JMenuItem("NIVEL ", ocho);
        nivel9 = new JMenuItem("NIVEL ", nueve);
        nivel10 = new JMenuItem("NIVEL ", diez);

        video1 = new JMenuItem("Codigo");
        itemSalir = new JMenuItem("Salir");
        quienes__somos = new JMenuItem("quienes somos");

        itemJuego = new JMenuItem("Juego");

        javax.swing.JMenuBar barra = new javax.swing.JMenuBar();

        JMenu jugar = new JMenu("Jugar");
        JMenu quienes_somos = new JMenu("Quienes Somos:");
        JMenu ayuda = new JMenu("Ayuda");

        
        barra.add(jugar);
        barra.add(ayuda);
        barra.add(quienes_somos);

        jugar.add(nivel1);
        jugar.add(nivel2);
        jugar.add(nivel3);
        jugar.add(nivel4);
        jugar.add(nivel5);
        jugar.add(nivel6);
        jugar.add(nivel7);
        jugar.add(nivel8);
        jugar.add(nivel9);
        jugar.add(nivel10);

        jugar.add(itemJuego);
        ayuda.add(video1);
        ayuda.add(itemSalir);
        quienes_somos.add(quienes__somos);

        nivel1.addActionListener(this);
        nivel2.addActionListener(this);
        nivel3.addActionListener(this);
        nivel4.addActionListener(this);
        nivel5.addActionListener(this);
        nivel6.addActionListener(this);
        nivel7.addActionListener(this);
        nivel8.addActionListener(this);
        nivel9.addActionListener(this);
        nivel10.addActionListener(this);

        itemJuego.addActionListener(this);
        itemSalir.addActionListener(this);
        video1.addActionListener(this);
        quienes__somos.addActionListener(this);

        setJMenuBar(barra);
        setVisible(true);
    }

    public static void main(String[] args) {
        new menu("", 480, 440);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nivel5) {

            new AprendizajeNotable("", 500, 500);
        }

        if (e.getSource() == nivel1) {

            new Nivel1("Nivel 1 de Trinomio Cuadrado Perfecto", 500, 500);
        }

        if (e.getSource() == nivel2) {

            new Nivel2("Nivel 2 de Producto Notable", 500, 500);
        }

        if (e.getSource() == nivel3) {

            new Nivel3("Nivel 3 de producto notable", 500, 500);
        }

        if (e.getSource() == nivel4) {

            new Nivel4("Nivel 3 de Factorizacion de Trinomio", 500, 500);
        }

        if (e.getSource() == nivel5) {

            new Nivel5("Nivel 5 de Producto Notable", 500, 500);
        }
        if (e.getSource() == nivel6) {

            new Nivel6("Nivel 6 de Trinomio Cuadrado", 500, 500);
        }
        if (e.getSource() == nivel7) {

            new Nivel7("Nivel 7 de Trinomio Cuadrado", 500, 500);
        }
        if (e.getSource() == nivel8) {

            new Nivel8("Nivel 8 de Trinomio Cuadrado", 500, 500);
        }
        if (e.getSource() == nivel9) {

            new Nivel9("Nivel 9 de Producto Notable", 500, 500);
        }
        if (e.getSource() == nivel10) {

            new Nivel10("Nivel 10 de Producto Notable", 500, 500);
        }
        if (e.getSource() == quienes__somos) {
            //contador++;
            //setValidarNive1();
            new quienes_somos("Quienes Somos", 500, 500);
        }

        if (e.getSource() == video1) {
            goToURL("https://github.com/santiago2904/javaPPI");
        }

        if (e.getSource() == itemSalir) {
            System.exit(0);
        }
        if (e.getSource() == itemJuego) {
            abrirJuego();
        }

    }

    public void abrirJuego() {
        try {
            // Se lanza el ejecutable. 
            Process p = Runtime.getRuntime().exec("D:/aprendizaje.exe");

            // Se obtiene el stream de salida del programa 
            InputStream is = p.getInputStream();

            /* Se prepara un bufferedReader para poder leer la salida más comodamente. */
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            // Se lee la primera linea 
            String aux = br.readLine();

            // Mientras se haya leido alguna linea 
            while (aux != null) {
                // Se escribe la linea en pantalla 
                System.out.println(aux);

                // y se lee la siguiente. 
                aux = br.readLine();
            }
        } catch (Exception e) {
            // Excepciones si hay algún problema al arrancar el ejecutable o al leer su salida.*/
            e.printStackTrace();
        }
    }

     public void goToURL(String URL) {
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI(URL);
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {
                    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
