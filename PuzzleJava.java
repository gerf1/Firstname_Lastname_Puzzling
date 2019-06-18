import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;




public class PuzzleJava {
    public ArrayList < Integer > GreaterThan10andSum() {

        int sum = 0;
        ArrayList < Integer > arr = new ArrayList < Integer > ();
        ArrayList < Integer > newArray = new ArrayList < Integer > ();

        arr.add(3);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(7);
        arr.add(9);
        arr.add(8);
        arr.add(13);
        arr.add(25);
        arr.add(32);

        for (int i = 0; i < arr.size(); i++) {

            sum = sum + arr.get(i);

            if (arr.get(i) > 10) {
                newArray.add(arr.get(i));
            }

        }
        System.out.println("Sum:" + sum);

        return newArray;
    }


    public ArrayList < String > ShuffleArray() {

        ArrayList < String > names = new ArrayList < String > ();
        ArrayList < String > namesSize = new ArrayList < String > ();

        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");

        Collections.shuffle(names);
        System.out.println(names);


        for (int j = 0; j < names.size(); j++) {

            if (names.get(j).length() > 5) {

                namesSize.add(names.get(j));

            }

        }
        return namesSize;


    }


    public ArrayList < String > Alphabet() {
        ArrayList < String > array = new ArrayList < String > ();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            array.add(Character.toString(alphabet.charAt(i)));
        }

        Collections.shuffle(array);
        System.out.println("Shuffle array:" + array);

        System.out.println("Last Letter:" + array.get(array.size() - 1));
        System.out.println("First Letter:" + array.get(0));


        if (array.get(0).equals("a") || array.get(0).equals("e") || array.get(0).equals("i") || array.get(0).equals("o") || array.get(0).equals("u")) {
            System.out.println("The first letter is vowel");

        }

        return array;

    }

    public int[] randomArray() {

        int[] array = new int[10];
        int min = 55;
        int max = 110;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randNum = random.nextInt(max - min) + min;

            array[i] = randNum;


        }

        System.out.println("Random numbers between 55-110" + Arrays.toString(array));
        return array;

    }

    public int[] SortedrandomArray() {

        int[] array = new int[10];
        int[] newArray = new int[2];
        int min = 55;
        int max = 110;
        int MaxValue = 0;
        int MinValue = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randNum = random.nextInt(max - min) + min;

            array[i] = randNum;


        }

        System.out.println("Array" + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Sort Array" + Arrays.toString(array));
        newArray[0] = array[0];
        newArray[1] = array[array.length - 1];
        MaxValue = array[array.length - 1];
        MinValue = array[0];
        System.out.println("Max and Min" + Arrays.toString(newArray));

        return array;
    }


    public String randomString() {
        String word = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int x = random.nextInt(25) + 1;
            word += alphabet.charAt(x);
        }
        return word;
    }
    public ArrayList < String > randomTenString() {
        ArrayList < String > array = new ArrayList < String > ();
        for (int i = 0; i < 10; i++) {
            String x = randomString();
            array.add(x);
        }

        return array;

    }

}