package exercises.hackerrank.Exception.More_Exceptions;

class Calculator {

    static int power(int n, int p) throws Exception {
        double answer = 0;


            if (n < 0 || p < 0) {

                throw new Exception("n and p should be non-negative");   //this will through this exception printing the string only
            } else {
                answer = Math.pow(n, p);
            }

        int answerInt = (int) answer;
        return answerInt;
    }
}
