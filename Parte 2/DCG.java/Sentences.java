import java.util.LinkedList;

class Sentences {

    LinkedList<String> frase_Nom;
    LinkedList<String> frase_Verb;

    public LinkedList<String> formaFrases(String s) {
        String [] frase = s.split(" ");
        LinkedList<String> forma = new LinkedList<String>();

        for(int i = 0; i < frase.length; i++){
            forma.addLast(frase[i]);
        }
        return forma;
    }

    public void frases_NV(LinkedList<String> frase){
        frase_Nom = new LinkedList<>();
        frase_Verb = new LinkedList<>();

        int search = 0;

        for(String palavra : frase){
            if(verbo_Singular(palavra))
                search = 1;
            if(verbo_Plural(palavra))
                search = 1;

            if(search == 0)
                frase_Nom.addLast(palavra);
            else if(search == 1){
                frase_Verb.addLast(palavra);
            }
        }
    }

     public boolean artigoMS(String palavra){
        String[] artigos = {"O", "o"};

        for(String a: artigos){
            if(palavra.equals(a))
                return true;
        }
        return false;
    }

    public boolean artigoMP(String palavra){
        String[] artigos = {"Os","os"};

        for(String a: artigos){
            if(palavra.equals(a))
                return true;
        }
        return false;
    }

    public boolean artigoFS(String palavra){
        String[] artigos = {"A","a"};

        for(String a: artigos){
            if(palavra.equals(a))
                return true;
        }
        return false;
    }

    public boolean artigoFP(String palavra){
        String[] artigos = {"As","as"};

        for(String a: artigos){
            if(palavra.equals(a))
                return true;
        }
        return false;
    }

    
    public boolean preposicoes(String palavra){
        String[] prep = {"para","com","no","na","pelo","pela"};

        for(String f: prep){
            if(palavra.equals(f))
                return true;
        }
        return false;
    }

    public boolean substantivoMS(String palavra){
        String[] substantivo = {"tempo","cacador","rosto","rio","mar","vento","martelo","cachorro","tambor","sino"};

        for(String s: substantivo){
            if(palavra.equals(s))
                return true;
        }
        return false;
    }

    public boolean substantivoMPl(String palavra){
        String[] substantivo = {"lobos","tambores"};

        for(String s: substantivo){
            if(palavra.equals(s))
                return true;
        }
        return false;
    }

    public boolean substantivoFS(String palavra){
        String[] substantivo = {"menina","vida","noticia","porta","floresta","mae","cidade"};

        for(String s: substantivo){
            if(palavra.equals(s))
                return true;
        }
        return false;
    }

    public boolean substantivoFP(String palavra){
        String[] substantivo = {"lagrimas"};

        for(String s: substantivo){
            if(palavra.equals(s))
                return true;
        }
        return false;
    }

    public boolean verbo_Singular(String palavra){
        String[] verbos = {"corre","correu","bateu"};

        for(String v: verbos){
            if(palavra.equals(v))
                return true;
        }
        return false;
    }

    public boolean verbo_Plural(String palavra){
        String[] verbos = {"corriam","correram","bateram"};

        for(String v: verbos){
            if(palavra.equals(v))
                return true;
        }
        return false;
    }

    public boolean corrigeFrase() {
        
        if(artigoMS(frase_Nom.get(0))){
            
            if(substantivoMS(frase_Nom.get(1))){
                
                if(verbo_Singular(frase_Verb.get(0))){
  
                    if(frase_Verb.size()==1){ 
                        retornaFrase(1);
                        return true;
                    }

                    else {
                        
                        if(preposicoes(frase_Verb.get(1))){

                            if(artigoMS(frase_Verb.get(2))){
                                if(substantivoMS(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(artigoMP(frase_Verb.get(2))){ 
                                if(substantivoMPl(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(artigoFS(frase_Verb.get(2))){ 
                                if(substantivoFS(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(artigoFP(frase_Verb.get(2))){
                                if(substantivoFP(frase_Verb.get(3))){
                                    retornaFrase(2);
                                    return true;
                                }
                            }
                      
                            else if(substantivoMS(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                            else if(substantivoMPl(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                            else if(substantivoFS(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                            else if(substantivoFP(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                        }

                        else if(artigoMS(frase_Verb.get(1))){ 
                            if(substantivoMS(frase_Verb.get(2))){ 
                                retornaFrase(4);
                                return true;
                            }
                        }

                        else if(artigoMP(frase_Verb.get(1))){
                            if(substantivoMPl(frase_Verb.get(2))){
                                retornaFrase(4);
                                return true;
                            }
                        }

                        else if(artigoFS(frase_Verb.get(1))){
                            if(substantivoFS(frase_Verb.get(2))){ 
                                retornaFrase(4);
                                return true;
                            }
                        }

                        else if(artigoFP(frase_Verb.get(1))){ 
                            if(substantivoFP(frase_Verb.get(2))){
                                retornaFrase(4);
                                return true;
                            }
                        }
                    }
                }
            }
        }

        else if(artigoMP(frase_Nom.get(0))){
            if(substantivoMPl(frase_Nom.get(1))){

                if(verbo_Plural(frase_Verb.get(0))){ 
                    if(frase_Verb.size()==1){ 
                        retornaFrase(1);
                        return true;
                    }

                    else {

                        if(preposicoes(frase_Verb.get(1))){

                            if(artigoMS(frase_Verb.get(2))){
                                if(substantivoMS(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(artigoMP(frase_Verb.get(2))){ 
                                if(substantivoMPl(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(artigoFS(frase_Verb.get(2))){
                                if(substantivoFS(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(artigoFP(frase_Verb.get(2))){
                                if(substantivoFP(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(substantivoMS(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                            else if(substantivoMPl(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                            else if(substantivoFS(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                            else if(substantivoFP(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                        }

                        else if(artigoMS(frase_Verb.get(1))){ 
                            if(substantivoMS(frase_Verb.get(2))){ 
                                retornaFrase(4);
                                return true;
                            }
                        }

                        else if(artigoMP(frase_Verb.get(1))){ 
                            if(substantivoMPl(frase_Verb.get(2))){ 
                                retornaFrase(4);
                                return true;
                            }
                        }

                        else if(artigoFS(frase_Verb.get(1))){ 
                            if(substantivoFS(frase_Verb.get(2))){ 
                                retornaFrase(4);
                                return true;
                            }
                        }

                        else if(artigoFP(frase_Verb.get(1))){ 
                            if(substantivoFP(frase_Verb.get(2))){ 
                                retornaFrase(4);
                                return true;
                            }
                        }
                    }
                }
            }
        }

        else if(artigoFS(frase_Nom.get(0))){ 
            if(substantivoFS(frase_Nom.get(1))){ 
         
                if(verbo_Singular(frase_Verb.get(0))){ 
                    if(frase_Verb.size()==1){
                        retornaFrase(1);
                        return true;
                    }

                    else {

                        if(preposicoes(frase_Verb.get(1))){

                            if(artigoMS(frase_Verb.get(2))){ 
                                if(substantivoMS(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(artigoMP(frase_Verb.get(2))){ 
                                if(substantivoMPl(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(artigoFS(frase_Verb.get(2))){ 
                                if(substantivoFS(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(artigoFP(frase_Verb.get(2))){ 
                                if(substantivoFP(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }
                           
                            else if(substantivoMS(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                            else if(substantivoMPl(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                            else if(substantivoFS(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                            else if(substantivoFP(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                        }

                        else if(artigoMS(frase_Verb.get(1))){ 
                            if(substantivoMS(frase_Verb.get(2))){ 
                                retornaFrase(4);
                                return true;
                            }
                        }

                        else if(artigoMP(frase_Verb.get(1))){
                            if(substantivoMPl(frase_Verb.get(2))){ 
                                retornaFrase(4);
                                return true;
                            }
                        }

                        else if(artigoFS(frase_Verb.get(1))){ 
                            if(substantivoFS(frase_Verb.get(2))){ 
                                retornaFrase(4);
                                return true;
                            }
                        }

                        else if(artigoFP(frase_Verb.get(1))){ 
                            if(substantivoFP(frase_Verb.get(2))){
                                retornaFrase(4);
                                return true;
                            }
                        }
                    }
                }
            }
        }

        else if(artigoFP(frase_Nom.get(0))){
            if(substantivoFP(frase_Nom.get(1))){

                if(verbo_Plural(frase_Verb.get(0))){ 
                    if(frase_Verb.size()==1){ 
                        retornaFrase(1);
                        return true;
                    }

                    else { 

                        if(preposicoes(frase_Verb.get(1))){

                            if(artigoMS(frase_Verb.get(2))){
                                if(substantivoMS(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(artigoMP(frase_Verb.get(2))){ 
                                if(substantivoMPl(frase_Verb.get(3))){
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(artigoFS(frase_Verb.get(2))){ 
                                if(substantivoFS(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(artigoFP(frase_Verb.get(2))){ 
                                if(substantivoFP(frase_Verb.get(3))){ 
                                    retornaFrase(2);
                                    return true;
                                }
                            }

                            else if(substantivoMS(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                            else if(substantivoMPl(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                            else if(substantivoFS(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                            else if(substantivoFP(frase_Verb.get(2))){
                                retornaFrase(3);
                                return true;
                            }

                        }

                        else if(artigoMS(frase_Verb.get(1))){
                            if(substantivoMS(frase_Verb.get(2))){ 
                                retornaFrase(4);
                                return true;
                            }
                        }

                        else if(artigoMP(frase_Verb.get(1))){
                            if(substantivoMPl(frase_Verb.get(2))){
                                retornaFrase(4);
                                return true;
                            }
                        }

                        else if(artigoFS(frase_Verb.get(1))){ 
                            if(substantivoFS(frase_Verb.get(2))){
                                retornaFrase(4);
                                return true;
                            }
                        }

                        else if(artigoFP(frase_Verb.get(1))){ 
                            if(substantivoFP(frase_Verb.get(2))){
                                retornaFrase(4);
                                return true;
                            }
                        }
                    }
                }
            }
        }

        retornaFrase(5);
        return false;
    }

      private void retornaFrase(int f){
        if(f == 1){
            System.out.println("sent(frase_nom(artigo('"+frase_Nom.get(0)+"'),substantivo('"+frase_Nom.get(1)+"'))" +
                    ",frase_Verb(verbo('"+frase_Verb.get(0)+"')))");
        }
        else if(f == 2){
            System.out.println("sent(frase_nom(artigo('"+frase_Nom.get(0)+"')," +
                    "substantivo('"+frase_Nom.get(1)+"')),frase_Verb(verbo('"+frase_Verb.get(0)+"')," +
                    "preposicoes('"+frase_Verb.get(1)+"'),artigo('"+frase_Verb.get(2)+"'),substantivo('"+frase_Verb.get(3)+"')))");
        }
        else if(f == 3){
            System.out.println("sent(frase_nom(artigo('"+frase_Nom.get(0)+"'),substantivo('"+frase_Nom.get(1)+"'))," +
                    "frase_Verb(verbo('"+frase_Verb.get(0)+"'),preposicoes('"+frase_Verb.get(1)+"'),substantivo('"+frase_Verb.get(2)+"')))");
        }
        else if(f == 4){
            System.out.println("sent(frase_nom(artigo('"+frase_Nom.get(0)+"')," +
                    "substantivo('"+frase_Nom.get(1)+"')),frase_Verb(verbo('"+frase_Verb.get(0)+"')," +
                    "artigo('"+frase_Verb.get(1)+"'),substantivo('"+frase_Verb.get(2)+"')))");
        }
        else
            System.out.println("Frase sintaticamente incorreta. Por favor, verifique-a e tente novamente.");
    }
}