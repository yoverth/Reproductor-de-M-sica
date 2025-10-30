public class Eco extends EfectoAudio {

    public Eco(Cancion cancion) {
        super(cancion);
    }

    @Override
    public String reproducir() {
        return cancionDecorada.reproducir() + "\n🔁 Se aplica efecto: Eco";
    }
}
