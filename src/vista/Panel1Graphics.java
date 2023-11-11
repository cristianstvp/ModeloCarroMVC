/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
        
/**
 *
 * @author USUARIO
 */
public class Panel1Graphics extends JPanel
{
    public int x;
    public int y;
    public int xx;
    public int yy; 
    public Image imagen;
    
    public Panel1Graphics()
    {              
        //Definición del contenedor de la ventana
        setLayout(null);
        setBackground(Color.WHITE);
        
        
        imagen = new ImageIcon(getClass().getResource("/vista/crt.png")).getImage(); 
        
    }
    
    public void setD11(int pX)
    {
        x = pX;
    }
    
    public void setD12(int pY)
    {
        y = pY;
    }
    
    public void setD21(int pXx)
    {
        xx = pXx;
    }
    
    public void setD22(int pYy)
    {
        yy = pYy;
    }
    
    @Override
    public void paintComponent (Graphics g)
    {
        int r=0;
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        //Capturo el ancho y alto del panel
        int w= this.getWidth();
        int h = this.getHeight();
                
        //Dibujar ejes
        g2.drawLine(0, h/2, w, h/2);
        g2.drawLine(w/2, 0, w/2, h);
        
        
        //Trasladar origen y rotar plano
        g2.translate(w/2, h/2);
        //g2.rotate(3*Math.PI/2);
        //g2.rotate(Math.toRadians(270));                                        
        
        //carro ubicacion
        g2.fillOval(xx-4,yy-4,9,9);
        g2.drawImage(imagen, xx, yy, this);
        
        //linea de movimiento
        g2.drawLine(x, -y, xx, yy);  
        //Coordenadas
        g2.drawString("("+xx+","+-yy+")", xx, yy-2);
        //decir las coordenadas        
        g2.drawString("+X", 150, 0);
        g2.drawString("-X", -150, 0);
        g2.drawString("-Y", 0, 150);
        g2.drawString("+Y", 0, -150);
    }
    
    
    public void moverCarro(int pX, int pY)
    {
        xx=pX;
        yy=-pY;
        repaint();
    }
}
