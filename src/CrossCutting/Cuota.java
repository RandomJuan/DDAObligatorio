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
public class Cuota {
    
    private int _id;
    private int _precio;
    private Socio _socio;
    
    public Cuota(){}

    public Cuota(int _precio, Socio _socio) {
        this._precio = _precio;
        this._socio = _socio;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public int getPrecio() {
        return _precio;
    }

    public void setPrecio(int _precio) {
        this._precio = _precio;
    }

    public Socio getSocio() {
        return _socio;
    }

    public void setSocio(Socio _socio) {
        this._socio = _socio;
    }
    
}
