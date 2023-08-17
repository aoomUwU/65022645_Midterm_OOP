class Product {
    private String name;
    private double price;

    public void getName(){
        System.out.println("Product Name: "+name);
    }
    public void setName(String name){
        this.name = name;
    }
 
    public void getPrice(){
        System.out.println("Product Price: "+price);
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void getInfo(){
        this.getName();
        this.getPrice();
    }
}

class Book extends Product{
    private String author;
    private int pages;

    public void getAuthor(){
        System.out.println("Author: "+author);
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public void getPages(){
        System.out.println("Number of Pages: "+pages);
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public void getInfo(){
        super.getInfo();
        this.getAuthor();
        this.getPages();
    }
}

class Electronics extends Product{
    private String brand;
    private String model;
    
    public void getBrand(){
        System.out.println("Brand: "+brand);
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void getModel(){
        System.out.println("Model: "+model);
    }
    public void setModel(String model){
        this.model = model;
    }
    public void getInfo(){
        super.getInfo();
        this.getBrand();
        this.getModel();
    }
}
class Smartphone extends Electronics {
    private String OperatingSystem;

    public void getOperatingSystem(){
        System.out.println("Operating System: "+OperatingSystem);
    }
    public void setOperatingSystem(String OperatingSystem){
        this.OperatingSystem = OperatingSystem;
    }
    public void getInfo(){
        super.getInfo();
        this.getOperatingSystem();
    }
}

class F {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("chair");
        p1.setPrice(500.0);
        p1.getInfo();
        System.out.println("******************************");
        Electronics p2 = new Electronics();
        p2.setName("Television");
        p2.setPrice(20000.0);
        p2.setBrand("Samsung");
        p2.setModel("Neo QLED");
        p2.getInfo();
        System.out.println("******************************");
        Smartphone p3 = new Smartphone();
        p3.setName("Iphone");
        p3.setPrice(40000.0);
        p3.setBrand("Apple");
        p3.setModel("Iphone 99");
        p3.setOperatingSystem("ios");
        p3.getInfo();
        System.out.println("******************************");
        Book p4 = new Book();
        p4.setName("OOP Programming");
        p4.setPrice(250.0);
        p4.setAuthor("John Doe");
        p4.setPages(300);
        p4.getInfo();
        System.out.println("******************************");
    }
}