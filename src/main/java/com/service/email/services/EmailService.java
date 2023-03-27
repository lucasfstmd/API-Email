package com.service.email.services;

import com.service.email.models.Email;


public interface EmailService {
    Email sendEmail(Email email);
}
