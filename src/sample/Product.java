package sample;

public class Product {
    String name;
    String quantity;
    String old;
    String neu;
    String img;
    String desc;

    public Product(String name, String quantity, String old, String neu, String img, String desc) {
        this.name = name;
        this.quantity = quantity;
        this.old = old;
        this.neu = neu;
        this.img = img;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getNeu() {
        return neu;
    }

    public void setNeu(String neu) {
        this.neu = neu;
    }

    public String showAll(){
        return "{" +name + ", old=" + old + ", new=" + neu +"}";
    }

    public String toString(){

        return "{" +name + ", old=" + old + ", new=" + neu +"}";
    }

}
