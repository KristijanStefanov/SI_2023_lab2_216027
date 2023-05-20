import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
 @Test
 void testEveryBranch(){
     RuntimeException ex;
     User user1 = null;
     User user2 = null;
     User user3 = null;
     User user4 = null;
     List<User> list=new ArrayList<>();
     User finalUser = user1;
     ex = assertThrows(RuntimeException.class, ()-> SILab2.function(finalUser,list));
     assertTrue(ex.getMessage().contains("Mandatory information missing!"));
     user1= new User("Kiko","finki123","stefanov_kiko@yahoo.com");
     user2= new User("Stefi","finki123","stefanov_kiko@yahoo.com");
     list.add(user1);
     list.add(user2);

     assertEquals(false,SILab2.function(user1,list) );
     user3= new User(null,"fnki1","stefanovkikoyahoo.com");
     list.add(user3);
     assertEquals(false,SILab2.function(user3,list) );
     user4= new User("Kiko","finki123_","stefanovkiko@yahoo.com");
     list.add(user4);
     assertEquals(false,SILab2.function(user4,list) );
 }
 @Test
    void multipleConditionsTest(){
     List<User> lista2=new ArrayList<>();
     User user1= new User(null,"finki1234","sef_ki@yahoo.com");
     lista2.add(user1);
        assertEquals(false,SILab2.function(user1,lista2));
        User user2= new User("Kiko","finki1234","stefanov_kiko@yahoo.com");
     lista2.add(user2);
        assertEquals(false,SILab2.function(user2,lista2));
 }
}