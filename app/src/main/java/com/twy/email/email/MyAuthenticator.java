package com.twy.email.email;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * Author by twy, Email 499216359@qq.com, Date on 2020/1/8.
 * PS: Not easy to write code, please indicate.
 */
public class MyAuthenticator extends Authenticator {
    String userName = null;
    String password = null;

    public MyAuthenticator() {
    }

    public MyAuthenticator(String username, String password) {
        this.userName = username;
        this.password = password;
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(userName, password);
    }
}
