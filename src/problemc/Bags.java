package problemc;

//klass för att skapa våra bags
public class Bags {

    int width;
    int length;
    int height;

    Bags(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;

    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int bagVolume() {
        return length*width*height;
    }


}
