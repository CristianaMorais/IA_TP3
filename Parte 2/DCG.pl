/*
sentenca --> noun_phrase, verbal_phrase.
sentenca --> noun_phrase_p, verbal_phrase_p.
frase_nom --> determiner_f, noun_f.
frase_nom --> determiner_m, noun_m.
frase_nom --> noun_f.
frase_nom --> noun_m.
frase_nom_plural --> determiner_p_f, noun_p_f.
frase_nom_plural --> determiner_p_m, noun_p_m.
frase_nom_plural --> noun_p_f.
frase_nom_plural --> noun_p_m.
*/

%Nome e verbo
sentenca(sentenca(Nominal,Verbal)) --> frase_nom(Nominal), frase_ver(Verbal).
sentenca(sentenca(NominalPlural,VerbalPlural)) --> frase_nom_plural(NominalPlural), frase_ver_plural(VerbalPlural).


%Frase nominal (singular e plural)
frase_nom(frase_nom(Nome)) --> nome_m(Nome).
frase_nom(frase_nom(Nome)) --> nome_f(Nome).

frase_nom(frase_nom(Artigo, Nome)) --> artigo_m(Artigo), nome_m(Nome).
frase_nom(frase_nom(Artigo, Nome)) --> artigo_f(Artigo), nome_f(Nome).

frase_nom(frase_nom(Contracao, Nome)) --> contracao_m(Contracao), nome_m(Nome).
frase_nom(frase_nom(Contracao, Nome)) --> contracao_f(Contracao), nome_f(Nome).

frase_nom_plural(frase_nom_plural(Nome)) --> nome_m_plural(Nome).
frase_nom_plural(frase_nom_plural(Nome)) --> nome_f_plural(Nome).

frase_nom_plural(frase_nom_plural(Artigo, Nome)) --> artigo_m_plural(Artigo), nome_m_plural(Nome).
frase_nom_plural(frase_nom_plural(Artigo, Nome)) --> artigo_f_plural(Artigo), nome_f_plural(Nome).

frase_nom_plural(frase_nom_plural(Contracao, Nome)) --> contracao_m_plural(Contracao), nome_m_plural(Nome).
frase_nom_plural(frase_nom_plural(Contracao, Nome)) --> contracao_f_plural(Contracao), nome_f_plural(Nome).

%Frase preposicional
frase_prep(frase_prep(Preposi,Frase)) --> prep(Preposi), frase_nom(Frase).
frase_prep(frase_prep(Preposi,Frase)) --> prep(Preposi), frase_nom_plural(Frase).


%Frase verbal (singular e plural)
frase_ver(frase_ver(Verbo,Resto)) --> verbo(Verbo), frase_nom(Resto).
frase_ver(frase_ver(Verbo,Resto)) --> verbo(Verbo), frase_nom_plural(Resto).
frase_ver(frase_ver(Verbo,Resto)) --> verbo(Verbo), frase_prep(Resto).
frase_ver(frase_ver(Verbo)) --> verbo(Verbo).

frase_ver_plural(frase_ver_plural(Verbo,Resto)) --> verbo_plural(Verbo), frase_nom(Resto).
frase_ver_plural(frase_ver_plural(Verbo,Resto)) --> verbo_plural(Verbo), frase_nom_plural(Resto).
frase_ver_plural(frase_ver_plural(Verbo,Resto)) --> verbo_plural(Verbo), frase_prep(Resto).
frase_ver_plural(frase_ver_plural(Verbo)) --> verbo_plural(Verbo).

%Palavras retiradas do enunciado

%Artigo femenino (singular e plural)
artigo_f(artigo(a)) --> [a].
artigo_f(artigo('A')) --> ['A'].

artigo_f_plural(artigo(as)) --> [as].
artigo_f_plural(artigo('As')) --> ['As'].


%Artigo masculino (singular e plural)
artigo_m(artigo(o)) --> [o].
artigo_m(artigo('O')) --> ['O'].

artigo_m_plural(artigo(os)) --> [os].
artigo_m_plural(artigo('Os')) --> ['Os'].


%Contracoes no feminino (singular e plural)
contracao_f(artigo(na)) --> [na].
contracao_f(artigo(pela)) --> [pela].

contracao_f_plural(artigo(nas)) --> [nas].
contracao_f_plural(artigo(pelas)) --> [pelas].


%Contracoes no masculino (singular e plural)
contracao_m(artigo(no)) --> [no].
contracao_m(artigo(pelo)) --> [pelo].

contracao_m_plural(artigo(nos)) --> [nos].
contracao_m_plural(artigo(pelos)) --> [pelos].


%Nomes no masculino
nome_m(nome(cacador)) --> [cacador].
nome_m(nome(cachorro)) --> [cachorro].
nome_m(nome(mar)) --> [mar].
nome_m(nome(martelo)) --> [martelo].
nome_m(nome(rio)) --> [rio].
nome_m(nome(rosto)) --> [rosto].
nome_m(nome(sino)) --> [sino].
nome_m(nome(tambor)) --> [tambor].
nome_m(nome(tempo)) --> [tempo].
nome_m(nome(vento)) --> [vento].


%Nomes no femenino
nome_f(nome(cidade)) --> [cidade].
nome_f(nome(floresta)) --> [floresta].
nome_f(nome(mae)) --> [mae].
nome_f(nome(menina)) --> [menina].
nome_f(nome(noticia)) --> [noticia].
nome_f(nome(porta)) --> [porta].
nome_f(nome(vida)) --> [vida].


%Plurais dos nomes
nome_m_plural(nome(lobos)) --> [lobos].
nome_m_plural(nome(tambores)) --> [tambores].

nome_f_plural(nome(lagrimas)) --> [lagrimas].
nome_f_plural(nome(meninas)) --> [meninas].


%Preposicoes
prep(preposicao(com)) --> [com].
prep(preposicao(para)) --> [para].


%Verbos (singular e plural)
verbo(verbo(bateu)) --> [bateu].
verbo(verbo(corre)) --> [corre].
verbo(verbo(correu)) --> [correu].

verbo_plural(verbo_plural(bateram)) --> [bateram].
verbo_plural(verbo_plural(correram)) --> [correram].
verbo_plural(verbo_plural(corriam)) --> [corriam].
