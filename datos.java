public class datos {
    private String name;
    private int age;
    private static final int EDAD_POR_DEFECTO = 0;


    public datos(){
        this.name = "";
        this.age = EDAD_POR_DEFECTO;
    }
    public datos(String name){
        this.name = name;
        this.age =EDAD_POR_DEFECTO;
    }

    public datos(String name, int age){
        this.name=name;
        this.age=age;
    }
    String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public static void showInfo(datos persona){
        System.out.println("Nombre: " + persona.getName() + " y edad: " + persona.getAge());
    }
    public static void saludar(datos persona){
        System.out.println("Hola " + persona.getName());
    }
    public static void adulto(datos persona){
        if (persona.getAge()>=0&&persona.getAge()<18){
            System.out.println("Eres menor");
        }else if (persona.getAge()>=18&&persona.getAge()<65){
            System.out.println("Eres mayor de edad");
        }else if (persona.getAge()>=65&&persona.getAge()<120){
            System.out.println("Eres jubilado");
        }else {
            System.out.println("Me has dado una edad errorea");
        }

    }
}
