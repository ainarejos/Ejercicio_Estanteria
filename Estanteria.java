import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Estanteria {
    ArrayList<Llibre> estanteria = new ArrayList<>();

    public Estanteria(){}

    public void AfegirLlibre(Llibre llibre){
        if (ComprovaLlibre(llibre)){
            estanteria.add(llibre);
        }
    }

    private boolean ComprovaLlibre(Llibre llibre){
        boolean Cl=true;
        if (estanteria.contains(llibre)){
            Cl=false;
        }
        return Cl;
    }

    public void EliminarLlibre(Llibre llibre){
        Scanner sc = new Scanner(System.in);
        String algo=sc.nextLine();
        if (!ComprovaLlibre(llibre)&&(llibre.getTitol().equals(algo)||llibre.getAutor().equals(algo))){
            estanteria.remove(llibre);
            System.out.println("Ganamos");
        }
    }

    public void Top10(){
        Collections.sort(estanteria, Comparator.comparing(Llibre::getQualificacio));
        Collections.reverse(estanteria);
        for (int i = 0; i <estanteria.size() ; i++) {
            System.out.println(i+1 + ". "+ estanteria.get(i).getTitol());
        }
    }

    public void VeuresEstanteria(){
        for (Llibre a: estanteria) {
            System.out.print(a.getTitol() + ", ");
        }
    }
}
