public class Rune {
    private String imagePath;
    private String uniqueID;


    public Rune(String uniqueID, String imagePath) {
        this.uniqueID = uniqueID;
        this.imagePath = imagePath;
    }
    public String getImagePath() {
        return imagePath;
    }

    public String getID() {
        return uniqueID;
    }
}
