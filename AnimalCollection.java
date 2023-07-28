
import java.util.ArrayList;
import java.util.Collection;

    class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        //write ajava program to display the sum of even numbers less than 8
            public static class AnimalCollection {
                public static void main(String[] args) {
                    // Create an ArrayList to store the animals
                    ArrayList<Animal> animalList = new ArrayList<>();
        
                    // Create some Animal objects and add them to the ArrayList
                    Animal lion = new Animal("Lion");
                    Animal elephant = new Animal("Elephant");
                    Animal giraffe = new Animal("Giraffe");
        
                    animalList.add(lion);
                    animalList.add(elephant);
                    animalList.add(giraffe);
        
        
                    Collection<Animal> animalCollection = animalList;
        
                    for (Animal animal : animalCollection) {
                        System.out.println(animal.getName());
                    }
                }
            }
    }


