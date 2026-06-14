
/**
 * Меню преподавателя для управления тестами.
 *
 * @param scan объект Scanner для ввода данных
 * @param questions массив вопросов
 */
public class Question extends GenericClass implements Quiz{
    
    private String questionText;
    private Answer[] answers = new Answer[4];
    private int answerCount;
    public Answer[] getAnswers() {
        return answers;
    }
    public Question(String questionText){
        this.questionText = questionText;
    }
    //just watch how its work
    void showUUID(){
        System.out.println(id);
    }

    
    public void add(Answer answer){
        if (answerCount<3 && answerCount >= 0) {
            this.answers[answerCount] = answer;
        }
        answerCount++;
    }
    public void add(int index,Answer answer){
        if (index>=0 && index <3) {
            this.answers[index-1] = answer; 
        }
    }
    public void delete(Answer answer){
        for (int i = 0; i < answers.length; i++) {
            if(answers[i].equals(answer)){
                answers[i] = null;
            }
        }
    }

    public void delete(int index){
        if (index>=0 && index <4) {
            answers[index] = null;
        }
    }
    public void show(){
        System.out.print(questionText+" => ");
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] != null){
                System.out.print( (i+1) +". "+answers[i].text()+",");
            }
        }
        System.out.println();
    }

    public String getQuestionText() {
        return questionText;
    }
    
}
