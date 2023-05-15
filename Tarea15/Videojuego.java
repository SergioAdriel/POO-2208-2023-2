public class Videojuego {
        public int Id;
        private String nombre;
        private String genero;
        private double pesoEnGB;
        private String plataforma;
        private String desarrolador;

    public Videojuego() {
    }

    public Videojuego(int id, String nombre, String genero, double pesoEnGB, String plataforma, String desarrolador) {
            Id = id;
            this.nombre = nombre;
            this.genero = genero;
            this.pesoEnGB = pesoEnGB;
            this.plataforma = plataforma;
            this.desarrolador = desarrolador;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public double getPesoEnGB() {
            return pesoEnGB;
        }

        public void setPesoEnGB(double pesoEnGB) {
            this.pesoEnGB = pesoEnGB;
        }

        public String getPlataforma() {
            return plataforma;
        }

        public void setPlataforma(String plataforma) {
            this.plataforma = plataforma;
        }

        public String getDesarrolador() {
            return desarrolador;
        }

        public void setDesarrolador(String desarrolador) {
            this.desarrolador = desarrolador;
        }

    @Override
    public String toString() {
        return "Videojuego{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", pesoEnGB=" + pesoEnGB +
                ", plataforma='" + plataforma + '\'' +
                ", desarrolador='" + desarrolador + '\'' +
                '}';
    }
}


