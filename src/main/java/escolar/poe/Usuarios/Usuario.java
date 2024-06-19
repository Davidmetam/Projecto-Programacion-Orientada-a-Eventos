package escolar.poe.Usuarios;

public class Usuario {
    private int registro;
    private String nombre;
    private String Email;

    public Usuario(int registro, String nombre, String email) {
        this.registro = registro;
        this.nombre = nombre;
        Email = email;
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
