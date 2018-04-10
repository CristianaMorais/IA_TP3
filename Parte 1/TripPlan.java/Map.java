import java.util.LinkedList;

class Map {
    String partida;
    LinkedList<Timetable> viagens;

    Map(String part){
        partida = part;
        viagens = new LinkedList<Timetable>();
    }


    private boolean verificaDestinos (String destino){
        for(Timetable time : viagens){
            if(time.chegada.equals(destino)){
                return true;
            }
        }
        return false;
    }


    public void indicarDestinos (String partida, String chegada){
        if(!verificaDestinos(chegada)){
            Timetable target = new Timetable(partida,chegada);
            viagens.addLast(target);
        }
    }

 
    public void indicarVoo(String part, String chega, String dep_Time, String arr_Time, String flight_Num, String [] dias){
        for(Timetable xs : viagens){
            if(xs.partida.equalsIgnoreCase(part) && xs.chegada.equalsIgnoreCase(chega)){
                xs.addFlight(dep_Time,arr_Time,flight_Num,dias);
            }
        }
    }
}
