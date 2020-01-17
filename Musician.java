//I worked on the homework assignment alone, using only course materials.
public class Musician {
    // private fields and associated getter methods
    private String name;
    private String instrument;
    private int yearsPlaying;
    private double skillLevel;

    // first constructor with three arguments
    public Musician(String name, String instrument, int yearsPlaying) {
        this.name = name;
        this.instrument = instrument;
        this.yearsPlaying = yearsPlaying;
        skillLevel = 1 + 0.5 * yearsPlaying;

    }

    // second constructor with two parameters and set 0 for yearsPlaying
    public Musician(String name, String instrument) {
        this(name, instrument, 0);

    }

    //public methods
    public void rehearse() {
        skillLevel += 0.5;
        yearsPlaying += 1;
    }

    public void perform() {
        skillLevel++;
    }

    public String toString() {
        String s = "My name is " + name + ".";
        String r = " I have been playing " + instrument + " for " + yearsPlaying + " years.";
        return s + r;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public int getYearsPlaying() {
        return yearsPlaying;
    }

    public double getSkillLevel() {
        return skillLevel;
    }
}