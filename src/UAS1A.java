import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UAS1A {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> g = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input jumlah data yang akan diproses : ");
        int u = Integer.parseInt(reader.readLine());
        int counter=0;
        for (int index = 0; index<u;index++){
            counter++;
            System.out.print("masukan nama " + counter + " : ");
            String name = reader.readLine();
            System.out.print("huruf yang akan dihitung : ");
            char s = (char) reader.read();
            g = CountWords(name,s);
        }
        for (int o: g) {
            System.out.print(g + " ");
        }
    }
}
