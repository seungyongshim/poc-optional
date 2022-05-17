import java.util.Optional;

public record Person(Optional<String> first, 
                     Optional<String> middle,
                     Optional<String> last)
{
}