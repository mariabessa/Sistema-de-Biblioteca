package DAO;

import java.util.List;
import Modelo.Livro;
import Dados.*;

public class DAOLivro implements DAOInterface<Livro>{
    private static int id = 1;
    @Override
    public void incluir(Livro l) {
        l.setId(id++);
        Dados.listaLivros.add(l);
    }

    @Override
    public Livro localizar(int id) {
        for(Livro l : Dados.listaLivros){
            if(l.getId() == id){
                return l;
            }
        }
        return null;
    }

    @Override
    public void atualizar(Livro l) {
        int index = 0;
        for (Livro liv : Dados.listaLivros) {
            boolean isEqual = liv.getId().compareTo(l.getId()) == 0;
            if (isEqual) {
                index = Dados.listaLivros.indexOf(liv);
                break;
            }
        }
        Dados.listaLivros.set(index, l);
    }

    @Override
    public void remover(Livro l) {
        Dados.listaLivros.remove(l);
    }

    @Override
    public List<Livro> getList() {
        return Dados.listaLivros;
    }
    
    public static void emprestimo(int id){
        for(Livro l : Dados.listaLivros){
            if(l.getId() == id){
                l.setDisponibilidade(false);
            }
        }
}
    public static void receberLivro(int id){
        for(Livro l : Dados.listaLivros){
            if(l.getId() == id){
                l.setDisponibilidade(true);
            }
        }
    }
    public boolean estaDisponivel(int id) {
        for(Livro l : Dados.listaLivros){
            if(l.getId() == id){
                return l.isDisponibilidade();
            }
        }
        return false;
    }
}

