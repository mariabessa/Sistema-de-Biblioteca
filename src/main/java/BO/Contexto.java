package BO;

public class Contexto {
    private static int matriculaFuncionarioLogado;
    private static Integer id;

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Contexto.id = id;
    }

    public static int getMatriculaFuncionarioLogado() {
        return matriculaFuncionarioLogado;
    }

    public static void setMatriculaFuncionarioLogado(int matriculaFuncionarioLogado) {
        Contexto.matriculaFuncionarioLogado = matriculaFuncionarioLogado;
    }
    private static int registroAcademicoUsuarioLogado;


    public static int getRegistroAcademicoUsuarioLogado() {
        return registroAcademicoUsuarioLogado;
    }

    public static void setRegistroAcademicoUsuarioLogado(int registroAcademicoUsuarioLogado) {
        Contexto.registroAcademicoUsuarioLogado = registroAcademicoUsuarioLogado;
    }
    
}
