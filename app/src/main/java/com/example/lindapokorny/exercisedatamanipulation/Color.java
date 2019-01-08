package com.example.lindapokorny.exercisedatamanipulation;

public class Color {
    private String color;
    private String category;
    private String type;
    private Code code;

    public Color() {
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Code getCode() {
        return code;
    }

    public void setCode() {
        this.code = code;
    }

    //\"color\": \"green\",\n" +
    //                    "     \"category\": \"hue\",\n" +
    //                    "     \"type\": \"secondary\",\n" +
    //                    "     \"code\": {\n" +
    //                    "       \"rgba\": [0,255,0,1],\n" +
    //                    "       \"hex\": \"#0F0\"\n" +
}
