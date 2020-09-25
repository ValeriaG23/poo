import com.company.Telefon;

class Main {
    public static void main(String[]args){
        Telefon xioami= new Telefon ("pocophone", "negru", 2019, "xioami");
        xioami.setCuloare("ROSU");

        System.out.println(xioami.print());
    }
}