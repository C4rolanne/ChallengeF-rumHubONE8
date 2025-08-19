# FórumHub 🚀

## Sobre o Projeto

Esse projeto é uma API de um fórum bem simples, igual aqueles que usamos pra tirar dúvidas nos cursos. Aqui dá pra criar, ver, atualizar e deletar tópicos. Eu usei Java e Spring Boot porque o curso pediu e achei legal aprender coisas novas!

## O que dá pra fazer?

- Criar um novo tópico ✏️
- Listar todos os tópicos 📋
- Ver um tópico só 📄
- Atualizar um tópico 🔄
- Deletar um tópico ❌

## Como eu fiz

- Usei **Java 17** e **Spring Boot** (de início pareceu difícil, mas fui pegando o jeito)
- O banco de dados é o **H2** (é mais fácil pra testar)
- Tem validação dos dados, então não dá pra criar tópico todo errado
- Tem autenticação básica (usuário e senha), porque segurança é importante!

## Como rodar (do meu jeitinho)

1. Baixa o projeto ou faz um clone
2. Abre no IntelliJ ou Eclipse (usei o IntelliJ)
3. Roda a aplicação (tem um botão verdinho de play)
4. A API vai ficar disponível em `http://localhost:8080`
5. Dá pra testar os endpoints com o **Postman** ou **Insomnia** 

## Exemplos dos endpoints

- `POST /api/topicos` para criar tópico
- `GET /api/topicos` para listar tudo
- `GET /api/topicos/{id}` pra ver um específico
- `PUT /api/topicos/{id}` pra atualizar
- `DELETE /api/topicos/{id}` pra deletar

## Dificuldades 😅

No começo apanhei pra entender o Spring, mas depois de ver várias aulas e pedir ajuda no fórum e consegui fazer funcionar. Mexer com autenticação também foi um desafio…

## O que quero melhorar

- Aprender a testar de verdade (testes automatizados)
- Deixar mais seguro e legal de usar
- detalhes de funcionalidade


---
 🚀

