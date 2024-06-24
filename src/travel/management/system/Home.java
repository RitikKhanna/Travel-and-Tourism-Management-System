package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame {
    String username;

    public static void main(String[] args) {
        new Home("").setVisible(true);
    }

    public Home(String username) {
        super("Tourism Management System");
        this.username = username;
        setForeground(Color.CYAN);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(Toolkit.getDefaultToolkit().getScreenSize().width,
                Toolkit.getDefaultToolkit().getScreenSize().height, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width,
                Toolkit.getDefaultToolkit().getScreenSize().height);
        add(NewLabel);

        JLabel l1 = new JLabel("TOURISM MANAGEMENT SYSTEM");
        l1.setForeground(Color.BLACK);
        // Set a stylish font family and increase the font size
        l1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC , 60));
        l1.setBounds(250, 30, 1000, 100);
        NewLabel.add(l1);


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu m1 = new JMenu("CUSTOMER");
        m1.setForeground(Color.BLUE);
        menuBar.add(m1);

        JMenuItem mi1 = new JMenuItem("ADD CUSTOMER");
        m1.add(mi1);

        JMenuItem mi2 = new JMenuItem("UPDATE CUSTOMER DETAIL");
        m1.add(mi2);

        JMenuItem mi3 = new JMenuItem("VIEW CUSTOMER DETAILS");
        m1.add(mi3);

        JMenuItem mi4 = new JMenuItem("DELETE CUSTOMER DETAILS");
        m1.add(mi4);

        mi1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddCustomer(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        mi2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new UpdateCustomer(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        mi3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new ViewCustomers().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        mi4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new DeleteCustomer().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JMenu m2 = new JMenu("PACKAGES");
        m2.setForeground(Color.RED);
        menuBar.add(m2);

        JMenuItem mi6 = new JMenuItem("VIEW PACKAGE");
        m2.add(mi6);

        JMenuItem mi7 = new JMenuItem("BOOK PACKAGE");
        m2.add(mi7);

        JMenuItem mi5 = new JMenuItem("VIEW BOOKED PACKAGE");
        m2.add(mi5);

        mi6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CheckPackage().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        mi7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new BookPackage(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        mi5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new ViewPackage(username).setVisible(true);
                } catch (Exception e) {
                }

            }
        });

        JMenu m3 = new JMenu("HOTELS");
        m3.setForeground(Color.BLUE);
        menuBar.add(m3);

        JMenuItem mi9 = new JMenuItem("VIEW HOTELS");
        m3.add(mi9);
        
        JMenuItem mi8 = new JMenuItem("BOOK HOTELS");
        m3.add(mi8);

        

        JMenuItem mi10 = new JMenuItem("VIEW BOOKED HOTEL");
        m3.add(mi10);

        mi8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new BookHotel(username).setVisible(true);
            }
        });

        mi9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CheckHotels().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        mi10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new ViewBookedHotel(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JMenu m4 = new JMenu("DESTINATION");
        m4.setForeground(Color.RED);
        menuBar.add(m4);

        JMenuItem mi11 = new JMenuItem("DESTINATION");
        m4.add(mi11);

        mi11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Destination().setVisible(true);
            }
        });

        JMenu m5 = new JMenu("PAYMENT");
        m5.setForeground(Color.BLUE);
        menuBar.add(m5);

        JMenuItem mi12 = new JMenuItem("PAY USING PAYTM");
        m5.add(mi12);

        mi12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Payment().setVisible(true);
            }
        });

        JMenuItem mi17 = new JMenuItem("PAY USING GOOGLE PAY");
        m5.add(mi17);

        mi17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new GooglePay().setVisible(true);
            }
        });
        
        JMenu m6 = new JMenu("UTILITY");
        m6.setForeground(Color.RED);
        menuBar.add(m6);

        JMenuItem mi13 = new JMenuItem("NOTEPAD");
        m6.add(mi13);

        JMenuItem mi14 = new JMenuItem("CALCULATOR");
        m6.add(mi14);
        
        JMenuItem mi16 = new JMenuItem("STICKY NOTES");
        m6.add(mi16);

        mi13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    Runtime.getRuntime().exec("notepad.exe");
                } catch (Exception e) {
                }
            }
        });

        mi14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    Runtime.getRuntime().exec("calc.exe");
                } catch (Exception e) {
                }
            }
        });
        
        mi16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFrame stickyNoteFrame = new JFrame("Sticky Note");
                JTextArea textArea = new JTextArea();
                stickyNoteFrame.add(new JScrollPane(textArea));
                stickyNoteFrame.setSize(300, 200);
                stickyNoteFrame.setVisible(true);
            }
        });


        JMenu m7 = new JMenu("ABOUT");
        m7.setForeground(Color.BLUE);
        menuBar.add(m7);

        JMenuItem mi15 = new JMenuItem("ABOUT");
        m7.add(mi15);

        mi15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new About().setVisible(true);
            }
        });

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
