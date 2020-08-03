public class HelloWorld {
    public String sayHi(){
        return "Hello World";
    }
    public String sayHi(String name){
        //https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        String result = name.substring(0,1).toUpperCase()+name.substring(1);
        return "Hello "+ result;
    }

}
