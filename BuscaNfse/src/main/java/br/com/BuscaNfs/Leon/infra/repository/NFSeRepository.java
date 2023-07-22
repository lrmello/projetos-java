package br.com.BuscaNfs.Leon.infra.repository;


import br.com.BuscaNfs.Leon.Domain.model.NFSe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NFSeRepository extends JpaRepository<NFSe,Long> {

}
