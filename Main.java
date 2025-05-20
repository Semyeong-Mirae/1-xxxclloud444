// class Animal {
//     void speak(){
//         System.out.println("동물이 소리를 냅니다.");
//     }
    
// }
// class Dog extends Animal{
//     @Override
//     void speak(){
//         System.out.println("멍멍!");
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.speak();
//     }
// }

// class Person {
//     void speak(){
//         System.out.println("Hi");
//     }
// }
// class Korean extends Person{
//         @Override
//         void speak(){
//         System.out.println("안녕하세요");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Korean k = new Korean();
//         k.speak();
//     }
// }

// class Animal{
//     void speak(){
//         System.out.println("동물이 소리를 냅니다.");
//     }
// }

// class Dog extends Animal{
//     @Override
//     void speak(){
//         super.speak();
//         System.out.println("멍멍");
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.speak();
//     }
// }

// class Person{
//     String name = "세명";

//     void introduce(){
//         System.out.println("이름: " + name);
//     }
// }
// class Student extends Person{
//     int grade = 2;

//     @Override
//     void introduce(){
//         super.introduce();
//         System.out.println("학년: " + grade);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.introduce();
//     }
// }

// class Phone {
//     void call(){
//         System.out.println("전화 연결중...");
//     }
// }
// class SmartPhone extends Phone{
//     @Override
//     void call(){
//         super.call();
//         System.out.println("화면에서 통화 앱 실행");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         SmartPhone smart = new SmartPhone();
//         smart.call();
//     }
// }

// class Animal{
//     void speak(){
//         System.out.println("동물이 소리 냄");
//     }
// }

// class Dog extends Animal{
//     void speak(){
//         System.out.println("멍멍!");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal a = new Dog();
//         a.speak();
//     }
// }

// class Animal {
//     void speak(){
//         System.out.println("동물이 소리를 냅니다.");
//     }
// }
// class Cat extends Animal{
//     @Override
//     public void speak(){
//         System.out.println("야옹");
//     }
// }
// class Dog extends Animal{
//     @Override
//     public void speak(){
//         System.out.println("멍멍");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Animal[] animals = new Animal[2];
//         animals[0] = new Cat();
//         animals[1] = new Dog();

//         for (Animal animal : animals){
//             animal.speak();
//         }
//     }
// }

// class Animal {
//     void speak(){
//         System.out.println("동물이 소리를 냅니다.");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.out.println("멍멍!");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Animal a = new Dog();

//         a.speak();

//         Dog d = (Dog) a;
//         d.bark();
//     }
// }

// abstract class Shape{
//     abstract double getArea();
// }
// class Circle extends Shape{
//     double radius = 2.0;
//     double getArea(){
//         return 3.14 * radius * radius;
//     }
// }
// class Rectangle extends Shape{
//     int width = 3, height = 4;
//     double getArea(){
//         return width * height;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Shape[] shapes = {new Circle(), new Rectangle()};
//         for(Shape s : shapes){
//             System.out.println("넓이: " + s.getArea());
//         }
//     }
// }


// abstract class Person{
//     String name;

//     Person(String name){
//         this.name = name;
//     }
//     abstract void printinfo();
// }
// class Student extends Person{
//     int grade;

//     Student(String name, int grade){
//         super(name);
//         this.grade = grade;
//     }
//     @Override
//     void printinfo(){
//         System.out.println("학생 이름: " + name + "학년: " + grade);
//     }
// }
// class Teacher extends Person{
//     String subject;

//     Teacher(String name, String subject){
//         super(name);
//         this.subject = subject;
//     }

//     @Override
//     void printinfo(){
//         System.out.println("교사 이름: " + name + "과목: " + subject);
//     }
// }
// public class Main { 
//     public static void main(String[] args) {
        
//         Person[] people = {
//             new Student("김철수", 2),
//             new Teacher("박선생", "수학"),
//             new Student("이영희", 3)
//         };
            

//         for(Person p : people){
//             p.printinfo();
//         }
//     }
// }

// interface USB{
//     void connect();
// }
// class Mouse implements USB{
//     public void connect(){
//         System.out.println("마우스를 연결합니다!");
//     }
// }
// class Keyboard implements USB {
//     public void connect(){
//         System.out.println("키보드를 연결합니다!");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         USB device = new Mouse();
//         device.connect();
//     }
// }

// interface Switch{
//     void turnOn();
//     void turnOff();
// }
// class Lamp implements Switch{
//     public void turnOn(){
//         System.out.println("전등 켜짐");
//     }
//     public void turnOff(){
//         System.out.println("전등 꺼짐");
//     }
// }
// class Fan implements Switch{
//     public void turnOn(){
//         System.out.println("선풍기 켜짐");
//     }
//     public void turnOff(){
//         System.out.println("선풍기 꺼짐");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Switch sw1 = new Lamp();
//         Switch sw2 = new Fan();

//         sw1.turnOn();
//         sw1.turnOff();

//         sw2.turnOn();
//         sw2.turnOff();
//     }
// }
import java.util.Scanner;

interface Calculator{
    int add(int a, int b);

    default int multiply(int a, int b){
        return a * b;
    }

    static int substract(int a, int b){
        return a - b;
    }
}
class SimpleCalculator implements Calculator{
    @Override
    public int add(int a, int b){
        return a + b;
    }
}
public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calc.add(a,b));
        System.out.println(calc.multiply(a, b));
        System.out.println(Calculator.substract(a, b));
    }
}
