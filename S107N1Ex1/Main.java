package S107N1Ex1;

public class Main {

    public static void main(String[] args) {


        HomeWorker homeWorker = new HomeWorker("Charlie", "Chill",100);
        F2FWorker f2FWorker = new F2FWorker("Paquito", "Chocolatero",80,5);

        System.out.println("The worker"+homeWorker.toString()+"have a salary of"+homeWorker.salary()+"every month.");
        System.out.println("The worker"+f2FWorker.toString()+"have a salary of"+f2FWorker.salary()+"every month.");


    }
}