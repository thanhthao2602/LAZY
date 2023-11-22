
package bvnbuoi5;

import java.util.Scanner;
public class person {
  protected String name;
  protected int age;
protected address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    public person(String name, int age, address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public person() { 
        address address = new address();
        this.address=address;
    }
    public void input(){
       
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten : ");
        name = s.nextLine();
        System.out.println("Nhap tuoi : ");
        age = s.nextInt();
        s.nextLine();
        System.out.println("Nhap dia chi : ");
        address.input();
        
                
    }
    public void output(){
        System.out.println("Ten : "+ this.name);
        System.out.println("Tuoi : "+this.age);
        System.out.println("Dia chi : ");
        address.output();
    }

}
