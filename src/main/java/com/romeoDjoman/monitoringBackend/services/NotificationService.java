package com.romeoDjoman.monitoringBackend.services;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void envoyerNotification(String message) {

        System.out.println("Notification envoyée : " + message);
    }
}