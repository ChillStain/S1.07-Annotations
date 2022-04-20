package S107N1Ex2;


//Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent.
//Invoca des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent els “warnings” per ser obsolets.


import S107N1Ex1.F2FWorker;
import S107N1Ex1.HomeWorker;

public class Main2 {

    public static void main(String[] args) {


        HomeWorker2 homeWorker2 = new HomeWorker2("Charlie", "Chill",100);
        F2FWorker2 f2FWorker2 = new F2FWorker2("Paquito", "Chocolatero",80,5);

        System.out.println("The worker"+homeWorker2.toString()+"have a salary of"+homeWorker2.salary()+"every month.");// Here appears the method as deprecated
        System.out.println("The worker"+f2FWorker2.toString()+"have a salary of"+f2FWorker2.salary()+"every month.");// But here still working


    }
}