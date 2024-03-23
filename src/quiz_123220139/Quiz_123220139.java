package quiz_123220139;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Quiz_123220139 {

    static class LoginLayout extends JFrame {
        JLabel username, password;
        JTextField textUsername,textPassword;
        JButton bLogin;
        
        LoginLayout() {
            setTitle("Halaman Login");
            
            username = new JLabel("username: ");
            password = new JLabel("password: ");
            textUsername = new JTextField();
            textPassword = new JTextField();
            bLogin = new JButton("Login");
            
            setLayout(null);
            add(username);
            add(password);
            add(textUsername);
            add(textPassword);
            add(bLogin);
            
            username.setBounds(15, 60, 150, 30);
            password.setBounds(15, 90, 150, 30);
            textUsername.setBounds(170, 60, 150, 30);
            textPassword.setBounds(170, 90, 150, 30);
            bLogin.setBounds(170, 150, 150, 30);
            
            bLogin.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        String namaUser = textUsername.getText();
                        String passUser = textPassword.getText();
                        
                        String syaratNama = "123220139";
                        String syaratPass = "123123";
                        
                        if(namaUser.equals(syaratNama) && passUser.equals(syaratPass)){
                            dispose();
                            InputNilaiLayout y = new InputNilaiLayout();
//                            JOptionPane.showMessageDialog(null, "Login Berhasil");
                            setVisible(true);
                        } else{
                            JOptionPane.showMessageDialog(null, "Username atau Password salah!");
                        }
                    } catch(HeadlessException er){
                        JOptionPane.showMessageDialog(null, "ERROR : "+er.getMessage());
                    }
                }
            });
            
            setSize(400, 300);
            setVisible(true);
//            setLocationRelativeTO(null);
//            setDefaultCloseOperator(EXIT_ON_CLOSE);
        }
    }
    
    public static void main(String[] args) {
        LoginLayout x = new LoginLayout();
    }
    
}
