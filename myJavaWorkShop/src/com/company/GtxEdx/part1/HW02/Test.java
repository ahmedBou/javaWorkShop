package com.georgiaEdx.part1.HW02;

public class Test {
    public static void main(String[] args) {

        /*
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your operator:");
        String operator = input.nextLine();



            if(!operator.equals("add") && !operator.equals("multiply")
                && !operator.equals("divide") && !operator.equals("subtract")
                    && !operator.equals("alphabetize")){
                System.out.println("Invalid input entered. Terminating...");

            }else{
                System.out.println("correct");
            }
*/
       double a = 2.0;

/*
[Executed at: Sun Apr 18 4:26:11 PDT 2021]

Error: All homework did not pass (Calculator Test)
Running: test_alphabetize_equal
Testing alphabetize operation with input 'programming programming' ... Failed: Calculator did not run successfully
Finished: test_alphabetize_equal
Running: sub_op_case_sensitivity
Testing Calculator with operation sUbTraCT
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: sub_op_case_sensitivity
Running: mult_op_case_sensitivity
Testing Calculator with operation MultiPly
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: mult_op_case_sensitivity
Running: test_alphabetize_case
Testing alphabetize operation with input 'Zebra zebra' ... Failed: Calculator did not run successfully
Finished: test_alphabetize_case
Running: test_alphabetize_less
Testing alphabetize operation with input 'Chicken Egg' ... Failed: Calculator did not run successfully
Finished: test_alphabetize_less
Running: subtract_rejects_strings
Testing subtract operation with input and expecting the error message.
Failed: Calculator did not run successfully
Finished: subtract_rejects_strings
Running: multiply_prompt
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: multiply_prompt
Running: alphabetize_prompt_leftover
Re-running 'Alphabetize Prompt' to cover all 10 points in the rubric item.
Failed: Calculator did not run successfully
Finished: alphabetize_prompt_leftover
Running: subtract_rejects_double
Testing subtract operation with input <2.2 1.1> and expecting the error message.
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: subtract_rejects_double
Running: add_rejects_doubles
Testing add operation with input <5.0 2.0> and expecting the error message.
Testing add operation with input <1.2 7.1142> and expecting the error message.
Testing add operation with input <0.01 0.00> and expecting the error message.
Finished: add_rejects_doubles
Running: test_divide_by_zero
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: test_divide_by_zero
Running: multiply_output_value_rounded
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: multiply_output_value_rounded
Running: add_rejects_strings
Testing add operation with input and expecting the error message.
Failed: Calculator did not run successfully
Finished: add_rejects_strings
Running: test_main_method
Program compiles and main method exists.
Finished: test_main_method
Running: add_output_value_int
Testing 0 0 with correct answer 0
Failed: Tested add opertation with input 0 0 and program incorrectly output:
List of operations: add subtract multiply divide alphabetize
Enter an operation:
enter two integer
Invalid input entered. Terminating...

Was looking for int value: 0
Finished: add_output_value_int
Running: subtract_output_value_int
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: subtract_output_value_int
Running: div_op_case_sensitivity
Testing Calculator with operation DIVIDE
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: div_op_case_sensitivity
Running: switch_statement_exists
Finished: switch_statement_exists
Running: test_alphabetize_prompt
Failed: Calculator did not run successfully
Finished: test_alphabetize_prompt
Running: test_alphabetize_greater
Testing alphabetize operation with input 'Egg Chicken' ... Failed: Calculator did not run successfully
Finished: test_alphabetize_greater
Running: multiply_output_value
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: multiply_output_value
Running: subtract_prompt
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: subtract_prompt
Running: divide_rejects_strings
Testing subtract operation with input and expecting the error message.
Failed: Calculator did not run successfully
Finished: divide_rejects_strings
Running: test_invalid_operation
Failed: You have too many lines of output! Expected 3 lines but was actually 4 lines.
Make sure to follow the output shown on the assignment description EXACTLY.
Finished: test_invalid_operation
Running: alpha_op_case_sensitivity
Testing Calculator with operation aLPHAbetize
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: alpha_op_case_sensitivity
Running: ifelse_statement_exists
Finished: ifelse_statement_exists
Running: divide_output_value_rounded
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: divide_output_value_rounded
Running: multiply_rejects_strings
Testing multiply operation with input and expecting the error message.
Failed: Calculator did not run successfully
Finished: multiply_rejects_strings
Running: test_calculator_prompt
Testing 'add' operation with input ' 2 2'
Correct formatting for the initial prompt
Finished: test_calculator_prompt
Running: add_output_value
Failed: Tested add opertation with input 0 0 and program incorrectly output:
List of operations: add subtract multiply divide alphabetize
Enter an operation:
enter two integer
Invalid input entered. Terminating...

Was looking for value (int or float okay): 0
Finished: add_output_value
Running: subtract_output_value
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: subtract_output_value
Running: divide_output_value
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: divide_output_value
Running: divide_prompt
Failed: Program failed with valid input. Possible causes:
- Multiple Scanner objects, or Scanner created in loop/conditional
- Doesn't accept user input as specified in the assignment description

Finished: divide_prompt
Running: add_prompt
Failed: Your output does not contain the correct add prompt:
Enter two integers:
Finished: add_prompt
Running: add_op_case_sensitivity
Testing Calculator with operation aDd
Testing Calculator with operation ADD
Testing Calculator with operation add
Testing Calculator with operation adD
Testing Calculator with operation AdD
Finished: add_op_case_sensitivity
Test run: 35, Passed: 6, Failed: 29
Score: 17/100


 */
    }
}
