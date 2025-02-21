![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      A((Início)) --> B[\Digite sua Nota - valor entre 0 e 100\]
      B --> C{ Nota >= 50? }
      C --> |Sim| D[\Digite sua frequência em %\]
      C --> |Não| H(( ))
      H --> E[/Reprovado/]
      D --> F{ Frequência >= 75%?}
      F --> |Sim| G[/Aprovado/]
      G --> I(( ))
      F --> |Não|H
      E --> I
      I --> Fim([Fim])
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      A((Início)) --> B[\Digite um número1\]
      B --> C[\Digite outro número2\]
      C --> D[Soma = número1 + número2]
      D --> E[/Soma/]
      E --> F([Fim])

   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      A((Inicio)) --> B[\Digite um número\]
      B --> C{ numero >= 0? }
      C --> |Sim| D[/Número é positivo/]
      C --> |Nao| E[/Número é negativo/]
      D --> F(( ))
      E --> F(( ))
      F --> Fi([Fim])
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      A((inicio)) --> C[/Digite sua idade/]
      C --> D{Idade >= 16? \n E \n Possui titulo de eleitor?}
      D --> |Sim| E[/Pode votar/]
      D --> |Não| F[/Não pode votar/]
      E --> G(( ))
      F --> G
      G --> fi([Fim])
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
    
   ```mermaid
    flowchart TD
      A((Inicio)) --> B[\Digite N1\]
      B --> C[\Digite N2 \]
      C --> D{N1 >= N2?}
      D --> |Sim| E[/N1 > N2/]
      D --> |Não| F{N1 = N2?}
      F --> |Sim| H[/N1 = N2/]
      F --> |Não| J[/N2 > N1/]
      E --> G(( ))
      J --> G
      H --> G
      G --> Fi([Fim])
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
  ```mermaid
   flowchart TD
      A((Inicio)) --> B[\Digite N1\]
      B --> C[\Digite N2\]
      C --> D[\Digite N3\]
      D --> E{N1 >= N2?}
      E --> |Sim| F{N1 >= N3?}
      E --> |Não| G{N2 >= N3?}
      F --> |Sim| H[/N1 > N2 e N3/]
      F --> |Não| I{N1 = N3?}
      G --> |Sim| J[/N2 > N1 e N3/]
      G --> |Não| K{N2 = N3?}
      K --> |Sim| L[/N2 = N3/]
      K --> |Não| M[/N3 > N1 e N2/]
      I --> |Sim| N[/N1 = N3/]
      I --> |Não| O[/N3 > N1 e N2/]
      H --> P(( ))
      J --> P
      L --> P
      M --> P
      N --> P
      O --> P
      P --> Fi([Fim])
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      A((Inicio)) --> B[\Digite um número\]
      
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   
   flowchart TD
      A((Inicio)) --> B[\Digite um numero\]
      B --> C[/num1/]
      C --> D[num1 % 2]
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   
   flowchart TD
      I["Sua resposta aqui!"]
   ```