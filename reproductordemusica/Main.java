public class Main {
    public static void main(String[] args) {

        // Canción base
        Cancion base = new CancionBasica();
        System.out.println(base.reproducir());
        System.out.println("----------------------------");

        // Canción con eco
        Cancion conEco = new Eco(base);
        System.out.println(conEco.reproducir());
        System.out.println("----------------------------");

        // Canción con eco y graves
        Cancion conEcoYGraves = new Graves(conEco);
        System.out.println(conEcoYGraves.reproducir());
        System.out.println("----------------------------");

        // Canción con eco, graves y velocidad
        Cancion conTodos = new Velocidad(conEcoYGraves);
        System.out.println(conTodos.reproducir());
    }
}
