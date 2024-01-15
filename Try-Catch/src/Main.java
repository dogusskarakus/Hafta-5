import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("Program Başladı ");
        System.out.print("İndex numarası Giriniz :");
        int x = input.nextInt();

        try {
            int result = arrList(arr,x);
            System.out.print("İndeks değeri : "+ result);


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hatalı İndeks Değeri Girdiniz ");
        }


    }


    public static int arrList(int arr[], int x) throws ArrayIndexOutOfBoundsException{
        if (x < 0 || x> arr.length){
          throw new ArrayIndexOutOfBoundsException();
        }
        return arr[x];

    }

}

