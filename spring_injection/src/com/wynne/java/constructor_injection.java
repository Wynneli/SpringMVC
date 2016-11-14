package com.wynne.java;




import com.wynne.DaoImpl.SpringDao;
import com.wynne.DaoImpl.User;

public class constructor_injection {
   private User user;
   private SpringDao springdao;
   public constructor_injection(User user,SpringDao springdao){
	   this.user=user;
	   this.springdao=springdao;
	   System.out.println("constrctor successful!");
   }
   public void save(){
	   System.out.println("ok");
   }
}
