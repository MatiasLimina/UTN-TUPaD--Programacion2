import java.util.List;

public class Buscador <T extends Identificable<K>,K> {
    public T buscarPorId(List<? extends T> lista, K id){
        for (T elemento : lista){
            if (elemento.getId().equals(id)){
                return elemento;
            }
        }
        return null;
    }
}
