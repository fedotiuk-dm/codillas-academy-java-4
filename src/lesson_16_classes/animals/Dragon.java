package lesson_16_classes.animals;

public class Dragon {

    private String name;
    private int age;
    private double weight;
    private String voice;
    private String fire;
    private BreedType breedType;

    public Dragon() {
        System.out.println("Створено невідомого дракона");
    }

    public Dragon(String name, int age, double weight, String voice, String fire, BreedType breedType) {
        System.out.println("Створено повноцінного дракона");

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.voice = voice;
        this.fire = fire;
        this.breedType = breedType;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        this.fire = fire;
    }

    public BreedType getBreed() {
        return breedType;
    }

    public void setBreed(BreedType breedType) {
        this.breedType = breedType;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", voice='" + voice + '\'' +
                ", fire='" + fire + '\'' +
                ", breedType=" + breedType +
                '}';
    }
}
