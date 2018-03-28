/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author hihi
 */
public class Main {
    public static void main(String[] args) {
        Animal cat=new Cat("Meo");
        Animal dog=new Dog("Cho");
        
        Zoo zoo = new Zoo();
        zoo.add(cat);
        zoo.add(dog);
        zoo.showListAnimal();
    }
}
