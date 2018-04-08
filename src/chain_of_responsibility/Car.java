package chain_of_responsibility;

public class Car extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getDistance() >= 51){
            System.out.println("A car can ride more than 50 km");
        }
    }
}
