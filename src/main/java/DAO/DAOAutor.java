package DAO;

import java.util.List;
import Modelo.Autor;
import Dados.*;

public class DAOAutor implements DAOInterface<Autor>{
    private static int id = 1;
    
    @Override
    public void incluir(Autor autor) {
        autor.setId(id++);
        Dados.listaAutores.add(autor);
    }

    @Override
    public Autor localizar(int id) {
        for(Autor autor : Dados.listaAutores){
            if(autor.getId() == id){
                return autor;
            }
        }
        return null;
    }

    @Override
    public void atualizar(Autor a) {
        int index = 0;
        for (Autor autor : Dados.listaAutores) {
            boolean isEqual = autor.getId().compareTo(a.getId()) == 0;
            if (isEqual) {
                index = Dados.listaAutores.indexOf(autor);
                break;
            }
        }
        Dados.listaAutores.set(index, a);
    }

    @Override
    public void remover(Autor autor) {
        Dados.listaAutores.remove(autor);
    }

    @Override
    public List<Autor> getList() {
        return Dados.listaAutores;
    }
    
}

