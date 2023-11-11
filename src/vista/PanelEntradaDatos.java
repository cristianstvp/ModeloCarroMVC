/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author matias
 */
public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbColor;
    private JLabel lbPosX;
    private JLabel lbPosY;
    private JTextField tfColor;
    private JTextField tfPosX;
    private JTextField tfPosY;
    private String colores[]={"Azul","Verde","Rojo","Negro","Blanco"};
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/carro.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,220,176);
        add(lbImagen);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbColor = new JLabel("Color = ");
        lbColor.setBounds(230,10,60,20);
        add(lbColor);
        
        lbPosX = new JLabel("PosX = ");
        lbPosX.setBounds(230,40,60,20);
        add(lbPosX);
        
        lbPosY = new JLabel("PosY = ");
        lbPosY.setBounds(230,70,60,20);
        add(lbPosY);
        
        
        //Creación y adición de campos de texto
        tfColor = new JTextField(colores[(int)(Math.random()*5)]);
        tfColor.setBounds(300, 10, 60, 20);
        add(tfColor);
        
        tfPosX = new JTextField("10");
        tfPosX.setBounds(300, 40, 60, 20);
        add(tfPosX);
        
        tfPosY = new JTextField("10");
        tfPosY.setBounds(300, 70, 60, 20);
        add(tfPosY);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getColor()
    {
        return tfColor.getText();
    }
    
    public String getPosX()
    {
        return tfPosX.getText();
    }
    
    public String getPosY()
    {
        return tfPosY.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfColor.setText("");
        tfPosX.setText("");
        tfPosY.setText("");
    }
}
