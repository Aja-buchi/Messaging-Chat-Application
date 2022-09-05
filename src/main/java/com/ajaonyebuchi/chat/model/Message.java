package com.ajaonyebuchi.chat.model;

import com.ajaonyebuchi.chat.enums.StatusEnums;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Message {
    private String senderName;
    private String receiverName;
    private String message;
    private LocalDateTime date = LocalDateTime.now();
    private StatusEnums status;
}
