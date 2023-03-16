package com.api.produto.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.api.produto.modelo.ProdutoModelo;

import java.util.List;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Integer> {
    /*Listar todos os produtos*/
    List<ProdutoModelo> findAll();

    /*Pesquisar por código*/
    ProdutoModelo findByCodigo(int codigo);

    /*Remover produto*/
    void delete(ProdutoModelo produto);

    /*Cadastrar/Alterar produto*/
    <ProdMod extends  ProdutoModelo>ProdMod save(ProdMod produto);

}