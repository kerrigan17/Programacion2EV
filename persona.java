public class persona {
    public static void main(String[] args) {
        datos celia = new datos();
        datos Yousef = new datos();

        celia.setName("Celia");
        celia.setAge(24);
        Yousef.setName("Yousef");
        Yousef.setAge(20);

        datos.showInfo(celia);
        datos.adulto(celia);
        datos.showInfo(Yousef);
        datos.adulto(Yousef);
    }
}
