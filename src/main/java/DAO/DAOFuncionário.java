package DAO;

import java.util.List;
import Modelo.Funcionario;
import Dados.*;
import BO.Contexto;

public class DAOFuncionário implements DAOInterface<Funcionario>{
    private static int id = 1;
    
    @Override
    public Funcionario localizar(int id) {
        for(Funcionario f : Dados.listaFuncionarios){
            if(f.getId() == id){
                return f;
            }
        }
        return null;
    }
    

    @Override
    public void atualizar(Funcionario f) {
        int index = 0;
        for (Funcionario func : Dados.listaFuncionarios) {
            boolean isEqual = func.getId().compareTo(f.getId()) == 0;
            if (isEqual) {
                index = Dados.listaFuncionarios.indexOf(func);
                break;
            }
        }
        Dados.listaFuncionarios.set(index, f);
    }

    @Override
    public void remover(Funcionario f) {
        Dados.listaFuncionarios.remove(f);
    }

    @Override
    public List<Funcionario> getList() {
        return Dados.listaFuncionarios;
    }
    

    @Override
    public void incluir(Funcionario f) {
        f.setId(id++);
        Dados.listaFuncionarios.add(f);
    }
    
    public static boolean verificarLogin(int mat, String senha) {
        for (Funcionario funcionario : Dados.listaFuncionarios) {
            if (funcionario.getMatricula() == mat && funcionario.getSenha().equals(senha)) {
                Contexto.setId(funcionario.getId());
                return true; // Retorna o funcionário encontrado
            }
        }
        return false; // Caso não encontre nenhum funcionário com o login fornecido
    }
}
