public class A {

    public String a;
    protected  X x_object = new X("Xname");

    A (String blabla){
        this.a = blabla;
        System.out.println(blabla);
    }

    A(){
        System.out.println(a);
    }

}
