/**
 * Класс для выполнения базовых математических операций.
 * <p>
 * Этот класс предоставляет методы для сложения, вычитания и т.д.
 *
 * @author Alexandr Zaytsev
 * @version 1.0
 * @since 2026-11-08
 */
public class Calculator {

    /**
     * Складывает два целых числа.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма a и b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Делит одно число на другое.
     *
     * @param dividend делимое
     * @param divisor делитель
     * @return результат деления
     * @throws ArithmeticException если делитель равен нулю
     */
    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return dividend / divisor;
    }
}
