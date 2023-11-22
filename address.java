
package bvnbuoi5;
import java.util.Scanner;
public class address {

    private String commune;
    private String district;
    private String city;

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city; 
    }

    public address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public address() {
    }
    public void input(){
        Scanner s =  new Scanner(System.in);
        System.out.println("Nhap xa : ");
        commune = s.nextLine();
        System.out.println("Nhap huyen : ");
        district = s.nextLine();
        System.out.println("Nhap tinh : ");
        city = s.nextLine();
        
    }
    public void output(){
        
        System.out.println("Xa : "+this.commune);
        System.out.println("Huyen : "+this.district);
        System.out.println("Tinh : "+this.city);
        
    }

}
