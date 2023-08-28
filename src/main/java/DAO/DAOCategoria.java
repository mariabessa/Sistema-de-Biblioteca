package DAO;

import java.util.List;
import Modelo.Categoria;
import Dados.*;

public class DAOCategoria implements DAOInterface<Categoria>{
    private static int id = 1;
    
    @Override
    public void incluir(Categoria c) {
        c.setId(id++);
        Dados.listaCategorias.add(c);
    }

    @Override
    public Categoria localizar(int id) {
        for(Categoria f : Dados.listaCategorias){
            if(f.getId() == id){
                return f;
            }
        }
        return null;
    }

    @Override
    public void atualizar(Categoria c) {
        int index = 0;
        for (Categoria cat : Dados.listaCategorias) {
            boolean isEqual = cat.getId().compareTo(c.getId()) == 0;
            if (isEqual) {
                index = Dados.listaCategorias.indexOf(cat);
                break;
            }
        }
        Dados.listaCategorias.set(index, c);
    }

    @Override
    public void remover(Categoria f) {
        Dados.listaCategorias.remove(f);
    }

    @Override
    public List<Categoria> getList() {
        return Dados.listaCategorias;
    }
    
}

