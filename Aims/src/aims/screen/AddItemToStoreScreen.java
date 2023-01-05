package aims.screen;

import aims.cart.Cart;
import aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AddItemToStoreScreen extends JFrame{
    protected static JFrame storeScreen;
    protected static JFrame cartScreen;
    protected static JFrame addBookScreen;
    protected static JFrame addCDScreen;
    protected static JFrame addDVDScreen;
    protected JFrame currentScreen;

    protected JTextField tfTitle;
    protected JTextField tfCategory;
    protected JTextField tfCost;

    protected static Store store;
    protected static Cart cart;

    public static void setStoreScreen(JFrame storeScreen) {
        AddItemToStoreScreen.storeScreen = storeScreen;
    }

    public static void setCartScreen(JFrame cartScreen) {
        AddItemToStoreScreen.cartScreen = cartScreen;
    }

    public static void setAddBookScreen(JFrame addBookScreen) {
        AddItemToStoreScreen.addBookScreen = addBookScreen;
    }

    public static void setAddCDScreen(JFrame addCDScreen) {
        AddItemToStoreScreen.addCDScreen = addCDScreen;
    }

    public static void setAddDVDScreen(JFrame addDVDScreen) {
        AddItemToStoreScreen.addDVDScreen = addDVDScreen;
    }

    public AddItemToStoreScreen(){}

    public AddItemToStoreScreen(Store store){
        this.store = store;
    }

    public AddItemToStoreScreen(Store store, Cart cart){
        this.store = store;
        this.cart = cart;
    }

    public void setCurrentScreen(JFrame currentScreen) {
        this.currentScreen = currentScreen;
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem menuAddBook = new JMenuItem("Add Book");
        JMenuItem menuAddCD = new JMenuItem("Add CD");
        JMenuItem menuAddDVD = new JMenuItem("Add DVD");
        menuAddBook.addActionListener(new MenuListener());
        menuAddCD.addActionListener(new MenuListener());
        menuAddDVD.addActionListener(new MenuListener());

        smUpdateStore.add(menuAddBook);
        smUpdateStore.add(menuAddCD);
        smUpdateStore.add(menuAddDVD);

        menu.add(smUpdateStore);
        JMenuItem menuViewStore = new JMenuItem("View Store");
        JMenuItem menuViewCart = new JMenuItem("View Cart");
        menuViewStore.addActionListener(new MenuListener());
        menuViewCart.addActionListener(new MenuListener());

        menu.add(menuViewStore);
        menu.add(menuViewCart);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("View cart");
        cart.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cartScreen.setVisible(cartScreen.isVisible() ? false : true);
                    }
                }
        );
        cart.setPreferredSize(new Dimension(100,50));
        cart.setMaximumSize(new Dimension(100, 50));

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    abstract JPanel createCenter();

    public class MenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String menu = e.getActionCommand();
            if (menu.equals("View Store") && !storeScreen.equals(currentScreen)){
                storeScreen.setVisible(true);
                currentScreen.setVisible(false);
            } else if (menu.equals("View Cart") && !cartScreen.equals(currentScreen)){
                cartScreen.setVisible(true);
                currentScreen.setVisible(false);
            } else if (menu.equals("Add Book") && !addBookScreen.equals(currentScreen)){
                addBookScreen.setVisible(true);
                currentScreen.setVisible(false);
            } else if (menu.equals("Add CD") && !addCDScreen.equals(currentScreen)){
                addCDScreen.setVisible(true);
                currentScreen.setVisible(false);
            } else if (menu.equals("Add DVD") && !addDVDScreen.equals(currentScreen)){
                addDVDScreen.setVisible(true);
                currentScreen.setVisible(false);
            }
        }
    }
}