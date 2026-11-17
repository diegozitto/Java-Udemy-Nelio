package _13_Heranca_Polimorfismo.exFixacao.application;

import _13_Heranca_Polimorfismo.exFixacao.entities.ImportedProduct;
import _13_Heranca_Polimorfismo.exFixacao.entities.Product;
import _13_Heranca_Polimorfismo.exFixacao.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Product #%d data:\n" ,i+1);
            System.out.print("Common, used or imported (c/u/i)? ");
            String answer = sc.next();
            
            System.out.print("Name: ");
            String name = sc.next();
            
            System.out.print("Price: ");
            Double price = sc.nextDouble();
               
                if (answer.contains("i")){
                    System.out.print("Customs fee:");
                    Double customsFee = sc.nextDouble();
                    products.add(new ImportedProduct(name,price,customsFee));
                } else if (answer.contains("u")){
                    System.out.print("Manufacture date (DD/MM/YYYY):" );
                    Date manufactureDate = sdf.parse(sc.next());
                    products.add(new UsedProduct(name,price,manufactureDate));
                } else {
                    products.add(new Product(name,price));
                }
        }

        System.out.println();

        System.out.println("PRICE TAGS:");
        for(Product p : products){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
