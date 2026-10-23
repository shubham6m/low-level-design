package designpatterns.builder.approachone;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    public UserExam(UserExamParameters userExamParameters){
        // before assign the value we have to validate the things
        if(userExamParameters.englishMarks > 100 || 
            userExamParameters.mathsMarks > 100 || 
            userExamParameters.scienceMarks > 100){
                throw new InvalidParameterException("Marks can't greater than 100");
            }
            
        this.englishMarks = userExamParameters.englishMarks;
        this.mathsMarks = userExamParameters.mathsMarks;
        this.scienceMarks = userExamParameters.scienceMarks;
        this.name = userExamParameters.name;
    }
}
