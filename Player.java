
import java.util.Scanner;
public class Player
{
    String Player;
    int dmg;
    int speed;
    int life;
    int input;
    int winCondition;
    int health;
    Scanner In = new Scanner (System.in);
    int chancesHit;
    int enemyHealth;
    String Path = "";

    public Player()
    {
        dmg = 1;
        speed = 1;
        life = 10;
        health = life;
    }

    private void displayStats()
    {
        System.out.println("Here are your stats: ");
        System.out.println("Name: " + Player);
        System.out.println("Damage: " + dmg);
        System.out.println("Speed: " + speed);
        System.out.println("Health Max: " + life);
        System.out.println("Life right now: " + health);
    }

    private void inputName()
    {
        Player = In.next();
    }

    private void fightingInput()
    {
        input = In.nextInt();
        
        if (input == 1)
        {
            System.out.println("You try to hit the enemy!");
            chancesHit = (int) (Math.random() * 10);
            if (chancesHit > 2)
            {
                System.out.println("You hit it! -1 Enemy Health");
                enemyHealth --;
                System.out.println("Enemy Health: " + enemyHealth);
            }
            else 
            {
                System.out.println("You missed! -0 Enemy Health");
                System.out.println("Enemy Health: " + enemyHealth);
            }
        }
        else if (input == 2)
        {
            System.out.println("You chose to run!");
                if (speed < 2)
                {
                    enemyHealth = 0;
                    System.out.println("You ran away!");
                }
                else
                {
                    System.out.println("You ended up tripping and falling, now stop being a baby and go fight!");
                }
        }
        else if (input == 0)
        {
            displayStats();
        }
        else
        {
            System.out.println("Please put an actual number");

        }
        chancesHit = 0;

    }

    private void battleSequence(int Health)
    {
        System.out.println("==================================================================");
        System.out.println("You're in a fight now!");
        System.out.println("Type 1 to attack, 2 to run away, or 0 to view life/stats: ");
        enemyHealth = Health;
        while (enemyHealth > 0)
        { 
            chancesHit =  (int) (Math.random() * 10);
            System.out.println("The enemy tries to attack you!");
            if (chancesHit > 5)
            {
                health --;
                System.out.println("You've been hit! -1 Health");
            }
            else
            {
                System.out.println("The enemy missed! -0 Health");
            }
            fightingInput();
        }
        System.out.println("You won somehow, maybe I should've made this harder.... oh well congrats!");
        System.out.println("==================================================================");
    }

    private void playerInput(String option1, String option2, String option3, String option4)
{
    boolean isValid;
    isValid = false;

    while (isValid == false)
    {
        input = In.nextInt();
    
        if ((input == 1) && (option1.equals("") != true))
        {
            isValid = true;
            System.out.println(option1);
            
        }
        else if ((input == 2) && (option2.equals("") != true))
        {
            isValid = true;
            System.out.println(option2);
        }
        else if ((input == 3)  && (option3.equals("") != true))
        {
            isValid = true;
            System.out.println(option3);
        }
        else if ((input == 4)  && (option4.equals("") != true))
        {
            isValid = true;
            System.out.println(option4);
        }
        else if (input == 0)
        {
            displayStats();
            System.out.println("Now type in 1-4 to make a choice and stop wasting my time.");
        }
        else
        {
            System.out.println("Please enter an actual choice on the screen");
        }
    }
}
/*=========================================================================================================================================================================*/
/* SCENE ONE GAME PLAY!!!! KEEP ORGANIZED!!! */

    public void Scene1()
    {
        System.out.println("1: Sleep (Wow. Boring.)");System.out.println("2: Go to the fridge to eat (Highly doubtful of consequences)");System.out.println("3: Jump out the window (Good luck getting out of a 10 story building.)");System.out.println("4: Go to the market for breakfast (It should be fine...)");
        playerInput("The alluring temptation of sleep lulls you back to sleep. Whatever awaited you couldn't have been that much better, anyway. Game over.",
        "Your hunger is beginning to eat away at you - or that could just be the regret of a bad decision. You open the fridge to see the two week old food beginning to grow limbs. Good luck.",
        "You decide the window is the best way to go... for some reason. In a burst of adrenaline, you leap from the window's frame and catch air before you plummet to the ground into a heap of bloody flesh and regret. Nice job, loser. Game over.", 
        "You decide against anything else and head to the market for some breakfast. Certainly you could find someone willing to give a freeloader like yourself some food. How will you get there?");
            
        if (input == 2)
        {
            battleSequence(5);
            sceneonechoice1();
            
        }
        else if (input == 4)
        {  
            sceneonechoice2();
            
        }
    }
    
    private void sceneonechoice1()
    {
        System.out.println("What to do, what to do..."); System.out.println("1: Vore the survivors (Kinky but okay. They might not be down for that so watch out.)"); System.out.println("2: Eat the dead fruit (Yum...? But okay.)"); System.out.println("3: Consume."); System.out.println("4: Close the fridge and think logically about what just happened (Wow, using your brain for once, huh?)");
        playerInput("You vored the survivors, you sick freak. I'm proud.", 
        "You have eaten the dead. Those that remain await their unavoidable demise. +1 Speed",
        "You have c o n s u m e d. Good. Although now you've eaten too much and are overencumbered. -1 Speed.",
        "You decided to not do anything today since you were too much of a wuss. Good job baby. Gave over.");

        if (input == 1)
        {
            System.out.println("Unfortunately, they did not share the same kink and choked you. Good job idiot, this is why we can't have nice things. Game over.");
        }
        else if (input == 2)
        {
            speed ++;
            sceneonechoice1choice1();
        }
        else if (input == 3) 
        {
            speed --;
            System.out.println("You pack up your simple bags for the trip into town, maybe this time you'd be able to make some friends for once. (Doubtful.)");
            sceneonechoice1choice2();
        } 
    }

    private void sceneonechoice1choice1()
    {
        System.out.println("You should know the drill by now."); System.out.println("1: Go to the woods"); System.out.println("2: Go to the shop (Still the market)"); System.out.println("3: Stay home"); System.out.println("4: Go to the market");
        playerInput("You decided to metagame and go level up your stats at the market when... something starts running at you at practically light speed. Good luck.",
        "The market stands ahead of you, looming on the horizon. Right before you enter the marketplace, something starts approaching you rather quickly.",
        "Like the buffoon you are, you stayed home and did nothing. Game over, idiot.", 
        "You duck into an alleyway to get to the market quicker when a shadowy figure approaches you with something sharp and silver gleaming in his hand. This is what you get for trying to cut corners, moron.");
    
        if (input == 1)
        {
            System.out.println("A homeless man tries to attack you!");
            battleSequence(6);
            Path = "Second choice path";
        }
        else if (input == 2)
        {
            System.out.println("A homeless man tries to rob you!");
            battleSequence(6);
            Path = "First choice path";
            sceneonechoice1choice2();
        }
        else if (input == 4)
        {
            System.out.println("A homeless man tries to rob you!");
            battleSequence(6);
            sceneonechoice1choice2();
        }   
    }

    private void sceneonechoice1choice2()
    {
        System.out.println("You've finally arrived after what should have been a five minute walk and see a crowd of bystanders gathering up. You think there might be a fight breaking out. Will you go check it out?"); System.out.println("1: Yes"); System.out.println("2: No");
        playerInput("The fight intrigues you and perks your curiosity. In an attempt to see what is going on, you push past the crowd of civilians and see two men absolutely duking it out. Your sense of morality forces you to try and intervene. You run through the remaining crowd and slide in between the two men, attempting to stop them. Your instincts fail you and two fists come rushing towards you, smashing your head back and bringing the rest of you into the ground. Your head bounces on the pavement and you hear a crack. Everything goes black.",
        "Your mom always said not to put off what should be done right away. And of course, you listen to your mom. You have no time to deal with a potential fight. You continue to the stalls.", "It says 1 or 2 right?", "It says 1 or 2 right?");
        if (input == 1)
        {
            System.out.println("You are rushed from the fight scene, blood pooling around your cracked head. You are promptly announced dead. The doctors, having seen your moment of good will, decide to revive you with their last remaining revival potion. Oh. They dropped it. Whoops. Yeah, you're dead. Game over.");
        }
        else if (input == 2)
        {
            System.out.println("You head into the shop and talk to the shop owner.");
        }
        else if((input == 3) || (input == 4))
        {
            sceneonechoice1choice2();
        }
        Path = "First choice path";
   
    }

    private void sceneonechoice2()
    {
        System.out.println("1: Walk (Lol, boring but okay.)"); System.out.println("2: Drive (You're not really the best driver, but good luck.)"); System.out.println("3: Ride a horse (Horses? Really? Alright fine, have fun trying to do that.)"); System.out.println("4: Run at a full sprint, knocking over anyone and anything in your path with no concern for others because you are human trash.");

        playerInput("You take a simple walk to the market, the sun is bright and the birds are chirping. You're also boring as hell.",
        "You begin your drive to the market when a dog rushes in front of you. Your life flashed before your eyes and it was... quite sad and lonely really, but in your last moments, you swerve the car and crash into a building. The dog is okay. You are not. Game over.", 
        "You take the horse and for a moment feel like a beautiful teenage girl in a horse movie looking for self-discovery. Otherwise you're fine.",
        "Due to such foolishness, you have fallen to disgrace beneath the weight of your own hubris. Oh, also an old homeless man decided to mug you.");

        if (input == 1)
        {
            sceneonechoice1choice2();
        }
        else if (input == 3)
        {
            sceneonechoice1choice2();
        }
        else if (input == 4)
        {
            battleSequence(7);
            sceneonechoice1choice2();
        }
    }
/* =============================================================================================================================*/
                                                /*SCENE tWOO */
    private void Scene2()
    {
        if (Path.equals("First choice path") == true)
        {
            System.out.println("The shop owner offers you some wares, but they seem out of your financial reach, you offer your services for a quest. He gives you a couple of choices:"); System.out.println("1: Go out and rescue the princess for 100,000,000 gold"); System.out.println("2: Go out and rescue the princess for 100,000,000 gold (Chance for homelessmen)"); System.out.println("3: Go out and rescue the princess for 100,000,000 gold (Chance for homelessmen)"); System.out.println("4: Go home");
            playerInput("You start heading outside, and you thought you'd avoid the homeless guy right? Nope here he comes.", "You head out side and expect a homelessman to rob you once more, but alas you walk all the way to the princess's dungeon.", "You head out side and expect a homelessman to rob you once more, but alas you walk all the way to the princess's dungeon.", "Lame Game Over");
            System.out.println("Need to do");
        }
        else if (Path.equals("Second choice path") == true)
        {
            System.out.println("Need to do");
        }
        else if (Path.equals("") == true)
        {
            System.exit(0);
        }

    }























    public void playGame()
    {
        System.out.print("Please enter name of Player: "); inputName(); System.out.println("Now that we have your name we can play! Type in \"0\" anytime you need to chose an action to view your stats!"); System.out.println("Also the goal of the game is to be an acceptable amount of random... you will probably lose a lot so remeber your routes! However... if you chose a boring route you may have a \"chance\" of losing."); System.out.println("==================================================================================="); System.out.println("We start our quest in 20XX, humanity has reverted back to medival times due to war. You wake up hungry, what will you do? ");
        Scene1();
        Scene2();
        

    }

}


/*

*/