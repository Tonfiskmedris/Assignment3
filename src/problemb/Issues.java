package problemb;

//skapar en klass som vi kan skapa våra Labels eller tickets "problem" ifrån.
public class Issues {

    private String Label;
    private boolean solved;

    public String getLabel() {
        return Label;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

}
