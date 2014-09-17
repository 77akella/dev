package org.hh.email.bp.impl;

import java.util.Map;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.apache.log4j.Logger;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.hh.email.bp.EmailSenderBP;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.ui.velocity.VelocityEngineUtils;

public class EmailSenderBPImpl implements EmailSenderBP {

    private static final String TEMPLATE_BASE_PATH = "org/hh/email/resources/";
    private Logger log = Logger.getLogger(getClass());
    private VelocityEngine velocityEngine;
    private SimpleMailMessage templateMessage;
    private JavaMailSenderImpl mailSender;
    private boolean suppressSending = false;

    public void setSuppressSending(boolean suppressSending) {
        this.suppressSending = suppressSending;
    }

    public void setMailSender(JavaMailSenderImpl mailSender) {
        this.mailSender = mailSender;
    }

    public void setTemplateMessage(SimpleMailMessage templateMessage) {
        this.templateMessage = templateMessage;
    }

    public void setVelocityEngine(VelocityEngine velocityEngine) {
        this.velocityEngine = velocityEngine;
    }

    @Override
    public void sendEmailToUser(String email, String subject, String templateName, Map<String, String> templateParameters) {
        try {
            String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, TEMPLATE_BASE_PATH + templateName, "UTF-8", templateParameters);

            log.info("Sending email: " + subject + "\n" + text);

            if (!suppressSending) {
                SimpleMailMessage msg = new SimpleMailMessage(templateMessage);
                msg.setTo(email);
                msg.setSubject(subject);
                msg.setText(text);
                mailSender.send(msg);
                log.info("Message sent");
            } else {
                log.info("Message suppressed");
            }
        } catch (VelocityException e) {
            throw new RuntimeException("Cannot send email", e);
        }
    }

    public boolean isValidEmailAddress(String email) {
    	   boolean result = true;
    	   try {
    	      InternetAddress emailAddr = new InternetAddress(email);
    	      emailAddr.validate();
    	   } catch (AddressException ex) {
    	      result = false;
    	   }
    	   return result;
    	}
}
