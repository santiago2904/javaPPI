package aprendizajenotable;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

/**
 *
 * camilabubalo
 */
public class Nivel8 extends JFrame implements ActionListener {

    String ruta = "/imagenes/";
    ImageIcon iconok, iconsig;
    JRadioButton rdbtnop1, rdbtnop2,
            rdbtnop3, rdbtnop4;
    JLabel lblpregunta, lblpregunta1;
    JButton btnOk, btnSiguiente;
    ButtonGroup grupop1;

    public Nivel8(String titulo, int ancho, int alto) {
        setLayout(null);
        setTitle(titulo);
        setSize(ancho, alto);
        setLocationRelativeTo(this);

        //paso2 crear las instancias al constructor 
        ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
        JLabel fondo = new JLabel(img);
        JLayeredPane layered = new JLayeredPane();// objeto para colocar imagen de fondo
        ((JPanel) getContentPane()).setOpaque(false);
        fondo.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        iconok = new ImageIcon(getClass().getResource(ruta + "ok.png"));
        iconsig = new ImageIcon(getClass().getResource(ruta + "next.png"));
        lblpregunta = new JLabel("La formula correcta para realizar un trinomio ");
        lblpregunta1 = new JLabel("cuadrado perfecto con los numeros(20, 160 y 16) es:");
        rdbtnop1 = new JRadioButton("20x + 160 + 16");
        rdbtnop2 = new JRadioButton("20 + 160x + 16");
        rdbtnop3 = new JRadioButton(" 20² + 160y + 16y²");
        rdbtnop4 = new JRadioButton("20 + 160 + 16");
        grupop1 = new ButtonGroup();
        btnOk = new JButton(iconok);
        btnSiguiente = new JButton(iconsig);
        //colocar coordenadas
        lblpregunta.setBounds(10, 20, 750, 20);
        lblpregunta1.setBounds(10, 40, 750, 30);

        rdbtnop1.setBounds(10, 80, 420, 20);
        rdbtnop2.setBounds(10, 110, 420, 20);
        rdbtnop3.setBounds(10, 140, 420, 20);
        rdbtnop4.setBounds(10, 170, 420, 20);
        btnOk.setBounds(20, 210, 100, 20);
        btnSiguiente.setBounds(130, 210, 100, 20);

        btnOk.addActionListener(this);
        btnSiguiente.addActionListener(this);

        grupop1.add(rdbtnop1);
        grupop1.add(rdbtnop2);
        grupop1.add(rdbtnop3);
        grupop1.add(rdbtnop4);
        btnSiguiente.setVisible(false);

        add(lblpregunta);
        add(lblpregunta1);
        add(rdbtnop1);
        add(rdbtnop2);
        add(rdbtnop3);
        add(rdbtnop4);
        add(btnOk);
        add(btnSiguiente);

        Font fuente = new Font("Comic Sans MS", 2, 16);
        Font fuente1 = new Font("Cambria", 3, 20);

        lblpregunta.setFont(fuente);
        lblpregunta1.setFont(fuente);
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
                Puntos.setErrores(1);
            }

            if (rdbtnop3.isSelected()) {
                Puntos.setAcieros(1);

            }
            if (rdbtnop4.isSelected()) {
                Puntos.setErrores(1);

            }

            btnOk.setVisible(false);
            btnSiguiente.setVisible(true);

        }
    }

    public static void main(String[] args) {
        new Nivel8("Nivel 8 de Trinomio Cuadrado", 500, 500);

    }

    public void actionPerformed(ActionEvent boton) {
        if (boton.getSource() == btnOk) {
            setValidar();
        }

        if (boton.getSource() == btnSiguiente) {
            dispose();

            new Nivel9("Nivel 9 de Producto Notable", 400, 300);

        }

    }
}
