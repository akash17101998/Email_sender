package com.example.spring.demo.Iservice;

import com.example.spring.demo.model.EmailDetails;
import org.springframework.stereotype.Service;


public interface EmailService {

    // Method
    // To send a simple email
    String sendSimpleMail(EmailDetails details);

    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);

}
