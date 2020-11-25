package Orelly;

public class InitializingAnObjectWithValuesInTheConstructor {
    public static void main(String[] args) {

        Product product = new Product("kindle");
        TopCEO jeffBezos = new TopCEO("Jeff Bezos", "Amazon", product);

        System.out.println(jeffBezos.getName());
        System.out.println(jeffBezos.getCompanyName());
        System.out.println(jeffBezos.getProduct());
    }

    static class TopCEO {
        private static String name;
        private static String companyName;
        private static Product product;

        public TopCEO(String name, String companyName, Product product){
            this.name = name;
            this.companyName = companyName;
            this.product = product;

        }
        public static String getName(){
            return name;
        }
        public static String getCompanyName(){
            return companyName;
        }

        public static String getProduct(){
            return product.getName();
        }
        // Due to the all variables are private, the only place where we can access those fields is within the class,
        //which is not what we want. We have two options: Create a constructor or create public setter methods.
        //Since we don't have many private variables, the best option is to initialize the variables via constructor.
        //If we had more than four variables, it would be harder to manage the initialization of the instance in a constructor.
        //The builder design pattern is a better option to initialize complex instances.
    }
    static class Product {
        String name;

          Product (String name){
                this.name = name;
            }
            public String getName(){
                return this.name;
            }
        }
    }

