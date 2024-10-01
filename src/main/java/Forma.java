import javax.swing.*;
import com.formdev.flatlaf.FlatDarculaLaf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Forma extends JFrame {
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma(){
        inicializarForma();
        /*campoTexto.addActionListener(e -> {
            replicarTexto();
        });*/
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null); //centramos la ventana
    }

    private void replicarTexto(){
        this.replicadorLabel.setText(campoTexto.getText());
    }

    public static void main(String[] args){
        FlatDarculaLaf.setup();
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
