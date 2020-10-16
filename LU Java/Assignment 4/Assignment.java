// LetsUpgrade Java Essentials October 2020
// Assignment Day 5 | 14th October 2020

// Questions 1:
// Make the complete quiz application on your own.

import java.util.Scanner;

class Question {
    Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctAnswer,userAnswer;

    public boolean askQuestion() {
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("Please choose the correct option");
        userAnswer=sc.nextInt();
        if(userAnswer==correctAnswer) {
            return true;
        }
       return false;
    }
}

class Player {
    Scanner sc=new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails(){
        System.out.println("Enter your name");
        name=sc.next();
    }
}

class Game {
    Question[] questions=new Question[4];
    Player player=new Player();
    String[] questionsdata={"Who is the Strongest Avenger?","What is the closest planet to sun?","What is the capital of australia?","Which is neither prime nor composite number?"};
    String[] options1={"Ironman","Earth","Sydney","0"};
    String[] options2={"Thor","Venus","Perth","1"};
    String[] options3={"Hulk","Mercury","Melbourne","2"};
    String[] options4={"Dr Strange","Jupiter","Canberra","3"};
    int[] answers={2,3,4,1};

    public void initGame() {
        for(int i=0;i<4;i++) {
            questions[i]=new Question();
        }

        for(int i=0;i<4;i++) {
        questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }
    }

    public void play() {
          player.getDetails();
          for(int i=0;i<4;i++) {
              boolean status=questions[i].askQuestion();
              if(status==true) {
                  System.out.println("Correct answer!!");
                  player.score=player.score+5;
              }
              else {
                  System.out.println("Your answer is Wrong!");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" Your score is "+player.score);

    }
}


public class Assignment {
   public static void main(String[] args) {
        Game game=new Game();
        game.initGame();
        game.play();
    }
}
