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
public class Socio {
    
    private int _numero;
    private String _nombre;
    private String _direccion;
    private int _telefono;
    private Categoria _categoria;
    private boolean _disponible;

    public Socio(String _nombre, String _direccion, int _telefono, Categoria _categoria) {
        this._nombre = _nombre;
        this._direccion = _direccion;
        this._telefono = _telefono;
        this._categoria = _categoria;
        this._disponible = true;
    }

    public int getNumero() {
        return _numero;
    }

    public void setNumero(int _numero) {
        this._numero = _numero;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getDireccion() {
        return _direccion;
    }

    public void setDireccion(String _direccion) {
        this._direccion = _direccion;
    }

    public int getTelefono() {
        return _telefono;
    }

    public void setTelefono(int _telefono) {
        this._telefono = _telefono;
    }

    public Categoria getCategoria() {
        return _categoria;
    }

    public void setCategoria(Categoria _categoria) {
        this._categoria = _categoria;
    }

    public boolean isDisponible() {
        return _disponible;
    }

    public void setDisponible(boolean _disponible) {
        this._disponible = _disponible;
    }
    
    public void factoryMethod()
    {
        
    }
}
