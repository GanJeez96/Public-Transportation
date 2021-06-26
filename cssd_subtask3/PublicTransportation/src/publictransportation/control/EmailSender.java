/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportation.control;

/**
 *
 * @author Kavindu Gayashan
 */

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class EmailSender {
    
    
    /**
     * This function will accept 3 parameters as receiver's email, subject of the email and the message and send the email via smtp 
     * @param to String Receiver's email address
     * @param sub String Subject of the email
     * @param msg String message body of the email
     */
    public static void send(String to, String sub,String msg) 
    {
        final String user="travelanywhere1234@gmail.com";
        final String pass="TA123456789";
        
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");	
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getDefaultInstance(props,new Authenticator() 
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(user, pass);
            }
        });

        try 
        {
            Message message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(sub);
            message.setText(msg);

            Transport.send(message);
            
            JOptionPane.showMessageDialog(null,"Email sent!");
            
        } catch (MessagingException e) 
        {
            JOptionPane.showMessageDialog(null,"Something happened! Error"+e.getMessage());
            
            throw new RuntimeException(e);
        }
        
    }
    
    
    
}
