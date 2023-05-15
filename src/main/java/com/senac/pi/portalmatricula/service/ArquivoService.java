package com.senac.pi.portalmatricula.service;

import com.senac.pi.portalmatricula.model.Aluno;
import com.senac.pi.portalmatricula.model.Arquivo;
import com.senac.pi.portalmatricula.repository.ArquivoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ArquivoService {
    private ArquivoRepository arquivoRepository;

    public Arquivo salvarArquivo(MultipartFile file, Aluno aluno) throws IOException {
        String nomeArquivo = file.getOriginalFilename();
        String tipoArquivo = file.getContentType();
        byte[] conteudoArquivo = file.getBytes();

        Arquivo arquivo = new Arquivo();
        arquivo.setNome(nomeArquivo);
        arquivo.setTipo(tipoArquivo);
        arquivo.setConteudo(conteudoArquivo);
        arquivo.setAlunoId(aluno.getId());

        return arquivoRepository.save(arquivo);
    }
}

