public class Product {
    private static int count = 1;
    private int id;
    private String title;
    private long cost;

    public Product(String title) {
        this.id = count++;
        this.title = title;
        this.cost = (long) (Math.random() * 100);
    }

    @Override
    public String toString() {
        return String.format(id+ ". Product: " + title + ", price: " + cost + ".\n");
    }
}
