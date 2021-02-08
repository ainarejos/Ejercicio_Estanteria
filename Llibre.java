public class Llibre {
    private String Titol;
    private String Autor;
    private int Qualificacio;

    public Llibre(String titol, String autor, int qualificacio){
        this.Titol=titol;
        this.Autor=autor;
        this.Qualificacio=qualificacio;
    }
    public int getQualificacio() {
        return Qualificacio;
    }

    public String getTitol() {
        return Titol;
    }

    public String getAutor() {
        return Autor;
    }
}
