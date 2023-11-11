/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author matias
 */
public class DialogoMoverCarro extends JDialog
{
    //----------------------
    //Atributos
    //----------------------
    private JLabel lbTitulo;
    private JLabel lbPosX;
    private JLabel lbPosY;
    private JTextField txPosX;
    private JTextField txPosY;
    private JButton btAceptar;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public DialogoMoverCarro()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        //Creación y adición del elementos
        lbTitulo = new JLabel("Mover Carro",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lbTitulo.setBounds(10,10,280,20);
        add(lbTitulo);
        
        lbPosX= new JLabel("X = ",JLabel.RIGHT);
        lbPosX.setFont(new Font("Arial", Font.BOLD, 25));
        lbPosX.setBounds(10,50,140,20);
        add(lbPosX);
        
        lbPosY= new JLabel("Y = ",JLabel.RIGHT);
        lbPosY.setFont(new Font("Arial", Font.BOLD, 25));
        lbPosY.setBounds(10,90,140,20);
        add(lbPosY);
        
        txPosX= new JTextField();
        txPosX.setFont(new Font("Arial", Font.BOLD, 25));
        txPosX.setBounds(150,50,100,25);
        add(txPosX);
        
        txPosY= new JTextField();
        txPosY.setFont(new Font("Arial", Font.BOLD, 25));
        txPosY.setBounds(150,90,100,25);
        add(txPosY);
        
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 25));
        btAceptar.setBounds(20,140,260,25);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);
               
        //Caracteristicas de la ventana
        setTitle("Carro");
        setSize(300,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public String getPosX()
    {
        return txPosX.getText();
    }
    
    public String getPosY()
    {
        return txPosY.getText();
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }   
}
