public class Velocidad extends EfectoAudio {

    public Velocidad(Cancion cancion) {
        super(cancion);
    }

    @Override
    public String reproducir() {
        return cancionDecorada.reproducir() + "\n⚡ Se aplica efecto: Aumento de Velocidad";
    }
}
