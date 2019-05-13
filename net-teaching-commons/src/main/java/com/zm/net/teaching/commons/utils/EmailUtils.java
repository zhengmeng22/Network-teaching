package com.zm.net.teaching.commons.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;

@Component
public class EmailUtils {

    @Autowired
    private JavaMailSender jms;

    @Value("${spring.mail.username}")
    private String from;

    @Async
    public void sendEmail(String email,String url) throws Exception {
// TODO Auto-generated method stub
        MimeMessage message = jms.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(from);
        helper.setTo(email);
        helper.setSubject("html格式邮件");
        //内容为html格式
        String content = url;
        //true表示以html格式发送邮件
        helper.setText(content, true);

        jms.send(message);
    }

}
