package com.roman.email_sender.controller;

import com.roman.email_sender.service.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    MailSenderService mailSenderService;

    @PostMapping("/sendEmail")
    public String sendEmail(){
        mailSenderService.sendMail("romanjava97@gmail.com",
                                "This is subject for test",
                                 "This is the mail body for test");
        return "Email send successful";
    }
}
