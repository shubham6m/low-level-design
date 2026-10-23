package designpatterns.builder.approachone;

public class Client {
    public static void main(String[] args) {
        UserExamParameters parameters = new UserExamParameters();

        parameters.englishMarks = 110;
        parameters.name = "shubham";


        UserExam userExam;
        try{
            userExam = new UserExam(parameters);
        }catch(Exception e){
            System.out.println("some parameter(s) value are wrong");
        }
    }
}
