package pr10.HarryPotter;

import org.springframework.stereotype.Component;
import pr10.interface1.Magican;

@Component
public class HarryPotter implements Magican {
    @Override
    public void doMagic() {
        System.out.println("Гарри Поттер использует заклинание ОСТОЛБЕНЕЙ!");
    }
}
