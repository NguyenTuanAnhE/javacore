/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hihi
 */
public class Zoo {
    private List<Animal> animals=new ArrayList<>();
    
    public void add(Animal animal){
        animals.add(animal);
    }
    
    public void remove(Animal animal){
        animals.remove(animal);
    }
    
    public void showListAnimal(){
        for(Animal animal: animals){
            animal.sayHello();
        }
    }
}
