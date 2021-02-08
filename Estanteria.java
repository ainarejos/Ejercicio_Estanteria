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

    public void EliminarLlibre(String llibre){
        for (int i = 0; i < estanteria.size() ; i++) {
            Llibre libro= estanteria.get(i);
            if ((libro.getAutor().equals(estanteria.get(i).getAutor())||(libro.getTitol().equals(estanteria.get(i).getTitol())))){
                estanteria.remove(i);
                Llibre llibre0=new Llibre("", "", 0);
                estanteria.add(llibre0);

                System.out.println("Ganamos");
            }
        }

    }

    private boolean ComprovarAutor(String llibre){
        boolean Ca=false;
        for (int i = 0; i <estanteria.size() ; i++) {
            if (estanteria.get(i).getTitol().equals(llibre)){
                Ca=true;
            }
        }
        return Ca;
    }

    private boolean ComprovarTitulo(String llibre){
        boolean Ca=false;
        for (int i = 0; i <estanteria.size() ; i++) {
            if (estanteria.get(i).getAutor().equals(llibre)){
                Ca=true;
            }
        }
        return Ca;
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
