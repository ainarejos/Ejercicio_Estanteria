public class Main {
    public static void main(String[] args) {
        Llibre l1=new Llibre("Don Ismael y SanchoJoshua", "Cervantino", 5);
        Llibre l2=new Llibre("El mending", "Brandon Mendelson", 8);
        Estanteria e1=new Estanteria();
        e1.AfegirLlibre(l1);
        e1.AfegirLlibre(l2);
        e1.EliminarLlibre("Cervantino");
        e1.Top10();
        e1.VeuresEstanteria();

    }
}
