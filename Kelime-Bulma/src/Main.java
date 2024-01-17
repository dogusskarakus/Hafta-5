
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir metin giriniz : ");
        String text = scan.nextLine();

        //Kelimeleri ayırmamızı sağlar
        String[] word = text.split(" ");

        // Kelimelerin kaç geçtiğini tutmak için HashMap kullandık.
        HashMap<String, Integer> textMap = new HashMap<>();


        // Kelime varsa eğer sayısı bir artırılır.
        for (String w : word) {
            if (textMap.containsKey(w)) {
                textMap.put(w, textMap.get(w) + 1);
            } else {
                textMap.put(w, 1);
            }
        }
        int max =0;
        String most = "";
        // Her kelimenin tekrar sayısı kontrol edilir.
        for (Map.Entry<String, Integer> entry : textMap.entrySet()){
            if (entry.getValue() > max){
                max=entry.getValue();
                most= entry.getKey();
            }
        }

        System.out.print("En çok geçen kelime :"+ most + ": "+ max + "'dir ");


    }
}

