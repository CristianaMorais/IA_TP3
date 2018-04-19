## Trabalho 3 de Inteligencia Artificial 

## Trabalho realizado por:

         -Cristiana Morais da Silva up201505454

         -Sara Daniela Ferreira de Sousa up201504217


# 1º Problema : Trip Plan

- Instruções de Compilação em prolog


```prolog
 ?- ['Trip_Plan'].
 ```

  - route(Place1, Place2, Day, Route).
 
Place1 - Local de partida. (Indicar o local de onde se pretende partir)

Place2 - Local de chegada. (Indicar o local a onde se pretende chegar)

Day - Dia do voo. (Indicar um dia da semana entre [mo,tu,we,th,fr,sa,su] )

Route - Rota a tomar. (colocar uma variável como por exemplo R)

## Exemplo:

```prolog
   ?- route(london, zurich,tu,R).
R = [london-zurich:ba614:(9:10):11:45] ? ;
R = [london-zurich:sr805:(14:45):17:20] ? ;
no
   ?- 
```

## Exemplo:

  - flight(Place1,Place2,Day,Flight_num,Dep_time,Arr_time).
  
Place1 - Local de partida. (Indicar o local de onde se pretende partir)

Place2 - Local de chegada. (Indicar o local a onde se pretende chegar)

Day - Dia do voo (Indicar um dia da semana entre [mo,tu,we,th,fr,sa,su] )

Flight_num - Número do voo. (colocar uma variável como por exemplo N)

Dep_time - Hora de partida. (colocar uma variável como por exemplo P)

Arr_time - Hora de chegada. (colocar uma variável como por exemplo C)

```prolog
   ?- flight(london,zurich,mo,N,P,C).
C = 11:45,
N = ba614,
P = 9:10 ? ;
C = 17:20,
N = sr805,
P = 14:45 ? ;
no
   ?- 
```

- Instruções de compilação em java

```java

 $ javac *.java && java Trip_Plan
 
 ```
## Exemplo de utilização
```text
Escolha o numero da pergunta:

A -> Em que dias da semana há um voo direto de Place1 para Place2?
B -> Quais são os voos disponiveis para ir de Place1 a Place2 no dia D?
C -> Tenho que visitar N locais, em que comecando meu voo a partir de X no dia D1 e retornando para Y no dia D2. 
Em que sequencia devo visitar estas cidades de forma que eu não tenha mais que um voo por dia?

voos -> Ver todas as viagens
sair -> Para sair do programa

Qual é a pergunta que pretende?: 
 C

Insira "." quando terminar de inserir as cidades para visitar
N:  london
N:  milan
N:  zurich
N:  .
X:  london
D1:  mo
Y:  london
D2:  fr

ROTA DA VIAGEM: 
Percurso da sua viagem: london zurich london 
london zurich milan london 

DIA: mo
[london-zurich/ba614/9:10]
[london-zurich/sr805/14:45]

DIA: tu
[zurich-london/ba613/9:0]
[zurich-london/yu323/16:10]

DIA: we
[london-zurich/ba614/9:10]
[london-zurich/sr805/14:45]

DIA: th
[zurich-milan/sr620/7:55]

DIA: fr
[milan-london/az458/9:10]
[milan-london/ba511/12:20]
----------------------------------

```

# 2ºProblema: DCG

- Instruções de Compilação em prolog

```prolog
 ?- ['DCG']. 

  - sentenca(X , ['O',cacador,correu,com,os,lobos],[]).
 
X - variável

 - Exemplo:

    ?- sentenca(X, ['O',cacador,correu,com,os,lobos],[]).
X = sent(frase_nom(artigo('O'),nome(cacador)),frase_verb(verbo(correu),frase_preposicional(preposicao(com),frase_nom(artigo(os),nome(lobos))))) ? ;
no
   ?- 

  - sentenca(X , ['A',cacador,corriam,pela,rosto],[]).
 
X - variável

 - Exemplo:

   ?- sentenca(X , ['A',cacador,corriam,pela,rosto],[]).
no
   ?- 
```

- Instruções de compilação em java

```java
 $ javac *.java && java Dcg
```
```text
Intoduza uma frase em que as palavras estejam separadas por um espaco e não contenham ponto de final: 

Caso pretenda sair escreva: sair

 A noticia correu para a floresta

sent(frase_nom(artigo('A'),substantivo('noticia')),frase_Verb(verbo('correu'),preposicoes('para'),artigo('a'),substantivo('floresta')))
Frase sintaticamente incorreta. Por favor, verifique-a e tente novamente.

Introduza uma nova frase:

 ```
