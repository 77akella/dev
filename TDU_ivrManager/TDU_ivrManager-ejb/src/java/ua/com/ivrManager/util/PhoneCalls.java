/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.util;

import java.util.Collections;
import java.util.Comparator;
import ua.com.ivrManager.ejb.entity.DialRule;
import ua.com.ivrManager.ejb.entity.DialRuleEntery;

/**
 *
 * @author Artem
 */
public class PhoneCalls {
    private static final Comparator<DialRuleEntery> comparatorByDnisLength=new Comparator<DialRuleEntery>(){
        @Override
        public int compare(DialRuleEntery o1, DialRuleEntery o2) {
            if (o1.getStartsWith().length() > o2.getStartsWith().length()) {
                return -1;
            } else if (o1.getStartsWith().length() < o2.getStartsWith().length()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public static String formatDnis(String dnis,DialRule dialRule){
        if(dnis==null) return dnis;
        if(dialRule==null) return dnis.trim();
        dnis.trim();
        Collections.sort(dialRule.getDialRuleEnteries(), comparatorByDnisLength);
        for(DialRuleEntery dialRuleEntery:dialRule.getDialRuleEnteries()){
            if(dnis.length()==dialRuleEntery.getDnisLength()&&(dialRuleEntery.getStartsWith()==null||dnis.startsWith(dialRuleEntery.getStartsWith()))){
                dnis=dialRuleEntery.getAddToStart()==null?"":dialRuleEntery.getAddToStart()+dnis.substring(dialRuleEntery.getCutFromStart());
                break;
            }
        }
        return dnis;
    }
}
