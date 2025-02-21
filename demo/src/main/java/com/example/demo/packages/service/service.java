package com.example.demo.packages.service;

import com.example.demo.packages.model.contentdata;
import com.example.demo.packages.model.data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class service {

    @Autowired
    private JavaMailSender jms;
    private repo rp;

    public service(repo rp) {
        this.rp = rp;
    }



    @Value("${spring.mail.username}")
    private String sender;

    public void sendEmail(data dts) {
    SimpleMailMessage smm = new SimpleMailMessage();
    smm.setFrom(sender);
    smm.setTo(dts.getRecipient());
    smm.setSubject(rp.getcontent());
    String username[]=dts.getRecipient().split("@");
    String msg="Hii "+username[0]+" "+rp.gettext().toString();
    smm.setText(msg);

    jms.send(smm);
    }
}
