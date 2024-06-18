# Projeto  - Sistema Gerenciador de Veículos


## Orientações

- Cada integrante da dupla deve fazer o seu projeto.
- As duplas podem compartilhar códigos entre si.
- As duplas devem ser reunir para discutir a solução.
- No final do módulo a dupla entregará 1 único projeto.

### Pontução

- Menu Completo (5 pontos)
- Estrutura de Pacotes (1 Ponto)
- Repository Pattern (1 Ponto)
- Invocar API de CEP (1 Ponto)
- Disponibilizar no Github (1 Ponto) 
- Gerar Relatório de Vendas (1 Ponto)

### Entrega

- O projeto final deve ser entregue versionado no Github com o **README.md** atualizado.


## Criação do Projeto

Crie um projeto utilizando o Maven com as seguintes configurações:

* GropID: **br.com.fuctura**
* ArtifactID: **sistemaGerenciadorDeVeiculosProjeto**


### Configure a versão do Java para 17

![image](https://github.com/javajdk2023/j05032024/assets/130251409/28973124-5ae1-499e-bcc6-7421c73101a8)

Adicione a *tag* **properties** no seu arquivo **pom.xml**

```
  <properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
  </properties>
```

### Atualizar o Projeto

Clique no nome do projeto 

![image](https://github.com/javajdk2023/j05032024/assets/130251409/e368f93b-816d-4eae-89ce-ee6b40b6f0dc)


Pressione **ALT + F5**. Uma nova tela aparecerá. Clique em  **OK**

Esta opção força o Eclipse a fazer a leitura do arquivo **pom.xml** e atualizar o seu projeto.

![image](https://github.com/javajdk2023/j05032024/assets/130251409/c41eaf54-fd9b-47f8-a5af-dab960a03675)

Confirmar se a versão do Java foi atualizada para 17

![image](https://github.com/javajdk2023/j05032024/assets/130251409/e23443a1-ee60-4011-a489-2d5cf1931e64)


### Dependências

Adicione as seguintes dependências no seu arquivo **pom.xml**:

* https://mvnrepository.com/artifact/org.postgresql/postgresql/42.7.3
* [https://mvnrepository.com/artifact/faker/faker/0.3.2](https://mvnrepository.com/artifact/com.github.javafaker/javafaker/1.0.2)
* https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1

# Modelagem ER

Crie no seu projeto Java as seguintes entidades com os seus respectivos atributos:

![image](https://github.com/javajdk2023/j05032024/assets/130251409/d1c05959-7575-4bc7-b428-e8c23c0ddecc)

As entidades devem estar no pacote: **br.com.fuctura.entidade**

## Testar o Modelo ER

Para cada entidade crie 1 tabela no Excel com 3 dados de exemplo. Valide se as relações estão funcionando conforme modelado.

Alternativa ao Excel: https://ethercalc.net/zncoemb4wr80

# Inferface com Usuário

Você deve criar um menu que permita o usuário efetuar as seguintes operações:

* Opção 1 - Frente de Loja.
* Opção 2 - Manuteção no Cadastro.
* Opção 3 - Sair.

## Frente de Loja

O objetivo da frente de Loja é focar nas consultas e pequenas manutações no cadastro.

Opções diponíveis na frente de loja:

* Opção 1 - Gerenciar Veículo
  - Opção 1 - Consultar Veículo por Placa
  - Opção 2 - Voltar para o menu superior.
* Opção 2 - Gerenciar Loja
  - Opção 1 - Listar todas as Lojas
  - Opção 2 - Voltar para o menu superior.
* Opção 3 - Gerenciar Vendedor
  - Opção 1 - Consultar Vendedor por Nome
  - Opção 2 - Voltar para o menu superior.
* Opção  4 - Gerenciar Cliente
  - Opção 1 - Cadastrar Cliente
  - Opção 2 - Consultar Cliente por CPF
  - Opção 3 - Voltar para o menu superior.
* Opção 5 - Gerenciar Venda
  - Opção 1 - Cadastrar Venda.
  - Opção 2 - Voltar para o menu superior.
* Opção 6 - Voltar para o menu superior.

## Manutenção no Cadastro

O objetivo da manutenção é alterar os dados salvos no banco de dados da aplicação

* Opção 1 - Gerenciar Veículo
  - Opção 1 - Cadastrar veículo
  - Opção 2 - Excluir veículo
  - Opção 3 - Alterar dados do veículo
  - Opção 4 - Voltar para o menu superior.
* Opção 2 - Gerenciar Loja
  - Opção 1 - Cadastrar Loja
  - Opção 2 - Excluir Loja
  - Opção 3 - Alterar dados da Loja
  - Opção 4 - Voltar para o menu superior.
* Opção 3 - Gerenciar Vendedor
  - Opção 1 - Cadastrar Vendedor
  - Opção 2 - Excluir Vendedor
  - Opção 3 - Alterar dados do Vendedor
  - Opção 4 - Voltar para o menu superior.
* Opção  4 - Gerenciar Cliente
  - Opção 1 - Cadastrar Cliente
  - Opção 2 - Excluir Cliente
  - Opção 3 - Alterar dados do Cliente
  - Opção 4 - Voltar para o menu superior.
* Opção 5 - Cadastrar Venda
  - Opção 1 - Excluir Venda
  - Opção 2 - Voltar para o menu superior.
* Opção 6 - Voltar para o menu superior.

## Abrir Editor SQL

para digitarmos os comandos abaixo, vamos precisar do DBEaver instalar e configurado. Siga o passo a passo: https://github.com/javajdk2023/j05032024/blob/testar-conexao/README.md

## DDL - Criando Entidades com SQL

### Exemplo

Vamos criar uma tabela utilizando o comando **create table** que automaticamente gera um código sequencial (1, 2, 3, 4,...) de usuário para nós. 

Além disso, vamos garantir que não é possível repetir o código.

```
create table usuario (
codigo serial,
cpf varchar(13),
idade int,
PRIMARY KEY(codigo)
);
```

Abaixo segue um de-para com os tipos de dados em Java com os tipos de dados aceitos pelo Postgres.

| Java  | Postgres |
| ------------- | ------------- |
| int  | int  |
| String  | varchar(N)  |
| double  | float  |

## DML - Inserindo Dados com SQL

### Exemplo

Podemos inserir dados utilizando o comando **insert**. No exemplo abaixo estamos cadastrando um usuário.

```
insert into usuario (cpf, idade) values ('123', 10);
```

## DML - Consultando Dados com SQL

### Exemplo

Podemos utilizar o comando **select** para consultar os dados de uma tabela. Por exemplo:

```
select * from usuario u;
```
