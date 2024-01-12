
package lab1d;

public class Lab1d {
    public static class Staff{
        int code;
        String name;
        public void show(){
            System.out.println("I am a staff of code: "+ code +" and name: "+name);
        }
    }
    
    public static class Teacher extends Staff{
        String subject;
        String publication = "Neema";
        @Override
        public void show(){
            System.out.println("I am Teacher teaching subject: "+subject+ " and publication: "+publication);
            System.out.println("I am also a staff of code: "+code);
        }
    }
    public static class Officer extends Staff{
        String grade;
        @Override
        public void show(){
            System.out.println("I am Officer of grade: "+grade);
            System.out.println("I am also a staff of name: "+name);
        }
    }
    public static void main(String[] args) {
        //creating new objects of the class
        Staff s1 = new Staff();
        s1.code = 456;
        s1.name = "Siris";
        s1.show();
        
        Teacher t1 = new Teacher();
        t1.subject = "Computer Science";
        t1.code = 134;
        t1.show();
        
        Officer o1 = new Officer();
        o1.grade = "Senior";
        o1.name = "Sanjay";
        o1.show(); 
    }
}
