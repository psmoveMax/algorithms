import java.util.ArrayList;
import java.util.List;

public class UniqueElemArray {

    public static void main(String[] args) {
        long[] phoneNumbers = new long[] {+79161002030L, +79255558877L, +79219990000L, +79161002030L};

        List<Long> uniqueNumbers = new ArrayList<>();

        for(long currentNumber:phoneNumbers) {
            boolean alreadyExists = false;
            for(Long existingNumber : uniqueNumbers) {
                if(existingNumber == currentNumber) {
                    alreadyExists = true;
                    break;
                }
            }
            if(!alreadyExists) {
                uniqueNumbers.add(currentNumber);
            }
        }
        System.out.println(uniqueNumbers);
    }
}