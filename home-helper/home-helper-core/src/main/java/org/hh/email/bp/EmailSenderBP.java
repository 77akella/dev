package org.hh.email.bp;

import java.util.Map;

public interface EmailSenderBP {
    public void sendEmailToUser(String email, String subject, String templateName, Map<String, String> templateParameters);
    public boolean isValidEmailAddress(String email);
}
