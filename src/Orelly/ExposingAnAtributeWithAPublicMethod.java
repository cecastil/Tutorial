package Orelly;


//The idea for this pattern is that we can to encapsulation the information, we creating a setter and getter method for
//each variable.
public class ExposingAnAtributeWithAPublicMethod {
    public static void main(String[] args) {

        Pet santas = new Pet(); //we create an object for Pet class
        santas.setName("Santa's Little Helper"); //invoked the method setName in the Pet constructor
        SimpsonCharacter simpson = new SimpsonCharacter();//we created an object for simpsonCharacter

        simpson.setName("Homer"); //we are setter the name in simpson object
        simpson.setPet(santas);// and we are setter the namePet in simpsonPet
        simpson.setAge(35);
        simpson.setFamilyName("Simpson");
        simpson.setHeight(1.83);
        simpson.setStyle("Casual");

        System.out.println(simpson.getFamilyName());
        System.out.println(simpson.getName());//we getter the simpsonCharacter name
        System.out.println(simpson.getAge());
        System.out.println(simpson.getHeight());
        System.out.println(simpson.getStyle());
        System.out.println(simpson.getPetName());//we getter the simpsonPet name
    }

     static class SimpsonCharacter{
        private String name;
        private String familyName;
        private int age;
        private double height;
        private String style;
        private Pet pet;
        public SimpsonCharacter(){
            pet = new Pet();
        }
        public String getName(){//the getter method
            return name;
        }
        public String getFamilyName(){
            return familyName;
        }
        public void setFamilyName(String familyName){
            this.familyName = familyName;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
        public double getHeight(){
            return height;
        }
        public void setHeight(double height){
            this.height = height;
        }
        public String getStyle(){
            return style;
        }
        public void setStyle(String style){
            this.style = style;
        }
        public void setName(String name){//the setter method
            this.name = name;
        }
        public String getPetName(){//we are invoke the getName method for the Pet class from the SimpsonCharacter class
            return pet.getName();
        }
        public void setPet (Pet pet){//we are set the Petname from Pet class to SimpsonCharacter class
            this.pet = pet;
        }
     }

     static class Pet{
        private String name;
        public String getName(){
            return name;
        }
        public void setName (String name){//we need to invoke this method later we will instance an object pet
            this.name = name;
        }


     }
}
