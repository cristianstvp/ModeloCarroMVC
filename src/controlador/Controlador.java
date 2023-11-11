/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Carro;
import vista.VentanaPrincipal;

/**
 *
 * @author matias
 */
public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Carro model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Carro pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("crear"))
        {   
            //Validar datos entrada
            try
            {
                String color = venPrin.miPanelEntradaDatos.getColor();
                int posX = Integer.parseInt(venPrin.miPanelEntradaDatos.getPosX());
                int poxY = Integer.parseInt(venPrin.miPanelEntradaDatos.getPosY());
            
                //Creación del objeto tipo Carro
                model = new Carro(color, posX, poxY);
                
                venPrin.miPanelResultado.mostrarResultado("Se ha creado un objeto Carro");
                venPrin.miPanelResultado.mostrarResultado("Su número de ruedas son " + model.getNumRuedas());
                venPrin.miPanelResultado.mostrarResultado("Su color actual es " + model.getColor());
                venPrin.miPanelResultado.mostrarResultado("Su posición actual es (" + model.getPosX()+"," + model.getPosY()+")" );
                venPrin.miPanelResultado.mostrarResultado("Su velocidad actual es " + model.getVelocidad());
                //Desactivar boton crear
                //venPrin.miPanelOperaciones.desactivarBotonCrear();
                //Activar botones
                venPrin.miPanelOperaciones.activarBotones();
                //Ubicar el carro en la posicion inicial
                venPrin.mipanel.moverCarro(posX,poxY);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        
        if(comando.equals("mover"))
        {   
            venPrin.crearDialogoMover();
            this.venPrin.miDialogoMoverCarro.agregarOyentesBotones(this);  
        }
        
        if(comando.equals("aceptar"))
        {
            this.venPrin.miDialogoMoverCarro.agregarOyentesBotones(this); 
            int x = Integer.parseInt(venPrin.miDialogoMoverCarro.getPosX());
            int y = Integer.parseInt(venPrin.miDialogoMoverCarro.getPosY());
            venPrin.mipanel.setD11(model.getPosX());
            venPrin.mipanel.setD12(model.getPosY());
            venPrin.mipanel.moverCarro(x,y);
            model.mover(x, y);
            venPrin.miPanelResultado.mostrarResultado("\nTras mover el carro, su posición actual es (" + model.getPosX()+"," + model.getPosY()+")"); 
            venPrin.miDialogoMoverCarro.cerrarDialogo();            
        }
        
        if(comando.equals("acelerar"))
        {
            model.acelerar();
            venPrin.miPanelResultado.mostrarResultado("\nTras acelerar, su velocidad actual es " + model.getVelocidad());
        }
        
        if(comando.equals("frenar"))
        {
            model.frenar();
            venPrin.miPanelResultado.mostrarResultado("\nTras frenar, su velocidad actual es " + model.getVelocidad());
        }
    }    
}
