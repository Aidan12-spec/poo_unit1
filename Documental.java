/**
 * Class Documental
 */
package uni1a;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudioVisual {
    private String tema;
    private Investigador investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, String nombreInvestigador) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador = new Investigador(nombreInvestigador);
    }

    public class Investigador{
        private String nombre;
        
        public Investigador(String nombre){
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
    }
    public Documental() {
        super(null, 0, null);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public void mostrarDetalles() {
    System.out.println("Detalles del documental:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    System.out.println("Género: " + getGenero());
    System.out.println("Tema: " + this.tema);
        System.out.println("Investigadores: " + investigador.getNombre());
    System.out.println();
    }
}
