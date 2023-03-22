package org.example.io.github.lrmello.repositories;

import org.example.io.github.lrmello.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class Clientes {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public Cliente salvarCliente(Cliente cliente){
        entityManager.persist(cliente);
        return cliente;
    }

    @Transactional
    public Cliente autalizarCliente(Cliente cliente) {
        entityManager.merge(cliente);
        return cliente;
    }

    @Transactional
    public Cliente removerCliente(Cliente cliente) {
        if (!entityManager.contains(cliente)){
            entityManager.merge(cliente);
        }
        entityManager.remove(cliente);
        return cliente;
    }

    public void removerCliente(Integer id){
        Cliente cliente = entityManager.find(Cliente.class, id);
        removerCliente(cliente);
    }

    @Transactional
    public List<Cliente> findClienteByName(String name){
        String jpql = "select * Cliente where cli like :name";
        TypedQuery<Cliente> query = entityManager.createQuery(jpql,Cliente.class);
        query.setParameter("nome","%"+ name + "%");
        return query.getResultList();
    }


    @Transactional
    public List<Cliente> encontrarTodos(){
       return entityManager.createQuery("from Cliente",Cliente.class).getResultList();
    }

}


