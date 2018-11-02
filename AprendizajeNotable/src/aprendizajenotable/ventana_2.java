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
import aprendizajenotable.AprendizajeNotable;
import aprendizajenotable.Puntos;

public class ventana_2 extends JFrame
        implements ActionListener, MouseListener {
//paso 1 declaracion variables

    String ruta = "/imagenes/";

    ImageIcon iconok, iconsig;
    JCheckBox ckop1, ckop2, ckop3, ckop4;
    JLabel lblpreg, lblpreg1;
    JButton btnok, btnresp, btnsigui;
    int contador = 0;
    

    public ventana_2(String Titulo, int ancho, int alto) {

        
        //paso 2 crear instancias
        //de la clase padre(base)
        this.getContentPane().setBackground(new java.awt.Color(255, 239, 213));
        iconok = new ImageIcon(getClass().getResource(ruta + "ok.png"));
        iconsig = new ImageIcon(getClass().getResource(ruta + "next1.png"));
        lblpreg = new JLabel("Escoge dos opciones que resulten  ");

        lblpreg1 = new JLabel("de un producto natablsetLayout(null); //evitar distribuciones automaticas\n" +
"        setTitle(Titulo);//titulo\n" +
"        setSize(ancho, alto);//tamaño formularios\n" +
"        setLocationRelativeTo(this);//centrado automaticoe ");
        ckop1 = new JCheckBox("4x²+ 20x +25");
        ckop2 = new JCheckBox("a²+c²");
        ckop3 = new JCheckBox("49x²+126x+81");
        ckop4 = new JCheckBox("9x+5x²");
        btnok = new JButton(iconok);
        btnsigui = new JButton(iconsig);

        //paso 3 colocar coordenadas y tamaños
        lblpreg.setBounds(10, 20, 350, 20);
        lblpreg1.setBounds(10, 50, 350, 20);

        ckop1.setBounds(10, 80, 350, 20);
        ckop1.addMouseListener(this);
        ckop2.setBounds(10, 110, 350, 20);
        ckop2.addMouseListener(this);
        ckop3.setBounds(10, 140, 350, 20);
        ckop3.addMouseListener(this);
        ckop4.setBounds(10, 170, 350, 20);
        ckop4.addMouseListener(this);
        btnok.setBounds(10, 215, 80, 20);

        btnsigui.setBounds(100, 200, 150, 20);
        btnsigui.addActionListener(this);
        btnok.addActionListener(this);
        btnsigui.setVisible(false);
        //paso 4 colocar JPanel
        add(lblpreg);
        add(ckop1);
        add(ckop2);
        add(ckop3);
        add(ckop4);
        add(btnok);
        add(btnsigui);
        add(lblpreg1);
        Font fuente = new Font("Comic Sans MS", 2, 16);
        Font fuente1 = new Font("Cambria", 3, 13);
        lblpreg.setFont(fuente);
        lblpreg1.setFont(fuente);

        ckop1.setBackground(new java.awt.Color(255, 239, 213));
        ckop2.setBackground(new java.awt.Color(255, 239, 213));
        ckop3.setBackground(new java.awt.Color(255, 239, 213));
        ckop4.setBackground(new java.awt.Color(255, 239, 213));

        setVisible(true);

    }

    public void setValidar() {
        /* if (ckop1.isSelected()) {
            ckop1.setBackground(Color.pink);
            
           
        }//fin si

        if (ckop2.isSelected()) {
            ckop2.setBackground(Color.orange);
        }

        if (ckop3.isSelected()) {
            ckop3.setBackground(Color.pink);
        }

        if (ckop4.isSelected()) {
            ckop4.setBackground(Color.orange);

        }*/
//expresion compuesta en java operador y &&
        if ((ckop1.isSelected())
                && (ckop3.isSelected())
                && (!ckop2.isSelected())
                && (!ckop4.isSelected())) {
            Puntos.setAcieros(1);
            JOptionPane.showMessageDialog(null, "Lo hemos logrado");
            btnok.setVisible(false);
            btnsigui.setVisible(true);

        } else {
            Puntos.setErrores(1);
            JOptionPane.showMessageDialog(null, "Lo siento, inténtalo de nuevo");
        }
    }

    public static void main(String[] args) {

        new AprendizajeNotable("nivel 2 pregunta a", 500, 500);
    }

    @Override
    public void actionPerformed(ActionEvent boton) {
        if (boton.getSource() == btnok) {
            if (contador >= 1) {
                setValidar();
            } else {
                JOptionPane.showMessageDialog(null, "Debes seleccionar dos opcines ");
            }
        }

        if (boton.getSource() == btnsigui) {
             dispose();
        
new ventana_3("5", 500, 500);

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
