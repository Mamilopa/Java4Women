package ExcCollectionsW6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        String[] his = {"Arvid", "Anna", "Adam", "Albert", "August", "Doris", "Wilhelm"};
        String[] hers = {"Stefan", "Sara", "Sune", "Hugo", "Lotta", "Anna", "Adam", "Albert", "Anton"};
        String[] Zacks = {"Hugo", "Albert", "Arvid", "Anna", "Zack"};

        ArrayList<String> hisFriends = new ArrayList<>(Arrays.asList(his)); //asList för att göra an array till en List
        ArrayList<String> herFriends = new ArrayList<>(Arrays.asList(hers));
        ArrayList<String> zacksFriends = new ArrayList<>(Arrays.asList(Zacks));

        ArrayList<String> allInvited = new ArrayList<>();

        allInvited.addAll(hisFriends);
        allInvited.addAll(herFriends);
        allInvited.addAll(zacksFriends);

        allInvited.sort(null);
        Collections.sort(allInvited);

        Collections.shuffle(allInvited);
        
        
  for (int i = 1; i <= allInvited.size(); i++) {
      String string = allInvited.get(i-1);
      System.out.println(string + ", your seat number is: " + i);   
                //System.out.println(i);
        
                
//                for (String string : allInvited) {
//            }

        }

        allInvited.forEach(name -> System.out.println(name));
        //allInvited.forEach((String name)-> System.out.println(name));
        allInvited.removeIf(name -> name.startsWith("A"));
        //allInvited.forEach(name-> System.out.println(name));

//       Iterator iter= allInvited.iterator();
//       
//        while (iter.hasNext()){
//        String string= (String) iter.next();
//        if (string.startsWith("A")){
//        iter.remove();
//                }
//           }
//        System.out.println("After remove");
//        for (String string : allInvited) {
//            System.out.println(string);
//            
//        }
//        
//        for (String string : allInvited) {
//            if (string.equalsIgnoreCase("Wilhelm")){
//if (string.equalsIgnoreCase("Doris"))
//    allInvited.remove("Wilhelm");
//                //System.out.println("You are not invited");
//
//                //System.out.println("Dear " + string + " You are not invited to the party" );
//                        }else{
//            
//            System.out.println("Dear " +string + " You are invited to the party");
    }

    //System.out.println(allInvited);
    //Collections.sort(hisFriends);
//        hisFriends.sort(null);
//        herFriends.sort(null);
//        zacksFriends.sort(null);
//        System.out.println(hisFriends);
//        System.out.println(herFriends);
//        System.out.println(zacksFriends);
//        
//        Collections.addAll(allInvited, "Tiger","Lion","Sheep");//lägger in objects i en ArrayList
//        Collections.fill(allInvited, "Post");//Fyller positioner som finns i en ArrayList med object
//        System.out.println(allInvited);
//        
}
