class MethodExample{
    static def methodName(){
        println("This is a sample method")
    }
    static int parameterizedMethod(int a, int b=10){
        return a+b;
    }
    static main(args) {
        methodName();
        println(parameterizedMethod(2,4))
        println(parameterizedMethod(2))
    }
}