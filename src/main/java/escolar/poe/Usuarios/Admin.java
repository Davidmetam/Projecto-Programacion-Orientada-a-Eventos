package escolar.poe.Usuarios;

public class Admin{

    private String Usuario;

    private int Contraseña;

    public Admin(String usuario, int contraseña) {
        Usuario = usuario;
        Contraseña = contraseña;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public int getContraseña() {
        return Contraseña;
    }

    public void setContraseña(int contraseña) {
        Contraseña = contraseña;
    }
}
