package lab2;

import java.util.ArrayList;

public class Lab2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please add argument");
            return;
        }

        int count = Integer.parseInt(args[0]);
        ArrayList<Product> products = new ArrayList<Product>();

        for (int i = 0; i < count; i++) {
            switch(i % 4) {
                case 0:
                    products.add(new Book());
                    break;
                case 1:
                    products.add(new Picture());
                    break;
                case 2:
                    products.add(new Shoe());
                    break;
                case 3:
                    products.add(new Toy());
                    break;
            }
        }

        products.stream()
         .forEach(product -> product.whoAmI());

        System.out.println();

        products.stream()
         .filter(product -> product instanceof Present)
         .forEach(product -> {
             product.whoAmI();
             System.out.println(((Present) product).itCanBePresented());
         });
    }
}