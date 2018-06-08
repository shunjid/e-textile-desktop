package CodingPackage;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class MailSender 
{
    public static boolean sendMail(String from,String password,String message,String to[])
   {
	   String host = "smtp.gmail.com";
	   Properties props = System.getProperties();
	   props.put("mail.smtp.starttls.enable", "true");
	   props.put("mail.smtp.host", host);
	   props.put("mail.smtp.user", from);
	   props.put("mail.smtp.password", password);
	   props.put("mail.smtp.port", 587);
	   props.put("mail.smtp.auth", true);
	   Session session = Session.getDefaultInstance(props,null);
	   MimeMessage mimemessage = new MimeMessage(session);
	   
	   try 
	   {
		mimemessage.setFrom(new InternetAddress(from));
		
		InternetAddress[] toAddress = new InternetAddress[to.length];
		
		for(int i = 0;i<to.length;++i)
		{
			toAddress[i] = new InternetAddress(to[i]);
		}
		
		for(int i=0;i<toAddress.length;++i)
		{
			mimemessage.setRecipient(Message.RecipientType.TO, toAddress[i]);
		}
		
		mimemessage.setSubject("mail using apI");
		mimemessage.setText(message);
		
		Transport transport = session.getTransport("smtp");
		transport.connect(host,from,password);
		transport.sendMessage(mimemessage, mimemessage.getAllRecipients());
		transport.close();
		return true;
	   } 
	   catch (MessagingException e) 
           {
		JOptionPane.showMessageDialog(null, e.toString());
	   }
	   
	   return false;
   }
}

