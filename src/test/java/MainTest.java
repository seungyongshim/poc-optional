import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest
{
    @Test
    void PersonSpec() {
        // act
        var ret = new Person(Optional.ofNullable("gildong"),
                             Optional.ofNullable(null), 
                             Optional.ofNullable("hong"));

        // asserts
        Assertions.assertEquals("Person[first=Optional[gildong], middle=Optional.empty, last=Optional[hong]]",
                                ret.toString());
    }
}