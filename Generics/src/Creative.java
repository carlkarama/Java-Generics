import java.util.List;

public class Creative<T> {

    public List<T> creatives;

    public Creative() {

    }

    public List<T> getCreatives() {
        return creatives;
    }

    public void setCreatives(List<T> creatives) {
        this.creatives = creatives;
    }

    public void listCreatives() {
        System.out.println("---------- CREATIVES ----------");
        System.out.println(getCreatives());
    }
}
