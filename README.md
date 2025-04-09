# ToDoList
Este é um projeto de exemplo de uma aplicação de lista de tarefas (ToDo List), desenvolvida em **Java 21**, utilizando **Maven** e baseada nos princípios da **Clean Architecture**. O foco está na separação de responsabilidades, testabilidade e escalabilidade da aplicação.

## Camadas e Estrutura do Projeto

```text
com.gk.todolist/
├── adapters/                     
│   │
├── application/
│   └── usecases/│       
│
├── controller/
│   └── ToDoListController
│
├── core/
│   ├── dto/
│   ├── exceptions/
│   ├── model/
│   └── usecases/
│
├── infra/
│   ├── gateways/
│   ├── model/
│   ├── repository/
│   └── util/
│
└── ToDoListApplication
```


 
## Funcionalidades

- Criar nova tarefa
- Listar tarefas
- Atualizar tarefa
- Excluir tarefa

## Tecnologias Utilizadas

- Java 21
- Maven
- Spring Boot

## Como Executar

1. Clone o repositório:

```bash
git https://github.com/GabouKing/ToDoList.git
cd todolist
```
2. Compile e execute com Maven:

```bash
./mvnw clean install
./mvnw spring-boot:run
```

A aplicação estará disponível em:
(http://localhost:8080)






