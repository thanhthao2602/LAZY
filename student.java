
package bvnbuoi5;

import java.util.Scanner;
public class student extends person {
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria =2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

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

    public bvnbuoi5.address getAddress() {
        return address;
    }

    public void setAddress(bvnbuoi5.address address) {
        this.address = address;
    }

    public float getCriteria() {
        return criteria;
    }

    public student(int id, String nameClass, float gpa, String name, int age, bvnbuoi5.address address) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public student(int id, String nameClass, float gpa) {
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public student() {
    }
    
    public int compareTo(student o) {
        return Float.compare(this.gpa, o.gpa);
    }
    @Override
    public void input(){
         Scanner s= new Scanner(System.in);
         super.input();
         System.out.println("Nhap id : ");
         id = s.nextInt();
         s.nextLine();
         System.out.println("Nhap ten lop : ");
         nameClass = s.nextLine();
         System.out.println("Nhap gpa : ");
         gpa = s.nextFloat();
         
    }
      @Override
    public void output() {
        super.output();
        System.out.println("Student ID: "+this.getId());
        System.out.println("Class: "+this.getNameClass());
        System.out.println("GPA: "+this.getGpa());
    }
    public void outputTable() {
        System.out.printf("%-5d%-15s%-5d%-15s%-15s%-15s%-15s%-10.2f\n",this.getId(),this.getName(),this.getAge(),this.getAddress().getCommune(),this.getAddress().getDistrict(),this.getAddress().getCity(),this.getNameClass(),this.getGpa());
    }
     private boolean checkFall()
    {
        if(this.getGpa()< this.getCriteria()) 
            return true;
        return false;
    }
}
