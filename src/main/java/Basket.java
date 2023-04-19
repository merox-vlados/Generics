import java.util.ArrayList;

public class Basket<T> {
    ArrayList<? super Fruit> listBasket = new ArrayList<>();

    public void getWeight(ArrayList<? super Fruit> listBasket) {
        for(int i = 0; i  < listBasket.size(); i++) {
            listBasket.get(i);
        }
    }
}
