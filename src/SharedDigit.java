public class SharedDigit {

    public static boolean hasSharedDigit(int firstNum, int secondNum) {
        if((firstNum < 10 || firstNum > 99) || (secondNum < 10 || secondNum > 99)) {
            return false;
        } else {

            int firstOfFirstNum = firstNum / 10;
            int lastOfFirstNum = firstNum % 10;
            int firstOfSecondNum = secondNum / 10;
            int lastOfSecondNum = secondNum % 10;

            if (firstOfFirstNum == firstOfSecondNum || firstOfFirstNum == lastOfSecondNum ||
                    lastOfFirstNum == firstOfSecondNum || lastOfFirstNum == lastOfSecondNum) {
                return true;
            }
        }
        return false;
    }
}
