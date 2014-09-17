package ua.com.AACC.is.callback;

public class CallbackConfig {
    private String obSkillset;
    private Integer maxWaitTime;
    private String subject;
    private String text;
    private String phonePrefix;

    public CallbackConfig(String obSkillset, Integer maxWaitTime, String subject, String text, String phonePrefix) {
        this.obSkillset = obSkillset;
        this.maxWaitTime = maxWaitTime;
        this.subject = subject;
        this.text = text;
        this.phonePrefix = phonePrefix;
    }

    public String getObSkillset() {
        return obSkillset;
    }

    public Integer getMaxWaitTime() {
        return maxWaitTime;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public String getPhonePrefix() {
        return phonePrefix;
    }

    @Override
    public String toString() {
        return "CallbackConfig{" + "obSkillset=" + obSkillset + ", maxWaitTime=" + maxWaitTime + ", subject=" + subject + ", text=" + text + ", phonePrefix=" + phonePrefix + '}';
    }
}
