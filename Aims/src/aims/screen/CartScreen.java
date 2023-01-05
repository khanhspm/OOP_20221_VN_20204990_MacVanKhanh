package aims.screen;

import aims.cart.Cart;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.io.IOException;

public class CartScreen extends AddItemToStoreScreen{

    @Override
    JPanel createCenter() {
        return null;
    }

    public CartScreen(Cart cart){
        super();
        setCartScreen(this);
        setCurrentScreen(this);
        this.cart = cart;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);
        this.setSize(1024,768);
        this.setTitle("Cart");
        this.setVisible(false);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("Error");
                try {
                    FXMLLoader loader = new FXMLLoader(
                            getClass().getResource("src/aims/screen/Cart.fxml")
                    );
                    CartScreenController controller = new CartScreenController(cart);
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
    }
}