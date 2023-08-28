package Modelo;

public class Usuario extends Pessoa{
    private Integer registroAcademico;
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String nome, String sobreNome, String sen, int reg) {
        super(nome, sobreNome);
        this.registroAcademico = reg;
        this.senha = sen;
    }

    public Integer getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(Integer registroAcademico) {
        this.registroAcademico = registroAcademico;
    }
    
}
