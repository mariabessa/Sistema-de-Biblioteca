package Modelo;

public class Funcionario extends Pessoa{
    private Integer matricula;
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario(String nome, String sobreNome, int matricula, String sen) {
        super(nome, sobreNome);
        this.matricula = matricula;
        this.senha = sen;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    
}
