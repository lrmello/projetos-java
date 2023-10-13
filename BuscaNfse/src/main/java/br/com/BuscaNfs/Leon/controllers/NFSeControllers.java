package br.com.BuscaNfs.Leon.controllers;

import br.com.BuscaNfs.Leon.BuscaNfseApplication;
import br.com.BuscaNfs.Leon.infra.repository.NFSeRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class NFSeControllers {

    private NFSeRepository nfSeRepository;

    @GetMapping
    public List<BuscaNfseApplication> getAll(){
    };
}
