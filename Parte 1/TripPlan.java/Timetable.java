import java.util.LinkedList;

class Timetable {
    String partida, chegada;
    LinkedList<Flight> flight;

    Timetable(String part, String chega){
        partida = part;
        chegada = chega;
        flight = new LinkedList<Flight>();
    }

    public void addFlight(String dep_Time, String arr_Time, String num, String dias[]) {
        Flight aviao = new Flight(num,dias);
        aviao.add_Time(dep_Time,arr_Time);
        flight.add(aviao);
    }


}