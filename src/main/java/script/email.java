package script;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class email {
    public static void main(String[] args) {


        String meuemail = "anddessa01@gmail.com";
        String minhasenha = "qcydtpzrckdozvdc";
        SimpleEmail email=new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(meuemail, minhasenha));
        email.setSSLOnConnect(true);
        try {
            email.setFrom(meuemail);
            email.setSubject("Pipeline notificação");
            email.setMsg("Pipeline executado!");
            email.addTo("andressadepaulaandrade@gmail.com");
            email.send();
            System.out.println("enviado!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
