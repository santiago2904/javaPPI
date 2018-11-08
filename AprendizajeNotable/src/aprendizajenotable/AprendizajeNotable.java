package aprendizajenotable;

import static aprendizajenotable.AprendizajeNotable.layered;
import java.awt.*;
import aprendizajenotable.menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AprendizajeNotable extends JFrame implements ActionListener {

    static ImageIcon iconsig;
    static JButton btnok1;
    static JTextField txtcasilla2;
    static JLabel lblcasilla2, lblcasilla;
    static JPasswordField contraseña;
    static ImageIcon img, icoLogo;
    static JLabel fondo, logo;
    static JLayeredPane layered;

    public AprendizajeNotable(String titulo, int ancho, int alto) {

        Font fuente = new Font("Footlight MT Light", 3, 13);
        this.setUndecorated(true);
        this.getContentPane().setBackground(new java.awt.Color(255, 239, 213));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
        setTitle(titulo);
        setSize(ancho, alto);
        setLocationRelativeTo(this);

        ((JPanel) getContentPane()).setOpaque(false);

// pegamos el fondo al LayerPane(.add)
        layered = new JLayeredPane();
        img = new ImageIcon(getClass().getResource("/imagenes/fondo_1.jpg"));
        icoLogo = new ImageIcon(getClass().getResource("/imagenes/logotipo2.png"));
        logo = new JLabel(icoLogo);
        fondo = new JLabel(img);
        fondo.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        contraseña = new JPasswordField("");
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        iconsig = new ImageIcon(getClass().getResource("/imagenes/sesion.png"));
        logo.setBounds(90, 0, 300, 250);
        btnok1 = new JButton(iconsig);
        txtcasilla2 = new JTextField("");
        lblcasilla = new JLabel("Contraseña");
        lblcasilla2 = new JLabel("Nombre");
        lblcasilla2.setBounds(130, 280, 100, 20);
        txtcasilla2.setBounds(200, 280, 100, 20);
        lblcasilla.setBounds(120, 330, 100, 20);
        contraseña.setBounds(200, 330, 100, 20);
        btnok1.setBounds(140, 400, 200, 60);
        btnok1.addActionListener(this);
       
        add(logo);
        add(lblcasilla2);
        add(lblcasilla);
        add(txtcasilla2);
        add(btnok1);
        add(contraseña);

        lblcasilla.setFont(fuente);
        lblcasilla2.setFont(fuente);

        lblcasilla.setForeground(Color.white);
        lblcasilla2.setForeground(Color.white);

        setVisible(true);
        
    }

    public static boolean getValidar() {
        boolean res = false;
        aprendizajenotable.operaciones.setCargarDatosMenu();
        aprendizajenotable.operaciones.setCargarContraseña();

        if (txtcasilla2.getText().length() < 4
                || contraseña.getText().length() < 4) {

            JOptionPane.showMessageDialog(null, "Ingresa mas de tres caracteres");

        } else {

            if (aprendizajenotable.operaciones.getVali(txtcasilla2.getText(), contraseña.getText())) {

                res = true;

            }

        }

        return res;
    }

    public static void main(String[] args) {

        new AprendizajeNotable("Nombre", 500, 500);

    }

    public void actionPerformed(ActionEvent boton) {
        if (boton.getSource() == btnok1) {
            //  dispose();
            if (getValidar()) {

                dispose();
                JOptionPane.showMessageDialog(null, "Bienvenido");

                new menu("", 500, 500);

            } else {

                JOptionPane.showMessageDialog(null, "Ingresa correctamente");
            }

        }
    }

}