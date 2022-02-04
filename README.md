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
    11. [Desafio 12](#Desafio-12)
    12. [Desafio 13](#Desafio-13)
    13. [Desafio 14](#Desafio-14)
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
- [X] Desafio 12 - Testes
- [X] Desafio 13 - Integration
- [X] Desafio 14 - Desafio Final

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

---

## 3.12. Desafio 12
<a name="Desafio-12"></a>

Explique o conceito de teste unitário?

    Teste unitários é uma modalidade de teste que se concentra na verificação dos métodos do projeto. É realizado
    o teste dos métodos, com uso de dados suficientes para se testar apenas a lógica do método.

Descreva como fazer um código de teste.

    Escrever um código de teste consiste em utilizar alguns métodos, criando cenários para identificar se o
    método corresponde ao esperado.

Qual o intuito do teste unitário?

    Identificar bugs, garantir a qualidade final do código.

Quais são as ferramentas que utilizamos para realizar testes unitários(2 pelo
menos)

    JUnit e Mockito.


Desenvolva o teste unitário para o método acima, digitando abaixo todos stack
traces de erros e explique em uma só frase qual o erro

      trilha.back.financys.exception.ParameterNotFound: Não existe os dados pelo parâmetro passado
      at trilha.back.financys.services.EntryService.getLancamentosDependentes(EntryService.java:144)
      at testes.TrilhaBackTestes.lambda$testeParametrosDiferentes$1(TrilhaBackTestes.java:76)
      at org.junit.Assert.assertThrows(Assert.java:1001)
      at org.junit.Assert.assertThrows(Assert.java:981)
      at testes.TrilhaBackTestes.testeParametrosDiferentes(TrilhaBackTestes.java:75)
      at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
      at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
      at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
      at java.base/java.lang.reflect.Method.invoke(Method.java:566)
      at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
      at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
      at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
      at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
      at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
      at org.mockito.internal.runners.DefaultInternalRunner$1$1.evaluate(DefaultInternalRunner.java:54)
      at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
      at org.junit.runners.BlockJUnit4ClassRunner$1.evaluate(BlockJUnit4ClassRunner.java:100)
      at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:366)
      at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:103)
      at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:63)
      at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
      at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
      at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
      at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
      at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
      at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
      at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
      at org.mockito.internal.runners.DefaultInternalRunner$1.run(DefaultInternalRunner.java:99)
      at org.mockito.internal.runners.DefaultInternalRunner.run(DefaultInternalRunner.java:105)
      at org.mockito.internal.runners.StrictRunner.run(StrictRunner.java:40)
      at org.mockito.junit.MockitoJUnitRunner.run(MockitoJUnitRunner.java:163)
      at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
      at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
      at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)
      at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
      at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)

	Explicação: O teste chama a service e o método estoura na linha 144 onde os parâmetros de comparação são diferentes.

      trilha.back.financys.exception.WrongParameter: Parâmetros com valores errados
      at trilha.back.financys.services.EntryService.getLancamentosDependentes(EntryService.java:135)
      at testes.TrilhaBackTestes.lambda$testeParametrosNull$0(TrilhaBackTestes.java:64)
      at org.junit.Assert.assertThrows(Assert.java:1001)
      at org.junit.Assert.assertThrows(Assert.java:981)
      at testes.TrilhaBackTestes.testeParametrosNull(TrilhaBackTestes.java:63)
      at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
      at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
      at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
      at java.base/java.lang.reflect.Method.invoke(Method.java:566)
      at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
      at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
      at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
      at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
      at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
      at org.mockito.internal.runners.DefaultInternalRunner$1$1.evaluate(DefaultInternalRunner.java:54)
      at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
      at org.junit.runners.BlockJUnit4ClassRunner$1.evaluate(BlockJUnit4ClassRunner.java:100)
      at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:366)
      at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:103)
      at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:63)
      at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
      at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
      at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
      at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
      at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
      at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
      at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
      at org.mockito.internal.runners.DefaultInternalRunner$1.run(DefaultInternalRunner.java:99)
      at org.mockito.internal.runners.DefaultInternalRunner.run(DefaultInternalRunner.java:105)
      at org.mockito.internal.runners.StrictRunner.run(StrictRunner.java:40)
      at org.mockito.junit.MockitoJUnitRunner.run(MockitoJUnitRunner.java:163)
      at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
      at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
      at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)
      at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
      at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)

	Explicação: O teste chama a service e o método estoura na linha 135 porque os parâmetros são nulos.

	trilha.back.financys.exception.DivideByZeroException: Não pode dividir por 0!
    	at trilha.back.financys.services.EntryService.calculaMedia(EntryService.java:125)
    	at testes.TrilhaBackTestes.lambda$teste2$2(TrilhaBackTestes.java:92)
    	at org.junit.Assert.assertThrows(Assert.java:1001)
    	at org.junit.Assert.assertThrows(Assert.java:981)
    	at testes.TrilhaBackTestes.teste2(TrilhaBackTestes.java:91)
    	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
    	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
    	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
    	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
    	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
    	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
    	at org.mockito.internal.runners.DefaultInternalRunner$1$1.evaluate(DefaultInternalRunner.java:54)
    	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
    	at org.junit.runners.BlockJUnit4ClassRunner$1.evaluate(BlockJUnit4ClassRunner.java:100)
    	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:366)
    	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:103)
    	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:63)
    	at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
    	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
    	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
    	at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
    	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
    	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
    	at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
    	at org.mockito.internal.runners.DefaultInternalRunner$1.run(DefaultInternalRunner.java:99)
    	at org.mockito.internal.runners.DefaultInternalRunner.run(DefaultInternalRunner.java:105)
    	at org.mockito.internal.runners.StrictRunner.run(StrictRunner.java:40)
    	at org.mockito.junit.MockitoJUnitRunner.run(MockitoJUnitRunner.java:163)
    	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
    	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
    	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)
    	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
    	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)

    	Explicação: O teste chama a service e o método não passa pelo if porque o parâmetro é 0.

---

## 3.12. Desafio 13
<a name="Desafio-13"></a>

Tire evidências das telas e testes mostrando a integração dos dois códigos e adicione no README.md

      General
      Request URL: http://localhost:8080/categorias
      Request Method: GET
      Status Code: 200
      Remote Address: [::1]:8080
      Referrer Policy: strict-origin-when-cross-origin

      Response Headers
      Access-Control-Allow-Origin: http://localhost:4200
      Connection: keep-alive
      Content-Type: application/json
      Date: Thu, 03 Feb 2022 13:24:43 GMT
      Keep-Alive: timeout=60
      Transfer-Encoding: chunked
      Vary: Origin
      Vary: Access-Control-Request-Method
      Vary: Access-Control-Request-Headers

      Request Headers

      Accept: application/json, text/plain, */*
      Accept-Encoding: gzip, deflate, br
      Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
      Connection: keep-alive
      Host: localhost:8080
      Origin: http://localhost:4200
      Referer: http://localhost:4200/
      sec-ch-ua: " Not A;Brand";v="99", "Chromium";v="98", "Google Chrome";v="98"
      sec-ch-ua-mobile: ?0
      sec-ch-ua-platform: "Windows"
      Sec-Fetch-Dest: empty
      Sec-Fetch-Mode: cors
      Sec-Fetch-Site: same-site
      User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.81 Safari/537.36

---

## 3.13. Desafio 14
<a name="Desafio-14"></a>

Desafio 1 - Git:

I. Dê 2 exemplos de situações onde é necessário utilizar merge:

    Ex 1- Quando você desenvolveu uma parte de um projeto e quer fazer o merge com a branch principal.
    Ex 2- Testar um código, realizar a correção dos erros e fazer o merge com o projeto em produção.

II. Com qual objetivo realizamos o commit?

    Objetivo do commit é manter um histórico do desenvolvimento, com o versionamento do código facilita a manutenção
    e maior controle do projeto.

III. Qual a diferença entre:

      git add -all - Adiciona todos arquivos (novos, modificados e removidos)
      git add -u - Adiciona apenas os arquivos modificados e removidos.
      git add -A - Adiciona todos arquivos (novos, modificados e removidos)
      git add . - Adiciona todos arquivos (novos, modificados e removidos)

IV.  Qual  é  a  ordem  dos  comandos  para  subir  novas  atualizações,
verificando se existem alterações a serem recebidas?

    git add ., git pull origin main, git status, git commit -m "Novo Commit", git push origin main

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 1? Se não, justifique;

    Sim,o conhecimento adquirido foi muito importante porque foi utilizado durante todo o projeto.

b) Desafio 2 - POO e Entity:

I. Qual é a finalidade da camada Entity?

    Camada Entity contem as entidades do projeto, onde contém os getters e os setters, toString e construtores.
    Os métodos dessa camada não alteram nenhuma regra de negocio.

II. Para você, por que acha que seguimos a programação orientada a objetos?

    Porque com a POO facilita o trabalho em equipes, facilidade de manutenção em partes especificas do projeto e a
    reutilização de código.

III. Qual é o ideal por trás de utilizar os métodos getters e setters?

    Getters e setters tem por finalidade obter a informação e definir os valores respectivamente.

IV. Qual o propósito de um construtor em uma classe? Podemos criar uma classe sem construtor?

    Propósito do construtor é criar o objeto. O construtor é obrigatório, por padrão o java já cria um construtor
    vazio automaticamente.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 2? Se não, justifique;

    Sim.

c) Desafio 3 - HTTP, REST e Controller:

I. Qual é o objetivo da camada Controller?

    Camada de Controller é responsável por receber e enviar as requisições ao usuário.

II. No que os padrões REST nos auxiliam?

    REST é uma arquitetura que define um conjunto de restrições que são utilizadas para criação de serviços web.

III. Quais métodos HTTP utilizamos para montar um CRUD?

    Post, Put, Delete e Get.

IV.    Qual    a    diferença    entre    as    annotations    @PathVariable, @RequestParam, @RequestBody?
E  com  quais  métodos  HTTP  elas  podem  ser  utilizadas respectivamente?

    @PathVariable - É utilizado quando o valor da variável é passada diretamente na URL. Pode utilizar nos métodos
    GET, DElETE e PUT.
    @RequestParam - Podem conter parâmetros passados na URL, mas não fazer parte da URL. Pode utilizar no método GET.
    @RequestBody - indica que um parâmetro deve ser associado ao valor de uma solicitação HTTP. Pode utilizar
    nos métodos POST e PUT.


V. Para que serve ResponseEntity?

    Representa toda a resposta HTTP. Dessa forma é possível controlar o código de status, cabeçalhos e corpo.

VI. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 3? Se não, justifique;

    Sim, esse desafio foi importante para a lógica de programação, onde criamos vários métodos para realizar o crud
    com suas especificações.

d) Desafio 4 - JPA e Repository:

I. Qual é o propósito da camada Repository?

    Essa camada tem por finalidade o contato com o banco de dados, onde faz o acesso ao banco.

II. De maneira prática como funciona a injeção do Repository? E qual a sua relação com @Autowired?

    Instância a classe para que o objeto possa funcionar. @Autowired é uma anotação que marca o ponto de injeção
    na classe.

III. Quais são as facilidades em utilizar JPA?

    Com a utilização do JPA, o principal beneficio é a economia de tempo, as conexões de bancos de dados se tornam
    automaticas.

IV. Quais são os passos para configurar um banco de dados em um projeto Spring?

    Apenas passar as informações de caminho, porta, login e senha no arquivo application.properties.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 4? Se não, justifique;

    Sim, nessa etapa do projeto ficou claro o funcionamento e a implementação de um banco de dados.

e) Desafio 5 - Service:

I. Qual é a finalidade da camada Service?

    Camada service é responsável pelas regras de negocio, onde contém toda a lógica da aplicação.

II. Qual o sentido de um método ter apenas um propósito?

    Facilidade em caso de manutenção, diminuição de falhas e o método não fica extenso.

III. Qual a diferença entre um método void e métodos tipados?

    Método void não retorna nada. Método tipado é que ele só espera e aceita o tipo que foi passado.

IV. É normal um serviço chamar outro?

    Sim, uma service pode chamar outra service.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 5? Se não, justifique;

    Sim, no desafio ficou claro a função da service.

f) Desafio 6 - DTO:

I. Quais problemas conseguimos resolver utilizando a camada DTO?

    Com DTO é possivel passar apenas as informações necessarias para o usuário, por exemplo "escondendo" o id, porque
    o usuário não precisa saber o id interno.

II.  Qual  a  diferença  de  realizarmos  o  “de  para”  utilizando  constructor  ou  getters  e  setters?

    No construtor podemos passar o objeto inteiro e no getter e setter temos que passar um por um.

III. No que a utilização do Mapper nos auxilia? Achou fácil a implementação?

    Mapper nos auxilia no preenchimento de forma automática, economizando tempo e deixando o código mais limpo.
    Após ver a utilização do mapper e o entendimento sobre, a implementação ficou mais clara, mas no primeiro
    contato gerou algumas dúvidas.

I V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 6? Se não, justifique;

    Sim, consegui conhecer bem o DTO e o mapper e para o desafio da integração me ajudou muito.

g) Desafio 7 - Manipulação de dados:

I. Qual é a forma de validar os dados de uma requisição sem utilizar @Valid?

    É possível fazer validações com annotations, no projeto utilizamos validações nas entities.
    Ex. @NotNull, NotBlank, @Length ....

II. Para que serve um ENUM? Cite exemplos;

    ENUM serve para receber uma string ou um número para identificar uma lista pré definida.
     Ex. um tipo de pessoa por exemplo, Pessoa Jurídica ou Pessoa Física.

III. Como criamos um custom validator? E qual o objetivo de criar um?

    Criar uma anotação e implementar a lógica de validação em uma classe. Com a criação de validações é possível
    ter mensagens especificas de acordo com sua regra de negócio e ter total poder de customizar.


I V. Qual foi a diferença entre utilizar for e streams no desafio 6?

    A diferença é o tamanho do código, com streams é muito menor e algumas lógicas já estão prontas, apenas
    implementar. Ex. Ordenação, remover de acordo com a lógica.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 7? Se não, justifique;

    Sim, consegui adquirir bastante conhecimento principalmente na parte da stream.

h) Desafio 8 - Tratamento de exceptions:

I. Qual a finalidade de trata-las?

    Identificar e tratar de uma forma em que fique mais fácil a identificação e a leitura;

II. Como as descobrimos?

    Quando descobrimos qual erro devemos esperar. Ex. Passar uma string null, sendo que a string não pode ser nula.

III. Como fazemos para estourar um exception em uma determinada linha?

    Passando a informação esperada pela exception, se ela espera null para quebrar, passar um parametro nulo e a
    linha será quebrada.

I V. Qual é a melhor forma de implementarmos nosso controle de exceções?

    Utilizando o bloco Try, catch, finally. Onde o try contém a situação que pode gerar a exceção, o catch pega essa
    exceção e o finally executa independente de ter isso quebrado ou passado direto.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 8? Se não, justifique;

    Sim, consegui adquirir conhecimento sobre exceções.

i) Desafio 9 - Patterns, SOLID e Arquitetura:

I. O que é Singleton Pattern?

    É um padrão de projeto que especifica que apenas uma instância da classe pode existir e ela será usada em todo
    o projeto.

II. O que significa a letra D de SOLID e como se aplica na camada de Repository?

    Dependency Inversion Principle - Principio da inversão de dependencia. Porque o Repository é a camada mais baixa
    entre as camadas de serviço e controllers. Essas camadas de mais alto nível não devem se importar com a
    infraestrutura (Banco de dados)

III. Qual o objetivo das camadas?

      Objetivo das camadas é separar por responsabilidades.

I V. Qual arquitetura é melhor DDD, Hexagonal ou Clean?

    Não existe uma melhor e sim qual seu projeto se encaixa da melhor forma possivel.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 9? Se não, justifique;

    Sim, desafio bem teorico onde conseguimos ter uma visão mais aprofundada sobre os padrões de projetos.

j) Desafio 10 - Spring:

I. Qual a diferença entre Java e Spring?

    Java é uma linguagem de programação e Spring é um ecossistema de desenvolvimento.

II. É possível utilizar Spring Data sozinho?

    Não, Spring Data é uma ferradamenta do Spring que tem modulos referentes a banco de dados.

III. É possível utilizar Spring Boot, Spring Data e Spring Security em apenas um projeto?
Se sim, como é feito a integração?

    Sim, é possivel sim. Em nosso projeto foi utilizado o spring Boot e o Spring Data em conjunto. A integração é
    feita no arquivo pom.xml onde adicionamos a dependencia do spring data ou spring security.

I V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 10? Se não, justifique;

    Sim, foi adquirido bastante conhecimento e entendi sobre o ecossistema spring.

k) Desafio 11 - Libs:

I. Cite 5 libs que utilizou durante a trilha e suas respectivas funcionalidades;

    JUnit - Utilizado na parte dos testes.
    MOckito - também utilizado nos testes.
    Hibernate - Utilizado no banco de dados.
    H2 - banco de dados em memoria.

II. Qual a diferença entre uma lib e um driver?

    Driver é os drivers de configuração dos banco de dados, e as libs podem adicionar os drivers.

III. Existe limite de libs por projeto?

    Não, não existe limite de libs.

I V. Por que utilizar um gerenciador de dependências?

    Nele contem todas as configurações prontas, assim economizando tempo.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 11? Se não, justifique;

    Sim.

l) Desafio 12 - Testes unitários:

I. Por que DEVOPS exige uma porcentagem de cobertura mínima nos projetos?

    Para minimizar bugs em produção, assim conseguindo entregar um projeto com mais qualidade.

II. Qual o objetivo de utilizar Mockito? Dê um exemplo;

    Com o mockito é utilizado em testes unitários. Ex. "mockar" simular um banco de dados, sem alterar o banco de dados
    original.

III. O que é o Sonar? E qual é o seu papel?

    É uma ferramenta que realiza análise estática de um código fonte. Pode detectar erros de programação e até falhas
    de segurança. Pode ser utilizado também como uma forma de boas práticas.

I V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 12? Se não, justifique;

    Sim.

m) Desafio 13 - Integração:

I. Como foi o processo de integração?

    Foi necessário instalar o Node JS e o Angular, para rodar a aplicação. Alterar o caminho para que ambos possam
    "Conversar".

II. Quais foram as principais dificuldades?

    A principal dificuldade foi uma adequação que tive que fazer para que retornasse exatamente como o Front estava
    esperando.

III. Obteve algum erro de CORS?

    Sim.

I V. O que é CORS?

    É um mecanismo que permite que recursos restritos em uma página da web sejam recuperados por outro domínio
     fora do domínio ao qual pertence.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 13? Se não, justifique;

    Sim, foi muito interessante esse desafio, porque consegui ver pela primeira vez uma integração entre o front e o
    back end.