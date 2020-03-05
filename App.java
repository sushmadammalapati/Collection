package com.epam.Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
public class App  implements Collection<Student>
{

     ArrayList<Student> studentList;
     static String S;
     Integer R;
 public App()
 {  
 studentList = new ArrayList<Student>(10);
 }

 public int size()
 {
 
 return studentList.size();
 }
 @Override
public boolean add(Student std)
{
return studentList.add(std);
}
@Override
public boolean remove(Object std)
{

return studentList.remove(std);
}
public void delete() {
        if(studentList.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
   System.out.println("Enter the student roll_no you want to delete");
    int n;
    @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
    n=s.nextInt();
     for (int i = 0; i < studentList.size(); i++)
       {
     
           Student data = studentList.get(i);
          if (data.roll ==n)
          {
           System.out.println(data.roll+" "+data.name+" "+data.sec+ " is deleted");
           studentList.remove(data);
           } 
       }
       } }
public void printAll()
{
	if(studentList.isEmpty()) {
		System.out.println("List contains no records");
	}
	else
System.out.println(studentList);
}


public static void main(String[] args)
{
String name;
int rol_no ,n;
char sec;
Student std,st;
try (Scanner sc = new Scanner(System.in)) {
App class1 = new App();
System.out.println("How many students you want to add to the list");
n = sc.nextInt();
for (int i =0;i<n;i++)
{
System.out.println("Enter the student rol_no , name & sec");
rol_no = sc.nextInt();
name = sc.next();
sec = sc.next().charAt(0);
std = new Student(rol_no,name,sec);
class1.add(std);
}
class1.printAll();
System.out.println(class1.size());
  int i,j;
Boolean flag=true;
while(flag) {
    System.out.println("Enter the operation do you want perform");
System.out.println("1:Add\n2:Delete\n3:Print");
    @SuppressWarnings("resource")
	Scanner b =new Scanner(System.in);
i=b.nextInt();
switch(i) {
    case 1:
        System.out.println("how many students you want to add to the list");
         j = b.nextInt();
        for (int k =0;k<j;k++)
        {
            System.out.println("enter the student rol_no , name & sec");
            rol_no = b.nextInt();
            name = b.next();   
            sec = b.next().charAt(0);
            st = new Student(rol_no,name,sec);
            class1.add(st);
        }
        break;
    case 2:class1.delete();
        break;
    case 3:class1.printAll();
        break;
    default :
        flag=false;
        System.out.println("Exited");
        break;
}   
}
}
}

@Override
public boolean addAll(Collection<? extends Student> std)
{
// TODO Auto-generated method stub
return studentList.addAll(std);
}

@Override
public void clear()
{
// TODO Auto-generated method stub

}

@Override
public boolean contains(Object std)
{
// TODO Auto-generated method stub
return false;
}

@Override
public boolean containsAll(Collection<?> std)
{
// TODO Auto-generated method stub
return false;
}

@Override
public boolean isEmpty()
{
// TODO Auto-generated method stub
return studentList.isEmpty();
}

@Override
public Iterator<Student> iterator()
{
// TODO Auto-generated method stub
return null;
}



@Override
public boolean removeAll(Collection<?> std)
{
// TODO Auto-generated method stub
return studentList.removeAll(studentList);
}

@Override
public boolean retainAll(Collection<?> std)
{
// TODO Auto-generated method stub
return false;
}

@Override
public Object[] toArray()
{
// TODO Auto-generated method stub
return null;
}

@Override
public <T> T[] toArray(T[] std)
{
// TODO Auto-generated method stub
return null;
}

}
 class Student
{
    int roll;
         String name;
         char sec;
         Student(int roll, String name, char sec)
        {  
            this.roll = roll;
            this.name = name;
            this.sec = sec;  
        }
         @Override
         public String toString()
         {
         return String.format(roll + " " + name+" "+sec );
         } 
 	 }