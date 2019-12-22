package my.game;

import java.util.Scanner;


public class MyGame {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String a;
       
       int playerHealth = 500;
       int MonsterHealth = 1000;
       System.out.println("Firmly you decide to go the Kingdom to rescue the Princes while you  sense the monster coming");
        System.out.println("what will you do?");
        System.out.println("A.Face the monster and fight for it");
        System.out.println("B. make a plan to attack");
        System.out.println("C..Run and hide on a tree");
        a = sc.next();
        switch (a) {
            case "a":
            case "A":
                System.out.println("you will lose 100 Health");
                playerHealth -= 100;
                break;
            case "b":
            case "B":
                System.out.println("You will be safe if you kill the monster");
                System.out.println();
                break;
            case "c":
            case "C":
                System.out.println("you can fight if you want");
                System.out.println();
                break;
            default:
                System.out.println("Inavalid Key");
                System.out.println();
        
            
            
        }
        System.out.println("You proceed going to the Kingdom while you passing the bridge there are dragon blowing a fire on you");
        System.out.println("what will you do?");
        System.out.println("1.You will use a sword to fight");
        System.out.println("2.Fight and Fight");
        System.out.println("3.Kill them");
        a = sc.next();
        switch (a) {
            case "a":
            case "A":
                System.out.println("The monster step backward and got angered");
                System.out.println();
                break;
            case "b":
            case "B":
                System.out.println("The monster will be destroyed");
                System.out.println();
                break;
            case "c":
            case "C":
                System.out.println("Mission completed");
                System.out.println();
                break;
            default:
                System.out.println("Inavalid Key");
                System.out.println();
                
        }
        System.out.println("After the sword thrown by you the monster suddenly go near you and attack you in close");
        System.out.println("what will you do?");
        System.out.println("A. you will use your sword and shield");
        System.out.println("2. safe place ");
        System.out.println("3.you can go away to safe place");
        a = sc.next();
        switch (a) {
            case "a":
            case "A":
                System.out.println("the monster has been slain and you can pass through");
                System.out.println();;
                break;
            case "b":
            case "B":
                System.out.println("Suddenly the dragon will be vanished");
                System.out.println();
                break;
            case "c":
            case "C":
                System.out.println("They will follow you and pass through the drak road but it takes time");
                System.out.println();
                break;
            default:
                System.out.println("Inavalid Key");
                System.out.println();
                
        }
        System.out.println("After you pass the dark road you encounter land mind, he said asnwer his riddle, what has three eye but cannot see? he said if you can't answer you will lose 50 life");
        System.out.println("what will be your answer?");
        System.out.println("A. Clyclopes");
        System.out.println("B.Giant");
        System.out.println("C. third eye");
        a = sc.next();
        switch (a) {
            case "a":
            case "A":
                System.out.println("the land mind will struck you and powerfull punch");
                playerHealth -=50;
                System.out.println();
                break;
            case "b":
            case "B":
                System.out.println("the land mind will struck you sharp nail");
                playerHealth -=50;
                System.out.println();
                break;
            case "c":
            case "C":
                System.out.println("you have wisdom and you will pass through");
                break;
            default:
                System.out.println("Inavalid Key");
                System.out.println();
                
                
        }
        System.out.println("rhere was a great mist on the road and you feel something strange");
        System.out.println("would you to proceed to the next level?");
        System.out.println("A.Yes");
        System.out.println("B. No");
        System.out.println("C. not yet ready for the fight");
        a = sc.next();
        switch (a) {
            case "a":
            case "A":
                System.out.println("you will going to fall into the cave you will lose 20 Health");
                playerHealth -= 20;
                System.out.println();
                break;
            case "b":
            case "B":
                System.out.println("you will be safe if you did not kill the monster");
                break;
            case "c":
            case "C":
                System.out.println("you will die or lose ");
                break;
            default:
                System.out.println("Inavalid Key");
                System.out.println();
                
        }
        System.out.println("After you said NO you go to the other way and to that way there was a white lady");
        System.out.println("what will you do to surpass it?");
        System.out.println("A. fight for what is right");
        System.out.println("B. let the white lady disappear");
        System.out.println("C. rape the white lady and dive");
        a = sc.next();
        switch (a) {
            case "a":
            case "A":
                System.out.println("if you fight the white lady will going to disappear and you pass and you will rewarded a golden sword");
                System.out.println();
                break;
            case "b":
            case "B":
                System.out.println("the white lady will not disappear");
                break;
            case "c":
            case "C":
                System.out.println("the white lady can't be lured it will going to rape and you will lose 10 Health");
                break;
            default:
                System.out.println("Inavalid Key");
                System.out.println();   
                
                
                
        }
        System.out.println("After you pass the dark road you encounter land mind, he said asnwer his riddle, what has three eye but cannot see? he said if you can't answer you will lose 50 life");
        System.out.println("what will be your answer?");
        System.out.println("A. Clyclopes");
        System.out.println("B.Giant");
        System.out.println("C. third eye");
        a = sc.next();
        switch (a) {
            case "a":
            case "A":
                System.out.println("the land mind will struck you and powerfull punch");
                playerHealth -=50;
                System.out.println();
                break;
            case "b":
            case "B":
                System.out.println("the land mind will struck you sharp nail");
                playerHealth -=50;
                System.out.println();
                break;
            case "c":
            case "C":
                System.out.println("you have wisdom and you will pass through");
                break;
            default:
                System.out.println("Inavalid Key");
                System.out.println();
                
                
        }
        System.out.println("rhere was a great mist on the road and you feel something strange");
        System.out.println("would you to proceed to the next level?");
        System.out.println("A.Yes");
        System.out.println("B. No");
        System.out.println("C. not yet ready for the fight");
        a = sc.next();
        switch (a) {
            case "a":
            case "A":
                System.out.println("you will going to fall into the cave you will lose 20 Health");
                playerHealth -= 20;
                System.out.println();
                break;
            case "b":
            case "B":
                System.out.println("you will be safe if you did not kill the dragon");
                break;
            case "c":
            case "C":
                System.out.println("you will die or lose ");
                break;
            default:
                System.out.println("Inavalid Key");
                System.out.println();
                
        }
        System.out.println("After you killed the white lady the kingdom catches you eyes and you go over there and while going there there was a final wave a with a thousand monsters");
        System.out.println("what will you going to do?");
        System.out.println("A. fight for the princess and rescue her and use the power of the golden sword and all the powers you gathered");
        System.out.println("B. you wil abandon your mission");
        System.out.println("C. pray for it and haved faith on God so that the thousands monster will vanish");
        a = sc.next();
        switch (a) {
            case "a":
            case "A":
                System.out.println("if you fight fot the thousands monster they will not be totally defeated their life will be lessen");
                System.out.println();
                break;
            case "b":
            case "B":
                System.out.println("the game is over");
                break;
            case "c":
            case "C":
                System.out.println("God can defeat the thousands monster beacause he is powerfull");
                break;
            default:
                System.out.println("Inavalid Key");
                System.out.println();   
         
        
        System.out.println("after you defeat the the devil moaster you will leave  happily ever after");
       
        
        a = sc.next();
        
            switch (a) {
                
                
            }
        
    }
}

} 
            

       
    
    

