package LambdaExpressions_22;
// used to define anonymus methods, nameless methods or functions
// help with defing the interfaces


// if the interface is having single abstract method then the interface  is called funtional intereface
@FunctionalInterface
interface MyLambda{
    void display();
}

//class My implements MyLambda{
//    public void  display(){
//        System.out.println("hello World");
//    }
//}


public class Lambda_01_demo {
    public static void main(String[] args) {
        // Anynomus inner class
//        MyLambda m=new MyLambda(){
//            public void display(){
//                System.out.println("hellp Word");
//            }
//        };

        // Lambda Expression
        MyLambda m=()->{
            System.out.println("hello World");
        };
        m.display();
    }
}
