public class HelloWorld {

    public String sayHello() {
        return "hello Worlds";
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.sayHello());
    }
}
