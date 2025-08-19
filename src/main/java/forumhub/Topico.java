package com.forumhub.dto;

public class TopicoDto {
    private String titulo;
    private String mensagem;

    public TopicoDto() {}

    public TopicoDto(String titulo, String mensagem) {
        this.titulo = titulo;
        this.mensagem = mensagem;
    }

    // Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
}
