package aims.screen;

import aims.cart.Cart;
import aims.media.DigitalVideoDisc;
import aims.media.Media;
import aims.store.Store;
import javafx.collections.ListChangeListener;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class StoreScreen extends AddItemToStoreScreen{

    @Override
    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3,2,2));

        List<Media> mediaInStore = store.getItemsInStore();
        for(int i = 0; i < store.getItemsInStore().size(); i++){
            MediaStore cell = new MediaStore(mediaInStore.get(i), this.cart);
            center.add(cell);
        }

        return center;
    }

    public StoreScreen(Store store, Cart cart){
        super(store, cart);
        setCurrentScreen(this);
        setStoreScreen(this);
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);

        store.getItemsInStore().addListener(
                new ListChangeListener<Media>() {
                    @Override
                    public void onChanged(Change<? extends Media> change) {
                        BorderLayout layout = (BorderLayout)cp.getLayout();
                        cp.remove(layout.getLayoutComponent(BorderLayout.CENTER));
                        cp.add(createCenter(),BorderLayout.CENTER);
                        cp.repaint();
                        cp.revalidate();
                    }
                }
        );
    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        Store st = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", "Guy Ritchie", 77,18.99f);

        st.addMedia(dvd1);
        st.addMedia(dvd2);
        st.addMedia(dvd3);
        new StoreScreen(st, cart);
    }
}