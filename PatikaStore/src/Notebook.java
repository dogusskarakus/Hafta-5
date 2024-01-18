import java.util.Scanner;
import java.util.ArrayList;
import java.util.Optional;

public class Notebook extends Product {
    private static int nID=1;
    private static ArrayList<Notebook> notebooks =new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public Notebook(String name, int price, double discountRate, int stock,Brand brand, int memory, double screenSize, int ram) {
        super(nID, name, price, discountRate, stock,brand, memory, screenSize, ram);
        nID++;

    }

    public Notebook() {

    }
    /*static {
        notebooks.add(new Notebook("Macbook",500,5,24,Brand.getBrand(1),500,16,6));
        notebooks.add(new Notebook("Zenbook",600,3,41,Brand.getBrand(2),500,18,8));
        notebooks.add(new Notebook("Nirvana",700,10,16,Brand.getBrand(3),250,20,12));
    }
*/


    @Override
    public void menu(){
        System.out.println("1-Yeni Notebook ekle\n"+
                "2-Notebook listesini görüntüleyin\n"+
                "3-Notebok Silin\n"+
                "4-Notebookları id numarasına göre sıralayın\n"+
                "5-Notebookları markalara göre filtrele\n");

        System.out.print("Yapmak istedeğiniz işlem numarasını seçin : ");
        int select = scanner.nextInt();
        if (select==1) addProduct();
        if (select==2 || select==4) getProducts();
        if (select==3) deleteProduct();
        if (select==5) brandFilter();
    }

    @Override
    public void addProduct(){

        System.out.print("Ürünün Adını Giriniz : ");
        String newName = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Ürünün Fiyatını Giriniz :");
        int newPrice = scanner.nextInt();
        System.out.print("Ürünün indirim oranı :");
        double newDiscountRate = scanner.nextDouble();
        System.out.print("Ürünün Stoğunu Giriniz :");
        int newStock = scanner.nextInt();
        System.out.print("Ürünün Ram bilgisini Giriniz :");
        int newRam = scanner.nextInt();
        System.out.print("Ürünün Hafızası :");
        int newMemory= scanner.nextInt();
        System.out.print("Ürünün Ekran Boyutu :");
        double newscreenSize = scanner.nextInt();
        Brand.printBrands();
        System.out.print("Marka Seçiniz :");
        Brand brand = Brand.getBrand(scanner.nextInt());



        Notebook notebook = new Notebook(newName,newPrice,newDiscountRate,newStock,brand,newMemory,newscreenSize,newRam);
        this.notebooks.add(notebook);
        System.out.println("Yeni Notebook Eklendi");
        System.out.println("Eklenen notebook id : "+notebook.getId());

    }

    @Override
    public void getProducts(){
        printList(null);

    }

    public void printList(ArrayList<Notebook> notebookList){
        if (notebookList==null) notebookList=this.notebooks;

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Notebook n: notebookList){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    n.getId(),n.getName(),n.getPrice(),n.getBrand(),n.getMemory(),n.getScreenSize(),n.getRam(),n.getStock(),n.getDiscountRate());
        }

    }

    public void deleteProduct(){
        getProducts();
        System.out.print("Silinmesini istediğiniz notebook'un Id numarasını giriniz : ");
        int id=scanner.nextInt();
        Optional<Notebook> stuff = notebooks.stream()
                .filter(x->x.getId()==id)
                .findFirst();
        System.out.println("Siliniyor...\nid: "+id);
        stuff.ifPresent(notebook->notebooks.remove(notebook));
        System.out.println("Güncel notebook listesi ");
        getProducts();
    }

    private void brandFilter() {
        scanner.nextLine();
        System.out.print("Filtrelemek istediğiniz ürün markasını giriniz :");
        String filter= scanner.nextLine();
        ArrayList<Notebook> filterNotebooks=new ArrayList<>();
        for (Notebook n:notebooks){
            if(filter.equals(n.getBrand().getName())){
                filterNotebooks.add(n);
            }
        }
        printList(filterNotebooks);
    }

    public static int getnID() {
        return nID;
    }
}


