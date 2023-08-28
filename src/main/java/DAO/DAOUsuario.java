package DAO;

import java.util.List;
import Modelo.Usuario;
import Dados.*;
import BO.Contexto;

public class DAOUsuario implements DAOInterface<Usuario>{
    private static int id = 1;
    
    @Override
    public void incluir(Usuario usu) {
        usu.setId(id++);
        Dados.listaUsuarios.add(usu);
    }

    @Override
    public Usuario localizar(int id) {
        for(Usuario usu : Dados.listaUsuarios){
            if(usu.getId() == id){
                return usu;
            }
        }
        return null;
    }

    @Override
    public void atualizar(Usuario usu) {
        int index = 0;
        for (Usuario usuario : Dados.listaUsuarios) {
            boolean isEqual = usuario.getId().compareTo(usu.getId()) == 0;
            if (isEqual) {
                index = Dados.listaUsuarios.indexOf(usuario);
                break;
            }
        }
        Dados.listaUsuarios.set(index, usu);
    }

    @Override
    public void remover(Usuario usu) {
        Dados.listaUsuarios.remove(usu);
    }

    @Override
    public List<Usuario> getList() {
        return Dados.listaUsuarios;
    }
    
    public static boolean verificarLogin(int reg, String senha) {
        for (Usuario usuario : Dados.listaUsuarios) {
            if (usuario.getRegistroAcademico() == reg && usuario.getSenha().equals(senha)) {
                Contexto.setId(usuario.getId());
                return true; // Retorna o funcionário encontrado
            }
        }
        return false; // Caso não encontre nenhum funcionário com o login fornecido
    }
}
