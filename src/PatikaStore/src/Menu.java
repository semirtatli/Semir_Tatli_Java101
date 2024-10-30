import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {

    private final ArrayList<Brand> brands = new ArrayList<>();
    private ArrayList<Phone> phones = new ArrayList<>();
    private ArrayList<Notebook> notebooks = new ArrayList<>();
    private int productIdCounter = 1;
    public Menu(){
        initializeBrands();
        initializePhones();
        initializeNotebooks();
        MainPage();
    }
    private void initializeBrands() {
        brands.add(new Brand(1, "Apple"));
        brands.add(new Brand(2, "Asus"));
        brands.add(new Brand(3, "Casper"));
        brands.add(new Brand(4, "HP"));
        brands.add(new Brand(5, "Huawei"));
        brands.add(new Brand(6, "Lenovo"));
        brands.add(new Brand(7, "Monster"));
        brands.add(new Brand(8, "Samsung"));
        brands.add(new Brand(9, "Xiaomi"));

    }

    public void  initializePhones(){
        phones.add(new Phone(productIdCounter++,brands.get(0),"IPhone 13",40000.0,0,23,128,6.1,3000,4,"White"));
        phones.add(new Phone(productIdCounter++,brands.get(0),"IPhone 15",50600.0,0,54,128,6.1,4000,6,"Black"));
        phones.add(new Phone(productIdCounter++,brands.get(7),"Galaxy S24 Ultra",60000.0,0,43,512,6.8,5000,12,"Black"));
        phones.add(new Phone(productIdCounter++,brands.get(7),"Galaxy S22",18300.0,0,14,128,6.1,3700,8,"White"));
        phones.add(new Phone(productIdCounter++,brands.get(8),"Redmi Note 13 Pro",13700.0,0,13,256,6.6,5000,8,"White"));
        phones.add(new Phone(productIdCounter++,brands.get(8),"Redmi Note 12",7400.0,0,13,128,6.8,5000,8,"Black"));
        phones.add(new Phone(productIdCounter++,brands.get(8),"Redmi Note 10",11900.0,0,13,128,6.6,5000,8,"Blue"));
        phones.add(new Phone(productIdCounter++,brands.get(4),"Nora 12S",20100.0,0,13,128,6.7,4500,8,"Blue"));
        phones.add(new Phone(productIdCounter++,brands.get(4),"Mate Xs",48000.0,0,13,512,6.6,4500,8,"Blue"));
    }

    public void initializeNotebooks(){
        notebooks.add(new Notebook(productIdCounter++,brands.get(0),"Macbook Air",35000.0,0,10,16,256,13));
        notebooks.add(new Notebook(productIdCounter++,brands.get(0),"Macbook Pro",91900.0,0,10,18,512,14));
        notebooks.add(new Notebook(productIdCounter++,brands.get(5),"IdeaPad 3",18000.0,0,10,8,512,15));
        notebooks.add(new Notebook(productIdCounter++,brands.get(5),"IdeaPad Gaming 3",64000.0,0,10,8,256,15));
        notebooks.add(new Notebook(productIdCounter++,brands.get(4),"Matebook D16",20000.0,0,10,8,512,16));
        notebooks.add(new Notebook(productIdCounter++,brands.get(2),"Excalibur",39100.0,0,10,32,512,15));
        notebooks.add(new Notebook(productIdCounter++,brands.get(2),"Nirvana C550",20100.0,0,10,16,512,15));
        notebooks.add(new Notebook(productIdCounter++,brands.get(1),"TUf Gaming",25100.0,0,10,8,512,15));
        notebooks.add(new Notebook(productIdCounter++,brands.get(1),"Vivobook",47500.0,0,10,8,512,15));
        notebooks.add(new Notebook(productIdCounter++,brands.get(7),"Abra A5",39900.0,0,10,32,512,15));
    }

public void MainPage(){
    Scanner sc = new Scanner(System.in);
    int firstChoice;
    int secondChoice = 1;

        do{
        System.out.print("General Choices \n" +
                "1 - Notebook Operations\n " +
                "2 - Phone Operations\n" +
                "3 - Brand List\n" +
                "0 - Exit\n" +
                "Your choice :");
        firstChoice = sc.nextInt();

        if(firstChoice == 1) {
            System.out.print("Notebook Choices \n" +
                    "1 - Notebook List \n " +
                    "2 - Notebook Add \n" +
                    "3 - Notebook Delete\n" +
                    "4 - Notebook Filter\n" +
                    "0 - Exit\n" +
                    "Your Choices :");
            secondChoice = sc.nextInt();

            switch (secondChoice){
                case 1:
                    listNotebook();
                    break;
                case 2:
                    addNotebook();
                    break;
                case 3:
                    System.out.println("Enter the id of the notebook to be deleted");
                    int id = sc.nextInt();
                    for(int i = 0; i < notebooks.size();i++) {
                        if (notebooks.get(i).getId() == id) {
                            notebooks.remove(i);
                        }
                    }
                    break;
                case 4:
                    filterNotebook();
                    break;
                default:
                    secondChoice = 0;
                    break;

            }
        }

        else if(firstChoice == 2) {
            System.out.print("Phone Choices \n" +
                    "1 - Phone List \n " +
                    "2 - Phone Add \n" +
                    "3 - Phone Delete\n" +
                    "4 - Phone Filter\n" +
                    "5 - Exit\n" +
                    "Your Choices :");
            secondChoice = sc.nextInt();

            switch (secondChoice){
                case 1:
                    listPhones();
                    break;
                case 2:
                    addPhone();
                    break;
                case 3:
                    System.out.println("Enter the id of the phone to be deleted");
                    int id = sc.nextInt();
                    for(int i = 0; i < phones.size();i++){
                        if(phones.get(i).getId()== id){
                            phones.remove(i);
                        }

                    }

                    break;
                case 4:
                    filterPhone();
                    break;
                default:
                    secondChoice = 0;
                    break;
            }
        } else if(firstChoice == 3) {
            for (Brand brandList : brands) {
                System.out.println(brandList.getName());
            }

        }




    } while(firstChoice != 0 || secondChoice != 0);
}

    private void filterPhone() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int id = 0;

        String brandName = " ";
        System.out.println("Choose option for filtering\n" +
                "1 - id\n" +
                "2 - name\n" +
                "3 - both");
        choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Enter id");
            id = sc.nextInt();
        }
        if(choice == 2){
            System.out.println("Enter brand name");
            brandName = sc.next();
        }
        if(choice == 3){
            System.out.println("Enter id");
            id = sc.nextInt();
            System.out.println("Enter brand name");
            brandName = sc.next();
        }


        for(int i = 0; i< phones.size();i++){
            if(id != 0){
                if(phones.get(i).getId() == id){
                    System.out.println(phones.get(i).toString());
                }
            }
            else if(!brandName.equals(" ")){
                if(phones.get(i).getBrand().getName().equals(brandName)){
                    System.out.println(phones.get(i).toString());
                }
            }
        }
    }
    private void filterNotebook() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int id = 0;

        String brandName = " ";
        System.out.println("Choose option for filtering\n" +
                "1 - id\n" +
                "2 - name\n" +
                "3 - both");
        choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Enter id");
            id = sc.nextInt();
        }
        if(choice == 2){
            System.out.println("Enter brand name");
            brandName = sc.next();
        }
        if(choice == 3){
            System.out.println("Enter id");
            id = sc.nextInt();
            System.out.println("Enter brand name");
            brandName = sc.next();
        }


        for(int i = 0; i< notebooks.size();i++){
            if(id != 0){
                if(notebooks.get(i).getId() == id){
                    System.out.println(notebooks.get(i).toString());
                }
            }
            else if(!brandName.equals(" ")){
                if(notebooks.get(i).getBrand().getName().equals(brandName)){
                    System.out.println(notebooks.get(i).toString());
                }
            }
        }
    }

    private void addNotebook() {
        Scanner sc = new Scanner(System.in);
        int brand;
        String name;
        double price;
        int discount;
        int stock;
        int RAM;
        int memory;
        double size;
        System.out.println("Enter the properties of notebook");

        brand = chooseBrand();
        System.out.print("\nname: "
        );
        name = sc.nextLine();
        System.out.print("\nprice: "
        );
        price = sc.nextDouble();
        System.out.print("\ndiscount: "
        );
        discount = sc.nextInt();
        System.out.print("\nstock: "
        );
        stock = sc.nextInt();
        System.out.print("\nRAM: "
        );
        RAM = sc.nextInt();
        System.out.print("\nmemory: "
        );
        memory = sc.nextInt();
        System.out.print("\nsize: "
        );
        size = sc.nextDouble();

        notebooks.add(new Notebook(productIdCounter++,brands.get(brand),name,price,discount,stock,RAM,memory,size));
    }

    private void addPhone() {
        Scanner sc = new Scanner(System.in);
        int brand;
        String name;
        double price;
        int discount;
        int stock;
        int RAM;
        int memory;
        double size;
        int battery;
        String colour;
        System.out.println("Enter the properties of notebook");

        brand = chooseBrand();
        System.out.print("\nname: "
        );
        name = sc.next();
        System.out.print("\nprice: "
        );
        price = sc.nextDouble();
        System.out.print("\ndiscount: "
        );
        discount = sc.nextInt();
        System.out.print("\nstock: "
        );
        stock = sc.nextInt();
        System.out.print("\nmemory: "
        );
        memory = sc.nextInt();
        System.out.print("\nsize: "
        );
        size = sc.nextDouble();
        System.out.print("\nbattery: "
        );
        battery = sc.nextInt();
        System.out.print("\nRAM: "
        );
        RAM = sc.nextInt();
        System.out.print("\nColour: "
        );
        colour = sc.next();


        phones.add(new Phone(productIdCounter++,brands.get(brand),name,price,discount,stock,memory, size, battery, RAM, colour));
    }

    private int chooseBrand(){
        Scanner sc = new Scanner(System.in);
        int brand;
        System.out.println("Select Brand with number: " +
                "1 - Apple\n2 - Asus\n3 - Casper\n4 - HP\n5 - Huawei\n6 - Lenovo\n7 - Monster\n8 - Samsung\n9 - Xiaomi"
        );
        brand = sc.nextInt();
        return brand -1;
    }
    private void listNotebook() {
        for(int i = 0; i < notebooks.size(); i++){
            System.out.println(notebooks.get(i).toString());
        }
    }

    private void listPhones() {
        for(int i = 0; i < phones.size(); i++){
            System.out.println(phones.get(i).toString());
        }
    }

    private void removePhone(int id){
        phones.remove(id);
    }

    private void removeNotebook(int id){
        notebooks.remove(id);
    }
}
