package academy.elqoo.java8.labmda;

import academy.elqoo.java8.lambda.Lambda;
import academy.elqoo.java8.lambda.TransactionLambda;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class LambdaTest {

    @Test
    public void removeStringsWithMoreThanThreeCharacters(){
        List<String> input = asList("This", "is", "java", "8");
        // input = Lambda.filter();
        assertThat(input, contains("is", "8"));
    }

    @Test
    public void shouldBeExecutedWitingATransaction(){
        TransactionLambda lambda = new TransactionLambda();
        // Lambda.processWithinTransaction
        assertTrue(lambda.isConsumed());
    }

    @Test
    public void shouldCreateAString(){
        String bigString = Lambda.create(/* Pass something here */);
        assertTrue(bigString.length()>0);
    }

    @Test
    public void extractStringSize(){
        String myString = "This is great";
        int length = Lambda.getStringLength(myString /*, place a lambda here */);
        assertTrue(length==13);
    }

    @Test
    public void multiply(){
        int a = 5;
        int b = 6;
        int result = Lambda.multiply(a,b/* pass a lambda here */);
        assertTrue(result==30);
    }

    @Test
    public void shouldSortStrings() throws Exception {
        List<String> input = Arrays.asList("C", "F", "A", "D", "B", "E");
        List<String> result = Lambda.sortStrings(input);
        assertThat(result, is(equalTo(Arrays.asList("A", "B", "C", "D", "E", "F"))));
    }


}
