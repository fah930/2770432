package Week6OOP;
class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $ " + price);

        if (price > 800) {
            System.out.println("Category: Premium");
        } else if (price > 400) {
            System.out.println("Category: Mid-range");
        } else {
            System.out.println("Category: Budget");
        }
        System.out.println(); // For spacing
    }
}
class Program4 {

        public static void main(String[] args) {
            // Creating objects
            MobilePhone phone1 = new MobilePhone("Apple", "iPhone 13", 999);
            MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S21", 799);
            MobilePhone phone3 = new MobilePhone("Nokia", "C20", 150);

            // Displaying details for each phone
            phone1.showDetails();
            phone2.showDetails();
            phone3.showDetails();
        }
    }



