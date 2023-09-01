# Exercício de Sintaxe Java com Spring Boot

Este repositório contém um projeto Java que implementa um exercício intermediário envolvendo a criação de uma aplicação Spring Boot para gerenciamento de produtos. Este documento fornecerá instruções sobre como configurar e executar a aplicação, bem como detalhes sobre os desafios propostos.


## Desafio 1: Configurando a Estrutura Básica

Neste primeiro desafio, você deve criar uma aplicação com o Spring Data para a entidade "Produto", que deve conter os seguintes atributos:

- Nome: String;
- Quantidade: Int;
- Descrição: String.

A seguir, você deve criar a estrutura de camadas, que inclui Controller, Service e DAO (Data Access Object), e usar a injeção de dependência entre elas. Certifique-se de adicionar todas as anotações necessárias para gerar cada Bean com `@Service` e `@Controller`.

### Passos para completar o Desafio 1:

1. Crie uma classe `Produto` com os atributos mencionados.
2. Implemente a estrutura de camadas com as seguintes classes:
   - `ProdutoController`: Responsável por lidar com as requisições HTTP.
   - `ProdutoService`: Lógica de negócios e processamento.
   - `ProdutoDao`: Acesso aos dados do produto.
3. Utilize a injeção de dependência para conectar as camadas.
4. Anote as classes com as anotações adequadas, como `@RestController`, `@Service`, `@Autowired`, etc.
5. Crie um método na `ProdutoController` para criar um produto, passando por todas as camadas.

## Desafio 2: Adicionando Recursos de Gerenciamento de Produtos

No segundo desafio, você deve expandir a aplicação adicionando recursos para gerenciar os produtos em estoque. Isso inclui:

- Um endpoint para buscar todos os produtos em estoque.
- Um endpoint para buscar um produto por Id em estoque.
- Um endpoint para eliminar um produto.

### Passos para completar o Desafio 2:

1. Crie endpoints na `ProdutoController` para cada um dos seguintes casos:
   - Buscar todos os produtos em estoque.
   - Buscar um produto por ID em estoque.
   - Eliminar um produto por ID.
2. Implemente a lógica correspondente na `ProdutoService` e no `ProdutoDao` para atender às solicitações dos endpoints.
3. Utilize os métodos HTTP apropriados (GET e DELETE) para cada operação.
4. Teste os endpoints usando um cliente REST, como o Postman ou o cURL.

## Como Executar a Aplicação

## Pré-requisitos

Antes de começar, certifique-se de ter o Docker instalado em seu sistema. Caso você não tenha o MySQL instalado localmente, vamos crie um contêiner Docker MySQL na porta 3666 para uso neste projeto.

Para executar a aplicação, siga estas etapas:

1. Clone este repositório em seu ambiente local:

   ```bash
   git clone https://github.com/Brunosouzad/ProductAPI/

## Como Acessar a API através do Swagger

A API da aplicação está documentada e pode ser acessada por meio do Swagger UI, que fornece uma interface amigável para explorar e interagir com os endpoints.

1. **Execute a aplicação:** Certifique-se de que sua aplicação Spring Boot esteja em execução. Se você ainda não a iniciou, use as instruções fornecidas anteriormente.

2. **Abra um navegador da web:** Abra seu navegador da web preferido.

3. **Acesse o Swagger UI:** Digite a seguinte URL na barra de endereços do seu navegador:
   
4. **Explore e teste a API:** Após acessar o Swagger UI, você verá uma lista de endpoints da API. Você pode clicar em cada endpoint para ver detalhes sobre como usá-los e testá-los diretamente na interface do Swagger.

Agora, você pode usar o Swagger UI para explorar e interagir com a API da sua aplicação Spring Boot.
```bash
http://localhost:8080/swagger-ui.html
