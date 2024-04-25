import java.util.List;

public class Main {

    public static void main(String[] args) {
        Creative<Editor> creativeEditor = new Creative<>();

        Editor carl = new Editor(1, "16GB RTX 3060 4TB SSD Cooler");
        
        creativeEditor.setCreatives(List.of(carl));

        creativeEditor.listCreatives();

        Rate<Editor> editorRate = new Editor(2, "16GB RTX 3060 4TB SSD Cooler");
    }
}