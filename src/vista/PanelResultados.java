/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author matias
 */
public class PanelResultados extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    private JTextArea taResultado;
    private JScrollPane spResultado;

    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelResultados()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion del area de texto
        taResultado = new JTextArea();
        taResultado.setLineWrap(true);
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20, 360, 210);
        add(spResultado);
       
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Borar los resultados
    public void borrar()
    {
        taResultado.setText("");
    }
    
    //Mostrar resultado
    public void mostrarResultado(String msj)
    {
        taResultado.append(msj+"\n");
    }
}
