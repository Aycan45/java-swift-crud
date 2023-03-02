import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Customer {
    private JButton btnAddCustomer;
    private JButton btnUpdateCustomer;
    private JButton btnDeleteCustomer;
    private JTable table1;
    private JTable table2;
    private JButton btnAddProduct;
    private JButton btnUpdateProduct;
    private JButton btnDeleteProduct;
    private JPanel CustomersAndProducts;
    private JFormattedTextField txtSearchByName;
    private JButton btnSearchByName;
    private JFormattedTextField txtSearchByProductName;
    private JButton btnSearchByProductName;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Customer");
        frame.setContentPane(new Customer().CustomersAndProducts);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Customer() {
        btnAddCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddCustomer add = new AddCustomer();

                add.setVisible(true);

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
