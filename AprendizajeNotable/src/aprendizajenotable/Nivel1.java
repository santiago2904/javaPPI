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
public class Nivel1 extends JFrame implements ActionListener {

    ImageIcon iconok, iconsig;

    JRadioButton rdbtnop1, rdbtnop2,
            rdbtnop3, rdbtnop4;

    JLabel lblpregunta, lblpregunta1;
    JButton btnOk, btnSiguiente;
    ButtonGroup grupop1;

    public Nivel1(String titulo, int ancho, int alto) {
        setLayout(null);
        setTitle(titulo);
        setSize(ancho, alto);
        setLocationRelativeTo(this);

        //paso2 crear las instancias al constructor 
        //this.getContentPane().setBackground(new java.awt.Color(255, 239, 213));
        ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
        JLabel fondo = new JLabel(img);
        JLayeredPane layered = new JLayeredPane();// objeto para colocar imagen de fondo
        ((JPanel) getContentPane()).setOpaque(false);

        fondo.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);

        iconok = new ImageIcon(getClass().getResource("/imagenes/ok.png"));
        iconsig = new ImageIcon(getClass().getResource("/imagenes/next.png"));
        lblpregunta = new JLabel("¿Cual de estos casos es");
        lblpregunta1 = new JLabel("un trinomio cuadrado perfecto?:");

        rdbtnop1 = new JRadioButton("81x²+18x+4 ");
        rdbtnop2 = new JRadioButton("10+7x+9-6");
        rdbtnop3 = new JRadioButton("(2+7x+10)");
        rdbtnop4 = new JRadioButton("9x-8");
        grupop1 = new ButtonGroup();
        btnOk = new JButton(iconok);
        btnSiguiente = new JButton(iconsig);
        //colocar coordenadas
        lblpregunta.setBounds(10, 20, 300, 20);
        lblpregunta1.setBounds(10, 50, 300, 20);
        rdbtnop1.setBounds(10, 90, 220, 20);
        rdbtnop2.setBounds(10, 120, 220, 20);
        rdbtnop3.setBounds(10, 150, 220, 20);
        rdbtnop4.setBounds(10, 180, 220, 20);
        btnOk.setBounds(20, 230, 100, 20);
        btnSiguiente.setBounds(130, 230, 100, 20);

        grupop1.add(rdbtnop1);
        grupop1.add(rdbtnop2);
        grupop1.add(rdbtnop3);
        grupop1.add(rdbtnop4);
        btnSiguiente.setVisible(false);
        add(lblpregunta1);
        add(lblpregunta);
        add(rdbtnop1);
        add(rdbtnop2);
        add(rdbtnop3);
        add(rdbtnop4);

        add(btnOk);
        btnOk.addActionListener(this);
        btnSiguiente.addActionListener(this);
        add(btnSiguiente);

        //rdbtnop1.setBackground(new java.awt.Color(255, 239, 213));
        rdbtnop1.setOpaque(false);
        rdbtnop2.setOpaque(false);
        rdbtnop3.setOpaque(false);
        rdbtnop4.setOpaque(false);

        Font fuente = new Font("Comic Sans MS", 2, 16);
        Font fuente1 = new Font("Cambria", 3, 20);
        lblpregunta.setFont(fuente);
        lblpregunta1.setFont(fuente);
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
                Puntos.setAcieros(1);
            }
            if (rdbtnop2.isSelected()) {
                Puntos.setErrores(1);
            }
            if (rdbtnop3.isSelected()) {
                Puntos.setErrores(1);
            }
            if (rdbtnop4.isSelected()) {
                Puntos.setErrores(1);

            }
            btnOk.setVisible(false);
            btnSiguiente.setVisible(true);

        }
    }

    public static void main(String[] args) {
        new Nivel1("nivel 1 de trinomio cuadrado perfecto ", 400, 300);

    }

    @Override
    public void actionPerformed(ActionEvent boton) {
        if (boton.getSource() == btnOk) {
            setValidar();
        }
        if (boton.getSource() == btnSiguiente) {
            dispose();

            new Nivel2("nivel 2 de producto notable", 400, 300);

        }

    }

}
