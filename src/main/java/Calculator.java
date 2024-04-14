/**
 * @className: Calculator
 * @description: TODO
 * @author: faith_ye
 * @date: 2024/4/14 13:55
 */
public class Calculator {
    public int compute(int num1, int num2, char symbol) {
        Computable computable = ComputeFactory.getCompute(symbol);
        return computable.compute(num1, num2);
    }
}
