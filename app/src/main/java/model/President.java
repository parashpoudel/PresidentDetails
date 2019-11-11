package model;

public class President {
    private String name;
    private String presidentDetails;
    private int imageId;

    public President(String name, String presidentDetails, int imageId) {
        this.name = name;
        this.presidentDetails = presidentDetails;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresidentDetails() {
        return presidentDetails;
    }

    public void setPresidentDetails(String phoneNumber) {
        this.presidentDetails = phoneNumber;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
