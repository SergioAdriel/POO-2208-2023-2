public class Libro {
    private String titulo;
    private String autor;
    private String editorial;

    public Libro() {
    }

    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }

    public void estadoLibro(int estadoLibro){
        if (estadoLibro >=7){
            System.out.println("El libro esta en buen estado");
        }
        if (estadoLibro >=5){
            System.out.println("El libro esta en estado intermedio");  //De 1 a 5 esta feo y de 5 a 7 regular
        }
        else {
            System.out.println("El libro esta bien culeis");
        }
    }

    public void disponible (int disponible){
        if (disponible >=1){
            System.out.println("El libro esta fuera de la biblioteca");
        }
        else {
            System.out.println("El libro esta disponible");
        }
    }
}
