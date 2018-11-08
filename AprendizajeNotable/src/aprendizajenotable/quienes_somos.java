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
        btn1 = new JButton(iconSanti);
        btn2 = new JButton(iconSara);
        btn2 = new JButton(iconCami);
        btn4 = new JButton(iconJoce);
        iconSanti = new ImageIcon(getClass().getResource("/imagenes/santiago.jpg"));
        iconSara = new ImageIcon(getClass().getResource("/imagenes/sara.jpg"));
        iconJoce = new ImageIcon(getClass().getResource("/imagenes/jocelyn.jpg"));
        iconCami = new ImageIcon(getClass().getResource("/imagenes/camila.jpg"));

        lblSara = new JLabel(iconSara);
        lblSantiago = new JLabel(iconSanti);
        lblCami = new JLabel(iconCami);
        lblJoce = new JLabel(iconJoce);

        texto1 = new JTextField("Yo soy Santiago, un apasionado de la Ciencia y la tecnología. \n"
                + "Estoy muy comprometido con la media técnica porque deseo dedicarme al desarrollo en unos años, "
                + "luego de esto me gustaría estudiar física y pasar el resto de mi vida investigando.  ");
        texto2 = new JTextField(" Mi nombre es Camila López. \n"
                + "Vivo en medellin, acualmente tengo 16 años y estudio en la Institución Educativa Javiera Londoño. \n"
                + "Lo que mas amo es pasar tiempo con mis mascotas, me encanta tomar fotografias al cielo. \n"
                + "Mis hobbits son: leer, escuchar musica en especial el rock, me gusta el basquetball. \n"
                + "En el futuro me veo estudiando ingenieria en sistemas.  ");
        texto3 = new JTextField("Hola, mi nombre es Sara Zapata Posada. \n"
                + "Vivo en Medellín, estudio en la Institución Educativa Javiera Londoño, y lo que más me gusta hacer es me gusta dormir y comer. \n"
                + "En mi tiempo libre me gusta leer, practicar basketball, voleibol y ver algunas series de televisión.\n"
                + "Me gustaría estudiar comunicación social y terminar la media tecnica (ingeniería de software-diseño de software).  ");
        texto4 = new JTextField("Soy estudiante de grado décimo de la Javiera Londoño. \n"
                + "Soy dededicada perseverante y responsable para las situaciones de mi vida, me gusta el trabajo en equipo y hacer las cosas de una manera correcta. \n"
                + "Me gusta dedicar tiempo a mi familia.\n"
                + "Mi pasión es el baile, y en mi tiempo libre me gusta salir a caminar y compartir con las personas de mi entorno. \n"
                + "En un futuro deseo verme como una ingeniera en sistemas, en verdad me gusta y me apasiona.");

        texto1.setBounds(40, 0, 0, 0);
        texto2.setBounds(0, 160, 0, 0);
        texto3.setBounds(0, 160, 0, 0);
        texto4.setBounds(0, 160, 0, 0);

        lblSantiago.setBounds(0, 0, iconSanti.getIconWidth(), iconSanti.getIconHeight());
        lblCami.setBounds(0, 120, iconCami.getIconWidth(), iconCami.getIconHeight());
        lblSara.setBounds(0, 240, iconSara.getIconWidth(), iconSara.getIconHeight());
        lblJoce.setBounds(0, 350, iconJoce.getIconWidth(), iconJoce.getIconHeight());;

        add(lblCami);
        add(lblJoce);
        add(lblSantiago);
        add(lblSara);

        setVisible(true);
    }

    public static void main(String[] args) {
        new quienes_somos("Quienes somos", 500, 500);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
