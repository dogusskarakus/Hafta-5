import java.util.Scanner;

public class PatikaStore {
    private boolean isMenu=true;
    private Scanner scan = new Scanner(System.in);

    public void Store() {
        while (isMenu) {
            System.out.println("PatikaStore Ürün Yönetim Paneli ! ");
            System.out.println();
            System.out.println("1 - Notebook İşlemleri ");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.println();
            System.out.print("Tercihiniz : ");

            switch (scan.nextInt()) {
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.menu();
                    break;


                case 2:
                    System.out.println("sdddd");
                    break;


                case 3:
                    Brand.printBrands();
                    break;


                case 0:
                    System.out.println("Çıkış yapılıyor.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Yanlış Değer Girdiniz !!");
                    break;
            }


        }

    }


}
