package gahee.basic.day08;

// 자바기초.docx 15번

public class Book{
    // 멤버변수
    private String name;         // 책이름
    private String writter;
    private String translator;   // 옮긴이
    private String publisher;    // 출판사
    private String date;         // 출간일
    private int price;           // 책가격
    private double discount;     // 할인가
    private int discountRate;    // 할인율
    private int point;           // 적립금

    // 매개변수가 있는 생성자
     public Book(String name, String writter, String translator, String publisher, String date,
                int price, double discount) {
        this.name = name;
        this.writter = writter;
        this.translator = translator;
        this.publisher = publisher;
        this.date = date;
        this.price = price;
        this.discount = discount;
    }

    // setter/getter
    public void setName(String name) {
        this.name = name;
    }

    public void setWritter(String writter) {
        this.writter = writter;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public String getWritter() {
        return writter;
    }

    public String getTranslator() {
        return translator;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public int getPoint() {
        return point;
    }
}
