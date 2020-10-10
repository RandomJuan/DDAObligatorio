/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

/**
 *
 * @author juanm
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author nicom
 */
public class pConexion {
    private static pConexion instancia;
    private Connection distribuidora;

    public pConexion() {
    }

    public pConexion getInstancia() {
        if (instancia == null) {
            instancia = new pConexion();
        }
        return instancia;
    }

    public void abrirConexion() throws Exception {
        try {
            //Cargamos el driver
            Class.forName("com.mysql.jdbc.Driver");
            //Creamos la conexion
            distribuidora = DriverManager.getConnection("jdbc:mysql://localhost/clubdeportivo?user=admin&password=Password01");
            distribuidora.setAutoCommit(true);
        } catch (ClassNotFoundException e) {
            throw new Exception("Problemas con el driver:" + e.getMessage());
        } catch (SQLException e1) {
            throw new Exception("Problemas con la conexion:" + e1.getMessage());
        }
    }

    public void cerrarConexion() throws Exception {
        try {
            distribuidora.close();
        } catch (SQLException e1) {
            throw new Exception("Problemas con la conexion:" + e1.getMessage());
        }
    }

    public void setInstancia(pConexion val) {
        pConexion.instancia = val;
    }

    public Connection getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(Connection val) {
        this.distribuidora = val;
    }

    public void agregar(Object o) throws Exception {
    }

    public void modificar(Object o) throws Exception {
    }

    public void eliminar(Object o) throws Exception {
    }
}
