package DAO;

import java.util.List;
import Modelo.Emprestimo;
import Dados.*;

public class DAOEmprestimo implements DAOInterface<Emprestimo>{
    private static int id = 1;
    @Override
    public void incluir(Emprestimo emp) {
        emp.setId(id++);
        Dados.listaEmprestimos.add(emp);
        
    }

    @Override
    public Emprestimo localizar(int id) {
        for(Emprestimo emp : Dados.listaEmprestimos){
            if(emp.getIdLivro() == id){
                return emp;
            }
        }
        return null;
    }

    @Override
    public void atualizar(Emprestimo emp) {
        int index = 0;
        for (Emprestimo emprestimo : Dados.listaEmprestimos) {
            if (emprestimo.getId() == emp.getId()) {
                index = Dados.listaEmprestimos.indexOf(emprestimo);
                break;
            }
        }
        Dados.listaEmprestimos.set(index, emp);
    }

    @Override
    public void remover(Emprestimo emp) {
        Dados.listaEmprestimos.remove(emp);
    }

    @Override
    public List<Emprestimo> getList() {
        return Dados.listaEmprestimos;
    }
    
}
