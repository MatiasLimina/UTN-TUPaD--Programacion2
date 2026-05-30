import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente extends Base{
    private String nombre;
    private String apellido;
    private String email;
    private String celular;
    private String contrasenia;
    private Rol rol;
    private List<Pedido> pedidos;

    public Cliente(String nombre, String apellido, String email, String celular, String contrasenia, Rol rol, List<Pedido> pedidos) {
        super(false,LocalDateTime.now());
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.pedidos = pedidos;
    }

    public Cliente(String nombre,Rol rol, String celular, String contrasenia, String apellido, String email) {
        this(nombre,apellido,email,celular,contrasenia,rol,new ArrayList<>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public List<Pedido> getPedidos() {
        return Collections.unmodifiableList(pedidos);
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
        pedido.setCliente(this);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", rol=" + rol +
                ", pedidos=" + pedidos +
                ", " + super.toString() +
                '}';
    }
}
