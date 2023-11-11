/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author matias
 */
public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bCrear;
    public JButton bMover;
    public JButton bAcelerar;
    public JButton bFrenar;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        bCrear = new JButton("Crear");
        bCrear.setFont(new Font("Arial", BOLD, 12));
        bCrear.setBounds(10,20,90,20);
        add(bCrear);
        bCrear.setActionCommand("crear");
        
        
        bMover = new JButton("Mover");
        bMover.setFont(new Font("Arial", BOLD, 12));
        bMover.setBounds(105,20,90,20);
        add(bMover);
        bMover.setActionCommand("mover");
        bMover.setEnabled(false);
        
        bAcelerar = new JButton("Acelerar");
        bAcelerar.setFont(new Font("Arial", BOLD, 12));
        bAcelerar.setBounds(200,20,90,20);
        add(bAcelerar);
        bAcelerar.setActionCommand("acelerar");
        bAcelerar.setEnabled(false);
        
        bFrenar = new JButton("Frenar");
        bFrenar.setFont(new Font("Arial", BOLD, 12));
        bFrenar.setBounds(295,20,80,20);
        add(bFrenar);
        bFrenar.setActionCommand("frenar");
        bFrenar.setEnabled(false);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        bCrear.addActionListener(pAL);
        bMover.addActionListener(pAL);
        bAcelerar.addActionListener(pAL);
        bFrenar.addActionListener(pAL);
    }
    
    public void desactivarBotonCrear()
    {
        bCrear.setEnabled(false);
    }
    
    public void activarBotones()
    {
        bMover.setEnabled(true);
        bAcelerar.setEnabled(true);
        bFrenar.setEnabled(true);
    }
}
