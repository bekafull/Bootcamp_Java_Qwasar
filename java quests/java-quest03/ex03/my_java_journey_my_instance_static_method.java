class MyFirstClass{
    static int value = 10;
    static int getValue(){
        return value = 42;
    }
    static void setValue(){
        System.out.println(MyFirstClass.getValue());
    }
}