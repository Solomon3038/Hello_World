package FilterName;


    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Path;
    import java.nio.file.Paths;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.Stack;


public class DateDemo {




        public static void main(String args[]) throws IOException {
            // Instantiate a Date object
            Date date = new Date();

            // display time and date using toString()
            System.out.println(date.toString());




            Date dNow = new Date( );
            SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

            System.out.println("Current Date: " + ft.format(dNow));

        }


    }







