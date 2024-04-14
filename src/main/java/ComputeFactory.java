/**
 * @className: ComputeFactory
 * @description: TODO
 * @author: faith_ye
 * @date: 2024/4/14 14:31
 */
public class ComputeFactory {
    private static final Sub sub = new Sub();
    private static final Add add = new Add();

    public static Computable getCompute(String symbol)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Computable) Class.forName(symbol).newInstance();
    }
}
