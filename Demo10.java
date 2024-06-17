class A
{
    static int x =10;
    static void display()
    {
        System.out.println("hi A class Display method");
    }
}

class Demo10 {
    public static void main(String[] args)
    {
        //A a = new A();
        A.display();
        System.out.println(A.x);
    }
}
