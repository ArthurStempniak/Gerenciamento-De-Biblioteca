package livros;

public class Livro {

    private String autor;
    private String tema;
    private String titulo;
    private Integer ano;


    public Livro() {
        this.autor = "";
        this.tema = "";
        this.titulo = "";
        this.ano = 0;
    }
    public Livro(String autor, String tema, String titulo, Integer ano) {
        this.autor = autor;
        this.tema = tema;
        this.titulo = titulo;
        this.ano = ano;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro [autor = " + autor + ", tema= " + tema + ", titulo= " + titulo + ", ano= " + ano + "]";
    }
}
