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
public class Session  {
    
    private static Session sesion;
    private Administrador admin;
    private Session()
    {
        
    }
    //Patron Singleton Implementado
    public static Session getInstance()
    {
        if(sesion == null)
        {
            sesion = new Session();
        }
        return sesion;
    }
    
    public void setAdministrador(Administrador pAdmin)
    {
        admin = pAdmin;
    }
    
    public Administrador getAdministrador()
    {
        return admin;
    }
}
