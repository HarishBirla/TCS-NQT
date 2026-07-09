import java.sql.SQLOutput;
import java.util.*;
public class codingKaro {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       //07:49:56

        String s = sc.nextLine();

        int hour = Integer.parseInt(s.substring(0 , 2));
        String minute = s.substring(3 , 5);
        String second = s.substring(6 , 8);
        String period = s.substring(8);

        if(period.equals("AM")){
            if(hour == 12){
                hour = 0;
            }
        }else{
            if(hour != 12){
                hour += 12;
            }
        }
        if(hour < 10){
            System.out.print("0" + hour + ":" + minute + ":" + second);
        }else{
            System.out.println(hour + ":" + minute + ":" + second);
        }



    }
}
