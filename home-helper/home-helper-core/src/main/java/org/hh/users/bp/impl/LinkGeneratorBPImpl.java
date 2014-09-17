package org.hh.users.bp.impl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.hh.users.bp.LinkGeneratorBP;


public class LinkGeneratorBPImpl implements LinkGeneratorBP {

    private static byte SAULT = 86;
    private static String DEFAULT_DUST = "||This is the message to you :-)||";
    private Logger log = Logger.getLogger(getClass());
    private String baseConfirmUrl;
    private int linkValidityPeriod; //in days!

    public void setLinkValidityPeriod(int linkValidityPeriod) {
        this.linkValidityPeriod = linkValidityPeriod;
    }

    public void setBaseConfirmUrl(String baseConfirmUrl) {
        this.baseConfirmUrl = baseConfirmUrl;
    }

    @Override
    public String generateVerificationKey(String email, Date latestVerificationDate) {
        String verificationKey = "";
        byte[] bytes = null;

        //Generating basic String    	
        verificationKey = email + DEFAULT_DUST + latestVerificationDate.toString();
        log.info("Generating basic String: " + verificationKey);

        //Get byte array from basic String
        try {
            bytes = verificationKey.getBytes("UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("Get byte array from basic String: " + bytes);

        //xor our byte array with SAULT
        bytes = xorByteArray(bytes);

        //getting HEX String form xored byte array
        String tempString = "";
        String result = "";
        for (byte c : bytes) {
            tempString = Integer.toHexString(c);
            result += tempString;
        }
        log.info("getting HEX String form xored byte array: " + result);

        return baseConfirmUrl + result;
    }

    @Override
    public String getEmailFromLink(String verificationKey) throws Exception {

        //getting byte array from HEX String + decoding to java String
        int len = verificationKey.length();
        byte[] bytes = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            bytes[i / 2] = (byte) ((Character.digit(verificationKey.charAt(i), 16) << 4)
                    + Character.digit(verificationKey.charAt(i + 1), 16));
        }
        log.info("getting byte array from HEX String + decoding to java String: " + bytes);

        //xor our byte array with SAULT
        bytes = xorByteArray(bytes);

        //constructing full String from decoded byte array
        String fullReturnString = null;
        try {
            fullReturnString = new String(bytes, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("constructing full String from decoded byte array: " + fullReturnString);
        String returneEmail = "";

        for (int i = 0; i < fullReturnString.length(); i++) {
            if (fullReturnString.charAt(i) == '|') {
                break;
            }
            returneEmail += fullReturnString.charAt(i);
        }

        return returneEmail;
    }

    private byte[] xorByteArray(byte[] bytes) {
        //xor our byte array with SAULT
        for (byte c : bytes) {
            c = (byte) (c ^ SAULT);
        }
        log.info("xor our byte array with SAULT: " + bytes);
        return bytes;
    }

}
