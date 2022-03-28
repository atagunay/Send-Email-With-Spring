package com.ata.sendmaildemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailSentController {

    private final EmailSentService emailSentService;

    public EmailSentController(EmailSentService emailSentService){
        this.emailSentService = emailSentService;
    }

    @GetMapping("/sent")
    public void sentEmail(@RequestParam(name = "to") String toEmail, @RequestParam(name = "subject") String subject,
                          @RequestParam(name = "body") String body){
        emailSentService.sendEmail(toEmail,subject,body);
    }

}
