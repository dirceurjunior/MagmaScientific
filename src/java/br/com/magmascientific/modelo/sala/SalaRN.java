/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.magmascientific.modelo.sala;

import br.com.magmascientific.util.DAOFactory;
import java.util.List;

/**
 *
 * @author Aguinaldo
 */
public class SalaRN {
    
    private final SalaDAO salaDAO;

    public SalaRN() {
        this.salaDAO = DAOFactory.criarSalaDAO();
    }
    
    public void excluir (Sala sala){
       this.salaDAO.excluir(sala);
    }
    
    public void atualizar (Sala sala){
       this.salaDAO.atualizar(sala);
    }
    
    public void salvar (Sala sala){
       this.salaDAO.salvar(sala);
    }
    
    public List<Sala> listarTodos(){
       return this.salaDAO.listarTodos();
    }
}
