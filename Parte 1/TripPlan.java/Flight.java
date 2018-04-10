class Flight {
    int [] dep_Time;
    int [] arr_Time;
    String semVoo;
    String [] dias;

    Flight(String n, String[] d){
        dep_Time = new int[2];
        arr_Time = new int[2];
        semVoo = n;
        dias = d;
    }

    public void add_Time(String part, String chega){
        String dep[] = part.split(":");
        String arr[] = chega.split(":");

        dep_Time[0] = Integer.parseInt(dep[0]);
        dep_Time[1] = Integer.parseInt(dep[1]);
        arr_Time[0] = Integer.parseInt(arr[0]);
        arr_Time[1] = Integer.parseInt(arr[1]);
    }
}