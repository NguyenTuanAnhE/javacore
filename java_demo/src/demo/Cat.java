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
public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    

    @Override
    public void sayHello() {
        System.out.println("Say Hello ima cat");
    }
    
}
