public class menuItems {
    private int price;
    private String description;
    private String category; /*Appetisers, Main course, Dessert */
    private boolean updatedDate;
    private String appetisers;
    private String MainCourse;
    private String dessert;


    public boolean getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(boolean updatedDate) {
        this.updatedDate = updatedDate;
        if (updatedDate = true) {
            System.out.println("The menu is updated recently and exciting new items are added.");
        }else {
            System.out.println("This is the old menu");

        }
    }

    public void setPrice(int price) {
        this.price = price + 10;
        System.out.println("The bill with tax $10 added :" + this.price);
    }
    public int getPrice(){
        return price;
    }

    public void setCategory(){
        this.category = category;
        System.out.println("The category has Appetizers, Main course and Desserts.");
    }
   public String getCategory(){
        return category;
   }
   public void setDescription(){
        this.description = description;
       System.out.println(this.appetisers + "- Is the ");
   }
}
