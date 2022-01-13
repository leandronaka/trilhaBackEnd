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
    8. [Desafio 9](#Desafio-9)
    9. [Desafio 10](#Desafio-10)
    10. [Desafio 11](#Desafio-11)
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
- [X] Desafio 9 - Patterns
- [X] Desafio 10 - Spring
- [X] Desafio 11 - Libs
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

## 3.9. Desafio 9
<a name="Desafio-9"></a>
O que é um padrão de projeto e por que nós os utilizamos?

    Padrão de projeto é como plantas de uma construção, são soluções típicas para problemas comuns em projetos,
    customizando para se adequar ao seu projeto. O padrão de projeto traz muitas vantagens, uma das principais
    vantagens é o reuso das soluções propostas para determinado problema. Outro grande motivo da utilização é
    a facilidade na hora da manutenção.

Cite e explique com suas palavras:

I. Um dos padrões de criação;

    Abstract Factory - Fornece uma interface para criação de familias  de objetos relacionais ou dependentes
    sem especificar suas classes concretas.

II. Um dos padrões estruturais;

    Adapter - Converte a interface de uma classe por outra esperada pelo usuário.

III. Um dos padrões comportamentais;

    Template Method - Permite que subclasses redefinam certos passos de um algoritmo sem mudar a estruura dele.

Explique o conceito de arquitetura de software e seu proposito

    É o processo de converter características de software como flexibilidade, escalabilidade, viabilidade, reutilização
    e segurança em uma solução estruturada que atende as necessidades técnicas e de negócios.

Qual arquitetura estamos seguindo até o momento? Justifique sua resposta.

    A arquitetura utilizada foi o MVC, onde separamos pelas camadas model, view e controller, cada uma com sua
    responsabilidade especifica.

O que significa a sigla SOLID?

    Solid é os 5 princípios da POO que facilitam no desenvolvimento de softwares, tornando-os faceis de manter.
    S - Single Responsability Principle - Principio da responsabilidade única.
    O - Open - Closed Principle - Principio aberto e fechado.
    L - Liskov Substitution Principle - Principio da substituição de Liskov.
    I - interface Segregation Principle - Principio da segregação de interface.
    D - Dependency Inversion Principle - Principio da inversão de dependencia.

Quais princípios foram utilizados no projeto até o momento? Explique.

    Usamos o Single Responsability Principle, onde definimos cada classe com sua responsabilidade. Outro principio
    utilizado no projeto foi o Dependency Inversion Principle, nas classes repository e controller.

---

## 3.10. Desafio 10
<a name="Desafio-10"></a>

O que você entende por Spring Framework?

    Spring é um ecossistema de desenvolvimento que facilita a criação de projetos Java utilizando módulos
    independentes. O foco do Spring é o desenvolvimento e não os processos de configuração.

Cite 3 exemplos de ferramentas Spring e suas respectivas finalidades;

    Spring Data - módulo que facilita o acesso aos dados.

    Spring Security - é responsável por gerenciar toda a parte de autenticação e as autorizações do projeto.

    Spring Boot - Projeto mais popular. É a versão opinativa do Spring Framework.

Quais ferramentas do Spring foram utilizadas na trilha até o momento?

    Spring Data, Spring Boot, Spring MVC.

Cite 5 vantagens em utilizar Spring;

    1. Facilidade de desenvolvimento
    2. Implementações com menos código.
    3. Facilidade de manutenção.
    4. Redução de tempo de desenvolvimento.
    5. Facilidade nas configurações iniciais do projeto.

Descreva os passos de criação de uma Web API Spring boot, com conexão com
SQL Server;

    Para criar uma Web API Spring boot com conexão SQL Server é preciso entrar no site Spring Initializer,
    adicionar as dependências Spring Web e MS SQL Server Driver.

Qual a funcionalidade do pom.xml?

    O pom.xml é um dos arquivos mais importantes do projeto, onde ele descreve uma série de configurações
    que o projeto terá e quais repositórios e dependências seu projeto irá precisar.

Qual a funcionalidades do applications.properties?

    applications.properties tem por finalidade conter as informações importantes do projeto. Esse arquivo
    deve ser bem estruturado para que todos possam manter ou administrar. Neste arquivo pode conter informações
    de conectividade de banco de dados, porta utilizada, e conexão com servidor.

Qual o propósito das Annotations?

    É um recurso que permite embutir informações complementares no código fonte. Elas devem ser declaradas antes
    do objeto, sempre deve preceder um @.

Cite 10 annotations, com suas respectivas finalidades e descreva ou desenhe um
cenário exemplificando a sua utilização;

    1. @Override - especifica que um método sobrescreve outro método da superclasse.
    2. @Test - especifica que é um método teste.
    3. @Deprecated - Indica que o elemento (Classe, método ou campo) está absoleto e foi substituido por um elemento
    mais novo.
    4. @SuppressWarnings - Diz ao compilador ignorar "warnings" específicos que poderiam ser gerados.
    5. @Configuration - Especifica que a classe atuará como configuração.
    6. @Controller - especifica que a classe atuará como uma controlador em projetos MVC.
    7. @Service - especifica que a classe atuará como serviço em projetos MVC.
    8. @Repository - especifica que a classe terá acesso ao banco de dados e incluirá as lógicas de acesso a dados.
    9. @RequestBody - está anotação pode converter dados HTTP de entrada em objetos passando para o método controlador
    10. @PathVariable - está anotação é utilizada para recuperar dados da URL.

O que é um advice em Spring? Quais os tipos de advice para o Spring?

    É a ação executada pelo aspecto em um join point particular. Está ação pode executar antes, depois ou mesmo
    envolver o join point para decidir se o mesmo deve realmente ser executado.

    1. Before - Advice que executa antes do join point, mas não tem poder de evitar que o join point execute.
    2. After returning - Advice que executa após o join point se terminar com sucesso.
    3. After Throwing - Advice que executa após o join point quando ele finaliza enviando uma exceção.
    4. After (finally) - Advice que executa após o join point independentemente do seu retorno.
    5. Aroung - Advice que envolve a execução de um join point. Este é o tipo mais poderoso, pois pode realizar ações
    antes e depois da execução do join point.

O que é Spring IoC Container?

    O Spring IoC Container é responsável por criar os objetos, conectar e configurar, além de gerenciar seu ciclo
    de vida, desde a criação até a destruição.

Como adicionamos segurança à nossa aplicação Spring?

    É possível adicionamos segurança através do Spring Security, através de suas bibliotecas fornece proteção,
    autenticação, autorização e armazenamento de senhas.

Qual é o pacote Spring responsável pelas conexões com os bancos de dados?

    O pacote responsável pela conexão é o Application.properties.

Explique e exemplifique como criar um agendamento de execução de métodos Spring; Cite exemplos de usabilidade

    O agendamento de execução de métodos pode ser utilizado através da anotação @Scheduled. Para habilitar o
    agendamento, a classe deverá estar utilizando as anotações @component e @enableScheduled.
    O agendamento de métodos pode ser utilizado quando por exemplo um cliente quer ver diariamente as vendas do dia.

---

## 3.11. Desafio 11
<a name="Desafio-11"></a>

O que são libs quando se trata de código?

    Lib é um conjunto de funcionalidades que podem ser reaproveitadas pelos outros projetos.

Cite 2 libs populares no Java e seu objetivo;

    1. Jackson - É uma lib rápida, leve e fácil de utilizar. É considerada uma das melhores bibliotecas de JSON.
    2. JUnit - é uma lib com objeto em testes, testes são feitos para validar uma unidade ou módulo específico.

Qual é o propósito do Maven, e qual é o seu relacionamento com o arquivo
pom.xml?

    O Maven tem por objetivo o gerenciamento e automação de construção de projetos. As funções são adicionadas
    através do uso de plugins, estimulando melhores práticas. O arquivo pom.xml contém todas as configurações que o
    Maven precisa para interagir com o projeto.

Qual é a diferença do Maven para o Grandle?

    Os scripts do Maven é escrito em XML, já do Gradle é escrito em Groovy. Os scripts do do Grale são mais limpos
    e curtos. O Maven é uma ferramenta de gerenciamento e compreensão de projetos, já o Gradle é um sistema de
    automação.

Com os conhecimentos adquiridos até o agora, realize uma conexão com o
desafio 3 onde falamos sobre JDBC, os drivers de comunicação com os bancos de
dados.
I. Qual a relação entre os termos lib, driver e JDBC?

    JDBC contém os drivers dos bancos de dados, os drivers podem ser adicionador nas libs criadas.

II. Como é adicionado uma lib no projeto?

    Entrar na estrutura do projeto e bibliotecas.

III. Escolha um banco de dados (menos o H2) e explique como utilizar o driver de
comunicação.

    Foi utilizado o BD postgres e para utilizar o banco de dados, todas as configurações foram feitas no arquivos
    application.properties.