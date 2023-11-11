/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionCarros;

import controlador.Controlador;
import modelo.Carro;
import vista.VentanaPrincipal;

/**
 *
 * @author njpae
 */
public class CreacionCarros 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Carro miCarro = null;
        Controlador miControlador = new Controlador(miVentana, miCarro);
    }
}