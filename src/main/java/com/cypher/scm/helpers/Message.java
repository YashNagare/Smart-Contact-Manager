package com.cypher.scm.helpers;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private String content;

    @Builder.Default
    private MessageType type = MessageType.blue;

}
