package JavaCodeGeeks;

public class InheritanceExample {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println("...");
        Bird bird = new Bird();
        System.out.println("...");
        Dog dog = new Dog();
        System.out.println("...");
        animal.eat();
        animal.sleep();
        System.out.println("...");
        bird.eat();
        bird.sleep();
        System.out.println("...");
        dog.eat();
        dog.sleep();
        System.out.println("...");
        A a = new A();
        System.out.println("...");
        B b = new B();

        System.out.println("Inheritance and cast");
        Animal a1 = new Dog();
        Animal a2 = new Bird();
        a1.eat();
        a2.sleep();

        System.out.println("The instanceOf operator");
        Dog d = new Dog();
        if(d instanceof Animal){
            Animal r = (Animal) d;
            r.sleep();
        }

        System.out.println("Interface ...");

        Team team = new Team("Team silicates");
        team.printBasketBallName();
        team.printFootballTeam();

        System.out.println("Single Inheritance ...");
        System.out.println("Multilevel inheritance...");


    }
    public interface BasketBallTeam{
         void printBasketBallName();
    }
    public interface FootballTeam{
        void printFootballTeam();
    }
    public static class Team implements BasketBallTeam,FootballTeam{
        private String name;
        public Team (String name){
            this.name=name;
        }

        @Override
        public void printBasketBallName() {
            System.out.println("Basketball team: \"" + name + "B.C. \"");
        }

        @Override
        public void printFootballTeam() {
            System.out.println("Football team: \"" + name + "F.C.\"");
        }
    }
}
class A{
    public A(){
        System.out.println("This is class A");
    }

}
class B extends A{
    public B(){
        super();
        System.out.println("This is class B");
    }

}
 class Animal{
    public Animal(){
        System.out.println("A new animal has been created!");
    }
    public void sleep(){
        System.out.println("An animal sleeps...");
    }
    public void eat(){
        System.out.println("An animal eats...");
    }
}

 class Bird extends Animal{
    public Bird(){
        super();
        System.out.println("A new Bird has been created!");
    }

     @Override
     public void sleep() {
         System.out.println("A Bird is sleeps...");
     }

     @Override
     public void eat() {
         System.out.println("A Bird is eats...");
     }
 }

 class Dog extends Animal{
    public Dog(){
        super();
        System.out.println("A new Dos has been created!");
    }

     @Override
     public void sleep() {
         System.out.println("The dog is sleeps...");
     }

     @Override
     public void eat() {
         System.out.println("The dog is eats...");
     }
 }
 //
 //Single Inheritance
 //
 class Employee{
    private String name;
    private String id;
    private int age;

    public Employee(String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }
 class SalariedEmployee extends Employee{
    private double empSalary;
    public SalariedEmployee(String name, String id, int age, double empSalary){
        super (name, id, age);
        setEmpSalary(empSalary);
    }

     public double getEmpSalary() {
         return empSalary;
     }

     public void setEmpSalary(double empSalary) {
        if(empSalary >= 0.0){
            this.empSalary = empSalary;
        }
     }
 }

 //
 //Multilevel inheritance
 //

 class Person {
    private String name;
    private String id;
    private int age;
    public Person(String name, String id, int age){
        this.age = age;
        this.name = name;
        this.id = id;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }

 class SecondEmployee extends Person{
    private String department;
    private String designation;
    public SecondEmployee(String name, String id, int age, String department, String designation){
        super(name, id, age);
        this.department = department;
        this.designation = designation;
    }

     public String getDepartment() {
         return department;
     }

     public void setDepartment(String department) {
         this.department = department;
     }

     public String getDesignation() {
         return designation;
     }

     public void setDesignation(String designation) {
         this.designation = designation;
     }
 }

 class Manager extends SecondEmployee{
    private Employee[] reports;
    public Manager(String name, String id, int age, String department, String designation){
        super(name, id, age, department, designation);
    }

    public Employee[] getReports(){
        return reports;
    }
    public void setReports (Employee[] reports){
        this.reports = reports;
    }
 }

 //
 //Hierarchical Inheritance
 //

class PermanentEmployee extends Employee{
    private int salary;

     public PermanentEmployee(String name, String id, int age) {
         super(name, id, age);
     }
    public int getSalary(){
         return salary;
    }
    public void setSalary(){
         this.salary = salary;
    }
 }

 class ContractEmployee extends Employee{
    private int contractPeriod;
    private int contractAmount;
    public ContractEmployee(String name, String id, int age){
        super(name, id, age);
    }

     public int getContractPeriod() {
         return contractPeriod;
     }

     public void setContractPeriod(int contractPeriod) {
         this.contractPeriod = contractPeriod;
     }

     public int getContractAmount() {
         return contractAmount;
     }

     public void setContractAmount(int contractAmount) {
         this.contractAmount = contractAmount;
     }
 }

 class VendorEmployee extends Employee{
    private String vendor;
    public VendorEmployee(String name, String id, int age){
        super(name, id, age);
    }

     public String getVendor() {
         return vendor;
     }

     public void setVendor(String vendor) {
         this.vendor = vendor;
     }
 }