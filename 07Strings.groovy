class StringOperations{
    static main(args) {
    
        String sample = "Hello world"; 
        println(sample[4]); // Print the 5 character in the string
        println(sample[-1]); //Print the 1st character in the string starting from the back 
        println(sample[1..2]);//Prints a string starting from Index 1 to 2 
        println(sample[4..2]);//Prints a string starting from Index 4 back to 2 

        println(sample*3) //Repeat the string 3 times
        println(sample.length())
        println(sample.minus("world"))
    }
}