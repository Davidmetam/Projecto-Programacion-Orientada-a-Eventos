package escolar.poe.Usuarios;

public class Admin{

    private String Usuario;

    private String Contraseña;

    public Admin(String usuario, String contraseña) {
        Usuario = usuario;
        Contraseña = contraseña;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}
