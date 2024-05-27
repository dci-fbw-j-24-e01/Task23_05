package sixth;

import org.junit.Test;

public class Compare {
    @Test
    public void testMain (){
        Animal animal = new Animal("Animal");
        Animal dog = new Dog("Dog");
        Animal cat = new Cat("Cat");
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
