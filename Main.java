import java.util.Date;

class Main {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(1000);
        System.out.println(date);
        System.out.println(date.toString());
    }
}