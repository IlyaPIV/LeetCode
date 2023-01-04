package problems.easy.p412;

import java.util.ArrayList;
import java.util.List;


/*
* данный вариант оптимальнее т.к. легко добавлять новые условия делимости:
* например, если делится на 7 - то "Jazz", тогда для 35 будет "FizzBuzzJazz"
 */
public class OptimalSolution {
    public List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            String currStr = "";

            if (divisibleBy3) { currStr += "Fizz"; }
            if (divisibleBy5) { currStr += "Buzz"; }

            if (currStr.isEmpty()) { currStr += String.valueOf(i); }

            resultList.add(currStr);
        }

        return resultList;
    }
}
