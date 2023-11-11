/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;

/**
 *
 * @author matias
 */
public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultado;
    public DialogoMoverCarro miDialogoMoverCarro;
    public Panel1Graphics mipanel;
    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);        
        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,380,190);
        add(miPanelEntradaDatos);
       
        
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,380,60);
        add(miPanelOperaciones);
        
        //Creación y adición del PanelOperaciones
        miPanelResultado = new PanelResultados();
        miPanelResultado.setBounds(10,290,380,250);
        add(miPanelResultado);
        
        //crea grafica 
        mipanel = new Panel1Graphics();
        mipanel.setBounds(400,10, 400, 530);        
        add(mipanel);
        
        miDialogoMoverCarro = null;       
        
        //Caracteristicas de la ventana
        setTitle("Carro");
        setSize(825,590);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
    }
    
    //Crear ventana dialogo Mover
    public void crearDialogoMover()
    {
        miDialogoMoverCarro = new DialogoMoverCarro();
    }
}
