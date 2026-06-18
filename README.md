# 🎬 Streaming Catalog

Aplicação desenvolvida em Java para gerenciamento e recomendação de conteúdos de streaming. O projeto utiliza conceitos de Programação Orientada a Objetos (POO), consumo de APIs REST, manipulação de coleções e tratamento de exceções para simular funcionalidades encontradas em plataformas de streaming.

## 🚀 Funcionalidades

* Cadastro e gerenciamento de filmes, séries e episódios.
* Sistema de classificação de conteúdos.
* Recomendação baseada em avaliações.
* Cálculo de tempo total para maratonar conteúdos.
* Busca automática de informações através da API OMDb.
* Tratamento de exceções para falhas de comunicação e conversão de dados.
* Manipulação de listas e coleções Java.

## 🏛️ Arquitetura do Projeto

```text
src/
├── calculos/
│   ├── CalculadoraDeTempo.java
│   ├── Classificavel.java
│   └── FiltroRecomendacao.java
│
├── exceptions/
│   └── ErroDeConversaoException.java
│
├── modelos/
│   ├── Episodio.java
│   ├── Filme.java
│   ├── Serie.java
│   ├── Titulo.java
│   └── TituloOmdb.java
│
└── principal/
    ├── Principal.java
    ├── PrincipalComBusca.java
    └── PrincipalComListas.java
```

## 🛠️ Tecnologias Utilizadas

* Java 17+
* Programação Orientada a Objetos (POO)
* HttpClient
* Gson
* OMDb API
* Collections Framework
* IntelliJ IDEA
* Git e GitHub

## 🌐 Integração com API

O projeto realiza consultas à API OMDb para obter informações de filmes e séries em tempo real.

Exemplo de requisição:

```http
GET https://www.omdbapi.com/?t=Breaking+Bad&apikey=SUA_CHAVE
```

Fluxo da integração:

1. Usuário informa o título.
2. Aplicação realiza requisição HTTP.
3. Resposta JSON é recebida.
4. Gson converte o JSON para objetos Java.
5. Os dados são exibidos e manipulados pela aplicação.

## 💡 Conceitos Aplicados

### Programação Orientada a Objetos

* Encapsulamento
* Herança
* Polimorfismo
* Interfaces
* Reutilização de código

### Estruturas de Dados

* List
* ArrayList
* Ordenação de coleções
* Filtros e buscas

### Tratamento de Erros

Exceções personalizadas para cenários como:

* Erro de conversão de dados
* Respostas inválidas da API
* Dados inexistentes

## 📋 Exemplos de Funcionalidades

### Sistema de Recomendação

Os conteúdos implementam a interface `Classificavel`, permitindo que o sistema gere recomendações com base nas avaliações recebidas.

### Calculadora de Tempo

Permite calcular automaticamente o tempo necessário para assistir uma lista de conteúdos.

### Busca por Títulos

Consulta filmes e séries na OMDb API e converte os dados para objetos Java utilizando Gson.

## ▶️ Como Executar

Clone o repositório:

```bash
git clone https://github.com/seu-usuario/streaming-catalog.git
```

Entre no diretório:

```bash
cd streaming-catalog
```

Configure sua chave da OMDb API.

Execute uma das classes principais:

```java
Principal.java
```

ou

```java
PrincipalComBusca.java
```

ou

```java
PrincipalComListas.java
```

## 📚 Aprendizados

Este projeto foi desenvolvido para consolidar conhecimentos em:

* Desenvolvimento Java
* Consumo de APIs REST
* Manipulação de JSON
* Estruturas de dados
* Tratamento de exceções
* Boas práticas de orientação a objetos
* Organização e arquitetura de projetos
