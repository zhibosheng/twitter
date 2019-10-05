package io.ascending.training.model;

import java.sql.Timestamp;

public class Twitter {
    private long id;
    private String content;
    private long use_id;
    private long reply_id;
    private long likes;
    private Timestamp timestamp;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getUse_Id() {
        return use_id;
    }

    public void setUse_Id(long use_id) {
        this.use_id = use_id;
    }

    public long getReply_Id() {
        return reply_id;
    }

    public void setReply_Id(long reply_id) {
        this.reply_id = reply_id;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
