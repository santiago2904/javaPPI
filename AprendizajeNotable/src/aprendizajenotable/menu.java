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
import aprendizajenotable.pregunta1;
import aprendizajenotable.ventana_1;
import aprendizajenotable.ventana_2;
import aprendizajenotable.ventana_3;
import aprendizajenotable.ventana_5;

public class menu extends JFrame implements ActionListener {

    private int contador = 0;
    String ruta = "/imagenes/";
    ImageIcon uno, dos, tres, cuatro, cinco, seis;
    JMenuItem uno1, dos2, tres3, cuatro4, cinco5, seis6, nivel1,
            nivel2, nivel3, nivel4, nivel5, nivel6, video1, itemSalir, itemJuego;

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
        video1 = new JMenuItem("video1");
        itemSalir = new JMenuItem("Salir");
        itemJuego = new JMenuItem("Juego");

        javax.swing.JMenuBar barra = new javax.swing.JMenuBar();

        JMenu jugar = new JMenu("jugar");
        JMenu ayuda = new JMenu("ayuda");

        barra.add(jugar);
        barra.add(ayuda);

        jugar.add(nivel1);
        jugar.add(nivel2);
        jugar.add(nivel3);
        jugar.add(nivel4);
        jugar.add(nivel5);
        jugar.add(nivel6);
        jugar.add(itemJuego);
        ayuda.add(video1);
        ayuda.add(itemSalir);

        nivel1.addActionListener(this);
        nivel2.addActionListener(this);
        nivel3.addActionListener(this);
        nivel4.addActionListener(this);
        nivel5.addActionListener(this);
        nivel6.addActionListener(this);
        itemJuego.addActionListener(this);
        itemSalir.addActionListener(this);
        video1.addActionListener(this);

        setJMenuBar(barra);
        bloquear();
        setVisible(true);
    }

    void bloquear() {
        nivel2.setEnabled(false);
        nivel3.setEnabled(false);
        nivel4.setEnabled(false);
        nivel5.setEnabled(false);
        nivel6.setEnabled(false);
    }

    public void setDesbloquear() {
        nivel2.setEnabled(true);
    }

    public static void main(String[] args) {
        new menu("", 480, 440);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == nivel1) {
            contador++;
            setValidarNivel();
            new pregunta1("nivel 1", 500, 500);
        }

        if (e.getSource() == nivel2) {
            contador++;
            setValidarNivel();
            new ventana_1("nivel 2", 500, 500);
        }

        if (e.getSource() == nivel3) {
            contador++;
            setValidarNivel();
            new ventana_3("nivel 3", 500, 500);
        }

        if (e.getSource() == nivel4) {
            contador++;
            setValidarNivel();
            new ventana_2("nivel 4", 500, 500);
        }

        if (e.getSource() == nivel5) {
            contador++;
            setValidarNivel();
            new AprendizajeNotable("nivel 5", 500, 00);
        }

        if (e.getSource() == nivel6) {
            contador++;
            setValidarNivel();
            new ventana_5("nivel 6", 500, 300);
        }

        if (e.getSource() == video1) {
            goToURL("https://www.youtube.com");
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

    public void setValidarNivel() {

        if (contador == 0) {
            nivel1.setEnabled(true);
            nivel2.setEnabled(false);
            nivel3.setEnabled(false);
            nivel4.setEnabled(false);
            nivel5.setEnabled(false);
            nivel6.setEnabled(false);
        }

        if (contador == 1) {
            nivel1.setEnabled(false);
            nivel2.setEnabled(true);
            nivel3.setEnabled(false);
            nivel4.setEnabled(false);
            nivel5.setEnabled(false);
            nivel6.setEnabled(false);
        }

        if (contador == 2) {
            nivel1.setEnabled(false);
            nivel2.setEnabled(false);
            nivel3.setEnabled(true);
            nivel4.setEnabled(false);
            nivel5.setEnabled(false);
            nivel6.setEnabled(false);
        }

        if (contador == 3) {
            nivel1.setEnabled(false);
            nivel2.setEnabled(false);
            nivel3.setEnabled(false);
            nivel4.setEnabled(true);
            nivel5.setEnabled(false);
            nivel6.setEnabled(false);
        }

        if (contador == 4) {
            nivel1.setEnabled(false);
            nivel2.setEnabled(false);
            nivel3.setEnabled(false);
            nivel4.setEnabled(false);
            nivel5.setEnabled(true);
            nivel6.setEnabled(false);
        }

        if (contador == 5) {
            nivel1.setEnabled(false);
            nivel2.setEnabled(false);
            nivel3.setEnabled(false);
            nivel4.setEnabled(false);
            nivel5.setEnabled(false);
            nivel6.setEnabled(true);
        }
    }
}
