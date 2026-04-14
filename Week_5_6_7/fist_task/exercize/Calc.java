package Week_5_6_7.fist_task.exercize;

public class Calc {
    int fistNum;
    int secondNum;
    char sign;
    int result;
    
    public Calc(int i, int j, char c) {
        //TODO Auto-generated constructor stub
        this.fistNum = i;
        this.secondNum = j;
        this.sign = c;
    }

    public void calculate(){
        switch (sign) {
            case '+':
                result = fistNum+secondNum;
                break;
            case '-':
                result = fistNum-secondNum;
                break;
            case '*':
                result = fistNum*secondNum;
            default:
                break;
        }}
        public void printResult(){
        System.out.printf("%d %c %d = %d",this.fistNum,this.sign ,this.secondNum,this.result);
        }
    }


