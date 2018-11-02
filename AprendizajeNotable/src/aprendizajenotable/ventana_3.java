package aprendizajenotable;

import com.sun.glass.ui.Cursor;
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
 * @author Lenovo
 */
public class ventana_3 extends JFrame implements ActionListener {

    String ruta = "/imagenes/";
    
    ImageIcon iconok, iconsig;
    JRadioButton rdbtnop1, rdbtnop2,
            rdbtnop3, rdbtnop4;
    
    JLabel lblpregunta;
    JButton btnOk, btnSiguiente;
    ButtonGroup grupop1;
    
    public ventana_3(String titulo, int ancho, int alto) {
        setLayout(null);
        setTitle(titulo);
        setSize(ancho, alto);
        setLocationRelativeTo(this);

        //paso2 crear las instancias al constructor 
        this.getContentPane().setBackground(new java.awt.Color(255, 239, 213));
        iconok = new ImageIcon(getClass().getResource(ruta + "ok.png"));
        iconsig = new ImageIcon(getClass().getResource(ruta + "next1.png"));
        lblpregunta = new JLabel("al factorizar 4a²-12ab+9b² se obtiene:");
        rdbtnop1 = new JRadioButton("(2a-3b)²");
        rdbtnop2 = new JRadioButton("x²");
        rdbtnop3 = new JRadioButton("(a-b)(a-b)");
        rdbtnop4 = new JRadioButton("(a+b)(a-b)");
        grupop1 = new ButtonGroup();
        btnOk = new JButton(iconok);
        btnSiguiente = new JButton(iconsig);
        //colocar coordenadas
        lblpregunta.setBounds(10, 20, 400, 20);
        
        rdbtnop1.setBounds(10, 80, 220, 20);
        rdbtnop2.setBounds(10, 100, 220, 20);
        rdbtnop3.setBounds(10, 120, 220, 20);
        rdbtnop4.setBounds(10, 140, 220, 20);
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
        add(rdbtnop1);
        add(rdbtnop2);
        add(rdbtnop3);
        add(rdbtnop4);
        add(btnOk);
        add(btnSiguiente);
        
        Font fuente = new Font("Comic Sans MS", 2, 16);
        Font fuente1 = new Font("Cambria", 3, 13);
        
        lblpregunta.setFont(fuente);
        
        rdbtnop1.setBackground(new java.awt.Color(255, 239, 213));
        rdbtnop2.setBackground(new java.awt.Color(255, 239, 213));
        rdbtnop3.setBackground(new java.awt.Color(255, 239, 213));
        rdbtnop4.setBackground(new java.awt.Color(255, 239, 213));
        
        setVisible(true);
        
    }
    
    public void setValidar() {
        if (rdbtnop1.isSelected()) {
            Puntos.setAcieros(1);
            JOptionPane.showMessageDialog(null, "genial, ganaste!");
            btnOk.setVisible(false);
            btnSiguiente.setVisible(true);
        }
        if (rdbtnop2.isSelected()) {
            Puntos.setErrores(1);
            JOptionPane.showMessageDialog(null, "vuelve a intentarlo");
            
        }
        if (rdbtnop3.isSelected()) {
            Puntos.setErrores(1);
            JOptionPane.showMessageDialog(null, "vuelve a intentarlo");
            
        }
        if (rdbtnop4.isSelected()) {
            Puntos.setErrores(1);
            JOptionPane.showMessageDialog(null, "vuelve a intentarlo");
            
        }
        
    }
    
    public static void main(String[] args) {
        new ventana_3("nivel 2 pregunta 1", 400, 300);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent boton) {
        if (boton.getSource() == btnOk) {
            setValidar();
        }
        
        if (boton.getSource() == btnSiguiente) {
        dispose();
        
new menu("5", 500, 500);

        }
        
    }
}
