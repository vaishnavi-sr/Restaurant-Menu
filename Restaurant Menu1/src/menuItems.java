public class menuItems {
    private int price;
    private String description;
    private String category; /*Appetisers, Main course, Dessert */

    public boolean isUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(boolean updatedDate) {
        this.updatedDate = updatedDate;
    }

    private boolean updatedDate;

    public menuItems(int price) {
        this.price = price;
    }
    public void setPrice(price){

    }
}
