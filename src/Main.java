import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        // La convertion entre un String et un Int en Java
        // Link of all conversion: https://www.javatpoint.com/java-string-to-int

        // Example 1: The conversion of String into Int using Integer.parseInt()
        String s = "200";
        int i = Integer.parseInt(s);
        System.out.println(i); // Output: 200

        // Example 2: The conversion of String into Long using .parseLong()
        long l = Long.parseLong(s);
        System.out.println(l); // Output: 200

        // Example 3: The conversion of String into Float using .parseFloat()
        float f = Float.parseFloat(s);
        System.out.println(f); // Output: 200.0

        // Example 4: The conversion of String into Double using .parseDouble()
        double d = Double.parseDouble(s);
        System.out.println(d); // Output: 200.0

        // Example 5: The conversion of {Int, Long, Float, Double, Char, Object} into String using .valueOf()
        String s1 = String.valueOf(i);
        String s2 = String.valueOf(l);
        String s3 = String.valueOf(f);
        String s4 = String.valueOf(d);
        System.out.println(String.format("S1 : %s ,S2 : %s ,S3 : %s ,S4 : %s", s1, s2, s3, s4));
        // Char to String
        char c = 'S';
        String strChar = String.valueOf(c);
        System.out.println(strChar); // Output : S
        // Object to string
        Emp e = new Emp("Jhon Doe");
        String string1 = e.toString();
        String str2 = String.valueOf(e);
        System.out.println(string1); // Output : Emp{name='Jhon Doe'}
        System.out.println(str2); // Output: Emp{name='Jhon Doe'}

        // Output: S1 : 200 ,S2 : 200 ,S3 : 200.0 ,S4 : 200.0

        // Example 6: The conversion of String into Date
        String sDate1 = "31/12/1998";
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        } catch (ParseException exp) {
            throw new RuntimeException(exp);
        }
        System.out.println(sDate1 + "\t" + date1); // Output: 31/12/1998	Thu Dec 31 00:00:00 CET 1998

        // Example 7: The conversion of Date into String
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        System.out.println(strDate); // Output: 2022-54-21 10:54:54

        // Example 8: The conversion of String into Char
        String str = "hello";
        char character = str.charAt(0);
        System.out.println(character); //Output:  h

        // Example 9: The conversion of String into Object
        String string = "hello";
        Object obj = string;
        System.out.println(obj); // Output: hello
    }
}