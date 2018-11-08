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
import javax.swing.*;
import javax.swing.JOptionPane;
import aprendizajenotable.menu;
import aprendizajenotable.Puntos;

public class quienes_somos extends JFrame
        implements ActionListener {
    
    JPanel panel1 = new JPanel();
    ImageIcon iconSanti, iconCami, iconSara, iconJoce;
    JTextField texto1, texto2, texto3, texto4;
    JPanel jp = new JPanel();
    JButton btn1, btn2, btn3, btn4;
    JLabel lblSara, lblSantiago, lblJoce, lblCami;
    
    public quienes_somos(String Titulo, int ancho, int alto) {
        
        setLayout(null); //evitar distribuciones automaticas
        setTitle(Titulo);//titulo
        setSize(ancho, alto);//tamaño formularios
        setLocationRelativeTo(this);//centrado automatico
        
        ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/nosotros.png"));
        JLabel fondo = new JLabel(img);
        JLayeredPane layered = new JLayeredPane();// objeto para colocar imagen de fondo
        ((JPanel) getContentPane()).setOpaque(false);
        fondo.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        
        iconSanti = new ImageIcon(getClass().getResource("/imagenes/next1.png"));
        
        btn1 = new JButton(iconSanti);
        
        btn1.setBounds(190, 520, 100, 20);
        btn1.addActionListener(this);
        
        add(btn1);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new quienes_somos("Quienes somos", 500, 600);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == btn1) {
            dispose();
            new menu("", 500, 500);
        }
    }
    
}
