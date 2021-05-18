package com.company.CS1102.week5.progAssn;

public class Quiz {

    public static void main(String[] args) {

        Question question1 = new MultipleChoiceQuestion(
                "What is a quiz?\n",
                "A. a test of knowledge, especially a brief informal test given to students\n",
                "B. 42\n","C. a duck\n","D. to get to the other side\n",
                "E. To be or not to be, that is the question.", "B"
        );
        question1.check();
        Question question2 = new MultipleChoiceQuestion(
                "How do you determine the number of elements in an array?\n",
                "A. buses.length\n", "B. buses.length()\n", "C. buses.size\n", "D. buses.size()\n",
                "any of the above\n", "A"
        );
        question2.check();

        Question question3 = new MultipleChoiceQuestion(
                "How many legs does a spider have?\n",
                "A. Two.\n", "B. Ten.\n", "C. Eight.\n", "D. Six.\n", "E. Nine.", "C"
        );
        question3.check();


        Question question = new TrueFalseQuestion("What is a quiz?\n", "TRUE");
        question.check();

        Question.showResults();

    }



}
