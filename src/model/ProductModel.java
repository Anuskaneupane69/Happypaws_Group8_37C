package model;


public class ProductModel {
    private String productName;
    private int productPrice;
    private int productRating;
    private String img; // stores image path
    private int productId;

    // Full constructor
    public ProductModel(String productName, String img, int productPrice, int productRating, int productId) {
        this.productName = productName;
        this.img = img;
        this.productPrice = productPrice;
        this.productRating = productRating;
        this.productId = productId;
    }

    // Optional constructor with only essential info
    public ProductModel(String productName, String img, int productPrice) {
        this(productName, img, productPrice, 0, 0); // default rating and ID
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductRating() {
        return productRating;
    }

    public void setProductRating(int productRating) {
        this.productRating = productRating;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}