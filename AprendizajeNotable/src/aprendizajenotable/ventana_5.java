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

public class ventana_5 extends JFrame
        implements ActionListener, MouseListener {
//paso 1 declaracion variables

    ImageIcon iconok, iconsig;

    JCheckBox ckop1, ckop2, ckop3, ckop4;
    JLabel lblpregunta;
    JButton btnok, btnrespuesta, btnsiguiente;
    int contador = 0;

    public ventana_5(String Titulo, int ancho, int alto) {

        setLayout(null); //evitar distribuciones automaticas
        setTitle(Titulo);//titulo
        setSize(ancho, alto);//tamaño formularios
        setLocationRelativeTo(this);//centrado automatico
        //paso 2 crear instancias
        //de la clase padre(base)
        this.getContentPane().setBackground(new java.awt.Color(255, 239, 213));
        iconok = new ImageIcon(getClass().getResource("/imagenes/ok.png"));
        iconsig = new ImageIcon(getClass().getResource("/imagenes/next1.png"));
        lblpregunta = new JLabel(" NO son un trinomio cuadrado perfecto ");

        ckop1 = new JCheckBox("9b^2-30a^2b+25a^");
        ckop2 = new JCheckBox("4x^3+7-8");
        ckop3 = new JCheckBox("9b+7a-6ab+10ba");
        ckop4 = new JCheckBox("(5a^2-3a)");
        btnok = new JButton(iconok);
        btnsiguiente = new JButton(iconsig);

        //paso 3 colocar coordenadas y tamaños
        lblpregunta.setBounds(10, 20, 500, 20);
        ckop1.setBounds(10, 50, 200, 20);
        ckop1.addMouseListener(this);
        ckop2.setBounds(10, 80, 200, 20);
        ckop2.addMouseListener(this);
        ckop3.setBounds(10, 110, 200, 20);
        ckop3.addMouseListener(this);
        ckop4.setBounds(10, 140, 200, 20);
        ckop4.addMouseListener(this);
        btnok.setBounds(10, 170, 80, 20);

        btnsiguiente.setBounds(100, 170, 100, 20);
        btnsiguiente.addActionListener(this);
        btnok.addActionListener(this);
        Font fuente = new Font("Comic Sans MS", 2, 16);
        Font fuente1 = new Font("Cambria", 3, 13);
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

        ckop1.setBackground(new java.awt.Color(255, 239, 213));
        ckop2.setBackground(new java.awt.Color(255, 239, 213));
        ckop3.setBackground(new java.awt.Color(255, 239, 213));
        ckop4.setBackground(new java.awt.Color(255, 239, 213));

        setVisible(true);

    }

    public void setValidar() {

// expresion compuesta en java operador
        if ((!ckop1.isSelected())
                && (ckop2.isSelected())
                && (ckop3.isSelected())
                && (ckop4.isSelected())) {
            Puntos.setAcieros(1);
            JOptionPane.showMessageDialog(null, "lo has logrado!");
            btnok.setVisible(false);
            btnsiguiente.setVisible(true);

        } else {
            Puntos.setErrores(1);
            JOptionPane.showMessageDialog(null, "vuelve a intentarlo!");

        }
    }

    public static void main(String[] args) {

        new ventana_5("nivel 2 pregunta a", 500, 500);
    }

    @Override
    public void actionPerformed(ActionEvent boton) {
        if (boton.getSource() == btnok) {
            if (contador >= 1) {
                setValidar();
            } else {
                JOptionPane.showMessageDialog(null, "debe seleccionar al menos una ");
            }
        }
        if (boton.getSource() == btnsiguiente) {

            JOptionPane.showMessageDialog(null, "Aciertos: " + Puntos.getAcieros() + " de 6 " + " Errores: " + Puntos.getErrores() + " de 6 ");
                  dispose();
        
new menu("5", 500, 500);

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
