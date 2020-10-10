/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrossCutting;

/**
 *
 * @author juanm
 */

//Clase abstracta que posee el metodo de Creacion, y que sera sobreescrito en el creador. En nuestro caso el Administrador.
public abstract class AbstractFactory {
    
     abstract Product CrearProducto(TipoProducto pTipo);
}
