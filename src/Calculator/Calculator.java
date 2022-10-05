package Calculator;

import java.util.List;

public class Calculator {
    public int Math(List<Operation> list, char[] operations, int OperationsCount) {
        int MidResult = Integer.parseInt(list.get(0).Entry);
        int c = 0;
        // The actual Calculator
        for (Operation operation : list) {
            switch (operations[c]) {
                case '+':
                    MidResult = MidResult + Integer.parseInt(operation.Entry);
                    break;
                case '-':
                    MidResult = MidResult - Integer.parseInt(operation.Entry);
                    break;
                case '*':
                    MidResult = MidResult * Integer.parseInt(operation.Entry);
                    break;
                case '/':
                    MidResult = MidResult / Integer.parseInt(operation.Entry);
                    break;
                default:
                    break;
            }
            c++;
        }
        return MidResult;
    }
}
