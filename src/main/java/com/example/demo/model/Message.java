
package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    private String content;
    private boolean isPublic;

    public Message(String content, boolean isPublic) {
        this.content = content;
        this.isPublic = isPublic;
    }

    public Message() {}

    public Long getId() {
        return id;
    }
    public String getContent() {
        return content;
    }
    public boolean isPublic() {
        return isPublic;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }
}
