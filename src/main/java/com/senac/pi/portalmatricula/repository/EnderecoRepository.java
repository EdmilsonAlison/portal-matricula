package com.senac.pi.portalmatricula.repository;

import com.senac.pi.portalmatricula.model.Aluno;
import com.senac.pi.portalmatricula.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
