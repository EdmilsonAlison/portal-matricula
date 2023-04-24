package com.senac.pi.portalmatricula.service;


import com.senac.pi.portalmatricula.model.Aluno;
import com.senac.pi.portalmatricula.model.PagamentoBoleto;
import com.senac.pi.portalmatricula.model.dto.AlunoDto;
import com.senac.pi.portalmatricula.repository.AlunoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;


    public Optional<AlunoDto> procurarAlunoId(Integer id){
        Optional<Aluno> aluno = Optional.of(alunoRepository.getReferenceById(id));
        if(aluno.isEmpty()){
            throw new IllegalArgumentException();
        }
        AlunoDto alunoDto = new ModelMapper().map(aluno.get(), AlunoDto.class);
        return Optional.of(alunoDto);
    }

    public List<AlunoDto> listarAlunos(){
        List<Aluno> alunos = alunoRepository.findAll();
        return alunos.stream().map(aluno -> new ModelMapper().map(aluno, AlunoDto.class)).collect(Collectors.toList());
    }


    public AlunoDto adicionar(AlunoDto alunoDto){
        Aluno aluno = new ModelMapper().map(alunoDto, Aluno.class);
        aluno.setMatrícula("M"+alunoDto.getCpf());
        aluno.setCodPagamento(PagamentoBoleto.gerarCod());
        aluno = alunoRepository.save(aluno);
        return alunoDto;
    }

    public  void deletar(Integer id){
        Optional<Aluno> aluno = alunoRepository.findById(id);
        if(aluno.isEmpty()){
            throw new IllegalArgumentException();
        }
        alunoRepository.deleteById(id);
    }

    public AlunoDto atualizar(Integer id, AlunoDto alunoDto){
        if(alunoRepository.existsById(alunoDto.getId())){
            Aluno aluno = new ModelMapper().map(alunoDto, Aluno.class);
            aluno = alunoRepository.save(aluno);
            return alunoDto;
        }
        throw new IllegalArgumentException();
    }


}
