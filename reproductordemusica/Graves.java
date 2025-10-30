public class Graves extends EfectoAudio {

    public Graves(Cancion cancion) {
        super(cancion);
    }

    @Override
    public String reproducir() {
        return cancionDecorada.reproducir() + "\n🎚️ Se aplica efecto: Aumento de Graves";
    }
}
