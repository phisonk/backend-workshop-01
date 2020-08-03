public class HelloWorld {
    public String sayHi(){
        return "Hello World";
    }
    public String sayHi(String name){
        String result = name.substring(0,1).toUpperCase()+name.substring(1);
        return "Hello "+ result;
    }

}
