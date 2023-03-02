import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCustomer extends JFrame{
    private JPanel AddCustomer;
    private JButton btnClose;
    private JFormattedTextField txtFirstName;
    private JFormattedTextField txtEmail;
    private JButton btnAddCustomer;
    private JFormattedTextField txtLastName;
    private JFormattedTextField txtPhone;


    public AddCustomer(){
        setContentPane(AddCustomer);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });
    }
}
