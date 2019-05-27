package com.ys;

public class Main {
    public static void main(String[] args) {
//        String str = "abcdefg" ;
//        for (char c :str.toCharArray()
//             ) {
//            System.out.println(c);
//        }
//        print(1, "Hello YS");
       Animal ys = new Human("YS",25,"China");
       ys.say();
       ys.say();
       Animal y2 = new Human("abc",1,"Japan");
       Animal no = new Animal("Dog ",5);
        System.out.println();
       try {
           System.out.println("This is for try-catch");
       }catch (Exception e){
           e.printStackTrace();
       }
       Animal y1 = new Animal("cat",3);
       y1.say();
    }
    public static void print(int index, Object o){
        System.out.println(index+"、 "+o.toString());
    }

}
