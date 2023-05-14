package com.senac.pi.portalmatricula.controller;

import com.senac.pi.portalmatricula.model.dto.AlunoDto;
import com.senac.pi.portalmatricula.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("alunos")
class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<AlunoDto>> procurarAlunoId( @PathVariable Integer id){
        Optional<AlunoDto> alunoDto = alunoService.procurarAlunoId(id);
        return new ResponseEntity<>(alunoDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<AlunoDto>> listarAlunos(){
        List<AlunoDto> alunoDtos = alunoService.listarAlunos();
        return new ResponseEntity<>(alunoDtos, HttpStatus.OK);
    }



    @PostMapping("/cadastrar")
    public ResponseEntity<AlunoDto> adicionar(@RequestBody @Valid AlunoDto alunoDto){
        alunoService.adicionar(alunoDto);
        return new ResponseEntity<>(alunoDto, HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Integer id){
        alunoService.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @PutMapping("/{id}")
    public ResponseEntity<AlunoDto> atualizar(@PathVariable Integer id, @RequestBody AlunoDto alunoDto){
        AlunoDto aluno= alunoService.atualizar(id, alunoDto);
        return new ResponseEntity<>(alunoDto, HttpStatus.OK);
    }

}
