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
        this.getContentPane().setBackground(new java.awt.Color(255, 239, 213));
        iconok = new ImageIcon(getClass().getResource(ruta + "ok.png"));
        iconsig = new ImageIcon(getClass().getResource(ruta + "next1.png"));
        lblpregunta = new JLabel("La formula correcta para realizar un trinomio ");
        lblpregunta1 = new JLabel("cuadrado perfecto con los numeros(20, 3 y 10) es:");
        rdbtnop1 = new JRadioButton("20x + 3 + 10");
        rdbtnop2 = new JRadioButton("20 + 3x + 10");
        rdbtnop3 = new JRadioButton(" 20^2 + 3x + 10");
        rdbtnop4 = new JRadioButton("20 + 3 + 10");
        grupop1 = new ButtonGroup();
        btnOk = new JButton(iconok);
        btnSiguiente = new JButton(iconsig);
        //colocar coordenadas
        lblpregunta.setBounds(10, 20, 750, 20);
        lblpregunta1.setBounds(10, 40, 750, 30);


        rdbtnop1.setBounds(10, 80, 420, 20);
        rdbtnop2.setBounds(10, 100, 420, 20);
        rdbtnop3.setBounds(10, 120, 420, 20);
        rdbtnop4.setBounds(10, 140, 420, 20);
        btnOk.setBounds(20, 190, 100, 20);
        btnSiguiente.setBounds(130, 190, 100, 20);

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
        Font fuente1 = new Font("Cambria", 3, 13);

        lblpregunta.setFont(fuente);
        lblpregunta1.setFont(fuente);
        rdbtnop1.setBackground(new java.awt.Color(255, 239, 213));
        rdbtnop2.setBackground(new java.awt.Color(255, 239, 213));
        rdbtnop3.setBackground(new java.awt.Color(255, 239, 213));
        rdbtnop4.setBackground(new java.awt.Color(255, 239, 213));

        setVisible(true);

    }

    public void setValidar() {
        if (rdbtnop1.isSelected()) {
            Puntos.setErrores(1);

            btnOk.setVisible(false);
            btnSiguiente.setVisible(true);

        }
        if (rdbtnop2.isSelected()) {
            Puntos.setErrores(1);

            btnOk.setVisible(false);
            btnSiguiente.setVisible(true);

        }

        if (rdbtnop3.isSelected()) {
            Puntos.setAcieros(1);

            btnOk.setVisible(false);
            btnSiguiente.setVisible(true);
        }
        if (rdbtnop4.isSelected()) {
            Puntos.setErrores(1);


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
            JOptionPane.showMessageDialog(null, "Aciertos: " + Puntos.getAcieros()
                    + " de 6 " + " Errores: " + Puntos.getErrores() + " de 6 ");
            new Nivel9("Nivel 9 de Producto Notable", 500, 500);

        }

    }
}
