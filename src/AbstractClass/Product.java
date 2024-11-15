package AbstractClass;

public abstract class Product {
    protected String name;
    protected String brand;

    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public abstract double getPrice();
    public abstract String getDescription();

    public void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Description: " + getDescription());
        System.out.println("Price: Rs." + getPrice());
    }
}

class ElectronicsProduct extends Product {
    private double price;

    public ElectronicsProduct(String name, String brand, double price) {
        super(name, brand);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return "Electronics - " + name + " by " + brand;
    }
}

class ClothingProduct extends Product {
    private double price;
    private String size;

    public ClothingProduct(String name, String brand, double price, String size) {
        super(name, brand);
        this.price = price;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return "Clothing - " + name + " by " + brand + ", Size: " + size;
    }
}

class BookProduct extends Product {
    private double price;
    private String author;

    public BookProduct(String name, String brand, double price, String author) {
        super(name, brand);
        this.price = price;
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return "Book - " + name + " by " + author;
    }
}

class Shopping {
    public static void main(String[] args) {
        Product[] shoppingCart = {
            new ElectronicsProduct("Laptop", "Dell", 75349.49),
            new ClothingProduct("T-Shirt", "Nike", 799.99, "L"),
            new BookProduct("Effective Java", "Pearson", 1289.49, "Joshua Bloch")
        };

        double totalPrice = 0; 
        for (Product product : shoppingCart) {
            totalPrice+=product.getPrice();
            product.displayProductDetails();
            System.out.println();
        }
        
        System.out.println("Total Price : Rs."+totalPrice);
    }
}

