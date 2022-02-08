package peaksoft.hw_12;

public class Dog implements Animal{

    private String name;
    private int age;
    private String breed;
    private String color;

    public Dog(){

    }

    public Dog(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "-----Dog-----" +
                "\n \t \t name  = " + name +
                "\n \t \t age   = " + age +
                "\n \t \t breed = " + breed +
                "\n \t \t color = " + color;
    }

    @Override
    public void animalPlus() {
        System.out.println("\t \t PLUS : A dog is man's best friend");
    }

    @Override
    public void animalMinus() {
        System.out.println("\t \t MINUS: Dogs love to play in muddy puddles");
    }
}
