package loops;


import java.lang.reflect.Array;

class Car {
        private String color;
        public Car(String c) {  //constructor
            color=c;
        }
        public void setColor(String newColor) {  //a function taking an argument and returning nothing
            color=newColor;
        }
        public String getColor() {  //a function not taking any argument, but returning a String
            return color;
        }
        public void honk() {  //a function neither taking any argument, nor returning anything
            System.out.println("Beep Beep!!!");
        }
    }

    class MainClass {
        public static void main(String args[]) {


            Car myCars[] = new Car[5];  //array to store 5 Car objects

            int i;
            for (i = 0; i < 3; i++)  //instantiating the first three cars using a loop

                myCars[i] = new Car("Red");
            //instantiating the other two cars separately

            myCars[3] = new Car("Black");


            myCars[4] = new Car("White");

            System.out.println(myCars[2].getColor());  //getting and printing the color of the Car at index 2

            myCars[2].setColor("Gray");  //changing its color to "gray". Note that I am sending an argument here


            System.out.println(myCars[2].getColor());  //now the new color will be printed
            for (i = 0; i < 5; i++) {
                //calling the functions for each of the object
                System.out.print("My " + myCars[i].getColor() + " honks: ");
                myCars[i].honk();
            }
        }
    }


