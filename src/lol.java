import java.util.Scanner;

public class lol {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine() + " b";
        //one(str);
        //two(str);
        //three(str);
    }

    public static void one (String str){
        int count = 0;
        int state = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ')
            {
                state = 1;
            }
            else if ((c == 'а' || c == 'и' || c == 'е' || c == 'ё' || c == 'о' || c == 'у' || c == 'ы' || c == 'э' || c == 'ю' || c == 'я') && state == 1)
            {
                count++;
                state = 0;
            }
            else
            {
                state = 0;
            }
        }
        System.out.println(count);
    }

    public static void two (String str){
        Scanner strScanner = new Scanner(str);
        String word = strScanner.next();
        int count = 0;
        while (word.compareTo("b") != 0){
            if(word.length() == 3){
                count++;
            }
            word = strScanner.next();
        }
        System.out.println(count);
    }

    public static void three (String str){
        Scanner ha = new Scanner(str);
        String word = ha.next();
        String maxWord = word;
        while(word.compareTo("b") != 0){
            word = ha.next();
            if(word.length() >= maxWord.length()) maxWord = word;
        }
        System.out.println(maxWord);
    }
}

