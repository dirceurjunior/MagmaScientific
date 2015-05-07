/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.magmascientific.modelo.exame;

import java.util.List;

/**
 *
 * @author Dirceu R Junior
 */
public interface ExameDAO {

    public void salvar(Exame exame);

    public void atualizar(Exame exame);

    public void excluir(Exame exame);

    public Exame porId(Integer id);

    public Exame porNome(String nome);

    public List<Exame> listarTodos();

    public List<Exame> listarPorNome(String nome);

}
