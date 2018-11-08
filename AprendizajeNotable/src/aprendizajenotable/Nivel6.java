package aprendizajenotable;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import aprendizajenotable.menu;
import aprendizajenotable.Puntos;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Nivel6 extends JFrame
        implements ActionListener, MouseListener {
//paso 1 declaracion variables

    ImageIcon iconok, iconsig;
    JCheckBox ckop1, ckop2, ckop3, ckop4;
    JLabel lblpregunta;
    JButton btnok, btnrespuesta, btnsiguiente;
    int contador = 0;

    public Nivel6(String Titulo, int ancho, int alto) {

        setLayout(null); //evitar distribuciones automaticas
        setTitle(Titulo);//titulo
        setSize(ancho, alto);//tamaÃ±o formularios
        setLocationRelativeTo(this);//centrado automatico
        //paso 2 crear instancias
        //de la clase padre(base)
        ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
        JLabel fondo = new JLabel(img);
        JLayeredPane layered = new JLayeredPane();// objeto para colocar imagen de fondo
        ((JPanel) getContentPane()).setOpaque(false);
        fondo.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        iconok = new ImageIcon(getClass().getResource("/imagenes/ok.png"));
        iconsig = new ImageIcon(getClass().getResource("/imagenes/next.png"));
        lblpregunta = new JLabel(" No son un trinomio cuadrado perfecto ");

        ckop1 = new JCheckBox("9b²-30a²b+25a²");
        ckop2 = new JCheckBox("4x^3+7-8");
        ckop3 = new JCheckBox("9b+7a-6ab+10ba");
        ckop4 = new JCheckBox("(5a²-3a)");
        btnok = new JButton(iconok);
        btnsiguiente = new JButton(iconsig);

        //paso 3 colocar coordenadas y tamaÃ±os
        lblpregunta.setBounds(10, 5, 500, 20);
        ckop1.setBounds(10, 50, 200, 20);
        ckop1.addMouseListener(this);
        ckop2.setBounds(10, 90, 200, 20);
        ckop2.addMouseListener(this);
        ckop3.setBounds(10, 130, 200, 20);
        ckop3.addMouseListener(this);
        ckop4.setBounds(10, 170, 200, 20);
        ckop4.addMouseListener(this);
        btnok.setBounds(10, 220, 80, 20);

        btnsiguiente.setBounds(100, 220, 100, 20);
        btnsiguiente.addActionListener(this);
        btnok.addActionListener(this);
        Font fuente = new Font("Comic Sans MS", 2, 16);
        Font fuente1 = new Font("Cambria", 3, 20);
        lblpregunta.setFont(fuente);
        //paso 4 colocar JPanel
        add(lblpregunta);
        add(ckop1);
        add(ckop2);
        add(ckop3);
        add(ckop4);
        add(btnok);
        add(btnsiguiente);
        btnsiguiente.setVisible(false);

        ckop1.setOpaque(false);
        ckop2.setOpaque(false);
        ckop3.setOpaque(false);
        ckop4.setOpaque(false);

        ckop1.setFont(fuente1);
        ckop2.setFont(fuente1);
        ckop3.setFont(fuente1);
        ckop4.setFont(fuente1);

        setVisible(true);

    }

    public void setValidar() {

// expresion compuesta en java operador
        if (ckop1.isSelected() && ckop2.isSelected()) {
            Puntos.setAcieros(1);
        } else {
            Puntos.setErrores(1);
        }
        btnok.setVisible(false);
        btnsiguiente.setVisible(true);

    }

    public static void main(String[] args) {

        new Nivel6("Nivel 6 de Trinomio Cuadrado", 400, 300);
    }

    @Override
    public void actionPerformed(ActionEvent boton) {
        if (boton.getSource() == btnok) {
            if (contador >= 1) {
                setValidar();
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una ");
            }
        }
        if (boton.getSource() == btnsiguiente) {

            dispose();

            new Nivel7("Nivel 7 de Trinomio Cuadrado", 600, 300);

        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == ckop1) {

            if (ckop1.isSelected()) {
                contador++;
            } else {
                contador--;

            }
        }

        if (e.getSource() == ckop2) {
            if (ckop2.isSelected()) {
                contador++;
            } else {
                contador--;

            }
        }

        if (e.getSource() == ckop3) {

            if (ckop3.isSelected()) {
                contador++;
            } else {
                contador--;

            }
        }

        if (e.getSource() == ckop4) {
            if (ckop4.isSelected()) {
                contador++;
            } else {
                contador--;

            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
