package iterator;

public class Main {

    public static void main(String[] args) {
        CustomList customList = new CustomList();
        customList.add(new Object());
        customList.add(new Object());
        customList.add(new Object());
        customList.add(new Object());

        for (Object ob:customList) {
            System.out.println(ob);
        }
    }
}
