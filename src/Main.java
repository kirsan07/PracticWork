import java.nio.file.Paths;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String put = scanner.nextLine();
        String str = scanner.nextLine();
        String[] string = str.split("[\\s]+");
        int one = Integer.parseInt(string[0]);
        int two = Integer.parseInt(string[1]);
        int three = Integer.parseInt(string[2]);
        int four = Integer.parseInt(string[3]);
        int five = Integer.parseInt(string[4]);
        int six = Integer.parseInt(string[5]);
        int seven = Integer.parseInt(string[6]);
        if (one<two & one<three & one<four & one<five & one<six){
            two = two % one *one;
            three = three % one *one;
            four = four % one *one;
            five = five % one *one;
            six = six % one *one;
        }
        else if (two<one & two<three & two<four & two<five & two<six){
            one = one % two *two;
            three = three % two *two;
            four = four % two *two;
            five = five % two *two;
            six = six % two *two;
        }
        else if (three<one &three<two & three<four & three<five & three<six){
            one = one % three *three;
            two = two % three *three;
            four = four % three *three;
            five = five % three *three;
            six = six % three *three;
        }
        else if (four<one &four<three & four<two & four<five &four<six){
            one = one % four *four;
            three = three % four *four;
            two = four % four *four;
            five = five % four *four;
            six = six % four *four;
        }
        else if (five<one & five<three & five<four & five<two & five<six){
            one = one % five *five;
            three = three % five *five;
            four = four % five *five;
            two = two % five *five;
            six = six % five *five;
        }
        else if (six<one & six<three & six<four & six<five & six<two){
            one = one % six *six;
            three = three % six *six;
            four = four % six *six;
            five = five % six *six;
            two = two % six *six;
        }
    }
}