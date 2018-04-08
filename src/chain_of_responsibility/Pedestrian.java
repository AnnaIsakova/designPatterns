package chain_of_responsibility;

public class Pedestrian extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getDistance() < 11){
            System.out.println("A pedestrian can walk max 10 km");
        } else {
            System.out.println("A pedestrian can not walk more than 10 km and has to pass request to it's successor");
            successor.handleRequest(request);
        }
    }
}
