/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import util.*;

public class m_venta {
    
public static String c[][]=new String [10][4];
    
 public void venta_producto(int i,int producto,String cod_cliente){
      
     
	c[i][0]=String.valueOf(producto);
	c[i][1]=String.valueOf(cod_cliente);            
        
        carro.setC(c);
	  
    }
 double precioc;
 public double precio (String tipo, int anno){
    
     if(tipo.equals("Full") && (anno>=1990 && anno<=2014)){
         precioc=8233.3;
     }
     else {
         precioc=7500;
     }
     
     return precioc;
 }

}
