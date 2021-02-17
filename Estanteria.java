import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Estanteria {
    //Atributos.
    ArrayList<Llibre> estanteria = new ArrayList<>();

    //Metodos.
    public Estanteria(){}

    public void AfegirLlibre(Llibre llibre) throws Exception {
        try {
            if (ComprovaLlibre(llibre)&&estanteria.size()<10){
                estanteria.add(llibre);
            } else{
                throw new Exception("Liberia llena");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private boolean ComprovaLlibre(Llibre llibre){
        boolean Cl=true;
        if (estanteria.contains(llibre)){
            Cl=false;
        }
        return Cl;
    }

    public void EliminarLlibre(String llibre) throws Exception {
        try {
            boolean comprobador=true;
            for (int i = 0; i < estanteria.size() ; i++) {
                if ((llibre.equals(estanteria.get(i).getAutor())||(llibre.equals(estanteria.get(i).getTitol())))){
                    estanteria.remove(i);
                    comprobador=false;
                }
            }
            if (comprobador){
                throw new Exception("No se ha encontrado el libro");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
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
