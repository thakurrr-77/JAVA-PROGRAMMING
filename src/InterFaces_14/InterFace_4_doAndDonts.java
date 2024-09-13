package InterFaces_14;
interface Test1{
    // by default interfaces are Public And Abstract
    // abstract method cant be private
    // yes we can have identifiers in interfact byt should be writeen in uppercase
    // the identifiest are by default static and final
    // interface can have static  methods with the body

    int X=10;
    public abstract void meth1();

    abstract void meth2();
    // default methods are also allowed from java 8 onwards in interface
    default  void meth3(){
        System.out.println("I am meth 3 of test ");
        meth5();
    }
    // private method can also be decalred in interface but can not be abstract and will only will be available in the interface hence will be internally used in the interface  ;
    private void meth5(){
        System.out.println("i am private meth 5 of test");
    };
}
// A interface can be extended from other interface
interface Test2 extends Test1{
    void meth4();
}
class My1 implements  Test2{
    public void meth1(){}
    public void meth2(){}
    public void meth4(){}
}
public class InterFace_4_doAndDonts {
    public static void main(String[] args) {
        System.out.println(Test1.X);
        Test1 t=new My1();
        t.meth3();
    }
}
