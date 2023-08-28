package Modelo;
import java.util.List;

public class Livro{
   private Integer id;
   private String titulo;
   private String editora;
   private Integer numeroDePaginas;

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
   private List<Categoria> categoria;
   private List<Autor> autor;
   private boolean disponibilidade;
   
    public Livro(String titulo, String editora, Integer numPaginas, List<Categoria> categoria, List<Autor> autor) {
        this.titulo = titulo;
        this.editora = editora;
        this.numeroDePaginas = numPaginas;
        this.categoria = categoria;
        this.autor = autor;
        this.disponibilidade = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }
    
    public String isDisponivel(){
        if(this.disponibilidade){
            return "Sim";
        }else{
            return "Não";
        }
    }
   
}
