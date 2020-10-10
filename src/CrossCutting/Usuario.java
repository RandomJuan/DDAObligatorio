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
public class Usuario {
    
    private int _id;
    private String _usuario;
    private String _contrasenia;

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getUsuario() {
        return _usuario;
    }

    public void setUsuario(String _usuario) {
        this._usuario = _usuario;
    }

    public String getContrasenia() {
        return _contrasenia;
    }

    public void setContrasenia(String _contrasenia) {
        this._contrasenia = _contrasenia;
    }
    
    
    
}
