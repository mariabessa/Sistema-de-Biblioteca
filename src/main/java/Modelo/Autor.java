package Modelo;

public class Autor extends Pessoa{
    private String biografia;

    public Autor(String nome, String sobreNome, String bio) {
        super(nome, sobreNome);
        this.biografia = bio;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    
}
