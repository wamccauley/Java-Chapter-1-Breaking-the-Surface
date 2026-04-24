// ============================================================
// Chapter 1 Coding Activity: Phrase-O-Matic
// Head First Java, 3rd Edition - Chapter 1, p. 18
//
// GOAL: Build a program that randomly combines words from three
// lists to generate a fancy-sounding business phrase.
//
// HOW TO WORK THROUGH THIS FILE:
//   - Read each numbered step and the hint beneath it.
//   - Type your code on the blank line(s) below each TODO.
//   - Do NOT delete the TODO comments -- they guide your work.
//   - When you finish all 5 steps, compile and run:
//       javac PhraseOMatic.java
//       java PhraseOMatic
//   - Example output: "What we need is a reactive pub-sub pipeline"
// ============================================================

public class PhraseOMatic {

    public static void main(String[] args) {

        // --------------------------------------------------------
        // STEP 1: Create three word lists (String arrays)
        // --------------------------------------------------------
        // A String array holds multiple String values.
        // Syntax:  String[] arrayName = {"word1", "word2", "word3"};
        //
        // TODO: Declare a String array named wordListOne and fill it
        // with at least 3 words of your choice (or use these):
        // "agnostic", "opinionated", "voice activated", "haptically driven",
        // "extensible", "reactive", "agent based", "functional",
        // "AI enabled", "strongly typed"


        // TODO: Declare a String array named wordListTwo and fill it
        // with at least 3 words of your choice (or use these):
        // "loosely coupled", "six sigma", "asynchronous", "event driven",
        // "pub-sub", "IoT", "cloud native", "service oriented",
        // "containerized", "serverless", "microservices", "distributed ledger"


        // TODO: Declare a String array named wordListThree and fill it
        // with at least 3 words of your choice (or use these):
        // "framework", "library", "DSL", "REST API", "repository",
        // "pipeline", "service mesh", "architecture", "perspective",
        // "design", "orientation"


        // --------------------------------------------------------
        // STEP 2: Find out how many words are in each list
        // --------------------------------------------------------
        // Every array has a .length property that tells you how many
        // items are in it.
        // Syntax:  int myVar = arrayName.length;
        //
        // TODO: Declare an int named oneLength and set it to wordListOne.length


        // TODO: Declare an int named twoLength and set it to wordListTwo.length


        // TODO: Declare an int named threeLength and set it to wordListThree.length


        // --------------------------------------------------------
        // STEP 3: Generate three random numbers
        // --------------------------------------------------------
        // We use java.util.Random to pick a random index for each list.
        // Syntax:  java.util.Random randomGenerator = new java.util.Random();
        //          int rand1 = randomGenerator.nextInt(oneLength);
        //   nextInt(n) gives a random number from 0 up to (but NOT including) n.
        //
        // TODO: Create a Random object named randomGenerator


        // TODO: Declare an int named rand1 and set it to a random number
        //       between 0 and oneLength (use randomGenerator.nextInt(oneLength))


        // TODO: Declare an int named rand2 and set it to a random number
        //       between 0 and twoLength


        // TODO: Declare an int named rand3 and set it to a random number
        //       between 0 and threeLength


        // --------------------------------------------------------
        // STEP 4: Build the phrase by combining one word from each list
        // --------------------------------------------------------
        // Use your random numbers as indexes to pick a word from each array.
        // Syntax:  arrayName[index]  gives you one item from the array.
        // Combine them with + and spaces between:
        //   String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        //
        // TODO: Declare a String named phrase and build it from the three lists


        // --------------------------------------------------------
        // STEP 5: Print out the final phrase
        // --------------------------------------------------------
        // Use System.out.println() to print the phrase.
        // The output should look like:
        //   What we need is a reactive pub-sub pipeline
        //
        // TODO: Print "What we need is a " followed by the value of phrase


    } // end main

} // end PhraseOMatic
