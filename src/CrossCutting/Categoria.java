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
public class Categoria implements Product{
    
    private int _id;
    private String _categoria;
    private boolean _disponible;

    public Categoria(){}
    public Categoria(String _categoria) {
        this._categoria = _categoria;
        this._disponible = true;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getCategoria() {
        return _categoria;
    }

    public void setCategoria(String _categoria) {
        this._categoria = _categoria;
    }

    public boolean isDisponible() {
        return _disponible;
    }

    public void setDisponible(boolean _disponible) {
        this._disponible = _disponible;
    }
    
    
    
    
    
    
    
}
