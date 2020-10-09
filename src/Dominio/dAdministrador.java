/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import CrossCutting.Categoria;
import CrossCutting.Cuota;
import CrossCutting.Product;
import CrossCutting.TipoProducto;

/**
 *
 * @author juanm
 */
public class dAdministrador {
    
    
    public static boolean InsertarProducto(Product pProducto)
    {
        //Es de ejemplo nomas, FactoryMethod ya implementado, el creador es el Administrador, de el producto, Categoria y Cuota
        
        String clase = pProducto.getClass().getSimpleName();
        
        switch(TipoProducto.valueOf(clase))
        {
            case Categoria:
                ((Categoria)pProducto).setId(1);
                
        }
        return true;
    }
    
}
