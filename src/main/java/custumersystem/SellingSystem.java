package custumersystem;

import java.util.Scanner;

public class SellingSystem {

    static Scanner sc = new Scanner(System.in);


    // Atributes

    static int id;
    static String description;
    static double price;
    static int quantity;
    static boolean state;


    public static void main(String[] args) {

        createProducts();
        getProducts();
        System.out.println("Ingrese el id del producto a actualizar");
        int id = sc.nextInt();
        updateProducts(id);

        System.out.println("Ingrese el id del producto a eliminar");
        id = sc.nextInt();
        sc.nextLine();
        deleteProducts(id);


    }

    // Clas Methods

    public static void createProducts() {
        System.out.println("Ingrese el id del producto");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del producto");
        description = sc.nextLine();
        System.out.println("Ingrese el precio del producto");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese la cantidad");
        quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el estado del producto");
        state = sc.nextBoolean();
    }

    public static void getProducts() {
        System.out.println("Id: " + id + "\n" +
                "Description: " + description + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity + "\n" +
                "State: " + state + "\n");
    }

    public static void updateProducts(int findId) {

        if (findId == id) {


            System.out.println("Ingrese el id del producto");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del producto");
            description = sc.nextLine();
            System.out.println("Ingrese el precio del producto");
            price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la cantidad");
            quantity = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el estado del producto");
            state = sc.nextBoolean();
        }else {
            System.out.println("Producto no encontrado");
        }
    }
    public static void  deleteProducts(int deleteId){

        if (deleteId == id) {
            id = 0;
            description = "";
            price = 0.0;
            quantity = 0;
            state = false;

        } else {
            System.out.println("Id no encontrado");
        }
    }
}
