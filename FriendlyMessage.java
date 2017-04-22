package com.example.shamitha.pc_share;

public class FriendlyMessage {

    private String id;
    private String text;
    private String name;
    private String imageurl;

    public FriendlyMessage() {
    }

    public FriendlyMessage(String text, String name) {
        this.text = text;
        this.name = name;
        imageurl=null;
    }
    public FriendlyMessage(String text, String name,String url){
        this.text = text;
        this.name = name;
        imageurl=url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getText() {
        return text;
    }

    public void setImageurl(String url){ imageurl=url;}

    public String getImageurl() {
        return imageurl;
    }

  }
