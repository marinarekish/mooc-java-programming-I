
public class Main {

    public static void main(String[] args) {
//        SimpleDate simpleData = new SimpleDate(25, 12, 2024);
//        
//        System.out.println(simpleData);
//        
//        simpleData.advance();
//        System.out.println(simpleData);
//        
//        simpleData.advance(5);
//        System.out.println(simpleData);
        
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(790);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }

        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
//        System.out.println("Try " + date.afterNumberOfDays(790));

        SimpleDate now = new SimpleDate(13, 2, 2015);
        SimpleDate afterOneWeek = now;
        afterOneWeek.advance(7);

        System.out.println("Now: " + now);
        System.out.println("After one week: " + afterOneWeek);
    }
}
