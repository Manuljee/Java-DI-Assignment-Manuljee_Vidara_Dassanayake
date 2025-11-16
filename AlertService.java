package com.epiclearn.assignmentproject;

public class AlertService implements Notifier{
    private String emailNotifier;
    private String smsNotifier;
    public AlertService(String emailNotifier, String smsNotifier){
        this.emailNotifier=emailNotifier;
        this.smsNotifier=smsNotifier;
    }

    public String getEmailNotifier(){
        return emailNotifier;
    }
    public String getSmsNotifier(){
        return smsNotifier;
    }

    public void setEmailNotifier(String emailNotifier){
        this.emailNotifier=emailNotifier;
    }
    public void setSmsNotifier(String smsNotifier){
        this.smsNotifier=smsNotifier;
    }
    public void alertUser(){
        System.out.println(getEmailNotifier());
        System.out.println(getSmsNotifier());
    }

    @Override
    public void send(String message){
            System.out.println("hi");
    }

}
