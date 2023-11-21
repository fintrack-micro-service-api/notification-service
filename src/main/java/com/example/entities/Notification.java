package com.example.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
//    @Id
//    @UuidGenerator
    private UUID id;
    private String notificationType;
    private String subject;
    private String content;
    private String status;
    private UUID userId;
    private Integer retryCount;

    public Notification(String notificationType, String subject, String content, String status, UUID userId, Integer retryCount) {
        this.notificationType = notificationType;
        this.subject = subject;
        this.content = content;
        this.status = status;
        this.userId = userId;
        this.retryCount = retryCount;
    }
}
