import java.util.*;

class Viagens {
    
    static LinkedList<LinkedList<String>> voos;
    static LinkedList<LinkedList<Flight>> flights;
    static LinkedList<Map> map; 

 
    public void baseDados(){
        map = new LinkedList<Map>();
        voos = new LinkedList<LinkedList<String>>();
        flights = new LinkedList<LinkedList<Flight>>();

        String [] alldays = {"mo","tu","we","th","fr","sa","su"};
        String [] week1 = {"mo","tu","we","th","fr","su"};
        String [] week2 = {"mo","tu","we","th","fr"};
        String [] week3 = {"tu","th"};
        String [] week4 = {"mo","tu","we","th","fr","sa"};
        String [] friday = {"fr"};
        String [] sunday = {"su"};

        String partida, chegada, dep_Time, arr_Time, flight_Num;
        Map map1;
        int checkIn = 0;

        //Edinburgh to london

        partida = "edinburgh";
        map1 = verMap(partida);

        if(map1 == null){
            checkIn = 1;
            map1 = new Map(partida);
        }

        chegada = "london";
        map1.indicarDestinos(partida,chegada);

        dep_Time = "9:40";
        arr_Time = "10:50";
        flight_Num = "ba4733";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, alldays);

        dep_Time= "13:40";
        arr_Time = "14:50";
        flight_Num = "ba4773";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, alldays);

        dep_Time = "19:40";
        arr_Time = "20:50";
        flight_Num = "ba4833";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, week1);

        if (checkIn == 1) {
            map.addLast(map1);
            checkIn = 0;
        }

        //London to Edinburgh

        partida= "london";

        map1 = verMap(partida);

        if (map1 == null) {
            checkIn = 1;
            map1 = new Map(partida);
        }

        chegada = "edinburgh";
        map1.indicarDestinos(partida, chegada);

        dep_Time = "9:40";
        arr_Time = "10:50";
        flight_Num = "ba4732";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, alldays);

        dep_Time = "11:40";
        arr_Time = "12:50";
        flight_Num = "ba4752";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, alldays);

        dep_Time = "18:40";
        arr_Time = "19:50";
        flight_Num = "ba4822";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, week2);

        if (checkIn == 1) {
            map.addLast(map1);
            checkIn = 0;
        }

        // London to Ljubljana

        partida = "london";

        map1 = verMap(partida);

        if (map1 == null) {
            checkIn = 1;
            map1 = new Map(partida);
        }

        chegada = "ljubljana";
        map1.indicarDestinos(partida, chegada);

        dep_Time = "13:20";
        arr_Time = "16:20";
        flight_Num = "ju201";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, friday);

        dep_Time = "13:20";
        arr_Time = "16:20";
        flight_Num = "ju213";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, sunday);

        if (checkIn == 1) {
            map.addLast(map1);
            checkIn = 0;
        }

        //London to Zurich

        partida = "london";

        map1 = verMap(partida);

        if (map1 == null) {
            checkIn = 1;
            map1 = new Map(partida);
        }

        chegada = "zurich";
        map1.indicarDestinos(partida, chegada);


        dep_Time = "9:10";
        arr_Time = "11:45";
        flight_Num = "ba614";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, alldays);

        dep_Time = "14:45";
        arr_Time = "17:20";
        flight_Num = "sr805";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, alldays);

        if (checkIn == 1) {
            map.addLast(map1);
            checkIn = 0;
        }

        //London to Milan

        partida = "london";

        map1 = verMap(partida);

        if (map1 == null) {
            checkIn = 1;
            map1 = new Map(partida);
        }

        chegada = "milan";
        map1.indicarDestinos(partida, chegada);

        dep_Time = "8:30";
        arr_Time = "11:20";
        flight_Num = "ba510";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, alldays);

        dep_Time = "11:00";
        arr_Time = "13:50";
        flight_Num = "az459";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num,  alldays);

        if (checkIn == 1) {
            map.addLast(map1);
            checkIn = 0;
        }

        //Ljubljana to zurich

        partida = "ljubljana";

        map1 = verMap(partida);

        if (map1 == null) {
            checkIn = 1;
            map1 = new Map(partida);
        }

        chegada = "zurich";
        map1.indicarDestinos(partida, chegada);

        dep_Time = "11:30";
        arr_Time = "12:40";
        flight_Num = "ju322";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, week3);



        if (checkIn == 1) {
            map.addLast(map1);
            checkIn = 0;
        }

        //Ljubljana to London

        partida = "ljubljana";

        map1 = verMap(partida);

        if (map1 == null) {
            checkIn = 1;
            map1 = new Map(partida);
        }

        chegada = "london";
        map1.indicarDestinos(partida, chegada);

        dep_Time = "11:10";
        arr_Time = "12:20";
        flight_Num = "yu200";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, friday);

        dep_Time = "11:30";
        arr_Time = "12:40";
        flight_Num = "ju322";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, sunday);


        if (checkIn == 1) {
            map.addLast(map1);
            checkIn = 0;
        }

        //Milan to London

        partida = "milan";

        map1 = verMap(partida);

        if (map1 == null) {
            checkIn = 1;
            map1 = new Map(partida);
        }

        chegada = "london";
        map1.indicarDestinos(partida, chegada);

        dep_Time = "9:10";
        arr_Time = "10:00";
        flight_Num = "az458";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, alldays);

        dep_Time = "12:20";
        arr_Time = "13:10";
        flight_Num = "ba511";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, alldays);


        if (checkIn == 1) {
            map.addLast(map1);
            checkIn = 0;
        }

        //milan to zurich

        partida = "milan";

        map1 = verMap(partida);

        if (map1 == null) {
            checkIn = 1;
            map1 = new Map(partida);
        }

        chegada = "zurich";
        map1.indicarDestinos(partida, chegada);

        dep_Time = "9:25";
        arr_Time = "10:15";
        flight_Num = "sr621";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, alldays);

        dep_Time = "12:45";
        arr_Time = "13:35";
        flight_Num = "sr623";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, alldays);


        if (checkIn == 1) {
            map.addLast(map1);
            checkIn = 0;
        }

        //Zurich to Ljubljana

        partida = "zurich";

        map1 = verMap(partida);

        if (map1 == null) {
            checkIn = 1;
            map1 = new Map(partida);
        }

        chegada = "ljubljana";
        map1.indicarDestinos(partida, chegada);

        dep_Time = "13:30";
        arr_Time = "14:40";
        flight_Num = "yu323";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, week3);



        if (checkIn == 1) {
            map.addLast(map1);
            checkIn = 0;
        }


        //Zurich to London

        partida = "zurich";

        map1 = verMap(partida);

        if (map1 == null) {
            checkIn = 1;
            map1 = new Map(partida);
        }

        chegada = "london";
        map1.indicarDestinos(partida, chegada);

        dep_Time = "9:00";
        arr_Time = "9:40";
        flight_Num = "ba613";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, week4);

        dep_Time = "16:10";
        arr_Time = "16:55";
        flight_Num = "yu323";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, week1);


        if (checkIn == 1) {
            map.addLast(map1);
            checkIn = 0;
        }

        //Zurich to Milan

        partida = "zurich";

        map1 = verMap(partida);

        if (map1 == null) {
            checkIn = 1;
            map1 = new Map(partida);
        }

        chegada = "milan";
        map1.indicarDestinos(partida, chegada);

        dep_Time = "7:55";
        arr_Time = "8:45";
        flight_Num = "sr620";
        map1.indicarVoo(partida, chegada, dep_Time, arr_Time, flight_Num, alldays);



        if (checkIn == 1) {
            map.addLast(map1);
            checkIn = 0;
        }
    }

    public void printBaseDados() {
        System.out.println();
        for (Map m : map) {
            System.out.println("*** " + m.partida + " ***");
            System.out.println();

            for (Timetable xs : m.viagens) {
                System.out.println("DESTINO: " + xs.chegada);

                for (Flight v : xs.flight) {
                    System.out.println("      -Hora Partida: " + v.dep_Time[0] + ":" + v.dep_Time[1]);
                    System.out.println("      -Hora Chegada: " + v.arr_Time[0] + ":" + v.arr_Time[1]);
                    System.out.println("      -Numero Voo  : " + v.semVoo);
                    System.out.print("      -Dias de Voo :");
                    for (String d : v.dias) {
                        System.out.print(" " + d + ";");
                    }
                    System.out.println();
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public String [] vooDireto(String depart, String chegada){

        String [] dias = new String[7];

        for (int i = 0; i < 7; i++) {
            dias[i] = ".";
        }

        for (Map m : map) {
            if (m.partida.equalsIgnoreCase(depart)) {
                for (Timetable l : m.viagens) {
                    if (l.chegada.equals(chegada)) {
                        for (Flight v : l.flight) {
                            for (String s : v.dias) {
                                dias = diasVooDireto(dias, s);
                            }
                        }
                    }
                }
            }
        }

        return dias;

    }

    private String[] diasVooDireto(String dias[], String s) {

        if (s.equals("mo")) {
            dias[0] = "mo";
        } else if (s.equals("tu")) {
            dias[1] = "tu";
        } else if (s.equals("we")) {
            dias[2] = "we";
        } else if (s.equals("th")) {
            dias[3] = "th";
        } else if (s.equals("fr")) {
            dias[4] = "fr";
        } else if (s.equals("sa")) {
            dias[5] = "sa";
        } else if (s.equals("su")) {
            dias[6] = "su";
        }

        return dias;
    }

    public Map verMap(String country) {
        for (Map m : map) {
            if (m.partida.equalsIgnoreCase(country)) {
                return m;
            }
        }
        return null;
    }

    public void diaPercurso(String part, String chega, String dia, LinkedList<String> percurso, int arr_Time[], LinkedList<Flight> flight) {

        percurso.addLast(part);
        String dias[] = vooDireto(part, chega);


        if (diferenteLocal(dias)) {
            if (verificaVoo(part, chega, dia)) {

                Map sitio = verMap(part);
                for (Timetable l : sitio.viagens) {

                    if (l.chegada.equals(chega)) {

                        for (Flight f : l.flight) {
                            if (transfer(arr_Time, f.dep_Time)) {

                                if (percurso.getLast().equals(chega)) {
                                    flight.removeLast();
                                    flight.addLast(f);
                                } else {
                                    percurso.addLast(chega);
                                    flight.addLast(f);
                                }

                                voos.addLast(copyLinkedListRota(percurso));
                                flights.addLast(copyLinkedListVoo(flight));

                            }
                        }
                    }
                }
            }
        } 

        else {
            Map sitio = verMap(part);

            for (Timetable l : sitio.viagens) {

                if (verificaVoo(sitio.partida, l.chegada, dia)) {

                    boolean found = false;
                    for (String mp : percurso) {
                        if (mp.equals(l.chegada)) {
                            found = true;
                        }
                    }

                    if (!found) { 

                        for (Flight v : l.flight) {
                            if (transfer(arr_Time, v.dep_Time)) {
                                flight.addLast(v);
                                diaPercurso(l.chegada, chega, dia, percurso, v.arr_Time, flight);
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean verificaVoo(String sitio, String destination, String dia) {

        for (Map m : map) {
            if (m.partida.equalsIgnoreCase(sitio)) {

                for (Timetable l : m.viagens) {
                    if (l.chegada.equalsIgnoreCase(destination)) {

                        for (Flight v : l.flight) {
                            for (String d : v.dias) {
                                if (dia.equals(d)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean transfer(int time1[], int time2[]) {

        int minutes1 = (time1[0] * 60) + time1[1];
        int minutes2 = (time2[0] * 60) + time2[1];

        int difference = minutes2 - minutes1;


        if (difference >= 40) {
            return true;
        }

        return false;
    }

    public boolean diferenteLocal(String dias[]) {

        for (String d : dias) {
            if (!d.equals(".")) {
                return true;
            }
        }

        return false;
    }

    private LinkedList<Flight> copyLinkedListVoo(LinkedList<Flight> list){

        LinkedList<Flight> copy = new LinkedList<Flight>();

        for (Flight v : list) {
            copy.addLast(v);
        }

        return copy;
    }

    private LinkedList<String> copyLinkedListRota(LinkedList<String> list){

        LinkedList<String> copy = new LinkedList<String>();

        for (String l : list) {
            copy.addLast(l);
        }

        return copy;
    }

    public void diaRota() {

        for (LinkedList<String> sol : voos) {

            LinkedList<Flight> listplane = flights.removeFirst();

            String s1 = sol.removeFirst();
            String s2;

            System.out.print("[");
            while (!sol.isEmpty()) {
                s2 = sol.removeFirst();
                Flight target = listplane.removeFirst();

                if (!sol.isEmpty()) {
                    System.out.print(s1 + "-" + s2 + "/" + target.semVoo + "/" + target.dep_Time[0] + ":" + target.dep_Time[1] + ",");
                }
		else {
                    System.out.print(s1 + "-" + s2 + "/" + target.semVoo + "/" + target.dep_Time[0] + ":" + target.dep_Time[1]);
                }

                s1 = s2;
            }
            System.out.println("]");
        }
    }

    public void visita(String part, String dest, LinkedList<String> locais, String diaP, String diaC, LinkedList<String> percurso) { //prints


        percurso.addLast(part);
        Map ponto = verMap(part);
        System.out.println(ponto);

        if (verificaVoo(part, dest, diaC) && diaC.equals(diaP)) {
            percurso.addLast(dest);
            voos.addLast(copyLinkedListRota(percurso));
        } else {

            for (Timetable l : ponto.viagens) {

                if (fazParte(l.chegada, locais)) {

                    if (verificaVoo(ponto.partida, l.chegada, diaP)) {
                        locais.remove(l.chegada);
                        diaP = nextDay(diaP);

                        visita(l.chegada, dest, locais, diaP, diaC, percurso);
                        percurso.removeLast();
                        locais.add(l.chegada);
                        diaP = previousDay(diaP);

                    }

                }

            }
        }
    }


    private String previousDay(String dia) {
        if (dia.equals("mo")) {
            return "su";
        } else if (dia.equals("tu")) {
            return "mo";
        } else if (dia.equals("we")) {
            return "tu";
        } else if (dia.equals("th")) {
            return "we";
        } else if (dia.equals("fr")) {
            return "th";
        } else if (dia.equals("sa")) {
            return "fr";
        } else if (dia.equals("su")) {
            return "sa";
        }

        return null;
    }

    private String nextDay(String dia) {

        if (dia.equals("mo")) {
            return "tu";
        } else if (dia.equals("tu")) {
            return "we";
        } else if (dia.equals("we")) {
            return "th";
        } else if (dia.equals("th")) {
            return "fr";
        } else if (dia.equals("fr")) {
            return "sa";
        } else if (dia.equals("sa")) {
            return "su";
        } else if (dia.equals("su")) {
            return "mo";
        }

        return null;
    }

    private boolean fazParte(String c, LinkedList<String> locais) {

        for (String cidade : locais) {
            if (cidade.equals(c)) {
                return true;
            }
        }

        return false;
    }

    public void printVisita(String departDay) { //prints
        
        for (LinkedList<String> sol : voos) {

            for (String s : sol) {
                System.out.print(s + " ");
            }
            
        }
        

        for (LinkedList<String> sol : voos) {

            String x1 = sol.removeFirst();
            String x2;
            Map actual;

            while (!sol.isEmpty()) {

                System.out.println("\nDIA: " + departDay);
                x2 = sol.removeFirst();
                actual = verMap(x1);

                for (Timetable l : actual.viagens) {

                    if (l.chegada.equals(x2)) {

                        for (Flight v : l.flight) {

                            for (String s : v.dias) {
                                if (s.equals(departDay)) {

                                    System.out.println("[" + x1 + "-" + x2 + ":" + v.semVoo + ":" + v.dep_Time[0] + ":" + v.dep_Time[1] + "]");
                                }
                            }
                        }
                    }
                }
                x1 = x2;
                departDay = nextDay(departDay);
            }

        }

	System.out.println("----------------------------------");
	System.out.println();
	System.out.println();
    }
}
