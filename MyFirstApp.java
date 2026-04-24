public class MyFirstApp { //This defines a public class named MyFirstApp
    public static void main(String[] args) { //This is the main method, which is the entry point of the program
        // Each statement must end with a semicolon (;)
       // # 1 Do Something
       int x = 3; //This sets integer x to 3
       String name = "Dirk"; //This sets string name to "Dirk"
       x = x * 17; //This multiplies x by 17 and sets x to the result
       System.out.print("x is " + x); //This prints "x is " followed by the value of x
       double d = Math.random(); //This sets d to a random number between 0.0 and 1.0
       // this is a comment \/ This is a comment

       // # 2 Do Something again and again
       while (x > 12) { //This starts a while loop that continues as long as x is greater than 12
        x = x -1; //This subtracts 1 from x and sets x to the result
       } //This ends the while loop
       for (int i = 0; i < 10; i = i + 1) { //This starts a for loop that initializes i to 0, continues as long as i is less than 10, and increments i by 1 after each iteration
        System.out.print("i is now " + i + "\n"); //This prints "i is now " followed by the value of i
       } //This ends the for loop

       // # 3 do something under this conidtion
       if (x == 10) { //This starts an if statement that checks if x is equal to 10
        System.out.print("x must be 10"); //This prints "x must be 10" if the condition is true
       } else { //This starts an else block that executes if the condition in the if statement is false
        System.out.print("x isn't 10"); //This prints "x isn't 10" if the condition in the if statement is false
       } //This ends the if-else statement
       if ((x < 3) && (name.equals ("Dirk"))) { //This starts an if statement that checks if x is less than 3 and name is equal to "Dirk"
        System.out.println("Gently"); //This prints "Gently" if the condition is true
       } //This ends the if statement
       System.out.print("this line runes no matter what"); //This prints "this line runes no matter what" regardless of any conditions
    } //This ends the main method
} //This ends the MyFirstApp class
