/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import CrossCutting.Product;

/**
 *
 * @author juanm
 */
public class Fachada {
    
    public boolean AgregarProducto(Product pProducto)
    {
        return dAdministrador.InsertarProducto(pProducto);
    }
}
