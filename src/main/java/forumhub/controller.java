package com.forumhub.controller;

import com.forumhub.dto.TopicoDto;
import com.forumhub.model.Topico;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private List<Topico> topicos = new ArrayList<>();

    @GetMapping
    public List<Topico> listar() {
        return topicos;
    }

    @PostMapping
    public Topico criar(@RequestBody TopicoDto dto) {
        Topico novo = new Topico(dto.getTitulo(), dto.getMensagem());
        novo.setId((long) (topicos.size() + 1));
        topicos.add(novo);
        return novo;
    }
}
