package _12_Enumeracoes_Composicao.exFixacao.application;

import _12_Enumeracoes_Composicao.exFixacao.entities.Client;
import _12_Enumeracoes_Composicao.exFixacao.entities.Order;
import _12_Enumeracoes_Composicao.exFixacao.entities.OrderItem;
import _12_Enumeracoes_Composicao.exFixacao.entities.Product;
import _12_Enumeracoes_Composicao.exFixacao.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data:");
        System.out.print("Name:");
        String name = sc.nextLine();

        System.out.print("Email:");

        String email = sc.next();

        System.out.print("Birth date (DD/MM/YYYY):");
        Date birthDate = sdf.parse(sc.next());
        sc.nextLine();

        Client c1 = new Client(name,email,birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();

        System.out.print("How many items to this order?");
        int n = sc.nextInt();

        Order o1 = new Order(new Date(), OrderStatus.valueOf(orderStatus),c1);

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter #%d item data:\n",i+1);
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName,productPrice);

            o1.addItem(new OrderItem(quantity,productPrice,product));

        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + sdfTime.format(o1.getMoment()));
        System.out.println("Order status: " + o1.getStatus());
        System.out.println("Client: " + o1.getClient());
        System.out.println("Order items: ");
        System.out.printf("%.2f%n",o1.total());

        sc.close();
    }
}
