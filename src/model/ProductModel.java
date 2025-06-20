package model;

public class ProductModel {
    private String productName;
    private int productPrice;
    private int productRating;
    private String img;
    private int productId;

    // Constructor without productId (set separately if needed)
    public ProductModel(String productName, String img, int productPrice, int productRating, int productId) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
        this.img = img;
        this.productId =productId;
    }
    // New constructor for easy creation without rating and id
    public ProductModel(String productName, String img, int productPrice) {
        this(productName, img, productPrice, 0, 0);
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
