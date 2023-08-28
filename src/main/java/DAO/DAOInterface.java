package DAO;
import Modelo.*;
import java.util.List;

// define os métodos padrões que devem ser implementados por todas as classes DAO
public interface DAOInterface<T>{
    public abstract void incluir(T objeto);
    public abstract T localizar(int id);
    public abstract void atualizar(T objeto);
    public abstract void remover(T objeto);
    public abstract List<T> getList();
}
