package com.example.controller;

import com.example.entities.request.EmailRequest;
import com.example.entities.request.NotificationRequest;
import com.example.service.NotificationService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping(value = "/message")
@AllArgsConstructor
//@SecurityRequirement(name = "app")
public class NotificationController {
    private final NotificationService service;
    @PostMapping("/notify")
    public ResponseEntity<?> getNews(@RequestBody NotificationRequest notificationRequest) {
        service.publishToMessageBroker(notificationRequest);

        return ResponseEntity.ok("Successful");

    }
    @PostMapping(value = "/send_mail")
    public ResponseEntity<?> sendMail(@Valid @RequestBody EmailRequest emailRequest) {
            service.publishToMail(emailRequest);
            return ResponseEntity.ok("Send Email Successful");
    }

    @GetMapping
    public Object getPublicKey(){
        System.out.println("Before");
        Object data = service.getPublicKey();
        System.out.println("Data: " + data);

        return data;
    }


//    @PostMapping("/addData")
//    public Mono<ResponseEntity<DataResponse<Object>>> addNotificationData(@RequestBody NotificationRequest notificationRequest) {
//        return service.addNotificationData(notificationRequest)
//                .flatMap(data -> Mono.just(
//                        ResponseEntity.status(HttpStatus.OK)
//                                .body(new DataResponse<>
//                                        ("data found", true, data))));
//
//    }

}
