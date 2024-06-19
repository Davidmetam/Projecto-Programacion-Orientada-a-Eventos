package escolar.poe.Usuarios;

public class Usuario {
    private int registro;
    private String nombre;
    private String Email;
    private String usuario;
    private String contraseña;

    public Usuario(int registro, String nombre, String email, String usuario, String contraseña) {
        this.registro = registro;
        this.nombre = nombre;
        Email = email;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
