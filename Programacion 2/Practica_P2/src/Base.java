import java.time.LocalDateTime;

public abstract class Base {
    private Long id;
    private boolean eliminado;
    private LocalDateTime createdAt;
    private static Long contador = 1L;

    public Base(boolean eliminado, LocalDateTime createdAt) {
        this.id = contador++;
        setEliminado(eliminado);
        setCreatedAt(createdAt);
    }

    public Long getId() {
        return id;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", eliminado=" + eliminado +
                ", createdAt=" + createdAt +
                '}';
    }
}
