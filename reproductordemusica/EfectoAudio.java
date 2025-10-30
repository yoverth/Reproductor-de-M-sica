public abstract class EfectoAudio implements Cancion {
    protected Cancion cancionDecorada;

    public EfectoAudio(Cancion cancion) {
        this.cancionDecorada = cancion;
    }

    @Override
    public String reproducir() {
        return cancionDecorada.reproducir();
    }
}
