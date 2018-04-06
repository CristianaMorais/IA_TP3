/* o operador / tem precedencia 400 por default*/

:- op(50,xfy,:).

/*utilização da função member */

:- use_module(library(lists)).

tempotransfer(H1:M1,H2:M2):-
  (M2 - M1) + (H2 - H1)*60 >= 40.

flight(Place1,Place2,Day,Flight_num,Dep_time,Arr_time):-
  timetable(Place1,Place2,List_of_flights),
  member(Dep_time/Arr_time/Flight_num/NDays, List_of_flights),
    existeVoo(Day, NDays).


    existevoo(Day,alldays):-
    member(Dia,[mo,tu,we,th,fr,sa,su]).
    existeVoo(Day,NDays):-
    member(Day,NDays).



    /*cria a rota entre um determinado sitio*/
    route(Place1,Place1,_,_).
    route(Place1, Place2, Day, Route):-
    trip_plan(Place1,Place2,Day,[Place1],Route).


    /*parte recursiva da função*/

    trip_plan(Place1, Place2, Day, [Place1-Place2:Flight_num:Dep_time:Arr_time],Visitado):-
    flight(Place1,Place2,Day,Flight_num,Dep_time,Arr_time).
    
    trip_plan(Place1,PLace2,Day,Route,Visitado):-
    flight(Place1,ligacao,Day,Flight_num,Dep_time,Arr_time),
    \+ member(ligacao,Visitado),
    trip_plan(ligacao,PLace2,Day,Routeligacao,[ligacao|Visitado]),  verificarTempo([PLace1-ligacao:Flight_num:Dep_time:Arr_time],Routeligacao),
    append([PLace1-ligacao:Flight_num:Dep_time:Arr_time],Routeligacao,Route).
    
    
    /* Inicio da rota */

    rota(CidadeInicial, Destinos, Dia1, Dia2,rota):-
    last(Destinos,ligacao),
    CidadeInicial = ligacao,
    false.

    rota(CidadeInicial, Destinos, Dia1, Dia2,[CidadeInicial-ligacao:Dia1:Flight_num:Dep_time:Arr_time|PercRest]):-

    member(ligacao,Destinos),
    flight(CidadeInicial,ligacao, Dia1, Flight_num,Dep_time,Arr_time),
    proximoDia(Dia1,Next),
    delete(Destinos,ligacao,Destinosligacaoiliares),
    plano(ligacao, Destinosligacaoiliares, CidadeInicial, Next, Dia2, PercRest).

    plano(CidadeInicial, [],Local, Dia1, Dia2,[CidadeInicial-Local:Dia1:Flight_num:Dep_time:Arr_time]):-
    verificaDia(Dia1,Dia2),
    flight(CidadeInicial,Local, Dia2, Flight_num,Dep_time,Arr_time).

    plano(CidadeInicial, Destinos, Local, Dia1, Dia2,rota):-
    member(ligacao,Destinos),
    verifcaDia(Dia1,Dia2),
    flight(CidadeInicial,ligacao, Dia1, Flight_num,Dep_time,Arr_time),
    proximoDia(Dia1, Next),
    delete(Destinos,ligacao, Destinosligacaoiliares),
    plano(ligacao, Destinosligacaoiliares, Local, Next, Dia2, PercRest),
    append([CidadeInicial-ligacao:Dia1:Flight_num:Dep_time:Arr_time],PercRest,rota).

    plano(CidadeInicial, Destinos, Local, Dia1, Dia2,rota):-
    proximoDia(Dia1, Next),
    verificaDia(Next,Dia2),
    plano(CidadeInicial, Destinos,Local, Next, Dia2,rota).

    verificarTempo([_]).
    verificarTempo([]).
    verificarTempo([_-_:_:Dep_time1:Arr_time1],[_-_:_:Dep_time2:Arr_time2|_]):-
    tempotransfer(Arr_time1,Dep_time2).

    /*verificar se o dia esta disponivel*/
    verificaDia(Dia1,Dia2):-
    nth1(Indice1,[mo,tu,we,th,fr,sa,su],Dia1),
    nth1(Indice2,[mo,tu,we,th,fr,sa,su],Dia2),
    Indice1 =< Indice2.

    /*Calcular o dia a seguir */

    proximoDia(mo, tu).
    proximoDia(tu, we).
    proximoDia(we, th).
    proximoDia(th, fr).
    proximoDia(fr, sa).
    proximoDia(sa, su).
    proximoDia(su, mo).

    timetable(edinburgh,london,
    [ 9:40/10:50/ba4733/alldays,
    13:40/14:50/ba4773/alldays,
    19:40/20:50/ba4833/[mo,tu,we,th,fr,su]]).

    timetable(london,edinburgh,
    [ 9:40/10:50/ba4732/alldays,
    11:40/12:50/ba4752/alldays,
    18:40/19:50/ba4822/[mo,tu,we,th,fr]]).

    timetable(london,ljubljana,
    [13:20/16:20/ju201/[fr],
   13:20/16:20/ju213/[su]]).

    timetable(london,zurich,
    [ 9:10/11:45/ba614/alldays,
    14:45/17:20/sr805/alldays]).

    timetable(london,milan,
    [ 8:30/11:20/ba510/alldays,
    11:00/13:50/az459/alldays]).

    timetable(ljubljana,zurich,
    [11:30/12:40/ju322/[tu,th]]).

    timetable(ljubljana,london,
    [11:10/12:20/yu200/[fr],
   11:25/12:20/yu212/[su]]).

    timetable(milan,london,
    [ 9:10/10:00/az458/alldays,
    12:20/13:10/ba511/alldays]).

    timetable(milan,zurich,
    [ 9:25/10:15/sr621/alldays,
    12:45/13:35/sr623/alldays]).

    timetable(zurich,ljubljana,
    [13:30/14:40/yu323/[tu,th]]).

    timetable(zurich,london,
    [ 9:00/9:40/ba613/[mo,tu,we,th,fr,sa],
    16:10/16:55/sr806/[mo,tu,we,th,fr,su]]).

    timetable(zurich,milan,
    [ 7:55/8:45/sr620/alldays]).
