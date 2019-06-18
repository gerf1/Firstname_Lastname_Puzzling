import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJavaTest {
    public static void main(String[] args){

    	PuzzleJava puzzlejava = new PuzzleJava();
    	System.out.println(puzzlejava.GreaterThan10andSum());
        System.out.println(puzzlejava.ShuffleArray());
        System.out.println(puzzlejava.Alphabet());
        System.out.println(Arrays.toString(puzzlejava.randomArray()));
        System.out.println(Arrays.toString(puzzlejava.SortedrandomArray()));
        System.out.println(puzzlejava.randomString());
        System.out.println(puzzlejava.randomTenString());

    	}
}