public abstract class MaterialBiblioteca {
    protected String titulo;
    protected int stock;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        if (stock < 0){
            this.stock = 0;
            throw new StockInsuficienteException("ERROR: El stock no puede ser negativo.");

        }else{
            this.stock = stock;
        }
    }
}

