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
public class Nivel10 extends JFrame implements ActionListener {

    ImageIcon iconok, iconsig;

    JRadioButton rdbtnop1, rdbtnop2,
            rdbtnop3, rdbtnop4;

    JLabel lblpregunta;
    JButton btnOk, btnSiguiente;
    ButtonGroup grupop1;

    public Nivel10(String titulo, int ancho, int alto) {
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
        iconok = new ImageIcon(getClass().getResource("/imagenes/ok.png"));
        iconsig = new ImageIcon(getClass().getResource("/imagenes/next1.png"));
        lblpregunta = new JLabel("El producto de (5ab−3) (5ab−3) es:");

        rdbtnop2 = new JRadioButton("25a²b²-30ab+9");
        rdbtnop1 = new JRadioButton("25a²b²+9");
        rdbtnop3 = new JRadioButton("25ab +9");
        rdbtnop4 = new JRadioButton("25a²b² -9");
        grupop1 = new ButtonGroup();
        btnOk = new JButton(iconok);
        btnSiguiente = new JButton(iconsig);
        //colocar coordenadas
        lblpregunta.setBounds(10, 20, 300, 20);

        rdbtnop1.setBounds(10, 90, 220, 20);
        rdbtnop2.setBounds(10, 120, 220, 20);
        rdbtnop3.setBounds(10, 150, 220, 20);
        rdbtnop4.setBounds(10, 180, 220, 20);
        btnOk.setBounds(20, 210, 100, 20);
        btnSiguiente.setBounds(130, 210, 100, 20);

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
        setVisible(true);

        add(btnOk);
        btnOk.addActionListener(this);
        btnSiguiente.addActionListener(this);
        add(btnSiguiente);

        Font fuente = new Font("Comic Sans MS", 2, 16);
        Font fuente1 = new Font("Cambria", 3, 20);
        rdbtnop1.setOpaque(false);
        rdbtnop2.setOpaque(false);
        rdbtnop3.setOpaque(false);
        rdbtnop4.setOpaque(false);
        rdbtnop1.setFont(fuente1);
        rdbtnop2.setFont(fuente1);
        rdbtnop3.setFont(fuente1);
        rdbtnop4.setFont(fuente1);
        lblpregunta.setFont(fuente);

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
            btnOk.setVisible(false);
            btnSiguiente.setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Nivel10("Nivel 10 de ", 400, 300);

    }

    @Override
    public void actionPerformed(ActionEvent boton) {
        String msg = "<html> <body> <table> <tr>  <td>Buenas</td>  <td>Malas</td>  </tr> "
                + "<tr>  <td> " + Puntos.getAcieros() + "</td>  <td>" + Puntos.getErrores() + "</td>  </tr>  </table> </body> </html>";
        if (boton.getSource() == btnOk) {
            setValidar();
        }
        if (boton.getSource() == btnSiguiente) {
            dispose();

            JOptionPane.showMessageDialog(this, msg);
            new menu("", 500, 500);

        }

    }

}
