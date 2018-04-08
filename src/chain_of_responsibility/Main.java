package chain_of_responsibility;

public class Main {

    public static void main(String[] args) {
        Request request = new Request(100);

        Pedestrian pedestrian = new Pedestrian();
        Bike bike = new Bike();
        Car car = new Car();

        pedestrian.setSuccessor(bike);
        bike.setSuccessor(car);

        pedestrian.handleRequest(request);
    }

}
