public class Main {
    public static void main(String[] args) throws Exception {
        Llibre l1=new Llibre("Don Ismael y SanchoJoshua", "Cervantino", 5);
        Llibre l2=new Llibre("El mending", "Brandon Mendelson", 8);
        Llibre l3=new Llibre("Janmaneitor", "James Charles", 10);
        Llibre l4=new Llibre("Regreso al Parking", "Robert Patison", 8);
        Llibre l5=new Llibre("La pandemia", "Jackie Chan", 1);
        Llibre l6=new Llibre("Los Avengadores", "Los hermanos rusos", 7);
        Llibre l7=new Llibre("Carmela te revienta", "Paco Paquito", 5);
        Llibre l8=new Llibre("Lunes 13", "Jasoooooooon", 6);
        Llibre l9=new Llibre("Piratas del Mediterranio", "Johnny Profundo", 9);
        Llibre l10=new Llibre("Harry el Marrano", "Billy el Viejo", 2);
        Llibre l11=new Llibre("La milla violeta", "Bart", 2);
        Estanteria e1=new Estanteria();
        e1.AfegirLlibre(l1);
        e1.AfegirLlibre(l2);
        e1.AfegirLlibre(l3);
        e1.AfegirLlibre(l4);
        e1.AfegirLlibre(l5);
        e1.AfegirLlibre(l6);
        e1.AfegirLlibre(l7);
        e1.AfegirLlibre(l8);
        e1.AfegirLlibre(l9);
        e1.AfegirLlibre(l10);
        e1.EliminarLlibre("James Charles");
        e1.AfegirLlibre(l11);
        e1.Top10();
        e1.VeuresEstanteria();
    }
}
