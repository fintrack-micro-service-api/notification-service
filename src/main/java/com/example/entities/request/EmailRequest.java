package com.example.entities.request;


import com.example.entities.Email;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailRequest {

    private List< @jakarta.validation.constraints.Email(message = "Invalid email address") String> to;
    private String from;
    private String subject;
    private String content;
    private String attachmentFilePath;

    public Email toEntity(){
        return new Email(to,from,subject,content,attachmentFilePath);
    }
}
