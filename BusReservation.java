import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.awt.Desktop;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class BusReservation {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);

        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);
        
        // welcome to SSN bus reservation
        JLabel welcome1 = new JLabel("WELCOME TO SSN / SNU");
        welcome1.setBounds(800, 250, 500, 100);
        JLabel welcome2 = new JLabel("BUS RESERVATION!!");
        welcome2.setBounds(900, 300, 500, 100);
        Font labelFont = welcome1.getFont();
        welcome1.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));
        welcome2.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        // ssn image
        ImageIcon ssn = new ImageIcon("C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\ssn.jpg");
        JLabel ssn1 = new JLabel(ssn);
        ssn1.setBounds(950, 450, ssn.getIconWidth(), ssn.getIconHeight());

        // close button
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });

        // login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(700, 450, 130, 60);
        loginButton.setBackground(new Color(255, 255, 0));
        loginButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        loginButton.setFocusable(false);
        loginButton.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if (e.getSource() == loginButton){
                frame.dispose();
                new Login(); 
                }
            } 
        });

        // register button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(1200, 450, 130, 60);
        registerButton.setBackground(new Color(255, 255, 0));
        registerButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        registerButton.setFocusable(false);
        registerButton.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if (e.getSource() == registerButton){
                frame.dispose();
                new Register(); 
                }
            } 
        });

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(loginButton);
        backgroundLabel.add(registerButton);
        backgroundLabel.add(welcome1);
        backgroundLabel.add(welcome2);
        backgroundLabel.add(ssn1);
        frame.setVisible(true);
    }
}

class Login {
    Login() {
        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);
        
        // welcome to SSN bus reservation
        JLabel welcome1 = new JLabel("WELCOME TO SSN / SNU");
        welcome1.setBounds(800, 250, 500, 100);
        JLabel welcome2 = new JLabel("BUS RESERVATION!!");
        welcome2.setBounds(900, 300, 500, 100);
        Font labelFont = welcome1.getFont();
        welcome1.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));
        welcome2.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        // ssn image
        ImageIcon ssn = new ImageIcon("C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\ssn.jpg");
        JLabel ssn1 = new JLabel(ssn);
        ssn1.setBounds(950, 450, ssn.getIconWidth(), ssn.getIconHeight());

        // close button
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });

        // ssn button
        JButton ssn_button = new JButton("SSN");
        ssn_button.setBounds(700, 450, 130, 60);
        ssn_button.setBackground(new Color(255, 255, 0));
        ssn_button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ssn_button.setFocusable(false);
        ssn_button.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if (e.getSource() == ssn_button){
                new Ssn_Details_login();
                frame.dispose(); 
                }
            } 
        });

        // snu button
        JButton snu_button = new JButton("SNU");
        snu_button.setBounds(1200, 450, 130, 60);
        snu_button.setBackground(new Color(255, 255, 0));
        snu_button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        snu_button.setFocusable(false);
        snu_button.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if (e.getSource() == snu_button){
                frame.dispose();
                new Snu_Details_login(); 
                }
            } 
        });

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(ssn_button);
        backgroundLabel.add(snu_button);
        backgroundLabel.add(welcome1);
        backgroundLabel.add(welcome2);
        backgroundLabel.add(ssn1);
        frame.setVisible(true);
    }
}

class Register {
    Register() {
        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);

        // welcome to SSN bus reservation
        JLabel welcome1 = new JLabel("WELCOME TO SSN / SNU");
        welcome1.setBounds(800, 250, 500, 100);
        JLabel welcome2 = new JLabel("BUS RESERVATION!!");
        welcome2.setBounds(900, 300, 500, 100);
        Font labelFont = welcome1.getFont();
        welcome1.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));
        welcome2.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        // ssn image
        ImageIcon ssn = new ImageIcon("C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\ssn.jpg");
        JLabel ssn1 = new JLabel(ssn);
        ssn1.setBounds(950, 450, ssn.getIconWidth(), ssn.getIconHeight());

        // close button
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });

        // ssn button
        JButton ssn_button = new JButton("SSN");
        ssn_button.setBounds(700, 450, 130, 60);
        ssn_button.setBackground(new Color(255, 255, 0));
        ssn_button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ssn_button.setFocusable(false);
        ssn_button.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if (e.getSource() == ssn_button){
                frame.dispose();
                new Ssn_Details_register(); 
                }
            } 
        });

        // snu button
        JButton snu_button = new JButton("SNU");
        snu_button.setBounds(1200, 450, 130, 60);
        snu_button.setBackground(new Color(255, 255, 0));
        snu_button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        snu_button.setFocusable(false);
        snu_button.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if (e.getSource() == snu_button){
                frame.dispose();
                new Snu_Details_register(); 
                }
            } 
        });

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(ssn_button);
        backgroundLabel.add(snu_button);
        backgroundLabel.add(welcome1);
        backgroundLabel.add(welcome2);
        backgroundLabel.add(ssn1);
        frame.setVisible(true);
    }
}

class Ssn_Details_register{
     Ssn_Details_register() {
        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);

        // welcome to SSN bus reservation
        JLabel welcome1 = new JLabel("WELCOME TO SSN / SNU");
        welcome1.setBounds(800, 250, 500, 100);
        JLabel welcome2 = new JLabel("BUS RESERVATION!!");
        welcome2.setBounds(900, 300, 500, 100);
        Font labelFont = welcome1.getFont();
        welcome1.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));
        welcome2.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        // close button
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });
        
        // digital ID field
        JLabel digi = new JLabel("Digital ID: ");
        digi.setBounds(850,450,500,100);
        JTextField digital_id = new JTextField();
        digital_id.setBounds(950, 475, 250, 35);
         // password field
        JLabel pass = new JLabel("Password: ");
        pass.setBounds(850,525,500,100);
        JTextField ssn_pass = new JTextField();
        ssn_pass.setBounds(950, 550, 250, 35);
        //name
        JLabel name = new JLabel("Name : ");
        name.setBounds(850,375,500,100);
        JTextField name_text = new JTextField();
        name_text.setBounds(950, 400, 250, 35);

        // submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(950, 650, 130, 60);
        submitButton.setBackground(new Color(255, 255, 0)); // yellow color
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submitButton.setFocusable(false);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username_ssn = digital_id.getText();
                String password_ssn = ssn_pass.getText();
                String name_ssn = name_text.getText();
                String line;
                int count=0;
                String ssn_file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\ssn_details.csv";
                try(BufferedReader reader = new BufferedReader(new FileReader(ssn_file))){
                     while((line = reader.readLine())!=null) {
                        String[] row = line.split(",");
                        if (row[1].replaceAll("\\s", "").equals(username_ssn.replaceAll("\\s", ""))){
                            count = count+1;    
                        }
                     } 
                }
                catch(IOException y){
                    System.out.println("Writing error");
                }
                if (count == 0){
                 try (BufferedWriter writer = new BufferedWriter(new FileWriter(ssn_file, true))) {
            // Writing header
            writer.write(String.format("%s, %s, %s, %s, %s\n", name_ssn, username_ssn, password_ssn, "Route 0", "No seat"));
            System.out.println("Data has been written to " + ssn_file);
        } catch (IOException f) {
            f.printStackTrace();
        }
                new Reserve_cancel_ssn(name_ssn);
                frame.dispose(); // Close the frame
    }
            else{
                Register_fail log = new Register_fail();
                log.Register_fail_ssn();
                frame.dispose();
            }
    
}});

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(digital_id);
        backgroundLabel.add(ssn_pass);
        backgroundLabel.add(welcome1);
        backgroundLabel.add(welcome2);
        backgroundLabel.add(digi);
        backgroundLabel.add(pass);
        backgroundLabel.add(submitButton);
        backgroundLabel.add(name);
        backgroundLabel.add(name_text);
        frame.setVisible(true);
    }
}

class Register_fail{
    void Register_fail_ssn(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        
        JButton submitButton = new JButton("Login");
        submitButton.setBounds(950, 650, 130, 60);
        submitButton.setBackground(new Color(255, 255, 0)); // yellow color
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submitButton.setFocusable(false);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Ssn_Details_login();
                frame.dispose(); // Close the frame
            }
        });

        JLabel welcome3 = new JLabel("ALREADY REGISTERED! LOGIN AGAIN");
        welcome3.setBounds(700, 300, 700, 100);
        Font labelFont = welcome3.getFont();
        welcome3.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(submitButton); 
        backgroundLabel.add(welcome3);
        frame.setVisible(true);
    }
    void Register_fail_snu(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        
        JButton submitButton = new JButton("Login");
        submitButton.setBounds(950, 650, 130, 60);
        submitButton.setBackground(new Color(255, 255, 0)); // yellow color
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submitButton.setFocusable(false);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Snu_Details_login();
                frame.dispose(); // Close the frame
            }
        });

        JLabel welcome3 = new JLabel("ALREADY REGISTERED! LOGIN AGAIN");
        welcome3.setBounds(700, 300, 700, 100);
        Font labelFont = welcome3.getFont();
        welcome3.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(submitButton); 
        backgroundLabel.add(welcome3);
        frame.setVisible(true);
    }
    }

class Snu_Details_register{
     Snu_Details_register() {
        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);

        // welcome to SSN bus reservation
        JLabel welcome1 = new JLabel("WELCOME TO SSN / SNU");
        welcome1.setBounds(800, 250, 500, 100);
        JLabel welcome2 = new JLabel("BUS RESERVATION!!");
        welcome2.setBounds(900, 300, 500, 100);
        Font labelFont = welcome1.getFont();
        welcome1.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));
        welcome2.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        // close button
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });
        
        // digital ID field
        JLabel roll = new JLabel("Roll Number: ");
        roll.setBounds(850,450,500,100);
        JTextField roll_text = new JTextField();
        roll_text.setBounds(950, 475, 250, 35);
         // password field
        JLabel pass_snu = new JLabel("Password: ");
        pass_snu.setBounds(850,525,500,100);
        JTextField snu_pass = new JTextField();
        snu_pass.setBounds(950, 550, 250, 35);
        //name
        JLabel name = new JLabel("Name : ");
        name.setBounds(850,375,500,100);
        JTextField name_text = new JTextField();
        name_text.setBounds(950, 400, 250, 35);

        // submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(950, 650, 130, 60);
        submitButton.setBackground(new Color(255, 255, 0)); // yellow color
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submitButton.setFocusable(false);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username_snu = roll_text.getText();
                String password_snu = snu_pass.getText();
                String name_snu = name_text.getText();
                int count=0;
                String line;
                String snu_file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\snu_details.csv";
                try(BufferedReader reader = new BufferedReader(new FileReader(snu_file))){
                     while((line = reader.readLine())!=null) {
                        String[] row = line.split(",");
                        if (row[1].replaceAll("\\s", "").equals(username_snu.replaceAll("\\s", ""))){
                            count = count+1;    
                        }
                     } 
                }
                catch(IOException y){
                    System.out.println("Writing error");
                }
                if (count==0){
                 try (BufferedWriter writer = new BufferedWriter(new FileWriter(snu_file, true))) {
            // Writing header
            writer.write(String.format("%s, %s, %s, %s, %s\n", name_snu, username_snu, password_snu, "Route 0", "No seat"));
            System.out.println("Data has been written to " + snu_file);
        } catch (IOException f) {
            f.printStackTrace();
        }
                new Snu_Bus_routes(name_snu);
                frame.dispose(); // Close the frame
    }
    else{
        Register_fail log = new Register_fail();
        log.Register_fail_snu();
        frame.dispose();
    }
            }
        });

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(roll);
        backgroundLabel.add(roll_text);
        backgroundLabel.add(welcome1);
        backgroundLabel.add(welcome2);
        backgroundLabel.add(snu_pass);
        backgroundLabel.add(pass_snu);
        backgroundLabel.add(submitButton);
        backgroundLabel.add(name);
        backgroundLabel.add(name_text);
        frame.setVisible(true);
    }
}

class Snu_Details_login{
     Snu_Details_login() {
        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);

        // welcome to SSN bus reservation
        JLabel welcome1 = new JLabel("WELCOME TO SSN / SNU");
        welcome1.setBounds(800, 250, 500, 100);
        JLabel welcome2 = new JLabel("BUS RESERVATION!!");
        welcome2.setBounds(900, 300, 500, 100);
        Font labelFont = welcome1.getFont();
        welcome1.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));
        welcome2.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        // close button
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });
        
        // digital ID field
        JLabel digi = new JLabel("Roll Number : ");
        digi.setBounds(850,450,500,100);
        JTextField digital_id = new JTextField();
        digital_id.setBounds(950, 475, 250, 35);
         // password field
        JLabel pass = new JLabel("Password: ");
        pass.setBounds(850,525,500,100);
        JTextField ssn_pass = new JTextField();
        ssn_pass.setBounds(950, 550, 250, 35);

        // submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(950, 650, 130, 60);
        submitButton.setBackground(new Color(255, 255, 0)); // yellow color
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submitButton.setFocusable(false);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username_ssn = digital_id.getText();
                String password_ssn = ssn_pass.getText();
                String line;
                int count = 0;
                String snu_file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\snu_details.csv";
                 try (BufferedReader reader = new BufferedReader(new FileReader(snu_file))) {
                    while((line = reader.readLine())!=null) {
                        String[] row = line.split(",");
                        if( row[1].replaceAll("\\s", "").equals(username_ssn.replaceAll("\\s", "")) && row[2].replaceAll("\\s", "").equals(password_ssn.replaceAll("\\s", ""))){
                            String login_name = row[0];
                            System.out.println("Login Successful");
                            new Snu_Bus_routes(login_name);
                            count =count+1;
                        }
                    }
                    if (count==0) {
                        new Login_failed();
                    }
        } catch (IOException f) {
            f.printStackTrace();
        }
                frame.dispose(); // Close the frame
            }
        });

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(digital_id);
        backgroundLabel.add(ssn_pass);
        backgroundLabel.add(welcome1);
        backgroundLabel.add(welcome2);
        backgroundLabel.add(digi);
        backgroundLabel.add(pass);
        backgroundLabel.add(submitButton);
        frame.setVisible(true);
    }
}

class Ssn_Details_login{
    private String login_name;
     Ssn_Details_login() {
        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);

        // welcome to SSN bus reservation
        JLabel welcome1 = new JLabel("WELCOME TO SSN / SNU");
        welcome1.setBounds(800, 250, 500, 100);
        JLabel welcome2 = new JLabel("BUS RESERVATION!!");
        welcome2.setBounds(900, 300, 500, 100);
        Font labelFont = welcome1.getFont();
        welcome1.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));
        welcome2.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        // close button
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });
        
        // digital ID field
        JLabel digi = new JLabel("Digital ID ");
        digi.setBounds(850,450,500,100);
        JTextField digital_id = new JTextField();
        digital_id.setBounds(950, 475, 250, 35);
         // password field
        JLabel pass = new JLabel("Password: ");
        pass.setBounds(850,525,500,100);
        JTextField ssn_pass = new JTextField();
        ssn_pass.setBounds(950, 550, 250, 35);

        // submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(950, 650, 130, 60);
        submitButton.setBackground(new Color(255, 255, 0)); // yellow color
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submitButton.setFocusable(false);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username_ssn = digital_id.getText();
                String password_ssn = ssn_pass.getText();
                String line;
                int count = 0;
                String ssn_file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\ssn_details.csv";
                 try (BufferedReader reader = new BufferedReader(new FileReader(ssn_file))) {
                    while((line = reader.readLine())!=null) {
                        String[] row = line.split(",");
                        if( row[1].replaceAll("\\s", "").equals(username_ssn.replaceAll("\\s", "")) && row[2].replaceAll("\\s", "").equals(password_ssn.replaceAll("\\s", ""))){
                            System.out.println("Login Successful");
                            login_name = row[0];
                            System.out.println(login_name);
                            count =count+1;
                            new Reserve_cancel_ssn(login_name);
                            break;
                        }
                    };
                    if (count==0) {
                        new Login_failed();
                    }
        } catch (IOException f) {
            f.printStackTrace();
        }
                frame.dispose(); // Close the frame
            }
        });

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(digital_id);
        backgroundLabel.add(ssn_pass);
        backgroundLabel.add(welcome1);
        backgroundLabel.add(welcome2);
        backgroundLabel.add(digi);
        backgroundLabel.add(pass);
        backgroundLabel.add(submitButton);
        frame.setVisible(true);
    }
}

class Login_failed {
    Login_failed() {
        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);
        
        // welcome to SSN bus reservation
        JLabel welcome1 = new JLabel("WELCOME TO SSN / SNU");
        welcome1.setBounds(800, 250, 500, 100);
        JLabel welcome2 = new JLabel("BUS RESERVATION!!");
        welcome2.setBounds(900, 300, 500, 100);
        Font labelFont = welcome1.getFont();
        welcome1.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));
        welcome2.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        // ssn image
        ImageIcon ssn = new ImageIcon("C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\ssn.jpg");
        JLabel ssn1 = new JLabel(ssn);
        ssn1.setBounds(950, 450, ssn.getIconWidth(), ssn.getIconHeight());

        // close button
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(1200, 450, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });

        // ssn button
        JButton ssn_button = new JButton("Re-Login");
        ssn_button.setBounds(700, 450, 130, 60);
        ssn_button.setBackground(new Color(255, 255, 0));
        ssn_button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ssn_button.setFocusable(false);
        ssn_button.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if (e.getSource() == ssn_button){
                new Login();
                frame.dispose(); 
                }
            } 
        });

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(ssn_button);
        backgroundLabel.add(welcome1);
        backgroundLabel.add(welcome2);
        backgroundLabel.add(ssn1);
        frame.setVisible(true);
    }
}

class Reserve_cancel_ssn{
    String route;
    String seat;
    Reserve_cancel_ssn(String login_name){
         String ssn_file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\ssn_details.csv";
                List<String> lines3 = new ArrayList<>();
                try(BufferedReader reader3 = new BufferedReader(new FileReader(ssn_file))){
                    String line3;
                    while ((line3 = reader3.readLine()) != null) {
                        lines3.add(line3);
            }
             for (int i = 0; i < lines3.size(); i++) {
    String[] parts3 = lines3.get(i).split(",");
                    if (parts3[0].replaceAll("\\s", "").equals(login_name.replaceAll("\\s", ""))){
                        seat = parts3[4];
                        route = parts3[3];
                        lines3.set(i, String.join(",", parts3));
                        break;
                    }
             }
                }
                catch(IOException l){
                    System.out.println("Error reading");
                }
        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });

        JButton submitButton = new JButton("Reserve");
        submitButton.setBounds(950, 550, 130, 60);
        submitButton.setBackground(new Color(255, 255, 0)); // yellow color
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submitButton.setFocusable(false);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               new Ssn_Bus_routes(login_name);
               frame.dispose();
            }
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(950, 650, 130, 60);
        cancelButton.setBackground(new Color(255, 255, 0)); // yellow color
        cancelButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cancelButton.setFocusable(false);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<String> lines = new ArrayList<>();
                try(BufferedReader reader = new BufferedReader(new FileReader(ssn_file))){
                    String line;
                    while ((line = reader.readLine()) != null) {
                        lines.add(line);
            }
             for (int i = 0; i < lines.size(); i++) {
    String[] parts = lines.get(i).split(",");
                    if (parts[0].replaceAll("\\s", "").equals(login_name.replaceAll("\\s", ""))){
                        parts[4] = "No seat";
                        lines.set(i, String.join(",", parts));
                        break;
                    }
             }
                }
                catch(IOException l){
                    System.out.println("Error reading");
                }
                try(BufferedWriter writer = new BufferedWriter(new FileWriter(ssn_file))){
                    for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
                }
                catch(IOException p){
                    System.out.println("Writing error");
                }

                String bus_file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\reservation_1.csv";
                List<String> lines2 = new ArrayList<>();
                try(BufferedReader reader2 = new BufferedReader(new FileReader(bus_file))){
                    String line2;
                    while ((line2 = reader2.readLine()) != null) {
                        lines2.add(line2);
            }
             for (int i = 0; i < lines2.size(); i++) {
    String[] parts2 = lines2.get(i).split(",");
                    if (parts2[0].replaceAll("\\s", "").equals(route.replaceAll("\\s", ""))){
                        for (int j=1; j<parts2.length; j++){
                            if (parts2[j].replaceAll("\\s", "").equals("Full".replaceAll("\\s", ""))){
                                parts2[j] = seat;
                                break;
                            }
                        }
                        lines2.set(i, String.join(",", parts2));
                        break;
                    }
             }
                }
                catch(IOException l){
                    System.out.println("Error reading");
                }
                try(BufferedWriter writer2 = new BufferedWriter(new FileWriter(bus_file))){
                    for (String line2 : lines2) {
                writer2.write(line2);
                writer2.newLine();
            }
                }
                catch(IOException p){
                    System.out.println("Writing error");
                }
                frame.dispose();
            }


        });


        JLabel welcome2 = new JLabel("Choose your option");
        welcome2.setBounds(700, 325, 500, 100);
        Font labelFont = welcome2.getFont();
        welcome2.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(welcome2);
        backgroundLabel.add(submitButton);
        backgroundLabel.add(cancelButton);
        frame.setVisible(true);
    
    }
}


class Reserve_cancel_snu{
    String seat;
    String route;
    Reserve_cancel_snu(String login_name){
        String ssn_file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\snu_details.csv";
                List<String> lines3 = new ArrayList<>();
                try(BufferedReader reader3 = new BufferedReader(new FileReader(ssn_file))){
                    String line3;
                    while ((line3 = reader3.readLine()) != null) {
                        lines3.add(line3);
            }
             for (int i = 0; i < lines3.size(); i++) {
    String[] parts3 = lines3.get(i).split(",");
                    if (parts3[0].replaceAll("\\s", "").equals(login_name.replaceAll("\\s", ""))){
                        seat = parts3[4];
                        route = parts3[3];
                        lines3.set(i, String.join(",", parts3));
                        break;
                    }
             }
                }
                catch(IOException l){
                    System.out.println("Error reading");
                }
        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });

        JButton submitButton = new JButton("Reserve");
        submitButton.setBounds(950, 550, 130, 60);
        submitButton.setBackground(new Color(255, 255, 0)); // yellow color
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submitButton.setFocusable(false);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               new Snu_Bus_routes(login_name);
               frame.dispose();
            }
        });

        JButton cancelButton = new JButton("Cancel Seat");
        cancelButton.setBounds(950, 650, 130, 60);
        cancelButton.setBackground(new Color(255, 255, 0)); // yellow color
        cancelButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cancelButton.setFocusable(false);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ssn_file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\snu_details.csv";
                List<String> lines = new ArrayList<>();
                try(BufferedReader reader = new BufferedReader(new FileReader(ssn_file))){
                    String line;
                    while ((line = reader.readLine()) != null) {
                        lines.add(line);
            }
             for (int i = 0; i < lines.size(); i++) {
    String[] parts = lines.get(i).split(",");
                    if (parts[0].replaceAll("\\s", "").equals(login_name.replaceAll("\\s", ""))){
                        parts[4] = "No seat";
                        lines.set(i, String.join(",", parts));
                        break;
                    }
             }
                }
                catch(IOException l){
                    System.out.println("Error reading");
                }
                try(BufferedWriter writer = new BufferedWriter(new FileWriter(ssn_file))){
                    for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
                }
                catch(IOException p){
                    System.out.println("Writing error");
                }
                
                String bus_file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\reservation_1.csv";
                List<String> lines2 = new ArrayList<>();
                try(BufferedReader reader2 = new BufferedReader(new FileReader(bus_file))){
                    String line2;
                    while ((line2 = reader2.readLine()) != null) {
                        lines2.add(line2);
            }
             for (int i = 0; i < lines2.size(); i++) {
    String[] parts2 = lines2.get(i).split(",");
                    if (parts2[0].replaceAll("\\s", "").equals(route.replaceAll("\\s", ""))){
                        for (int j=1; j<parts2.length; j++){
                            if (parts2[j].replaceAll("\\s", "").equals("Full".replaceAll("\\s", ""))){
                                parts2[j] = seat;
                                break;
                            }
                        }
                        lines2.set(i, String.join(",", parts2));
                        break;
                    }
             }
                }
                catch(IOException l){
                    System.out.println("Error reading");
                }
                try(BufferedWriter writer2 = new BufferedWriter(new FileWriter(bus_file))){
                    for (String line2 : lines2) {
                writer2.write(line2);
                writer2.newLine();
            }
                }
                catch(IOException p){
                    System.out.println("Writing error");
                }

                
                frame.dispose();
            }
        });


        JLabel welcome2 = new JLabel("Choose your option");
        welcome2.setBounds(700, 325, 500, 100);
        Font labelFont = welcome2.getFont();
        welcome2.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(welcome2);
        backgroundLabel.add(submitButton);
        backgroundLabel.add(cancelButton);
        frame.setVisible(true);
    
    }
}
class Reservation{
    Object chosen_bus;
    Reservation(Object chosen_bus, String login_name, int flag){
         List<String> lines = new ArrayList<>();
        String ssn_file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\reservation_1.csv";
                try (BufferedReader reader = new BufferedReader(new FileReader(ssn_file))){
                    String line;
                    while ((line = reader.readLine()) != null) {
                        lines.add(line);
            }
                }
                catch(IOException t){
                    t.getStackTrace();
                }
       
         String arr_bus[]  = null;
        for (int i = 0; i < lines.size(); i++) {
    String[] parts = lines.get(i).split(",");
    if (parts[0].trim().equals(String.valueOf(chosen_bus))) {
        List<String> columns = new ArrayList<>();
        for (int j = 1; j < parts.length; j++) {
            columns.add(parts[j]);
        }
        arr_bus = columns.toArray(new String[0]);
        break;
    }
}
       if (arr_bus != null) {
        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);
       
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });

        
        Arrays.sort(arr_bus);
        int count = 0;
        for (String element : arr_bus) {
            if (element != "Full") {
                count++;
            }
        }
        String[] arr_bus2 = new String[count];
        int index = 0;
        for (String element : arr_bus) {
            if (element != "Full") {
                arr_bus2[index++] = element;
            }
        }
         JComboBox<String> bus_combo = new JComboBox<>(arr_bus2);
        bus_combo.setBounds(950, 500, 130, 60);
        bus_combo.setBackground(new Color(255, 255, 0));
        bus_combo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        bus_combo.setFocusable(false);
        

        JButton submitButton = new JButton("Reserve");
        submitButton.setBounds(950, 650, 130, 60);
        submitButton.setBackground(new Color(255, 255, 0)); // yellow color
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submitButton.setFocusable(false);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object seat = bus_combo.getSelectedItem();
                 for (int i = 0; i < lines.size(); i++) {
    String[] parts = lines.get(i).split(",");
    if (parts[0].trim().equals(String.valueOf(chosen_bus))) {
        for (int j = 1; j < parts.length; j++) {
            if (parts[j].trim().equals(String.valueOf(seat))){
                parts[j] = "Full";
                lines.set(i, String.join(",", parts));
                break;
            }   
        }
        break;
    }
}
        try(BufferedWriter writer2 = new BufferedWriter(new FileWriter(ssn_file))){
            for (String line : lines) {
                writer2.write(line);
                writer2.newLine();
            }
        }
        catch (IOException l) {
            System.out.println("Invalid file in writing null");
        }

        if (flag == 0){
         List<String> lines2 = new ArrayList<>();
                String file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\ssn_details.csv";
                try (BufferedReader reader2 = new BufferedReader(new FileReader(file))){
                    String line2;
                    while ((line2 = reader2.readLine()) != null) {
                        lines2.add(line2);
            }
                }
                catch(IOException t){
                    System.out.println("Invalid file in reading ssn details");
                }
                for (int i = 0; i < lines2.size(); i++) {
            String[] parts2 = lines2.get(i).split(",");
            if (parts2.length >=5 && parts2[0].equals(login_name)) {
                    parts2[4] = String.valueOf(seat);
                    lines2.set(i, String.join(",", parts2));
            }
        }
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line2 : lines2) {
                writer.write(line2);
                writer.newLine();
            }
        } catch (IOException l) {
            System.out.println("Invlid file in writing seat");
        }
    }
    else{
        List<String> lines2 = new ArrayList<>();
                String file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\snu_details.csv";
                try (BufferedReader reader2 = new BufferedReader(new FileReader(file))){
                    String line2;
                    while ((line2 = reader2.readLine()) != null) {
                        lines2.add(line2);
            }
                }
                catch(IOException t){
                    System.out.println("Invalid file in reading snu details");
                }
                for (int i = 0; i < lines2.size(); i++) {
            String[] parts2 = lines2.get(i).split(",");
            if (parts2.length >=5 && parts2[0].equals(login_name)) {
                    parts2[4] = String.valueOf(seat);
                    lines2.set(i, String.join(",", parts2));
            }
        }
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line2 : lines2) {
                writer.write(line2);
                writer.newLine();
            }
        } catch (IOException l) {
            System.out.println("Invlid file in writing seat");
        }
    }
        frame.dispose();
            }
        });

        JLabel welcome1 = new JLabel("Refer the seat map on the left for referance");
        welcome1.setBounds(800, 250, 700, 100);
        Font labelFont = welcome1.getFont();
        welcome1.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        JLabel welcome2 = new JLabel("The seats available for reservation are: ");
        welcome2.setBounds(700, 325, 500, 100);
        welcome2.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        ImageIcon seatmap = new ImageIcon("D:\\Amrit\\College\\SSN\\CS\\bus reservation\\seat map.png");
        JLabel map = new JLabel(seatmap);
        map.setBounds(100, 75, 450, 800);
        frame.add(backgroundLabel);
        backgroundLabel.add(map);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(welcome1);
        backgroundLabel.add(welcome2);
        backgroundLabel.add(submitButton);
        backgroundLabel.add(bus_combo);
        frame.setVisible(true);
    }
    else{

        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });

        JButton submitButton = new JButton("Bus Route");
        submitButton.setBounds(950, 650, 130, 60);
        submitButton.setBackground(new Color(255, 255, 0)); // yellow color
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submitButton.setFocusable(false);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag==0){
                    new Ssn_Bus_routes(login_name);

                }
                else{
                    new Snu_Bus_routes(login_name);
                }
            }
        });


        JLabel welcome2 = new JLabel("The seats are full for this bus");
        welcome2.setBounds(700, 325, 500, 100);
        Font labelFont = welcome2.getFont();
        welcome2.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        JLabel welcome3 = new JLabel("The seats available for reservation are: ");
        welcome3.setBounds(700, 400, 500, 100);
        welcome3.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(welcome3);
        backgroundLabel.add(welcome2);
        backgroundLabel.add(submitButton);
        frame.setVisible(true);
    }
}
}
class Ssn_Bus_routes {
    Ssn_Bus_routes(String login_name){
        System.out.println(login_name);
        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);
        
        // welcome to SSN bus reservation

        JLabel welcome1 = new JLabel(String.format("WELCOME %s", login_name));
        welcome1.setBounds(800, 250, 500, 100);
        Font labelFont = welcome1.getFont();
        welcome1.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        JLabel bus_route = new JLabel("To view the bus routes click the Bus routes button below");
        bus_route.setBounds(600, 350, 600, 100);
        bus_route.setFont(new Font(labelFont.getName(), Font.PLAIN,20));

        JLabel bus_choose = new JLabel("To reserve bus seats, Kindly choose your bus number below");
        bus_choose.setBounds(600, 480, 800, 100);
        bus_choose.setFont(new Font(labelFont.getName(), Font.PLAIN,20));

        // close button
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });
        String[] bus_route_list = {"Route 1", "Route 2", "Route 3", "Route 4", "Route 4A", "Route 5", "Route 6", "Route 7", "Route 8", "Route 9", "Route 9A", "Route 10", "Route 11", "Route 12", "Route 13", "Route 14","Route 15", "Route 16", "Route 17","Route 18","Route 19", "Route 20","Route 21", "Route 22", "Route 23", "Route 24", "Route 25", "Route 26", "Route 27", "Route 28","Route 29","Route 30", "Route 31", "Route 32", "Route 31A", "Route 33", "route 34", "Route 35", "Route 36", "Route 37", "Route 38", "Route 38A", "Route 39", "Route 40", "Route 41", "Route 42", "Route 42A", "Route 43"};
        JComboBox<String> bus_combo = new JComboBox<>(bus_route_list);
        bus_combo.setBounds(850, 600, 130, 60);
        bus_combo.setBackground(new Color(255, 255, 0));
        bus_combo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        bus_combo.setFocusable(false);
        // ssn button
        JButton ssn_button_route = new JButton("Bus Routes");
        ssn_button_route.setBounds(950, 430, 130, 60);
        ssn_button_route.setBackground(new Color(255, 255, 0));
        ssn_button_route.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ssn_button_route.setFocusable(false);
        ssn_button_route.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if (e.getSource() == ssn_button_route){
                String bus_route_path = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\Bus Routes.pdf";
                File bus_file = new File(bus_route_path);
                Desktop desktop = Desktop.getDesktop();
                try {
                desktop.open(bus_file);
                }
                catch (IOException g){
                    g.printStackTrace();;
                }
                           }
            } 
        });

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(1000, 600, 130, 60);
        submitButton.setBackground(new Color(255, 255, 0)); // yellow color
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submitButton.setFocusable(false);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object chosen_bus = bus_combo.getSelectedItem();
                List<String> lines = new ArrayList<>();
                String ssn_file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\ssn_details.csv";
                try (BufferedReader reader = new BufferedReader(new FileReader(ssn_file))){
                    String line;
                    while ((line = reader.readLine()) != null) {
                        lines.add(line);
            }
                }
                catch(IOException t){
                    t.getStackTrace();
                }
                for (int i = 0; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(",");
            if (parts[0].equals(login_name)) {
                    parts[3] = String.valueOf(chosen_bus);
                    lines.set(i, String.join(",", parts));
            }
        }
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(ssn_file))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException l) {
            l.printStackTrace();
        }
                new Reservation(chosen_bus, login_name, 0);
                frame.dispose(); // Close the frame
            }
        });
        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(ssn_button_route);
        backgroundLabel.add(welcome1);
        backgroundLabel.add(bus_route);
        backgroundLabel.add(bus_choose);
        backgroundLabel.add(bus_combo);
        backgroundLabel.add(submitButton);
        frame.setVisible(true);
    }
}


class Snu_Bus_routes {
    Snu_Bus_routes(String login_name){
        System.out.println(login_name);
        JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);

        // Set the background image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/sarad/OneDrive/Desktop/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-for-SSN-SNU-students-main/Bus-Reservation-System.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(false); // Allow the background to show through
        backgroundLabel.setIcon(backgroundImage);
        
        // welcome to SSN bus reservation

        JLabel welcome1 = new JLabel(String.format("WELCOME %s", login_name));
        welcome1.setBounds(800, 250, 500, 100);
        Font labelFont = welcome1.getFont();
        welcome1.setFont(new Font(labelFont.getName(), Font.PLAIN, 27));

        JLabel bus_route = new JLabel("To view the bus routes click the Bus routes button below");
        bus_route.setBounds(600, 350, 600, 100);
        bus_route.setFont(new Font(labelFont.getName(), Font.PLAIN,20));

        JLabel bus_choose = new JLabel("To reserve bus seats, Kindly choose your bus number below");
        bus_choose.setBounds(600, 480, 800, 100);
        bus_choose.setFont(new Font(labelFont.getName(), Font.PLAIN,20));

        // close button
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(950, 750, 130, 60);
        closeButton.setBackground(new Color(255, 255, 0)); // yellow color
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        closeButton.setFocusable(false);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
            }
        });
        String[] bus_route_list = {"Route 1", "Route 2", "Route 3", "Route 4", "Route 4A", "Route 5", "Route 6", "Route 7", "Route 8", "Route 9", "Route 9A", "Route 10", "Route 11", "Route 12", "Route 13", "Route 14","Route 15", "Route 16", "Route 17","Route 18","Route 19", "Route 20","Route 21", "Route 22", "Route 23", "Route 24", "Route 25", "Route 26", "Route 27", "Route 28","Route 29","Route 30", "Route 31", "Route 32", "Route 31A", "Route 33", "route 34", "Route 35", "Route 36", "Route 37", "Route 38", "Route 38A", "Route 39", "Route 40", "Route 41", "Route 42", "Route 42A", "Route 43"};
        JComboBox<String> bus_combo = new JComboBox<>(bus_route_list);
        bus_combo.setBounds(850, 600, 130, 60);
        bus_combo.setBackground(new Color(255, 255, 0));
        bus_combo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        bus_combo.setFocusable(false);
        // ssn button
        JButton ssn_button_route = new JButton("Bus Routes");
        ssn_button_route.setBounds(950, 430, 130, 60);
        ssn_button_route.setBackground(new Color(255, 255, 0));
        ssn_button_route.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ssn_button_route.setFocusable(false);
        ssn_button_route.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if (e.getSource() == ssn_button_route){
                String bus_route_path = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\Bus Routes.pdf";
                File bus_file = new File(bus_route_path);
                Desktop desktop = Desktop.getDesktop();
                try {
                desktop.open(bus_file);
                }
                catch (IOException g){
                    g.printStackTrace();;
                }
                           }
            } 
        });

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(1000, 600, 130, 60);
        submitButton.setBackground(new Color(255, 255, 0)); // yellow color
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submitButton.setFocusable(false);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object chosen_bus = bus_combo.getSelectedItem();
                List<String> lines = new ArrayList<>();
                String snu_file = "C:\\Users\\sarad\\OneDrive\\Desktop\\Bus-Reservation-for-SSN-SNU-students-main\\Bus-Reservation-for-SSN-SNU-students-main\\snu_details.csv";
                try (BufferedReader reader = new BufferedReader(new FileReader(snu_file))){
                    String line;
                    while ((line = reader.readLine()) != null) {
                        lines.add(line);
            }
                }
                catch(IOException t){
                    t.getStackTrace();
                }
                for (int i = 0; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(",");
            if (parts[0].equals(login_name)) {
                    parts[3] = String.valueOf(chosen_bus);
                    lines.set(i, String.join(",", parts));
            }
        }
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(snu_file))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException l) {
            l.printStackTrace();
        }
                new Reservation(chosen_bus, login_name, 1);
                frame.dispose(); // Close the frame
            }
        });
        frame.add(backgroundLabel);
        backgroundLabel.add(closeButton);
        backgroundLabel.add(ssn_button_route);
        backgroundLabel.add(welcome1);
        backgroundLabel.add(bus_route);
        backgroundLabel.add(bus_choose);
        backgroundLabel.add(bus_combo);
        backgroundLabel.add(submitButton);
        frame.setVisible(true);
    }
}




