package ch07.sec07.exam08.ex01;

public class MainExample {

   public static void main(String[] args) {
      Animal animal;
      Bird bird = new Bird();//Animal영역+Bird영역
      Dog dog = new Dog();//Animal영역+Dog영역
      Fish fish = new Fish();//Animal영역+Fish영역
      
      animal = bird;//Bird객체가 Animal 타입으로 변환
      animal.say();
      animal = dog;
      animal.say();
      animal = fish;
      animal.say();

   }

}