/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ua.com.ivrManager.ejb.entity.Attribute;
import ua.com.ivrManager.ejb.entity.CallFlow;
import ua.com.ivrManager.ejb.entity.CallFlowNode;
import ua.com.ivrManager.ejb.entity.Var;

/**
 *
 * @author Artem
 */
public final class BasicVXML {

    /*
     * CallFlow Edit/View mode; BasicVXML -> minimum atributes, dafault values;
     */
    public static final String MODE_BASIC="basic";
    /*
     * List All scenario Edit/View Modes;
     */
    public static final ArrayList<String> MODES;
    static {
       MODES=new java.util.ArrayList<String>();
       MODES.add(MODE_BASIC);
    }

    private static final String TYPE_PARAM_CHILD_TYPES="childTypes";
    private static final String TYPE_PARAM_MAX_CHILDS="maxChilds";
    private static final String TYPE_PARAM_ATTRIBUTES="atributes";
    private static final String TYPE_PARAM_VARIABLES="variables";

    public static final String ATTR_TYPE_AUDIO="audioFile";
    public static final String ATTR_TYPE_DTMF="dtmf";
    public static final List<String> ATTR_TYPE_DTMF_VALUES;
    static {
        ATTR_TYPE_DTMF_VALUES=new ArrayList<String>(12);
        ATTR_TYPE_DTMF_VALUES.add("1");
        ATTR_TYPE_DTMF_VALUES.add("2");
        ATTR_TYPE_DTMF_VALUES.add("3");
        ATTR_TYPE_DTMF_VALUES.add("4");
        ATTR_TYPE_DTMF_VALUES.add("5");
        ATTR_TYPE_DTMF_VALUES.add("6");
        ATTR_TYPE_DTMF_VALUES.add("7");
        ATTR_TYPE_DTMF_VALUES.add("8");
        ATTR_TYPE_DTMF_VALUES.add("9");
        ATTR_TYPE_DTMF_VALUES.add("0");
        ATTR_TYPE_DTMF_VALUES.add("*");
        ATTR_TYPE_DTMF_VALUES.add("#");
    }

    public static final String ATTR_TYPE_TEXT="text";
    public static final String ATTR_TYPE_TEXTAREA="textArea";
    public static final String ATTR_TYPE_WRAPUP_CODE="wrapUp";
    public static final String ATTR_TYPE_TIMEOUT="attrTimeout";
    public static final String ATTR_TYPE_COUNT="attrCount";
    public static final String ATTR_TYPE_ID="id";
    public static final String ATTR_TYPE_LANGUAGE="language";
    public static final String[] BUNDLE_LANGUAGES;
    static {
        BUNDLE_LANGUAGES=new String[2];
        BUNDLE_LANGUAGES[0]="ru";
        BUNDLE_LANGUAGES[1]="en";
    }
    public static final String ATTR_TYPE_MONEY="money";
    public static final String[] BUNDLE_MONEY_TYPE;
    static {
        BUNDLE_MONEY_TYPE=new String[3];
        BUNDLE_MONEY_TYPE[0]="money1";
        BUNDLE_MONEY_TYPE[1]="money2";
        BUNDLE_MONEY_TYPE[2]="money3";
    }

    public static final String ATTRIBUTE_AUDIO_PROMPT="prompt";
    public static final String ATTRIBUTE_AUDIO_NOINPUT="noimput";
    public static final String ATTRIBUTE_AUDIO_NOMATCH="nomatch";
    public static final String ATTRIBUTE_AUDIO_MOH="MOH";
    public static final String ATTRIBUTE_COUNT_NOINPUT="noimputCount";
    public static final String ATTRIBUTE_COUNT_NOMATCH="nomatchCount";
    public static final String ATTRIBUTE_DTMF_OPTION="dtmfOption";
    public static final String ATTRIBUTE_DTMF_INPUT_LENGTH="dtmfLength";
    public static final String ATTRIBUTE_DNIS="dnis";
    public static final String ATTRIBUTE_TIMEOUT="timeout";
    public static final String ATTRIBUTE_GOTO="goto";
    public static final String ATTRIBUTE_WRAPUP_CODE="wrapUpCode";
    public static final String ATTRIBUTE_BUNDLE_PLAY_AUDIO_BEFORE="bundleAudioBefore";
    public static final String ATTRIBUTE_BUNDLE_PLAY_AUDIO_AFTER="bundleAudioAfter";
    public static final String ATTRIBUTE_BUNDLE_PLAY_MONEY_TYPE="bundleMoneyType";
    public static final String ATTRIBUTE_BUNDLE_PLAY_LANGUAGE="bundleLang";


    public static final String VARIABLE_FIELD_VALUE="value";
    public static final String VARIABLE_FIELD_NOINPUTCOUNT="noinputcount";
    public static final String VARIABLE_FIELD_NOMATCHCOUNT="nomatchcount";
    public static final String VARIABLE_FIELD_CONTACTFIELD="contactFiled";

    /*
     * Names of all primary basic Types. Value must be unique.
     */
    public static final String TYPE_BASIC_ROOT_NAME="basicRoot";
    public static final String TYPE_BASIC_END_NAME="basicEnd";
    public static final String TYPE_BASIC_MENU_NAME="basicMenu";
    public static final String TYPE_BASIC_MENU_OPTION_NAME="basicMenuOption";
    public static final String TYPE_BASIC_FORM_NAME="basicForm";
    public static final String TYPE_BASIC_TRANSFER_NAME="basicTransfer";
    public static final String TYPE_BASIC_GOTO_NAME="basicGoto";
    public static final String TYPE_BASIC_AUDIO_NAME="basicAudio";
    public static final String TYPE_BASIC_DISCONNECT_NAME="basicDisconnect";
    public static final String TYPE_BASIC_WRAPUP_NAME="basicWrapUp";
    public static final String TYPE_OUT_SAYMONEY_NAME="outSayMoney";
    public static final String TYPE_OUT_SAYDATE_NAME="outSayDate";
    public static final String TYPE_OUT_SAYNUMBER_NAME="outSayNumber";

    public static final List<String> TYPES_BASIC_PRIMARY;
    static {
        TYPES_BASIC_PRIMARY=new ArrayList<String>();

//        TYPES_BASIC_PRIMARY.add(TYPE_BASIC_ROOT_NAME);

        TYPES_BASIC_PRIMARY.add(TYPE_BASIC_MENU_NAME);
        TYPES_BASIC_PRIMARY.add(TYPE_BASIC_AUDIO_NAME);
        TYPES_BASIC_PRIMARY.add(TYPE_BASIC_WRAPUP_NAME);
//        TYPES_BASIC_PRIMARY.add(TYPE_BASIC_FORM_NAME);
        TYPES_BASIC_PRIMARY.add(TYPE_BASIC_TRANSFER_NAME);
        TYPES_BASIC_PRIMARY.add(TYPE_BASIC_GOTO_NAME);
        TYPES_BASIC_PRIMARY.add(TYPE_BASIC_DISCONNECT_NAME);
        TYPES_BASIC_PRIMARY.add(TYPE_OUT_SAYMONEY_NAME);
        TYPES_BASIC_PRIMARY.add(TYPE_OUT_SAYDATE_NAME);
        TYPES_BASIC_PRIMARY.add(TYPE_OUT_SAYNUMBER_NAME);
    }


    /*
     * Describes specific types
     */
    public static final HashMap<String,Object> TYPE_BASIC_ROOT;
    static {
        List<Attribute> atributes = new ArrayList<Attribute>();

        List<Var> variables =new ArrayList<Var>();


        List<String> childTypes =new ArrayList<String>();
        childTypes.addAll(TYPES_BASIC_PRIMARY);

        TYPE_BASIC_ROOT=new HashMap<String, Object>();
        TYPE_BASIC_ROOT.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_BASIC_ROOT.put(TYPE_PARAM_MAX_CHILDS, 1);
        TYPE_BASIC_ROOT.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_BASIC_ROOT.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPE_BASIC_END;
    static {
        List<Attribute> atributes = new ArrayList<Attribute>();

        List<Var> variables =new ArrayList<Var>();

        List<String> childTypes =new ArrayList<String>();

        TYPE_BASIC_END=new HashMap<String, Object>();
        TYPE_BASIC_END.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_BASIC_END.put(TYPE_PARAM_MAX_CHILDS, 0);
        TYPE_BASIC_END.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_BASIC_END.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPE_BASIC_MENU;
    static {
        List<Attribute> atributes = new ArrayList<Attribute>();
        atributes.add(new Attribute(ATTRIBUTE_AUDIO_PROMPT, "", ATTR_TYPE_AUDIO));
        atributes.add(new Attribute(ATTRIBUTE_AUDIO_NOINPUT, "", ATTR_TYPE_AUDIO));
        atributes.add(new Attribute(ATTRIBUTE_COUNT_NOINPUT, "3", ATTR_TYPE_COUNT));
        atributes.add(new Attribute(ATTRIBUTE_AUDIO_NOMATCH, "", ATTR_TYPE_AUDIO));
        atributes.add(new Attribute(ATTRIBUTE_COUNT_NOMATCH, "3", ATTR_TYPE_COUNT));

        List<Var> variables =new ArrayList<Var>();
        variables.add(new Var(VARIABLE_FIELD_VALUE,TYPE_BASIC_MENU_NAME,"",false));
        variables.add(new Var(VARIABLE_FIELD_NOINPUTCOUNT,TYPE_BASIC_MENU_NAME,"",false));
        variables.add(new Var(VARIABLE_FIELD_NOMATCHCOUNT,TYPE_BASIC_MENU_NAME,"",false));

        List<String> childTypes =new ArrayList<String>();
        childTypes.add(TYPE_BASIC_MENU_OPTION_NAME);
        TYPE_BASIC_MENU=new HashMap<String, Object>();
        TYPE_BASIC_MENU.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_BASIC_MENU.put(TYPE_PARAM_MAX_CHILDS, 12);
        TYPE_BASIC_MENU.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_BASIC_MENU.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPE_BASIC_MENU_OPTION;

    static {
        List<Attribute> atributes = new ArrayList<Attribute>();
        atributes.add(new Attribute(ATTRIBUTE_DTMF_OPTION, "", ATTR_TYPE_DTMF));

        List<Var> variables =new ArrayList<Var>();

        List<String> childTypes =new ArrayList<String>();
        childTypes.addAll(TYPES_BASIC_PRIMARY);
        TYPE_BASIC_MENU_OPTION=new HashMap<String, Object>();
        TYPE_BASIC_MENU_OPTION.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_BASIC_MENU_OPTION.put(TYPE_PARAM_MAX_CHILDS, 1);
        TYPE_BASIC_MENU_OPTION.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_BASIC_MENU_OPTION.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPE_BASIC_FORM;
    static {
        List<Attribute> atributes = new ArrayList<Attribute>();
        atributes.add(new Attribute(ATTRIBUTE_AUDIO_PROMPT, "", ATTR_TYPE_AUDIO));
        atributes.add(new Attribute(ATTRIBUTE_AUDIO_NOINPUT, "", ATTR_TYPE_AUDIO));
        atributes.add(new Attribute(ATTRIBUTE_DTMF_INPUT_LENGTH, "2", ATTR_TYPE_TIMEOUT));
        List<Var> variables =new ArrayList<Var>();
        variables.add(new Var(VARIABLE_FIELD_VALUE,TYPE_BASIC_FORM_NAME,"", false));

        List<String> childTypes =new ArrayList<String>();
        childTypes.addAll(TYPES_BASIC_PRIMARY);
        TYPE_BASIC_FORM=new HashMap<String, Object>();
        TYPE_BASIC_FORM.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_BASIC_FORM.put(TYPE_PARAM_MAX_CHILDS, 1);
        TYPE_BASIC_FORM.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_BASIC_FORM.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPE_BASIC_TRANSFER;
    static {
        List<Attribute> atributes = new ArrayList<Attribute>();
        atributes.add(new Attribute(ATTRIBUTE_DNIS, "", ATTR_TYPE_TEXT));
        atributes.add(new Attribute(ATTRIBUTE_TIMEOUT, "", ATTR_TYPE_TIMEOUT));
//        atributes.add(new Attribute(ATTRIBUTE_AUDIO_MOH, "", ATTR_TYPE_AUDIO));
        atributes.add(new Attribute(ATTRIBUTE_AUDIO_PROMPT, "", ATTR_TYPE_AUDIO));
        List<Var> variables =new ArrayList<Var>();
        variables.add(new Var(VARIABLE_FIELD_VALUE,TYPE_BASIC_TRANSFER_NAME,"", false));

        List<String> childTypes =new ArrayList<String>();
//        childTypes.addAll(TYPES_BASIC_PRIMARY);
        TYPE_BASIC_TRANSFER=new HashMap<String, Object>();
        TYPE_BASIC_TRANSFER.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_BASIC_TRANSFER.put(TYPE_PARAM_MAX_CHILDS, 0);
        TYPE_BASIC_TRANSFER.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_BASIC_TRANSFER.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPE_BASIC_GOTO;
    static {
        List<Attribute> atributes = new ArrayList<Attribute>();
        atributes.add(new Attribute(ATTRIBUTE_GOTO, null, ATTR_TYPE_ID));
        List<Var> variables =new ArrayList<Var>();

        List<String> childTypes =new ArrayList<String>();
//        childTypes.addAll(TYPES_BASIC_PRIMARY);
        TYPE_BASIC_GOTO=new HashMap<String, Object>();
        TYPE_BASIC_GOTO.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_BASIC_GOTO.put(TYPE_PARAM_MAX_CHILDS, 0);
        TYPE_BASIC_GOTO.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_BASIC_GOTO.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPE_BASIC_AUDIO;

    static {
        List<Attribute> atributes = new ArrayList<Attribute>();
        atributes.add(new Attribute(ATTRIBUTE_AUDIO_PROMPT, null, ATTR_TYPE_AUDIO));

        List<Var> variables =new ArrayList<Var>();
        variables.add(new Var(VARIABLE_FIELD_VALUE,TYPE_BASIC_AUDIO_NAME,"", false));
        List<String> childTypes =new ArrayList<String>();
        childTypes.addAll(TYPES_BASIC_PRIMARY);
        TYPE_BASIC_AUDIO=new HashMap<String, Object>();
        TYPE_BASIC_AUDIO.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_BASIC_AUDIO.put(TYPE_PARAM_MAX_CHILDS, 1);
        TYPE_BASIC_AUDIO.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_BASIC_AUDIO.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPE_BASIC_DISCONNECT;

    static {
        List<Attribute> atributes = new ArrayList<Attribute>();

        List<Var> variables =new ArrayList<Var>();
//        variables.add(new Var(VARIABLE_FIELD_VALUE,TYPE_BASIC_AUDIO_NAME,"", false));
        List<String> childTypes =new ArrayList<String>();
//        childTypes.addAll(TYPES_BASIC_PRIMARY);
        TYPE_BASIC_DISCONNECT=new HashMap<String, Object>();
        TYPE_BASIC_DISCONNECT.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_BASIC_DISCONNECT.put(TYPE_PARAM_MAX_CHILDS, 0);
        TYPE_BASIC_DISCONNECT.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_BASIC_DISCONNECT.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPE_BASIC_WRAPUP;
    static {
        List<Attribute> atributes = new ArrayList<Attribute>();
        atributes.add(new Attribute(ATTRIBUTE_WRAPUP_CODE, null, ATTR_TYPE_WRAPUP_CODE));

        List<Var> variables =new ArrayList<Var>();

        List<String> childTypes =new ArrayList<String>();
        childTypes.addAll(TYPES_BASIC_PRIMARY);
        TYPE_BASIC_WRAPUP=new HashMap<String, Object>();
        TYPE_BASIC_WRAPUP.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_BASIC_WRAPUP.put(TYPE_PARAM_MAX_CHILDS, 1);
        TYPE_BASIC_WRAPUP.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_BASIC_WRAPUP.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPE_OUT_SAYMONEY;
    static {
        List<Attribute> atributes = new ArrayList<Attribute>();
        atributes.add(new Attribute(ATTRIBUTE_BUNDLE_PLAY_AUDIO_BEFORE, "", ATTR_TYPE_AUDIO));
        atributes.add(new Attribute(ATTRIBUTE_BUNDLE_PLAY_LANGUAGE, BUNDLE_LANGUAGES[0], ATTR_TYPE_LANGUAGE));
        atributes.add(new Attribute(ATTRIBUTE_BUNDLE_PLAY_MONEY_TYPE, BUNDLE_MONEY_TYPE[0], ATTR_TYPE_MONEY));
        atributes.add(new Attribute(ATTRIBUTE_BUNDLE_PLAY_AUDIO_AFTER, "", ATTR_TYPE_AUDIO));

        List<Var> variables =new ArrayList<Var>();
        variables.add(new Var(VARIABLE_FIELD_CONTACTFIELD,TYPE_OUT_SAYMONEY_NAME,"", true));
        variables.add(new Var(VARIABLE_FIELD_VALUE,TYPE_OUT_SAYMONEY_NAME,"", false));

        List<String> childTypes =new ArrayList<String>();
        childTypes.addAll(TYPES_BASIC_PRIMARY);
        TYPE_OUT_SAYMONEY=new HashMap<String, Object>();
        TYPE_OUT_SAYMONEY.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_OUT_SAYMONEY.put(TYPE_PARAM_MAX_CHILDS, 1);
        TYPE_OUT_SAYMONEY.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_OUT_SAYMONEY.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPE_OUT_SAYDATE;
    static {
        List<Attribute> atributes = new ArrayList<Attribute>();
        atributes.add(new Attribute(ATTRIBUTE_BUNDLE_PLAY_AUDIO_BEFORE, "", ATTR_TYPE_AUDIO));
        atributes.add(new Attribute(ATTRIBUTE_BUNDLE_PLAY_LANGUAGE, BUNDLE_LANGUAGES[0], ATTR_TYPE_LANGUAGE));
        atributes.add(new Attribute(ATTRIBUTE_BUNDLE_PLAY_AUDIO_AFTER, "", ATTR_TYPE_AUDIO));

        List<Var> variables =new ArrayList<Var>();
        variables.add(new Var(VARIABLE_FIELD_CONTACTFIELD,TYPE_OUT_SAYDATE_NAME,"", true));
        variables.add(new Var(VARIABLE_FIELD_VALUE,TYPE_OUT_SAYDATE_NAME,"", false));

        List<String> childTypes =new ArrayList<String>();
        childTypes.addAll(TYPES_BASIC_PRIMARY);
        TYPE_OUT_SAYDATE=new HashMap<String, Object>();
        TYPE_OUT_SAYDATE.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_OUT_SAYDATE.put(TYPE_PARAM_MAX_CHILDS, 1);
        TYPE_OUT_SAYDATE.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_OUT_SAYDATE.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPE_OUT_SAYNUMBER;
    static {
        List<Attribute> atributes = new ArrayList<Attribute>();
        atributes.add(new Attribute(ATTRIBUTE_BUNDLE_PLAY_AUDIO_BEFORE, "", ATTR_TYPE_AUDIO));
        atributes.add(new Attribute(ATTRIBUTE_BUNDLE_PLAY_LANGUAGE, BUNDLE_LANGUAGES[0], ATTR_TYPE_LANGUAGE));
        atributes.add(new Attribute(ATTRIBUTE_BUNDLE_PLAY_AUDIO_AFTER, "", ATTR_TYPE_AUDIO));

        List<Var> variables =new ArrayList<Var>();
        variables.add(new Var(VARIABLE_FIELD_CONTACTFIELD,TYPE_OUT_SAYNUMBER_NAME,"", true));
        variables.add(new Var(VARIABLE_FIELD_VALUE,TYPE_OUT_SAYNUMBER_NAME,"", false));

        List<String> childTypes =new ArrayList<String>();
        childTypes.addAll(TYPES_BASIC_PRIMARY);
        TYPE_OUT_SAYNUMBER=new HashMap<String, Object>();
        TYPE_OUT_SAYNUMBER.put(TYPE_PARAM_CHILD_TYPES, childTypes);
        TYPE_OUT_SAYNUMBER.put(TYPE_PARAM_MAX_CHILDS, 1);
        TYPE_OUT_SAYNUMBER.put(TYPE_PARAM_ATTRIBUTES, atributes);
        TYPE_OUT_SAYNUMBER.put(TYPE_PARAM_VARIABLES, variables);
    }

    public static final HashMap<String,Object> TYPES_MAP;

    static {
        TYPES_MAP=new HashMap<String, Object>();

        TYPES_MAP.put(TYPE_BASIC_ROOT_NAME,TYPE_BASIC_ROOT);
        TYPES_MAP.put(TYPE_BASIC_END_NAME,TYPE_BASIC_END);
        TYPES_MAP.put(TYPE_BASIC_MENU_NAME,TYPE_BASIC_MENU);
        TYPES_MAP.put(TYPE_BASIC_MENU_OPTION_NAME,TYPE_BASIC_MENU_OPTION);
        TYPES_MAP.put(TYPE_BASIC_FORM_NAME,TYPE_BASIC_FORM);
        TYPES_MAP.put(TYPE_BASIC_TRANSFER_NAME,TYPE_BASIC_TRANSFER);
        TYPES_MAP.put(TYPE_BASIC_GOTO_NAME,TYPE_BASIC_GOTO);
        TYPES_MAP.put(TYPE_BASIC_AUDIO_NAME,TYPE_BASIC_AUDIO);
        TYPES_MAP.put(TYPE_BASIC_DISCONNECT_NAME, TYPE_BASIC_DISCONNECT);
        TYPES_MAP.put(TYPE_BASIC_WRAPUP_NAME, TYPE_BASIC_WRAPUP);
        TYPES_MAP.put(TYPE_OUT_SAYMONEY_NAME, TYPE_OUT_SAYMONEY);
        TYPES_MAP.put(TYPE_OUT_SAYDATE_NAME, TYPE_OUT_SAYDATE);
        TYPES_MAP.put(TYPE_OUT_SAYNUMBER_NAME, TYPE_OUT_SAYNUMBER);
    }

    public static CallFlowNode editMode(CallFlowNode node, String type, String mode){
        if(!MODES.contains(mode)){
            throw new IllegalArgumentException("Mode "+mode+" not supported in editMode");
        }
        if(mode.equals(MODE_BASIC)){
            if(!TYPES_MAP.keySet().contains(type)){
                throw new IllegalArgumentException("Type "+type+" not supported with mode "+mode+" in editMode");
            }

            /*
             * Specific setting mode constructor
             */
//            if(type.equals(TYPE_BASIC_END)){
//                node.setType(type);
//                node.setMaxChilds(0);
//            }

            /*
             * Generic setting mode constructor
             */
            HashMap<String, Object> currentType = (HashMap<String, Object>) TYPES_MAP.get(type);
            node.setType(type);
            node.setChildTypes((List<String>) currentType.get(TYPE_PARAM_CHILD_TYPES));
            node.setMaxChilds((Integer) currentType.get(TYPE_PARAM_MAX_CHILDS));
//            node.setChildren(new ArrayList<CallFlowNode>());
            node=populateCallFlowNodeVariables(node,(List<Var>) currentType.get(TYPE_PARAM_VARIABLES));
            node=populateCallFlowNodeAttributes(node,(List<Attribute>) currentType.get(TYPE_PARAM_ATTRIBUTES));
            return node;
        }

        throw new IllegalArgumentException("Type "+type+" not supported with mode "+mode+" in editMode");
    }

    private static CallFlowNode populateCallFlowNodeVariables(CallFlowNode sn, List<Var> svList){
        if(svList==null){
            System.out.println("-------------null Vars in "+sn.getType());
            return sn;
        }
  //      int snId=sn.getFlowCountId();
        List<String> snSvNames= new ArrayList<String>();
        for(Var snSv:sn.getVars()){
                snSvNames.add(snSv.getType()+snSv.getDotName());
            }
        for(Var sv:svList){
                if(!snSvNames.contains(sv.getType()+sv.getDotName())){
                    sn.getVars().add(
                            new Var(
                                sv.getName(),
                                sv.getDotName(),
                                sv.getType(),
                                sv.getInitVal(),
                                sv.isValueFromContactList(),
                                sv.isSystem(),
                                sv.isUserDefined(),
                                sv.isReport()
                                )
                            );
                }
        }

        return sn;
    }

    private static CallFlowNode populateCallFlowNodeAttributes(CallFlowNode sn, List<Attribute> attList){
        if(attList==null){
            return sn;
        }
//        int snId=sn.getFlowCountId();
        List<String> snAttrNames= new ArrayList<String>();
        for(Attribute snSv:sn.getAttributes()){
                snAttrNames.add(snSv.getName());
            }
        for(Attribute at:attList){
                if(!snAttrNames.contains(at.getName())){
                    sn.getAttributes().add(new Attribute(at.getName(), at.getVal(), at.getType()));
                }
        }

        return sn;
    }

//    public static List<String> checkCallFlowBeforeSave(CallFlow callFlow){
//        List<String> errors=new ArrayList<String>();
//
//
//        return errors;
//    }
//
//    private static String checkCallFlowNodeBeforeSave(CallFlowNode node){
//        if(node.getType().equals(TYPE_BASIC_ROOT_NAME)){
//            if(node.getChildren().size()!=1){
//                return "CallFlowError_"+node.getType()+"_mustHave_1_child";
//            }
//        }
//
//        if(node.getType().equals(TYPE_BASIC_MENU_NAME)){
//                        HashMap<String,String> options = new HashMap<String,String>();
//                        for(CallFlowNode option:node.getChildren()){
//                            if(option.getType().equals(TYPE_BASIC_MENU_OPTION_NAME)){
//                                for(Attribute dtmf:option.getAttributes()){
//                                    if(dtmf.getName().equals(ATTRIBUTE_DTMF_OPTION)){
//                                        String nextId;
//                                        if(dtmf.getVal().isEmpty()){
//                                            throw new IllegalArgumentException("Some option of node Menu "+node.getName()+" is Empty. You must set value");
//                                        }
//                                        if(options.containsKey(dtmf.getVal())){
//                                            throw new IllegalArgumentException("Duplicate option ("+dtmf.getVal()+") of node Menu "+node.getName()+". Please, set valid value");
//                                        }
//                                        if(option.getChildren().isEmpty()){
//                                            nextId="exit";
//                                        }else{
//                                            nextId=option.getChildren().get(0).getType()+"_"+option.getChildren().get(0).getFlowCountId();
//                                        }
//                                            options.put(dtmf.getVal(), nextId );
//                                    }
//                                }
//                            }
//                        }
//                    HashMap<String,String> audios= new HashMap<String,String>();
//                    Long resultVar = null;
//                    Long noInputCountVar = null;
//                    Long noMatchCountVar = null;
//                    String noInputCountAttr="";
//                    String noMatchCountAttr="";
//                        for(Attribute attr:node.getAttributes()){
//                            if(attr.getName().equals(ATTRIBUTE_AUDIO_PROMPT)){
//                                audios.put(ATTRIBUTE_AUDIO_PROMPT, attr.getVal());
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_AUDIO_NOINPUT)){
//                                audios.put(ATTRIBUTE_AUDIO_NOINPUT, attr.getVal());
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_AUDIO_NOMATCH)){
//                                audios.put(ATTRIBUTE_AUDIO_NOMATCH, attr.getVal());
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_COUNT_NOINPUT)){
//                                noInputCountAttr=attr.getVal();
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_COUNT_NOMATCH)){
//                                noMatchCountAttr=attr.getVal();
//                            }
//                        }
//                        if(audios.get(ATTRIBUTE_AUDIO_PROMPT)==null||audios.get(ATTRIBUTE_AUDIO_PROMPT).isEmpty()){
//                            throw new IllegalArgumentException("Audio Prompt for node Menu "+node.getName()+" is Empty. You must set value");
//                        }
//        }
//
//        if(node.getType().equals(TYPE_BASIC_FORM_NAME)){
//                    HashMap<String,String> audios= new HashMap<String,String>();
//                    String dtmfLength = null;
//                    Long resultVar=null;
//                        for(Attribute attr:node.getAttributes()){
//                            if(attr.getName().equals(ATTRIBUTE_AUDIO_PROMPT)){
//                                audios.put(ATTRIBUTE_AUDIO_PROMPT, attr.getVal());
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_AUDIO_NOINPUT)){
//                                audios.put(ATTRIBUTE_AUDIO_NOINPUT, attr.getVal());
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_DTMF_INPUT_LENGTH)){
//                                dtmfLength=attr.getVal();
//                            }
//                        }
//                        if(audios.get(ATTRIBUTE_AUDIO_PROMPT).isEmpty()){
//                            throw new IllegalArgumentException("Audio Prompt for node Form "+node.getName()+" is Empty. You must set value");
//                        }
//                        if(dtmfLength==null||dtmfLength.isEmpty()){
//                            throw new IllegalArgumentException("Length of input data is not set for node Menu "+node.getName()+" is Empty. You must set value");
//                        }
//                        for(Var v:node.getVars()){
//                            if(v.getDotName().equals(VARIABLE_FIELD_VALUE)){
//                                resultVar=v.getId();
//                            }
//                        }
//        }
//
//        if(node.getType().equals(TYPE_BASIC_TRANSFER_NAME)){
//                    String dnis = "";
//                    String audioPrompt="";
////                    String audioMOH="";
//                    int timeout=40;
//                    Long resultVar = null;
//                        for(Attribute attr:node.getAttributes()){
//                            if(attr.getName().equals(ATTRIBUTE_AUDIO_PROMPT)){
//                                audioPrompt=attr.getVal();
//                            }
////                            if(attr.getName().equals(ATTRIBUTE_AUDIO_MOH)){
////                                audioMOH=attr.getVal();
////                            }
//                            if(attr.getName().equals(ATTRIBUTE_DNIS)){
//                                dnis=attr.getVal();
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_TIMEOUT)&&!attr.getVal().isEmpty()){
//                                timeout=Integer.valueOf(attr.getVal());
//                            }
//                        }
//                        if(dnis.isEmpty()){
//                            throw new IllegalArgumentException("DNIS for node Form "+node.getName()+" is Empty. You must set value");
//                        }
//        }
//
//        if(node.getType().equals(TYPE_BASIC_GOTO_NAME)){
//                    String gotoId = "";
//                        for(Attribute attr:node.getAttributes()){
//                            if(attr.getName().equals(ATTRIBUTE_GOTO)){
//                                gotoId=attr.getVal();
//                            }
//                        }
//                        if(gotoId.isEmpty()){
//                            throw new IllegalArgumentException("Goto Attribute for node Goto "+node.getName()+" is Empty. You must set value");
//                        }
//        }
//
//        if(node.getType().equals(TYPE_BASIC_AUDIO_NAME)){
//                    String audio = "";
//                    Long resultVar = null;
//                        for(Attribute attr:node.getAttributes()){
//                            if(attr.getName().equals(ATTRIBUTE_AUDIO_PROMPT)){
//                                audio=attr.getVal();
//                            }
//                        }
//                        for(Var v:node.getVars()){
//                            if(v.getDotName().equals(VARIABLE_FIELD_VALUE)){
//                                resultVar=v.getId();
//                            }
//                        }
//                        if(audio==null||audio.isEmpty()){
//                            throw new IllegalArgumentException("Audio Prompt for node Audio "+node.getName()+" is Empty. You must set value");
//                        }
//        }
//
//        if(node.getType().equals(TYPE_BASIC_WRAPUP_NAME)){
//                    String  wrapUpCode = null;
//                        for(Attribute attr:node.getAttributes()){
//                            if(attr.getName().equals(ATTRIBUTE_WRAPUP_CODE)){
//                                wrapUpCode=attr.getVal();
//                            }
//                        }
//                        if(wrapUpCode==null||wrapUpCode.isEmpty()){
//                            throw new IllegalArgumentException("Wrap Up Code for "+node.getName()+" is Empty. You must set value");
//                        }
//        }
//
//
//        if(node.getType().equals(TYPE_OUT_SAYMONEY_NAME)){
//                    Long varId = null;
//                    String lang="";
//                    String audioBefore="";
//                    String audioAfter="";
//                    String currency="";
//                    Long resultVar = null;
//                        for(Attribute attr:node.getAttributes()){
//                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_LANGUAGE)){
//                                lang=attr.getVal();
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_MONEY_TYPE)){
//                                currency=attr.getVal();
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_AUDIO_BEFORE)&&attr.getVal()!=null){
//                                audioBefore=attr.getVal();
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_AUDIO_AFTER)&&attr.getVal()!=null){
//                                audioAfter=attr.getVal();
//                            }
//                        }
//                        for(Var v:node.getVars()){
//                            if(v.getType().equals(TYPE_OUT_SAYMONEY_NAME)&&v.getDotName().equals(VARIABLE_FIELD_CONTACTFIELD)){
//                                varId=v.getId();
//                            }
//                            if(v.getDotName().equals(VARIABLE_FIELD_VALUE)){
//                                resultVar=v.getId();
//                            }
//                        }
//                        if(lang.isEmpty()){
//                            throw new IllegalArgumentException("Language Attribute for node SayMoney "+node.getName()+" is Empty. You must set value");
//                        }
//                        if(currency.isEmpty()){
//                            throw new IllegalArgumentException("Currency Attribute for node SayMoney "+node.getName()+" is Empty. You must set value");
//                        }
//                        if(getBundleLanguagesURL(lang).isEmpty()){
//                            throw new IllegalArgumentException("Language ["+lang+"] for node SayMoney "+node.getName()+" is not supported. Please, contact Support TDU");
//                        }
//        }
//
//        if(node.getType().equals(TYPE_OUT_SAYDATE_NAME)){
//                    Long varId = null;
//                    String lang="";
//                    String audioBefore="";
//                    String audioAfter="";
//                    Long resultVar = null;
//                        for(Attribute attr:node.getAttributes()){
//                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_LANGUAGE)){
//                                lang=attr.getVal();
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_AUDIO_BEFORE)){
//                                audioBefore=attr.getVal();
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_AUDIO_AFTER)){
//                                audioAfter=attr.getVal();
//                            }
//                        }
//                        for(Var v:node.getVars()){
//                            if(v.getType().equals(TYPE_OUT_SAYDATE_NAME)&&v.getDotName().equals(VARIABLE_FIELD_CONTACTFIELD)){
//                                varId=v.getId();
//                            }
//                            if(v.getDotName().equals(VARIABLE_FIELD_VALUE)){
//                                resultVar=v.getId();
//                            }
//                        }
//                        if(lang.isEmpty()){
//                            throw new IllegalArgumentException("Language Attribute for node SayDate "+node.getName()+" is Empty. You must set value");
//                        }
//                        if(getBundleLanguagesURL(lang).isEmpty()){
//                            throw new IllegalArgumentException("Language ["+lang+"] for node SayDate "+node.getName()+" is not supported. Please, contact Support TDU");
//                        }
//        }
//
//        if(node.getType().equals(TYPE_OUT_SAYNUMBER_NAME)){
//                    Long varId = null;
//                    String lang="";
//                    String audioBefore="";
//                    String audioAfter="";
//                    Long resultVar = null;
//                        for(Attribute attr:node.getAttributes()){
//                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_LANGUAGE)){
//                                lang=attr.getVal();
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_AUDIO_BEFORE)){
//                                audioBefore=attr.getVal();
//                            }
//                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_AUDIO_AFTER)){
//                                audioAfter=attr.getVal();
//                            }
//                        }
//                        for(Var v:node.getVars()){
//                            if(v.getType().equals(TYPE_OUT_SAYNUMBER_NAME)&&v.getDotName().equals(VARIABLE_FIELD_CONTACTFIELD)){
//                                varId=v.getId();
//                            }
//                            if(v.getDotName().equals(VARIABLE_FIELD_VALUE)){
//                                resultVar=v.getId();
//                            }
//                        }
//                        if(lang.isEmpty()){
//                            throw new IllegalArgumentException("Language Attribute for node SayNumber "+node.getName()+" is Empty. You must set value");
//                        }
//                        if(getBundleLanguagesURL(lang).isEmpty()){
//                            throw new IllegalArgumentException("Language ["+lang+"] for node SayNumber "+node.getName()+" is not supported. Please, contact Support TDU");
//                        }
//        }
//    }
//
    public static String generateVXML(CallFlow callFlow){

         StringBuilder vxmlNodesText=new StringBuilder();
                vxmlNodesText.append(generateVXMLfromNode(callFlow.getFlowNode()));
                vxmlNodesText
                        .append("<form id=\"exit\">\n")
                        .append("     <block>\n")
                        .append("         <log expr=\"'disconnectiong call'\" /> \n")
                        .append("         <disconnect/>\n")
                        .append("         <log expr=\"'disconnected call'\" /> \n")
                        .append("     </block>\n")
                        .append("</form>\n")
                        .append("<catch event=\"connection.disconnect connection.disconnect.hangup\">\n")
                        .append("         <log expr=\"'call disconnected. sending data'\" /> \n")
                        .append("         <data method=\"post\" src=\"Submit\" namelist=\"session___dnis results contactId callFlowId contactListId interId campaignId wrapUpCode sessionId session___aai session___ani session___protocolname session___protocolversion session___uui session___calltag session___channel session___vpcalledextension session___vpcoveragereason session___vpcoveragetype session___vprdnis redirectinfo___uri redirectinfo___presentationinfo redirectinfo___screeninginfo redirectinfo___reason session___sharedmode shareduui___id shareduui___value session___sessionlabel session___sipcallid session___mediatype session___videoenabled session___videocodec session___videoformat session___videowidth session___videoheight session___videofps session___videobitrate session___videonearfmtp session___videofarfmtp session___ucid session___conversefirst session___conversesecond\" />\n")
                        .append("         <log expr=\"'data sent.exiting'\" /> \n")
                        .append("         <exit />\n")
                        .append("</catch>\n")
                        .append("<catch event=\"error\">\n")
                        .append("     <log expr=\"'event '+_event+': msg '+_message\" />\n")
                        .append("     <var name=\"level\" expr=\"'error'\"/>\n")
                        .append("     <var name=\"src\" expr=\"'vxml'\"/>\n")
                        .append("     <data method=\"post\" src=\"Logger\" namelist=\"results src level _event _message callFlowId contactId contactListId interId campaignId wrapUpCode sessionId  session___aai session___ani session___dnis session___protocolname session___protocolversion session___uui session___calltag session___channel session___vpcalledextension session___vpcoveragereason session___vpcoveragetype session___vprdnis redirectinfo___uri redirectinfo___presentationinfo redirectinfo___screeninginfo redirectinfo___reason session___sharedmode shareduui___id shareduui___value session___sessionlabel session___sipcallid session___mediatype session___videoenabled session___videocodec session___videoformat session___videowidth session___videoheight session___videofps session___videobitrate session___videonearfmtp session___videofarfmtp session___ucid session___conversefirst session___conversesecond\" />\n")
                        .append("     <disconnect />\n")
                        .append("</catch>\n")
                        .append("</vxml>");


        return vxmlNodesText.toString();
    }

    public static String generateVXMLfromNode(CallFlowNode node){
String form="";

        if(node.getType().equals(TYPE_BASIC_ROOT_NAME)){
            form="\n";
        }

        if(node.getType().equals(TYPE_BASIC_MENU_NAME)){
                        HashMap<String,String> options = new HashMap<String,String>();
                        for(CallFlowNode option:node.getChildren()){
                            if(option.getType().equals(TYPE_BASIC_MENU_OPTION_NAME)){
                                for(Attribute dtmf:option.getAttributes()){
                                    if(dtmf.getName().equals(ATTRIBUTE_DTMF_OPTION)){
                                        String nextId;
                                        if(dtmf.getVal().isEmpty()){
                                            throw new IllegalArgumentException("Some option of node Menu "+node.getName()+" is Empty. You must set value");
                                        }
                                        if(options.containsKey(dtmf.getVal())){
                                            throw new IllegalArgumentException("Duplicate option ("+dtmf.getVal()+") of node Menu "+node.getName()+". Please, set valid value");
                                        }
                                        if(option.getChildren().isEmpty()){
                                            nextId="exit";
                                        }else{
                                            nextId=option.getChildren().get(0).getType()+"_"+option.getChildren().get(0).getFlowCountId();
                                        }
                                            options.put(dtmf.getVal(), nextId );
                                    }
                                }
                            }
                        }
                    HashMap<String,String> audios= new HashMap<String,String>();
                    Long resultVar = null;
                    Long noInputCountVar = null;
                    Long noMatchCountVar = null;
                    String noInputCountAttr="";
                    String noMatchCountAttr="";
                        for(Attribute attr:node.getAttributes()){
                            if(attr.getName().equals(ATTRIBUTE_AUDIO_PROMPT)){
                                audios.put(ATTRIBUTE_AUDIO_PROMPT, attr.getVal());
                            }
                            if(attr.getName().equals(ATTRIBUTE_AUDIO_NOINPUT)){
                                audios.put(ATTRIBUTE_AUDIO_NOINPUT, attr.getVal());
                            }
                            if(attr.getName().equals(ATTRIBUTE_AUDIO_NOMATCH)){
                                audios.put(ATTRIBUTE_AUDIO_NOMATCH, attr.getVal());
                            }
                            if(attr.getName().equals(ATTRIBUTE_COUNT_NOINPUT)){
                                noInputCountAttr=attr.getVal();
                            }
                            if(attr.getName().equals(ATTRIBUTE_COUNT_NOMATCH)){
                                noMatchCountAttr=attr.getVal();
                            }
                        }
                        if(audios.get(ATTRIBUTE_AUDIO_PROMPT)==null||audios.get(ATTRIBUTE_AUDIO_PROMPT).isEmpty()){
                            throw new IllegalArgumentException("Audio Prompt for node Menu "+node.getName()+" is Empty. You must set value");
                        }
                        for(Var v:node.getVars()){
                            if(v.getDotName().equals(VARIABLE_FIELD_VALUE)){
                                resultVar=v.getId();
                            }
                            if(v.getDotName().equals(VARIABLE_FIELD_NOINPUTCOUNT)){
                                noInputCountVar=v.getId();
                            }
                            if(v.getDotName().equals(VARIABLE_FIELD_NOMATCHCOUNT)){
                                noMatchCountVar=v.getId();
                            }
                        }
                             form="<form id=\""+node.getType()+"_"+node.getFlowCountId()+"\">\n";
                            form+="   <field name=\"F"+node.getType()+node.getFlowCountId()+"\">\n"
                                + "     <prompt>\n"
                                + "        <audio src=\"Audio?id="+audios.get(ATTRIBUTE_AUDIO_PROMPT)+"\"/>\n"
                                + "     </prompt>\n";
                        for(String dtmf:options.keySet()){
                            form+="         <option dtmf=\""+dtmf+"\" value=\""+dtmf+"\" />\n";
                        }
                            form +="     <noinput>\n"
                                 + "     <script> noinputcount++; </script>\n";
                            if((audios.get(ATTRIBUTE_AUDIO_NOINPUT)!=null)&&(!audios.get(ATTRIBUTE_AUDIO_NOINPUT).isEmpty())){
                                form +="        <audio src=\"Audio?id="+audios.get(ATTRIBUTE_AUDIO_NOINPUT)+"\"/>\n";
                            }
                               form +="        <reprompt/>\n"
                                    + "     </noinput>\n";
                            if((noInputCountAttr!=null)&&(!noInputCountAttr.isEmpty())&&(!"0".equals(noInputCountAttr))){
                                form+="     <noinput count=\""+noInputCountAttr+"\">\n     <script> noinputcount++; </script>\n        <disconnect/>\n     </noinput>\n";
                            }

                                form +="     <nomatch>\n"
                                        + "     <script> nomatchcount++; </script>\n";
                            if((audios.get(ATTRIBUTE_AUDIO_NOMATCH)!=null)&&(!audios.get(ATTRIBUTE_AUDIO_NOMATCH).isEmpty())){
                                form +="        <audio src=\"Audio?id="+audios.get(ATTRIBUTE_AUDIO_NOMATCH)+"\"/>\n";
                            }
                               form +="        <reprompt/>\n"
                                    + "     </nomatch>\n";

                            if((noMatchCountAttr!=null)&&(!noMatchCountAttr.isEmpty())&&(!"0".equals(noMatchCountAttr))){
                                form+="     <nomatch count=\""+noMatchCountAttr+"\">\n     <script> nomatchcount++; </script>        <disconnect/>\n     </nomatch>\n";
                            }
                               form+= "   </field>\n"
                                    + "      <filled>\n"
                                    + "             <log expr=\"'***** Form "+node.getType()+"_"+node.getFlowCountId()+" value is: ' +F"+node.getType()+node.getFlowCountId()+"\"/> \n"
                                    + "<script> addResultArray( [{varId:'"+resultVar+"' , value:F"+node.getType()+node.getFlowCountId()+"},{varId:'"+noInputCountVar+"' , value:noinputcount},{varId:'"+noMatchCountVar+"' , value:nomatchcount}] );</script>\n";
                            for(String dtmf:options.keySet()){
                                form+="    <if cond=\"F"+node.getType()+node.getFlowCountId()+" == '"+dtmf+"'\">\n"
                                    + "       <goto next=\"#"+options.get(dtmf)+"\" />\n"
                                    + "    </if>\n";
                            }
                                form+=""
                                    + "      </filled>\n"
                                    + "     <catch event=\"connection.disconnect\"> \n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'input_error'},{varId:'"+noInputCountVar+"' , value:noinputcount},{varId:'"+noMatchCountVar+"' , value:nomatchcount}] );</script>\n"
                                    + "         <log expr=\"'call disconnected. sending data'\" /> \n"
                                    + "         <data method=\"post\" src=\"Submit\" namelist=\"results contactId callFlowId contactListId interId campaignId wrapUpCode sessionId session___aai session___ani session___dnis session___protocolname session___protocolversion session___uui session___calltag session___channel session___vpcalledextension session___vpcoveragereason session___vpcoveragetype session___vprdnis redirectinfo___uri redirectinfo___presentationinfo redirectinfo___screeninginfo redirectinfo___reason session___sharedmode shareduui___id shareduui___value session___sessionlabel session___sipcallid session___mediatype session___videoenabled session___videocodec session___videoformat session___videowidth session___videoheight session___videofps session___videobitrate session___videonearfmtp session___videofarfmtp session___ucid session___conversefirst session___conversesecond\" />\n"
                                    + "         <log expr=\"'data sent.exiting'\" /> \n"
                                    + "         <exit />\n"
                                    + "     </catch>"
                                    + "</form>\n\n\n";

        }

        if(node.getType().equals(TYPE_BASIC_FORM_NAME)){
                    HashMap<String,String> audios= new HashMap<String,String>();
                    String dtmfLength = null;
                    Long resultVar=null;
                        for(Attribute attr:node.getAttributes()){
                            if(attr.getName().equals(ATTRIBUTE_AUDIO_PROMPT)){
                                audios.put(ATTRIBUTE_AUDIO_PROMPT, attr.getVal());
                            }
                            if(attr.getName().equals(ATTRIBUTE_AUDIO_NOINPUT)){
                                audios.put(ATTRIBUTE_AUDIO_NOINPUT, attr.getVal());
                            }
                            if(attr.getName().equals(ATTRIBUTE_DTMF_INPUT_LENGTH)){
                                dtmfLength=attr.getVal();
                            }
                        }
                        if(audios.get(ATTRIBUTE_AUDIO_PROMPT).isEmpty()){
                            throw new IllegalArgumentException("Audio Prompt for node Form "+node.getName()+" is Empty. You must set value");
                        }
                        if(dtmfLength==null||dtmfLength.isEmpty()){
                            throw new IllegalArgumentException("Length of input data is not set for node Menu "+node.getName()+" is Empty. You must set value");
                        }
                        for(Var v:node.getVars()){
                            if(v.getDotName().equals(VARIABLE_FIELD_VALUE)){
                                resultVar=v.getId();
                            }
                        }
                             form="<form id=\""+node.getType()+"_"+node.getFlowCountId()+"\">\n";
                            form+="   <field name=\"F"+node.getType()+node.getFlowCountId()+"\">\n"
                                + "     <prompt>\n"
                                + "        <audio src=\"Audio?id="+audios.get(ATTRIBUTE_AUDIO_PROMPT)+"\"/>\n"
                                + "     </prompt>\n"
                                + "    <grammar  mode=\"dtmf\" xml:lang=\"en-us\" weight=\"1.0\" "
                                    + "src=\"builtin:dtmf/digits?length="+(dtmfLength.isEmpty()?"1":dtmfLength)+"\" maxage=\"0\"/>\n";

                            form +="     <noinput>\n";
                            if(audios.get(ATTRIBUTE_AUDIO_NOINPUT)!=null&&!audios.get(ATTRIBUTE_AUDIO_NOINPUT).isEmpty()){
                                    form+= "        <audio src=\"Audio?id="+audios.get(ATTRIBUTE_AUDIO_NOINPUT)+"\"/>\n";
                            }
                                    form+= "        <reprompt/>\n"
                                    + "     </noinput>\n";
                              form += "  </field>\n"
                                    + "      <filled>\n"
                                    + "         <log expr=\"'***** Form "+node.getType()+"_"+node.getFlowCountId()+" value is: ' +F"+node.getType()+node.getFlowCountId()+"\"/> \n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:F"+node.getType()+node.getFlowCountId()+"}] );</script>\n"
                                    +"<goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n";
                                form+=""
                                    + "      </filled>\n"
                                    + "</form>\n\n\n";
        }

        if(node.getType().equals(TYPE_BASIC_TRANSFER_NAME)){
                    String dnis = "";
                    String audioPrompt="";
//                    String audioMOH="";
                    int timeout=40;
                    Long resultVar = null;
                        for(Attribute attr:node.getAttributes()){
                            if(attr.getName().equals(ATTRIBUTE_AUDIO_PROMPT)){
                                audioPrompt=attr.getVal();
                            }
//                            if(attr.getName().equals(ATTRIBUTE_AUDIO_MOH)){
//                                audioMOH=attr.getVal();
//                            }
                            if(attr.getName().equals(ATTRIBUTE_DNIS)){
                                dnis=attr.getVal();
                            }
                            if(attr.getName().equals(ATTRIBUTE_TIMEOUT)&&!attr.getVal().isEmpty()){
                                timeout=Integer.valueOf(attr.getVal());
                            }
                        }
                        if(dnis.isEmpty()){
                            throw new IllegalArgumentException("DNIS for node Form "+node.getName()+" is Empty. You must set value");
                        }
                        for(Var v:node.getVars()){
                            if(v.getDotName().equals(VARIABLE_FIELD_VALUE)){
                                resultVar=v.getId();
                            }
                        }
                             form="<form id=\""+node.getType()+"_"+node.getFlowCountId()+"\">\n"
                                    + "   <transfer name=\"F"+node.getType()+node.getFlowCountId()+"\" dest=\"tel:+"+dnis+"\"\n"
                                    + "    type=\"consultation\" connecttimeout=\""+timeout+"s\" >\n";
                             if(audioPrompt!=null&&!audioPrompt.isEmpty()){
                                 form+="        <audio src=\"Audio?id="+audioPrompt+"\"/>\n";
                             }
                              form += "     <catch event=\"connection.disconnect.hangup\"> \n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'hangup'}] );</script> \n "
                                    + "         <data method=\"post\" src=\"Submit\" namelist=\"results contactId callFlowId contactListId interId campaignId wrapUpCode sessionId session___aai session___ani session___dnis session___protocolname session___protocolversion session___uui session___calltag session___channel session___vpcalledextension session___vpcoveragereason session___vpcoveragetype session___vprdnis redirectinfo___uri redirectinfo___presentationinfo redirectinfo___screeninginfo redirectinfo___reason session___sharedmode shareduui___id shareduui___value session___sessionlabel session___sipcallid session___mediatype session___videoenabled session___videocodec session___videoformat session___videowidth session___videoheight session___videofps session___videobitrate session___videonearfmtp session___videofarfmtp session___ucid session___conversefirst session___conversesecond\" />\n"
                                    + "     </catch>"
                                    + "     <catch event=\"connection.disconnect.transfer\"> \n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'transfer'}] );</script> \n "
                                    + "         <data method=\"post\" src=\"Submit\" namelist=\"results contactId callFlowId contactListId interId campaignId wrapUpCode sessionId session___aai session___ani session___dnis session___protocolname session___protocolversion session___uui session___calltag session___channel session___vpcalledextension session___vpcoveragereason session___vpcoveragetype session___vprdnis redirectinfo___uri redirectinfo___presentationinfo redirectinfo___screeninginfo redirectinfo___reason session___sharedmode shareduui___id shareduui___value session___sessionlabel session___sipcallid session___mediatype session___videoenabled session___videocodec session___videoformat session___videowidth session___videoheight session___videofps session___videobitrate session___videonearfmtp session___videofarfmtp session___ucid session___conversefirst session___conversesecond\" />\n"
                                    + "     </catch>"
                                    + "      <filled>\n"
                                    + "          <log expr=\"'***** Form "+node.getType()+"_"+node.getFlowCountId()+" value is: ' +F"+node.getType()+node.getFlowCountId()+"\"/> \n";
                                form+="      </filled>\n"
                                    + "   </transfer>\n"
                                    + "   <block>\n"
                                    + "     <if cond=\"F"+node.getType()+node.getFlowCountId()+"!='unknown'\">\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:F"+node.getType()+node.getFlowCountId()+"}] );</script>\n"
                                    + "     </if>\n"
                                    + "     <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "   </block>\n"
                                    + "</form>\n\n\n";
        }

        if(node.getType().equals(TYPE_BASIC_GOTO_NAME)){
                    String gotoId = "";
                        for(Attribute attr:node.getAttributes()){
                            if(attr.getName().equals(ATTRIBUTE_GOTO)){
                                gotoId=attr.getVal();
                            }
                        }
                        if(gotoId.isEmpty()){
                            throw new IllegalArgumentException("Goto Attribute for node Goto "+node.getName()+" is Empty. You must set value");
                        }

                             form="<form id=\""+node.getType()+"_"+node.getFlowCountId()+"\">\n"
                                    + "   <block>\n"
                                    + "     <goto next=\"#"+(gotoId.isEmpty()?"exit":gotoId)+"\" />\n"
                                    + "   </block>\n"
                                    + "</form>\n\n\n";
        }

        if(node.getType().equals(TYPE_BASIC_AUDIO_NAME)){
                    String audio = "";
                    Long resultVar = null;
                        for(Attribute attr:node.getAttributes()){
                            if(attr.getName().equals(ATTRIBUTE_AUDIO_PROMPT)){
                                audio=attr.getVal();
                            }
                        }
                        for(Var v:node.getVars()){
                            if(v.getDotName().equals(VARIABLE_FIELD_VALUE)){
                                resultVar=v.getId();
                            }
                        }
                        if(audio==null||audio.isEmpty()){
                            throw new IllegalArgumentException("Audio Prompt for node Audio "+node.getName()+" is Empty. You must set value");
                        }

                             form="<form id=\""+node.getType()+"_"+node.getFlowCountId()+"\">\n"
                                     + "    <field>\n"
                                     + "        <prompt bargein=\"false\" timeout=\"0.1s\">\n";
                                    if(!audio.isEmpty()){
                                        form+="         <audio src=\"Audio?id="+audio+"\"/>\n";
                                    }
                               form+= "         </prompt>\n"
                                    + "         <option dtmf=\"1\" value=\"1\" />\n"
                                    + "     </field>\n"
                                    + "     <noinput>\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'"+(!audio.isEmpty()?"played":"no_file")+"'}] );</script>\n"
                                    + "         <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "     </noinput>\n"
                                    + "     <nomatch>\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'"+(!audio.isEmpty()?"played":"no_file")+"'}] );</script>\n"
                                    + "         <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "     </nomatch>\n"
                                    + "     <filled>\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'"+(!audio.isEmpty()?"played":"no_file")+"'}] );</script>\n"
                                    + "         <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "     </filled>\n"
                                    + "     <catch event=\"connection.disconnect\">\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'"+(!audio.isEmpty()?"played_not_ended":"no_file")+"'}] );</script>\n"
                                    + "         <log expr=\"'call disconnected. sending data'\" /> \n"
                                    + "         <data method=\"post\" src=\"Submit\" namelist=\"results contactId callFlowId contactListId interId campaignId wrapUpCode sessionId session___aai session___ani session___dnis session___protocolname session___protocolversion session___uui session___calltag session___channel session___vpcalledextension session___vpcoveragereason session___vpcoveragetype session___vprdnis redirectinfo___uri redirectinfo___presentationinfo redirectinfo___screeninginfo redirectinfo___reason session___sharedmode shareduui___id shareduui___value session___sessionlabel session___sipcallid session___mediatype session___videoenabled session___videocodec session___videoformat session___videowidth session___videoheight session___videofps session___videobitrate session___videonearfmtp session___videofarfmtp session___ucid session___conversefirst session___conversesecond\" />\n"
                                    + "         <log expr=\"'data sent.exiting'\" /> \n"
                                    + "         <exit />\n"
                                    + "     </catch>"
                                    + "</form>\n\n\n";
        }

        if(node.getType().equals(TYPE_BASIC_DISCONNECT_NAME)){
                             form="<form id=\""+node.getType()+"_"+node.getFlowCountId()+"\">\n"
                                    + "   <block>\n"
                                    + "     <goto next=\"#exit\" />\n"
                                    + "   </block>\n"
                                    + "</form>\n\n\n";
        }

        if(node.getType().equals(TYPE_BASIC_WRAPUP_NAME)){
                    String  wrapUpCode = null;
                        for(Attribute attr:node.getAttributes()){
                            if(attr.getName().equals(ATTRIBUTE_WRAPUP_CODE)){
                                wrapUpCode=attr.getVal();
                            }
                        }
                        if(wrapUpCode==null||wrapUpCode.isEmpty()){
                            throw new IllegalArgumentException("Wrap Up Code for "+node.getName()+" is Empty. You must set value");
                        }
                             form="<form id=\""+node.getType()+"_"+node.getFlowCountId()+"\">\n"
                                     + "   <block>\n"
                                     + "      <assign name=\"wrapUpCode\" expr=\"'"+wrapUpCode+"'\"/>\n"
                                     + "      <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                     + "   </block>\n"
                                    + "</form>\n\n\n";
        }

        // population of menuOprion are processing in menu
        if(node.getType().equals(TYPE_BASIC_MENU_OPTION_NAME)){
            form=" ";
        }

        if(node.getType().equals(TYPE_OUT_SAYMONEY_NAME)){
                    Long varId = null;
                    String lang="";
                    String audioBefore="";
                    String audioAfter="";
                    String currency="";
                    Long resultVar = null;
                        for(Attribute attr:node.getAttributes()){
                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_LANGUAGE)){
                                lang=attr.getVal();
                            }
                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_MONEY_TYPE)){
                                currency=attr.getVal();
                            }
                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_AUDIO_BEFORE)&&attr.getVal()!=null){
                                audioBefore=attr.getVal();
                            }
                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_AUDIO_AFTER)&&attr.getVal()!=null){
                                audioAfter=attr.getVal();
                            }
                        }
                        for(Var v:node.getVars()){
                            if(v.getType().equals(TYPE_OUT_SAYMONEY_NAME)&&v.getDotName().equals(VARIABLE_FIELD_CONTACTFIELD)){
                                varId=v.getId();
                            }
                            if(v.getDotName().equals(VARIABLE_FIELD_VALUE)){
                                resultVar=v.getId();
                            }
                        }
                        if(lang.isEmpty()){
                            throw new IllegalArgumentException("Language Attribute for node SayMoney "+node.getName()+" is Empty. You must set value");
                        }
                        if(currency.isEmpty()){
                            throw new IllegalArgumentException("Currency Attribute for node SayMoney "+node.getName()+" is Empty. You must set value");
                        }
                        if(getBundleLanguagesURL(lang).isEmpty()){
                            throw new IllegalArgumentException("Language ["+lang+"] for node SayMoney "+node.getName()+" is not supported. Please, contact Support TDU");
                        }
                        if(varId==null){
                            throw new IllegalArgumentException("An error occured. Please delete node SayMoney "+node.getName()+" and create it again");
                        }

                            form="     <var name=\"var___"+varId+"\"/>\n"
                                    + "<form id=\""+node.getType()+"_"+node.getFlowCountId()+"\">\n"
                                    +"<block>\n"
                                    +"     <var name=\"varId\" expr=\"'"+varId+"'\"/>\n"
                                    +"     <var name=\"fetchMoney__"+node.getFlowCountId()+"\" />\n"
                                    +"     <data name=\"fetchMoney__"+node.getFlowCountId()+"\" method=\"post\" src=\"GetContactData\" namelist=\"varId interId\" /> \n"
                                    +"     <assign name=\"var___"+varId+"\" expr=\"GetData(fetchMoney__"+node.getFlowCountId()+",'contactData')\" /> \n"
                                    + (audioBefore.isEmpty()?(""):("<audio src=\"Audio?id="+audioBefore+"\" /> \n"))
                                    +"</block>\n"
                                    +"<subdialog name=\"F"+node.getType()+node.getFlowCountId()+"\" src=\""+getBundleLanguagesURL(lang)+"\" method=\"get\">\n"
                                    +"  <param name=\"data\" expr=\"var___"+varId+"\"/>\n"
                                    +"  <param name=\"dataType\" value=\""+currency+"\"/>\n"
                                    +"  <filled>\n"
                                    + (audioAfter.isEmpty()?(""):("<audio src=\"Audio?id="+audioAfter+"\" /> \n"))
                                    +"  <goto next=\"#"+node.getType()+"_"+node.getFlowCountId()+"a\" />\n"
                                    +"  </filled>\n"
                                    +"</subdialog>\n"
                                    + "     <catch event=\"connection.disconnect\">\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played_not_ended'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <log expr=\"'call disconnected. sending data'\" /> \n"
                                    + "         <data method=\"post\" src=\"Submit\" namelist=\"results contactId callFlowId contactListId interId campaignId wrapUpCode sessionId session___aai session___ani session___dnis session___protocolname session___protocolversion session___uui session___calltag session___channel session___vpcalledextension session___vpcoveragereason session___vpcoveragetype session___vprdnis redirectinfo___uri redirectinfo___presentationinfo redirectinfo___screeninginfo redirectinfo___reason session___sharedmode shareduui___id shareduui___value session___sessionlabel session___sipcallid session___mediatype session___videoenabled session___videocodec session___videoformat session___videowidth session___videoheight session___videofps session___videobitrate session___videonearfmtp session___videofarfmtp session___ucid session___conversefirst session___conversesecond\" />\n"
                                    + "         <log expr=\"'data sent.exiting'\" /> \n"
                                    + "         <exit />\n"
                                    + "     </catch>"
                                    + "</form>\n"
                                    + "<form id=\""+node.getType()+"_"+node.getFlowCountId()+"a\">\n"
                                    + "    <field>\n"
                                    + "        <prompt bargein=\"false\" timeout=\"0.1s\">\n"
                                    + "         </prompt>\n"
                                    + "         <option dtmf=\"1\" value=\"1\" />\n"
                                    + "     <catch event=\"error\"></catch>"
                                    + "     </field>\n"
                                    + "     <noinput>\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "     </noinput>\n"
                                    + "     <nomatch>\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "     </nomatch>\n"
                                    + "     <filled>\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "     </filled>\n"
                                    + "     <catch event=\"connection.disconnect\">\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played_not_ended'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <log expr=\"'call disconnected. sending data'\" /> \n"
                                    + "         <data method=\"post\" src=\"Submit\" namelist=\"results contactId callFlowId contactListId interId campaignId wrapUpCode sessionId session___aai session___ani session___dnis session___protocolname session___protocolversion session___uui session___calltag session___channel session___vpcalledextension session___vpcoveragereason session___vpcoveragetype session___vprdnis redirectinfo___uri redirectinfo___presentationinfo redirectinfo___screeninginfo redirectinfo___reason session___sharedmode shareduui___id shareduui___value session___sessionlabel session___sipcallid session___mediatype session___videoenabled session___videocodec session___videoformat session___videowidth session___videoheight session___videofps session___videobitrate session___videonearfmtp session___videofarfmtp session___ucid session___conversefirst session___conversesecond\" />\n"
                                    + "         <log expr=\"'data sent.exiting'\" /> \n"
                                    + "         <exit />\n"
                                    + "     </catch>"
                                    + "</form>\n\n\n";
        }

        if(node.getType().equals(TYPE_OUT_SAYDATE_NAME)){
                    Long varId = null;
                    String lang="";
                    String audioBefore="";
                    String audioAfter="";
                    Long resultVar = null;
                        for(Attribute attr:node.getAttributes()){
                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_LANGUAGE)){
                                lang=attr.getVal();
                            }
                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_AUDIO_BEFORE)){
                                audioBefore=attr.getVal();
                            }
                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_AUDIO_AFTER)){
                                audioAfter=attr.getVal();
                            }
                        }
                        for(Var v:node.getVars()){
                            if(v.getType().equals(TYPE_OUT_SAYDATE_NAME)&&v.getDotName().equals(VARIABLE_FIELD_CONTACTFIELD)){
                                varId=v.getId();
                            }
                            if(v.getDotName().equals(VARIABLE_FIELD_VALUE)){
                                resultVar=v.getId();
                            }
                        }
                        if(lang.isEmpty()){
                            throw new IllegalArgumentException("Language Attribute for node SayDate "+node.getName()+" is Empty. You must set value");
                        }
                        if(getBundleLanguagesURL(lang).isEmpty()){
                            throw new IllegalArgumentException("Language ["+lang+"] for node SayDate "+node.getName()+" is not supported. Please, contact Support TDU");
                        }
                        if(varId==null){
                            throw new IllegalArgumentException("An error occured. Please delete node SayDate "+node.getName()+" and create it again");
                        }

                            form="     <var name=\"var___"+varId+"\"/>\n"
                                    + "<form id=\""+node.getType()+"_"+node.getFlowCountId()+"\">\n"
                                    +"<block>\n"
                                    +"     <var name=\"varId\" expr=\"'"+varId+"'\"/>\n"
                                    +"     <var name=\"fetchDate__"+node.getFlowCountId()+"\" />\n"
                                    +"     <data name=\"fetchDate__"+node.getFlowCountId()+"\" method=\"post\" src=\"GetContactData\" namelist=\"varId interId\" /> \n"
                                    +"     <assign name=\"var___"+varId+"\" expr=\"GetData(fetchDate__"+node.getFlowCountId()+",'contactData')\" /> \n"
                                    +(audioBefore.isEmpty()?(""):("<audio src=\"Audio?id="+audioBefore+"\" /> \n"))
                                    +"</block>\n"
                                    +"<subdialog name=\"F"+node.getType()+node.getFlowCountId()+"\" src=\""+getBundleLanguagesURL(lang)+"\" method=\"get\">\n"
                                    +"  <param name=\"data\" expr=\"var___"+varId+"\"/>\n"
                                    +"  <param name=\"dataType\" value=\"datetime\"/>\n"
                                    +"  <filled>\n"
                                    + (audioAfter.isEmpty()?(""):("<audio src=\"Audio?id="+audioAfter+"\" /> \n"))
                                    +"  <goto next=\"#"+node.getType()+"_"+node.getFlowCountId()+"a\" />\n"
                                    +"  </filled>\n"
                                    +"</subdialog>\n"
                                    + "     <catch event=\"connection.disconnect\">\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played_not_ended'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <log expr=\"'call disconnected. sending data'\" /> \n"
                                    + "         <data method=\"post\" src=\"Submit\" namelist=\"results contactId callFlowId contactListId interId campaignId wrapUpCode sessionId session___aai session___ani session___dnis session___protocolname session___protocolversion session___uui session___calltag session___channel session___vpcalledextension session___vpcoveragereason session___vpcoveragetype session___vprdnis redirectinfo___uri redirectinfo___presentationinfo redirectinfo___screeninginfo redirectinfo___reason session___sharedmode shareduui___id shareduui___value session___sessionlabel session___sipcallid session___mediatype session___videoenabled session___videocodec session___videoformat session___videowidth session___videoheight session___videofps session___videobitrate session___videonearfmtp session___videofarfmtp session___ucid session___conversefirst session___conversesecond\" />\n"
                                    + "         <log expr=\"'data sent.exiting'\" /> \n"
                                    + "         <exit />\n"
                                    + "     </catch>"
                                    + "</form>\n"
                                    + "<form id=\""+node.getType()+"_"+node.getFlowCountId()+"a\">\n"
                                    + "    <field>\n"
                                    + "        <prompt bargein=\"false\" timeout=\"0.1s\">\n"
                                    + "         </prompt>\n"
                                    + "         <option dtmf=\"1\" value=\"1\" />\n"
                                    + "     <catch event=\"error\"></catch>"
                                    + "     </field>\n"
                                    + "     <noinput>\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "     </noinput>\n"
                                    + "     <nomatch>\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "     </nomatch>\n"
                                    + "     <filled>\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "     </filled>\n"
                                    + "     <catch event=\"connection.disconnect\">\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played_not_ended'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <log expr=\"'call disconnected. sending data'\" /> \n"
                                    + "         <data method=\"post\" src=\"Submit\" namelist=\"results contactId callFlowId contactListId interId campaignId wrapUpCode sessionId session___aai session___ani session___dnis session___protocolname session___protocolversion session___uui session___calltag session___channel session___vpcalledextension session___vpcoveragereason session___vpcoveragetype session___vprdnis redirectinfo___uri redirectinfo___presentationinfo redirectinfo___screeninginfo redirectinfo___reason session___sharedmode shareduui___id shareduui___value session___sessionlabel session___sipcallid session___mediatype session___videoenabled session___videocodec session___videoformat session___videowidth session___videoheight session___videofps session___videobitrate session___videonearfmtp session___videofarfmtp session___ucid session___conversefirst session___conversesecond\" />\n"
                                    + "         <log expr=\"'data sent.exiting'\" /> \n"
                                    + "         <exit />\n"
                                    + "     </catch>"
                                    + "</form>\n\n\n";
        }

        if(node.getType().equals(TYPE_OUT_SAYNUMBER_NAME)){
                    Long varId = null;
                    String lang="";
                    String audioBefore="";
                    String audioAfter="";
                    Long resultVar = null;
                        for(Attribute attr:node.getAttributes()){
                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_LANGUAGE)){
                                lang=attr.getVal();
                            }
                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_AUDIO_BEFORE)){
                                audioBefore=attr.getVal();
                            }
                            if(attr.getName().equals(ATTRIBUTE_BUNDLE_PLAY_AUDIO_AFTER)){
                                audioAfter=attr.getVal();
                            }
                        }
                        for(Var v:node.getVars()){
                            if(v.getType().equals(TYPE_OUT_SAYNUMBER_NAME)&&v.getDotName().equals(VARIABLE_FIELD_CONTACTFIELD)){
                                varId=v.getId();
                            }
                            if(v.getDotName().equals(VARIABLE_FIELD_VALUE)){
                                resultVar=v.getId();
                            }
                        }
                        if(lang.isEmpty()){
                            throw new IllegalArgumentException("Language Attribute for node SayNumber "+node.getName()+" is Empty. You must set value");
                        }
                        if(getBundleLanguagesURL(lang).isEmpty()){
                            throw new IllegalArgumentException("Language ["+lang+"] for node SayNumber "+node.getName()+" is not supported. Please, contact Support TDU");
                        }
                        if(varId==null){
                            throw new IllegalArgumentException("An error occured. Please delete node SayNumber "+node.getName()+" and create it again");
                        }

                            form="     <var name=\"var___"+varId+"\"/>\n"
                                    + "<form id=\""+node.getType()+"_"+node.getFlowCountId()+"\">\n"
                                    +"<block>\n"
                                    +"     <var name=\"varId\" expr=\"'"+varId+"'\"/>\n"
                                    +"     <var name=\"fetchNumb__"+node.getFlowCountId()+"\" />\n"
                                    +"     <data name=\"fetchNumb__"+node.getFlowCountId()+"\" method=\"post\" src=\"GetContactData\" namelist=\"varId interId\" /> \n"
                                    +"     <assign name=\"var___"+varId+"\" expr=\"GetData(fetchNumb__"+node.getFlowCountId()+",'contactData')\" /> \n"
                                    +(audioBefore.isEmpty()?(""):("  <audio src=\"Audio?id="+audioBefore+"\" /> \n"))
                                    +"</block>\n"
                                    +"<subdialog name=\"F"+node.getType()+node.getFlowCountId()+"\" src=\""+getBundleLanguagesURL(lang)+"\" method=\"get\">\n"
                                    +"  <param name=\"data\" expr=\"var___"+varId+"\"/>\n"
                                    +"  <param name=\"dataType\" value=\"number\"/>\n"
                                    +"  <filled>\n"
                                    + (audioAfter.isEmpty()?(""):("<audio src=\"Audio?id="+audioAfter+"\" /> \n"))
                                    +"  <goto next=\"#"+node.getType()+"_"+node.getFlowCountId()+"a\" />\n"
                                    +"  </filled>\n"
                                    +"</subdialog>\n"
                                    + "     <catch event=\"connection.disconnect\">\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played_not_ended'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <log expr=\"'call disconnected. sending data'\" /> \n"
                                    + "         <data method=\"post\" src=\"Submit\" namelist=\"results contactId callFlowId contactListId interId campaignId wrapUpCode sessionId session___aai session___ani session___dnis session___protocolname session___protocolversion session___uui session___calltag session___channel session___vpcalledextension session___vpcoveragereason session___vpcoveragetype session___vprdnis redirectinfo___uri redirectinfo___presentationinfo redirectinfo___screeninginfo redirectinfo___reason session___sharedmode shareduui___id shareduui___value session___sessionlabel session___sipcallid session___mediatype session___videoenabled session___videocodec session___videoformat session___videowidth session___videoheight session___videofps session___videobitrate session___videonearfmtp session___videofarfmtp session___ucid session___conversefirst session___conversesecond\" />\n"
                                    + "         <log expr=\"'data sent.exiting'\" /> \n"
                                    + "         <exit />\n"
                                    + "     </catch>"
                                    + "</form>\n"
                                    + "<form id=\""+node.getType()+"_"+node.getFlowCountId()+"a\">\n"
                                    + "    <field>\n"
                                    + "        <prompt bargein=\"false\" timeout=\"0.1s\">\n"
                                    + "         </prompt>\n"
                                    + "         <option dtmf=\"1\" value=\"1\" />\n"
                                    + "     <catch event=\"error\"></catch>"
                                    + "     </field>\n"
                                    + "     <noinput>\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "     </noinput>\n"
                                    + "     <nomatch>\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "     </nomatch>\n"
                                    + "     <filled>\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <goto next=\"#"+(node.getChildren().isEmpty()?"exit":node.getChildren().get(0).getType()+"_"+node.getChildren().get(0).getFlowCountId())+"\" />\n"
                                    + "     </filled>\n"
                                    + "     <catch event=\"connection.disconnect\">\n"
                                    + "         <script> addResultArray( [{varId:'"+resultVar+"' , value:'played_not_ended'},{varId:'"+varId+"' , value:var___"+varId+"}] );</script>\n"
                                    + "         <log expr=\"'call disconnected. sending data'\" /> \n"
                                    + "         <data method=\"post\" src=\"Submit\" namelist=\"results contactId callFlowId contactListId interId campaignId wrapUpCode sessionId session___aai session___ani session___dnis session___protocolname session___protocolversion session___uui session___calltag session___channel session___vpcalledextension session___vpcoveragereason session___vpcoveragetype session___vprdnis redirectinfo___uri redirectinfo___presentationinfo redirectinfo___screeninginfo redirectinfo___reason session___sharedmode shareduui___id shareduui___value session___sessionlabel session___sipcallid session___mediatype session___videoenabled session___videocodec session___videoformat session___videowidth session___videoheight session___videofps session___videobitrate session___videonearfmtp session___videofarfmtp session___ucid session___conversefirst session___conversesecond\" />\n"
                                    + "         <log expr=\"'data sent.exiting'\" /> \n"
                                    + "         <exit />\n"
                                    + "     </catch>"
                                    + "</form>\n\n\n";
        }

        if(form.equals("")){
            form+="    <!--   ------- not implemented  "+node.getType()+" --> \n";
        }


        for(CallFlowNode child:node.getChildren()){
            form+=generateVXMLfromNode(child);
        }
        return form;

    }

    public static String getBundleLanguagesURL(String lang){
        if(lang.equals(BUNDLE_LANGUAGES[0])) return "http://192.168.1.89:8080/module_bundle_ru/Start?sagecall=ru&amp;sagerunmodule=true";
        if(lang.equals(BUNDLE_LANGUAGES[1])) return "http://192.168.1.89:8080/module_bundle_en/Start?sagecall=en&amp;sagerunmodule=true";
        return "";
    }

}
