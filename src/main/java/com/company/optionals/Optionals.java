package com.company.optionals;

import java.util.Optional;

public class Optionals {

    //Optionals can only be used in return types
    public static void main(String[] args) {

        //Cat myCat = findCatByName("Mary");  //before optionals
        Optional<Cat> optionalCat = findCatByName("Mary"); //when using optionls
//        if (optionalCat.isPresent()) {
//            System.out.println(optionalCat.get().getAge());
//        } else {
//            System.out.println(0);
//        }

//        Cat myCat = optionalCat.orElse(new Cat("UNKNOWN", 0)); //this line replace all the above code in if statement
//        System.out.println(myCat.getAge());
//this neing the final code to summarize it all

       int age=  optionalCat.map(Cat::getAge) //if it has a value it will return orElse , 0
                .orElseGet(()->{
                    return 0;
                });
        System.out.println(age);
    }
    

    public static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);

        return Optional.ofNullable(cat);

    }

}
