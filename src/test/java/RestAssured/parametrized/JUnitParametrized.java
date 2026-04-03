package RestAssured.parametrized;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class JUnitParametrized {
    @ParameterizedTest
    @CsvSource({
            "писяпопакака",
            "Сашагей",
            "Свага"
    })
    public void test (String element){
        System.out.println(element);
    }
}