public class TestPet { 
   public static void main (String[] args) {
      Pet pet1 = new Pet("Rocco", "Dog", "Poodle", "Brown", 0.5);
      Pet pet2 = new Pet("Kobe", "Dog", "Rhodesian", "Brown", 7.0);
      
      /*
      Rocco.name = "Rocco";
      Rocco.animal = "Dog";
      Rocco.breed = "Poodle";
      Rocco.age = 5;
      Rocco.color = "Brown";
      */
      System.out.println("My pet's name is " + pet1.name + " and he is a " + pet1.color + " " +  pet1.breed + " " + pet1.animal);
/*      
      if (Rocco.age < 1) { 
           System.out.println(Rocco.name + " is less than 1 year old. They're a baby");
      } else { 
           System.out.println(Rocco.name + " is growing up fast!");
    }
*/    
    if (pet1.isGrownUp()) { 
           System.out.println(pet1.name + " is less than 1 year old. They're a baby");
      } else { 
           System.out.println(pet1.name + " is growing up fast!");
    // --  get set area --      
    // if 
    
    
    }

    }
}