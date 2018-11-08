package aprendizajenotable;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.nio.file.Files;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import aprendizajenotable.menu;
import aprendizajenotable.Puntos;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Nivel2 extends JFrame implements ActionListener {

    String ruta = "/imagenes/";

    ImageIcon iconok, iconsig;
    JRadioButton rdbtnop1, rdbtnop2,
            rdbtnop3, rdbtnop4;
    JButton btnok, btnsiguiente;
    JLabel lblpregunta1, lblpregunta2;
    ButtonGroup grupop1;

    public Nivel2(String titulo, int ancho, int alto) {
        setLayout(null);
        setTitle(titulo);
        setSize(ancho, alto);
        setLocationRelativeTo(this);
        //paso 2 crear instancias del constructor
        // this.getContentPane().setBackground(new java.awt.Color(255, 239, 213));

        ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
        JLabel fondo = new JLabel(img);
        JLayeredPane layered = new JLayeredPane();// objeto para colocar imagen de fondo
        ((JPanel) getContentPane()).setOpaque(false);

        fondo.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);

        iconok = new ImageIcon(getClass().getResource(ruta + "ok.png"));
        iconsig = new ImageIcon(getClass().getResource(ruta + "next.png"));

        lblpregunta1 = new JLabel("¿Cual de estas expresiones  ");

        lblpregunta2 = new JLabel("es un producto notable? ");
        rdbtnop1 = new JRadioButton("2x²+4x+5");
        rdbtnop2 = new JRadioButton("(ax+b)²");
        rdbtnop3 = new JRadioButton("2x-3y");
        rdbtnop4 = new JRadioButton("ax²*cx²");
        grupop1 = new ButtonGroup();

        btnok = new JButton(iconok);

        btnsiguiente = new JButton(iconsig);

        //coordenada y tamaaño 
        lblpregunta1.setBounds(10, 20, 250, 20);
        lblpregunta2.setBounds(10, 50, 200, 20);
        rdbtnop1.setBounds(10, 80, 220, 20);
        rdbtnop2.setBounds(10, 110, 220, 20);
        rdbtnop3.setBounds(10, 140, 220, 20);
        rdbtnop4.setBounds(10, 170, 220, 20);
        btnok.setBounds(20, 210, 100, 20);
        btnsiguiente.setBounds(130, 212, 100, 20);

        grupop1.add(rdbtnop1);
        grupop1.add(rdbtnop2);
        grupop1.add(rdbtnop3);
        grupop1.add(rdbtnop4);
        btnsiguiente.setVisible(false);

        add(lblpregunta1);
        add(lblpregunta2);
        add(rdbtnop1);
        add(rdbtnop2);
        add(rdbtnop3);
        add(rdbtnop4);
        add(btnok);
        btnok.addActionListener(this);
        add(btnsiguiente);
        btnsiguiente.addActionListener(this);
        Font fuente = new Font("Comic Sans MS", 2, 16);
        Font fuente1 = new Font("Cambria", 3, 20);

        lblpregunta1.setFont(fuente);
        lblpregunta2.setFont(fuente);

        rdbtnop1.setOpaque(false);
        rdbtnop2.setOpaque(false);
        rdbtnop3.setOpaque(false);
        rdbtnop4.setOpaque(false);
        rdbtnop1.setFont(fuente1);
        rdbtnop2.setFont(fuente1);
        rdbtnop3.setFont(fuente1);
        rdbtnop4.setFont(fuente1);

        setVisible(true);

    }

    public void setValidar() {

        if (!(rdbtnop1.isSelected()) && !(rdbtnop2.isSelected()) && !(rdbtnop3.isSelected()) && !(rdbtnop4.isSelected())) {

            JOptionPane.showMessageDialog(this, "Seleccione una opción");

        } else {
            if (rdbtnop1.isSelected()) {
                Puntos.setErrores(1);

            }
            if (rdbtnop2.isSelected()) {
                Puntos.setAcieros(1);

            }
            if (rdbtnop3.isSelected()) {
                Puntos.setErrores(1);

            }
            if (rdbtnop4.isSelected()) {
                Puntos.setErrores(1);

            }

            btnsiguiente.setVisible(true);
            btnok.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Nivel2("Nivel 2 de Producto Notable", 400, 300);

    }

    @Override
    public void actionPerformed(ActionEvent boton) {
        if (boton.getSource() == btnok) {
            setValidar();

        }
        if (boton.getSource() == btnsiguiente) {

            dispose();//eliminar el objeto anterior
            new Nivel3("nivel 3 de producto notable", 450, 300);

        }
    }
}
