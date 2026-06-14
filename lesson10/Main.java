import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        Question[] questions = new Question[10];

        questions[0] = new Question("2 + 2 = ?");
        questions[0].add(new Answer("3", false));
        questions[0].add(new Answer("5", false));
        questions[0].add(new Answer("4", true));
        questions[0].add(new Answer("9", false));
        questions[0].showUUID();
        String users[][] = new String[10][3];
        int userCount = 0;
        while (true) {
            System.out.println("1 ---> Sing in");
            System.out.println("2 ---> Registration");
            int n = scan.nextInt();
            
            //sign in block
            if(n == 1){
                System.out.println("Write your name: ");
                String  name = scan.next();
                System.out.println("Write password:");
                String password = scan.next();

                for (int i = 0; i < 10; i++) {
                    
                    if(name.equals(users[i][0])  && password.equals(users[i][1]) ){
                        if(users[i][2].equals(String.valueOf(Role.Teacher))){
                        teacherMenu(scan, questions);
                        }
                        studentMenu(scan, questions, users);
                    }
                }
                
            }

            //registration block
            else if(n == 2 ){
                System.out.println("Write your name: ");
                String  name = scan.next();
                System.out.println("Write password:");
                String password = scan.next();
                System.out.println("If you are Teacher Write T");
                String role  = scan.next();
                Role r = Role.Student;
                if (role.equals("T")) {
                    r = Role.Teacher;
                }
                
                for (int i = 0; i < 10; i++) {
                    
                    if(name.equals(users[i][0])  && password.equals(users[i][1]) ){
                            System.out.println("User already exists");
                            break;
                    }
                    if (users[i][0] == null) {
                        users[i][0] = name;
                        users[i][1] = password;
                        users[i][2] = String.valueOf(r);
                        System.out.println("User successful add");
                        break;
                    }
                }
                for (int i = 0; i < 10; i++) {
                        System.out.print(users[i][0]);
                        System.out.print(" ");
                        System.out.print(users[i][1]);
                        System.out.print(" ");
                        System.out.println(users[i][2]);
                }
            }
        }
    }





    public static void studentMenu(Scanner scan,Question[] questions,String[][] userResult ){
System.out.println("1 ---> Start");
System.out.println("2 ---> Exit");
int choise = scan.nextInt();
int resultIndex = 0;
if (choise == 2) {
    return;
}

for (Question q:questions) {
    if (q==null) {
        continue;
    }
    q.show();
    System.out.println("\nAnswer:");
    int answerIndex = scan.nextInt();
    boolean result = q.getAnswers()[answerIndex-1].corect();
    userResult[resultIndex][0] = q.getQuestionText();
    userResult[resultIndex][1] = q.getAnswers()[answerIndex-1].text();
    userResult[resultIndex][2] = String.valueOf(result);
    resultIndex++;
}

System.out.println("\nResult:");


for (int i = 0; i < 10; i++) {
    if (userResult[i][0] != null && userResult[i][1] != null && userResult[i][2]!=null) {
        System.out.println(
            "Question "+userResult[i][0]+
            " Choisen Answer "+userResult[i][1]+
            " Is corect "+ userResult[i][2]
        );
    }
}

}

public static void teacherMenu(
        Scanner scan,
        Question[] questions) {

    while (true) {

        System.out.println("1. Create Quiz");
        System.out.println("2. Delete Quiz");
        System.out.println("3. List Quiz");
        System.out.println("4. Update Quiz");
        System.out.println("5. Exit");

        int choice = scan.nextInt();

        switch (choice) {

            case 1 -> createQuiz(scan, questions);

            case 2 -> deleteQuiz(scan, questions);

            case 3 -> {

                for (Question q : questions) {

                    if (q != null)
                        q.show();
                }
            }
            case 4 -> {
                updateQuiz(scan, questions);
            }

            case 5 -> {
                return;
            }
        }
    }
}


public static void createQuiz(
        Scanner scan,
        Question[] questions) {

    int index = -1;

    for (int i = 0; i < questions.length; i++) {
        if (questions[i] == null) {
            index = i;
            break;
        }
    }

    if (index == -1) {
        System.out.println("Question list is full");
        return;
    }

    scan.nextLine();

    System.out.print("Question: ");
    String questionText = scan.nextLine();

    Question question = new Question(questionText);

    for (int i = 0; i < 4; i++) {

        System.out.print("Answer " + (i + 1) + ": ");
        String answerText = scan.nextLine();

        System.out.print("Is correct (true/false): ");
        boolean correct = scan.nextBoolean();
        scan.nextLine();

        question.add(new Answer(answerText, correct));
    }

    questions[index] = question;

    System.out.println("Quiz created successfully");
}

public static void deleteQuiz(
        Scanner scan,
        Question[] questions) {

    System.out.println("Questions:");

    for (int i = 0; i < questions.length; i++) {

        if (questions[i] != null) {
            System.out.println(
                    (i + 1) + ". "
                    + questions[i].getQuestionText()
            );
        }
    }

    System.out.print("Choose question number: ");
    int number = scan.nextInt();

    if (number < 1 ||
            number > questions.length ||
            questions[number - 1] == null) {

        System.out.println("Question not found");
        return;
    }

    questions[number - 1] = null;

    System.out.println("Question deleted");
}
public static void updateQuiz(Scanner scan, Question[] questions){

    for (int i = 0; i < questions.length; i++) {

        if (questions[i] != null) {
            System.out.println(
                    (i + 1) + ". "
                    + questions[i].getQuestionText()
            );
        }
    }

    System.out.print("Choose question: ");
    int index = scan.nextInt() - 1;

    scan.nextLine();

    System.out.print("New question: ");
    String newQuestion = scan.nextLine();

    questions[index] = new Question(newQuestion);

    System.out.println("Updated");
}

}




