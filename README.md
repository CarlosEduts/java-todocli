# Java TODO CLI

Projeto CLI para gerenciar tarefas simples em Java usando Maven.

<img src="./public/Java TODO CLI.png" style="border-radius:12px;" alt="Java TODO CLI"/>

## Visão geral

Aplicação em linha de comando que permite criar, listar e gerenciar tarefas. Organização em camadas simples: `view` (entrada/saída), `service` (lógica), `repository` (persistência em memória/arquivo), `model` (entidades) e `util` (helpers).

## Arquitetura e organização

\- Código fonte em `src/main/java/com/todocli`  
\- Principais pacotes:  
 \- `config` \- configuração (ex.: `ConnectionFactory`)  
 \- `model` \- classes de domínio (ex.: `Task`)  
 \- `repository` \- acesso/armazenamento (ex.: `TaskRepository`)  
 \- `service` \- regras de negócio (ex.: `TaskService`)  
 \- `view` \- componentes de interface CLI (ex.: `Home`, `TasksList`, `CreateTask`)  
 \- `util` \- utilitários (ex.: `CliUtils`)  
\- Ponto de entrada: `src/main/java/com/todocli/Main.java`

## Como executar localmente

Requisitos: Java 17\+, Maven, Docker e uma IDE (IntelliJ recomendada).

- iniciar um container com o `docker-compose up -d`
- Rodar direto pela IDE: abrir o projeto em IntelliJ e executar a classe `Main` (`src/main/java/com/todocli/Main.java`).

## Observações

- Projeto simples e pensado para uso local/educacional.
- Ajustar persistência em `TaskRepository` conforme necessário (arquivo, banco, etc.).
- Para desenvolvimento em Windows com WSL, abrir o projeto pelo IntelliJ apontando para o diretório do projeto (ex.: `\\wsl.localhost\Ubuntu-24.04\...`) ou abrir no WSL e rodar comandos Maven dentro do WSL.
