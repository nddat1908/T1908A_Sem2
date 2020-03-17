package Java2_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    public static void main(String[] args) {
        String namemovie;
        int size;
        List<String> movie = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        size = scanner.nextInt();
        for ( int  i = 0;i <size;i++){
            namemovie = scanner.next();
            movie.add(namemovie);
        }
        for ( int  i = 0;i <size;i++){
            System.out.println(i+".Name : " + movie.get(i));

        }
        movie.add("Moneyball");
        System.out.println(movie);

        movie.set(2,"Walmart");
        System.out.println(movie);

        movie.remove(4);
        System.out.println("After remove : " + movie);

        System.out.printf("indexOf \"Moneyball\" : " + movie.indexOf("Moneyball"));
    }
}
