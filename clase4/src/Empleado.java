import java.util.Arrays;

public class Empleado {
     String name;
     Integer age;
     String role;
     Double experienceInFactory;


    public Empleado(String name, Integer age, String role, Double experienceInFactory) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.experienceInFactory = experienceInFactory;
    }

    public void showAttributes (){
        String[] list =  {name, age.toString(), role, experienceInFactory.toString()};
        System.out.println(Arrays.toString(list));
    }

    public Boolean manipularMaquinaria  () {
        return experienceInFactory > 3;
    }

}
