package chain_of_responsibility;

public class Bike extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getDistance() >= 11 && request.getDistance() < 51){
            System.out.println("A bike can ride from 11 to 50 km");
        } else {
            System.out.println("A bike can not ride more than 50 km and has to pass request to it's successor");
            successor.handleRequest(request);
        }
    }

}
