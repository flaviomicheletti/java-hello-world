class Foo
{
    public static void main(String[] args)
    {
        HelloWorld hello = new HelloWorld();
        hello.world();
    }
}

class HelloWorld
{
    HelloWorld()
    {
        System.out.println("Hello ");
    }

    void world()
    {
        System.out.println("world");
    }
}

