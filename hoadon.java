
package bvnbuoi5;

import java.util.*;
public class hoadon {
    private String sign;
    private String number;
    private String date;
    private nguoiban seller;
    private Khachhang buyer;
    private List<hanghoa> goods;
    private Double totalPrice;

    public hoadon(String sign, String number, String date, nguoiban seller, Khachhang buyer, List<hanghoa> goods, Double totalPrice) {
        this.sign = sign;
        this.number = number;
        this.date = date;
        this.seller = seller;
        this.buyer = buyer;
        this.goods = goods;
        this.totalPrice = totalPrice;
    }

    public hoadon() {
        this.sign = "";
        this.number = "";
        this.date = "";
        this.seller = new nguoiban();
        this.buyer = new Khachhang();
        this.goods = new ArrayList<hanghoa>();
        this.totalPrice = 0.0;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public nguoiban getSeller() {
        return seller;
    }

    public void setSeller(nguoiban seller) {
        this.seller = seller;
    }

    public Khachhang getBuyer() {
        return buyer;
    }

    public void setBuyer(Khachhang buyer) {
        this.buyer = buyer;
    }

    public List<hanghoa> getGoods() {
        return goods;
    }

    public void setGoods(List<hanghoa> goods) {
        this.goods = goods;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sign: ");
        String sign = scanner.nextLine();
        setSign(sign);

        System.out.print("Enter number: ");
        String number = scanner.nextLine();
        setNumber(number);

        System.out.print("Enter date: ");
        String date = scanner.nextLine();
        setDate(date);

        System.out.println("Enter seller: ");
        nguoiban seller = new nguoiban();
        seller.input();
        setSeller(seller);

        System.out.println("Enter buyer: ");
        Khachhang buyer = new Khachhang();
        buyer.input();
        setBuyer(buyer);

        System.out.print("Enter number of goods: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter goods " + (i + 1) + ": ");
            hanghoa goods = new hanghoa();
            goods.input();
            this.goods.add(goods);
        }

        Double totalPrice = 0.0;
        for (hanghoa goods : this.goods) {
            totalPrice += goods.getPrice() * goods.getQuantity();
        }
        setTotalPrice(totalPrice);

    }

    public void output() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%70s\n", "HOA DON BAN HANG");
        System.out.printf("%80s\n%83s\n%61s\n", "Ky hieu: " + getSign(), "So hoa don: " + getNumber(), "Ngay: " + getDate());
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println(seller);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println(buyer);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        sortGoodsByPrice();
        System.out.printf("%-21s%-21s%-21s%-22s%-22s%s\n", "STT" , "Ten hang hoa", "Don vi tinh", "So luong", "Don gia", "Thanh tien");
        for(int i = 0; i < getGoods().size(); i++){
            System.out.printf("%-21d%-20s %-20s %-21d %-21.3f %.3f\n", (i + 1), getGoods().get(i).getName(), getGoods().get(i).getUnits(),
                    getGoods().get(i).getQuantity(), getGoods().get(i).getPrice(), getGoods().get(i).total());
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Tong tien: " + getTotalPrice());
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }

    public void sortGoodsByPrice() {
        for (int i = 0; i < goods.size() - 1; i++) {
            for (int j = i + 1; j < goods.size(); j++) {
                if (goods.get(i).getPrice() < goods.get(j).getPrice()) {
                    hanghoa temp = goods.get(i);
                    goods.set(i, goods.get(j));
                    goods.set(j, temp);
                }
            }
        }
    }
}
