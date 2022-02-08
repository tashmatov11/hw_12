package peaksoft.hw_12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hw12Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("MyPerson",Person.class);
        System.out.println(person);
        person.getAnimal().animalPlus();
        person.getAnimal().animalMinus();
        System.out.println();

        System.out.println("My best friend");
        Person person1 = (Person) context.getBean("MyFriends",Person.class);
        System.out.println(person1);
        person1.getAnimal().animalPlus();
        person1.getAnimal().animalMinus();
    }
}
