
package bvnbuoi5;

import java.util.*;

public class classroom {
    private static ArrayList<student> hs = new ArrayList<>();
    public void sortbyGPA(){
         for (int i = 0; i < hs.size(); i++) {
            for (int j = i+1; j < hs.size(); j++) {
                if(hs.get(i).getGpa()>hs.get(j).getGpa()){
                    Collections.swap(hs,i,j);
                }
            }
        }
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        boolean bd= true;
        while(bd==true) {
            student student= new student();
            student.input();
            hs.add(student);
            if (student.getId()== 555) bd=false;
        }
    }
    public void output() {
        System.out.printf("%-5s%-15s%-5s%-15s%-15s%-15s%-15s%-10s\n","ID","Name","Age","Commune","District","City","Class","GPA");
        for(student i : hs) {
            i.outputTable();
        }
    }
    public boolean removeByID(int iD) {
        for(student i : hs)
            if(i.getId()== iD){
                hs.remove(i);
                return true;
            }
        return false;
    }
    public classroom( ArrayList<student> hs) {
        this.hs=hs;
    }

    public classroom() {
    }

    public static ArrayList<student> getHs() {
        return hs;
    }

    public static void setHs(ArrayList<student> hs) {
        classroom.hs = hs;
    }
}

