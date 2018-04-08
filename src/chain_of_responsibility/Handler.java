package chain_of_responsibility;

public abstract class Handler {

    protected Handler successor;

    public abstract void handleRequest(Request request);

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
