<h1 align="center"> Trilha Back End Java 2021 </h1>

## Índice

1. [Descrição](#Descrição)
2. [Lista de Atividades](#Lista-de-Atividades)
3. [Questionários](#Questionários)
    1. [Desafio 1](#Desafio-1)
    2. [Desafio 2](#Desafio-2)
    3. [Desafio 3](#Desafio-3)
    4. [Desafio 4](#Desafio-4)
    5. [Desafio 5](#Desafio-5)
    6. [Desafio 6](#Desafio-6)
    7. [Desafio 8](#Desafio-8)
---

## 1. Descrição 
<a name="Descrição"></a>

Diretório criado para a Trilha Back End Java 2021.

---

## 2. Lista de Atividades
<a name="Lista-de-Atividades"></a>

- [X] Desafio 1 - Git
- [X] Desafio 2 - POO
- [X] Desafio 3 - Controller
- [X] Desafio 4 - Repository
- [X] Desafio 5 - Service
- [X] Desafio 6 - DTO
- [X] Desafio 7 - Dados
- [X] Desafio 8 - Exception
- [ ] Desafio 9 - Patterns
- [ ] Desafio 10 - Spring
- [ ] Desafio 11 - Libs
- [ ] Desafio 12 - Testes
- [ ] Desafio 13 - Integration
- [ ] Desafio 14 - Desafio Final

---

##  3. Questionários
<a name="Questionários"></a>

## 3.1. Desafio 1
<a name="Desafio-1"></a>

**Com suas palavras defina o que é um sistema de controle de versão (VCS)?**
    
    Sistemas de controle de versão é uma ferramenta de gerenciamento de versões de arquivos.
    Com o VCS é possível ter um maior controle das alterações dos arquivos. 
    É possível identificar algum tipo de alteração como adição, exclusão ou modificação de código. 

**Cite 5 vantagens em utilizar um VCS:**

    1. Histórico das alterações.
    2. Identificar as alterações feitas, tanto nos arquivos como quem modificou.
    3. Facilidade de trabalhar em equipe simultaneamente.
    4. Reverter e desfazer mudanças no código fonte.
    5. Disponibilidade para todos os desenvolvedores envolvidos.


**Cite 3 exemplos de VCS:**

    1. Subversion
    2. Mercurial
    3. GIT

---

## 3.2. Desafio 2
<a name="Desafio-2"></a>


**Com suas palavras defina o que é programação orientada a objetos (POO) e cite seus pilares?**

    POO foi criada em 1970 com uma alternativa para a programação
    estrutura, A POO é um paradigma baseado em objetos, onde esses objetos podem
    interagir um com o outro.


**Pilares da POO:**

    1. Abstração
    2. Encapsulamento
    3. Herança
    4. Polimorfismo

**Exemplifique e explique um cenário de Abstração;**

    É a abstração da representação do mundo real para a cenário do sistema. Onde são
    criadas as classes do sistema. As entidades são as características e ações. 
    Exemplos: Entidade Carro, suas características são: cor,
    tamanho, entre outras. Já as ações são: ligar, desligar, acelerar, para entre
    outras.

**Exemplifique e explique um cenário de Encapsulamento;**

    Encapsulamento tem por função esconder ou encapsular uma ideia, escondendo os detalhes
    internos. No encapsulamento é utilizado os métodos getters e setters para acessar
    as classes privadas. 
    Exemplo: Um sistema de vendas, caso de problema nos
    cadastros de funcionários, a manutenção será feita apenas nela, como são
    independentes não é necessário modificar as demais classes. 

**Exemplifique e explique um cenário de Herança;**

    Herança é a característica que o filho herda da mãe. Para usar a Herança é necessário usar
    a palavra reserva Extends.
    Exemplo: Classe Gerente herda todas as características da Classe Funcionário. 

**Exemplifique e explique um cenário de Polimorfismo;**

    Polimorfismo altera o funcionamento interno de um método herdado da classe Mãe. Herança e
    polimorfismo estão ligados.
    Exemplo: Televisão herda as características de Eletrodoméstico,
    mas ela tem um método Trocar Canal que apenas a televisão tem. 

**Cite 5 vantagens da POO:**

    1. Reutilização de código;
    2. Manutenção de código;
    3. Maior eficiência no desenvolvimento
    4. Maior facilidade em grandes projetos
    5. Facilidade de leitura e entendimento

---

## 3.3. Desafio 3
<a name="Desafio-3"></a>

**O que é o protocolo de comunicação HTTP e como ele funciona?**

    HTTP é um protocolo de comunicação que comunica a URL do site para ver os conteúdos existentes.
    O HTTP funciona como um protocolo de requisição-resposta no modelo cliente-servidor. Sua principal aplicação é a transferência de servidor web e navegador.

**O que é REST, e qual é a sua relação com o protocolo HTTP?**

    REST é uma arquitetura que define um conjunto de restrições que são utilizadas para criação de serviços web.
    O REST utiliza o HTTP para a transferência dos dados.

**O que é WEB API, e qual a sua relação com REST?**

    É uma interface de programação de aplicações. É um conjunto de regras que permite que
    diferentes programas se comuniquem. Rest determina a estrutura da API.


**Liste todos os métodos de solicitações HTTP utilizados pelo padrão REST e suas respectivas finalidades**

    1.GET - Retorna uma informação
    2.POST - Criação
    3.PUT - Salvar
    4.Delete - Excluir
    5.TRACE - Retorna a requisição se houve alteração
    6.PATCH - Atualiza uma parte
    7.CONNECT - Converte requisição de conexão
    8.HEAD - Retorna o cabeçalho de uma resposta.

**O que é SWAGGER?**

    É uma ferramenta de documentação da API. Uma forma mais fácil de visualizar a documentação, alem de fornecer
    a documentação baseado no código.

---

## 3.4. Desafio 4
<a name="Desafio-4"></a>

O que é JDBC?

    É um conjunto de classes e interfaces que se conecta atraves de um driver em um especifico banco de dados. 
    Também é possivel executar comandos SQL.

O que é  ORM, cite 3 exemplos?

    É a maneira de conciliar o desenvolvimento orientado a objetos ao banco de dados relacional, transformando em 
    objeto-relacional.
    Exemplos de ORM
        1.Hibernate
        2.EclipseLink
        3.ActiveJPA

O que é JPA e qual é a sua relação com ORM's?

    JPA é uma coleção de classes e métodos que armazenam os objetos dentro dos banco de dados. O principal objetivo
    é a economia de tempo, por não precisar desenvolver código para conexão com o banco de dados.
    O ORM é o conceito e o JPA define um padrão de como irá funcionar dentro do código.

O que é Spring Data?

    É um framework responsável pela implementação dos repositórios. Facilita muito as operações CRUD.

O que caracteriza um projeto "CRUD básico" ?

    CRUD significa Create, Read, Update e Delete. São as quatro funções básicas que os sistemas usam para manipular
    o banco de dados.
    
---

## 3.5. Desafio 5
<a name="Desafio-5"></a>

Defina com suas palavras qual é a responsabilidade das camadas vistas até agora,
entity, controller, repository e service.

    Entity - É a camada dos objetos ou entidades, essa camada não tem métodos que alteram o objeto,
     apenas os getter, setters, toString, entre outros.

    Controller - É a camada responsável por receber as requisições e enviar a resposta ao usuário.

    Service - responsável pela regra de negócio, a lógica da aplicação.

    Repository - Implementa a camada de acesso aos dados. São as ações de consultar, adicionar, excluir do banco de dados.

---

## 3.6. Desafio 6
<a name="Desafio-6"></a>

O que significa DTO, e qual sua importância?

    DTO significa Data object Transfer, é utilizado para transportar dados. A sua importância é agrupar os dados
    e passar para a view apenas os dados necessários, por exemplo passar nome e email, "escondendo" a senha para que
    os usuários não tenham acesso.

---

## 3.8. Desafio 8
<a name="Desafio-8"></a>

O que são exceptions?

    Exceções são situações anormais que podem ocorrer durante a execução de um sistema. Essas exceções
    podem ser tratadas.

Qual é o funcionamento do try, catch e finally?

    O bloco Try-Catch-Finally é um recurso para tratar exceções.
    O bloco Try contém o código que está sujeito a ocorrer algum tipo de erro. Já o bloco Catch, contém o
    tratamento da exceção que eventualmente ocorra no bloco try. O bloco Finally representa o trecho de código
    que será executado independente de ter ocorrido a exceção ou não.

Qual a relação entre “try, catch e finally” e “throws”?

    Try, catch e finally são um bloco de tratamento de exceção. Já o Throws declara que um método pode lançar
    uma ou mais exceções.

Para que serve a annotation @ExceptionHandler?

    A anotação é usada para lidar com exceções em controllers. É possível criar uma resposta
    ao erro totalmente personalizada.

Para que serve o comando throw?

    Throw manda a exceção ser lançada, mas não exige que seja tratada.

Para que serve a annotation @ControllerAdvice?

    Não é específico para o tratamento de exceções, também é usado para tratar propriedades,
    validações ou vinculações de formatadores em nível global.

Escreva sua própria conclusão sobre exceptions

    Exceptions é uma forma de tratar a exceção de uma forma que seja de fácil entendimento para o usuário. 

---