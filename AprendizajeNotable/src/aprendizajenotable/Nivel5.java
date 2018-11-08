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
 * @author Lenovo
 */
public class Nivel5 extends JFrame implements ActionListener {

    String ruta = "/imagenes/";

    ImageIcon iconok, iconsig;
    JRadioButton rdbtnop1, rdbtnop2,
            rdbtnop3, rdbtnop4;

    JLabel lblpregunta;
    JButton btnOk, btnSiguiente;
    ButtonGroup grupop1;

    public Nivel5(String titulo, int ancho, int alto) {
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
        lblpregunta = new JLabel("Cuál de estos casos es un producto notable");
        rdbtnop1 = new JRadioButton("20x² + 6x + 6");
        rdbtnop2 = new JRadioButton("(20x + 5)^2");
        rdbtnop3 = new JRadioButton("20a² + 6");
        rdbtnop4 = new JRadioButton("(20x -5)");
        grupop1 = new ButtonGroup();
        btnOk = new JButton(iconok);
        btnSiguiente = new JButton(iconsig);
        //colocar coordenadas
        lblpregunta.setBounds(10, 20, 400, 20);

        rdbtnop1.setBounds(10, 80, 220, 20);
        rdbtnop2.setBounds(10, 110, 220, 20);
        rdbtnop3.setBounds(10, 140, 220, 20);
        rdbtnop4.setBounds(10, 170, 220, 20);
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
        add(rdbtnop1);
        add(rdbtnop2);
        add(rdbtnop3);
        add(rdbtnop4);
        add(btnOk);
        add(btnSiguiente);

        Font fuente = new Font("Comic Sans MS", 2, 16);
        Font fuente1 = new Font("Cambria", 3, 20);

        lblpregunta.setFont(fuente);

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

                btnOk.setVisible(false);
                btnSiguiente.setVisible(true);
            }
            if (rdbtnop2.isSelected()) {
                Puntos.setAcieros(1);
                btnOk.setVisible(false);
                btnSiguiente.setVisible(true);

            }
            if (rdbtnop3.isSelected()) {
                Puntos.setErrores(1);
                btnOk.setVisible(false);
                btnSiguiente.setVisible(true);

            }
            if (rdbtnop4.isSelected()) {
                Puntos.setErrores(1);
                btnOk.setVisible(false);
                btnSiguiente.setVisible(true);

            }
        }

    }

    public static void main(String[] args) {
        new Nivel5("Nivel 5 de Producto Notable ", 400, 300);

    }

    @Override
    public void actionPerformed(ActionEvent boton) {
        if (boton.getSource() == btnOk) {
            setValidar();
        }

        if (boton.getSource() == btnSiguiente) {
            dispose();

            new Nivel6("Nivel 6 de Trinomio Cuadrado", 400, 300);

        }

    }
}
