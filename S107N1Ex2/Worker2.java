package S107N1Ex2;

public class Worker2 {


    private String name;
    private String surname;
    private int hour€=20;
    private int nHours;

    public Worker2(String name, String surname,int nHours){
        this.name = name;
        this.surname = surname;
        this.nHours = nHours;
    }


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", hour€=" + hour€ +
                ", nHours=" + nHours +
                '}';
    }

    public int salary(){
        return hour€ * nHours;
    }
}


