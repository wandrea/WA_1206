package hu.helix.WA.WA_1206;

import com.sun.org.apache.xpath.internal.SourceTree;
import hu.helix.WA.User;

import java.util.Scanner;

public class UserRegistry {

    private User[] users;


    public UserRegistry(){
        users= new User [10];
        init();

    }

    public void run(){
        Scanner scanner= new Scanner(System.in);
        int operation =-1;
        while(operation!=5){
            System.out.print("Válasszon egy menüpontot: ");
            operation = scanner.nextInt();
            switch(operation){
                case 1:
                    printAllUser();
                    break;
                case 2:
                    addNewUser();
                    break;
                case 3:
                    break;
                case 4:
                     break;
                case 5:
                    System.out.println("Kilépés...");
                default:
                    printMenu();


            }


        }


    }

public void printAllUser(){
    for (int i = 0; i < users.length; i++) {

        if(users[i] != null) {
            System.out.print(" id: " + users[i].getId());
            System.out.print(", \tfirstname: " + users[i].getFirstname());
            System.out.print(", \tlastname: " + users[i].getLastname());
            System.out.print(", \tpassword: " + users[i].getPassword());
            System.out.println(", \tage: " + users[i].getAge());
        }
    }
}

    private void printMenu(){
        System.out.println("*************Menu**********");
        System.out.println("****Print all User (1)*****");
        System.out.println("****Add new User (2)*******");
        System.out.println("****Modify User (3)********");
        System.out.println("****Delete User(4)*********");
        System.out.println("*********Exit (5)**********");

    }

    private void init(){

        for (int i = 0; i < users.length-1; i++) {

            users[i] = new User();
            users[i].setId(i);
            users[i].setFirstname("alma" + Math.random()*100);
            users[i].setLastname("Béla" + Math.random()*100);
            users[i].setPassword("jelszó" + Math.random()*100);
            users[i].setAge((int) (Math.random() * 100));


        }



    }



    private void addNewUser(){
        boolean hasPlace=false;


        for (int i = 0; i < users.length; i++) {

            if (users[i] == null) {
                Scanner scanner = new Scanner(System.in);
                User user = new User();


                int id=0;
                for (int j = 0; j < users.length; j++) {
                    if(users[j]!=null && users[j].getId() >= id){
                        id=users[j].getId() + 1;
                    }

                }

                String firstname;
                String lastname;
                String password;
                int age;

                System.out.println("firstname: ");
                firstname = scanner.next();
                System.out.println("lastname: ");
                lastname = scanner.next();
                System.out.println("password: ");
                password = scanner.next();
                System.out.println("age: ");
                age = scanner.nextInt();


                user.setId(id);
                user.setFirstname(firstname);
                user.setLastname(lastname);
                user.setPassword(password);
                user.setAge(age);

                users[i] = user;

                hasPlace = true;

                break;


            }
        }
            if(!hasPlace){
                System.out.println("nincs  több hely ");


        }


    }


private void modifyUser(){
    Scanner scanner = new Scanner();
    System.out.println("Kérem az id-t: ");
   int modifyId = -1;
    modifyId=scanner.nextInt();
    
   if (modifyId==//tömbe szereplő id-kal!!){

   }

}
private void deleteUser(){

}


}
