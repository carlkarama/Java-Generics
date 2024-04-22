public class Editor implements Rate<Editor> {

    public int id;
    public String setup;

    public Editor(int id, String setup) {
        this.id = id;
        this.setup = setup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "id=" + id +
                ", setup='" + setup + '\'' +
                '}';
    }

    @Override
    public void charge(double hourlyRate, int hours) {

    }
}
