package pr10.HarryPotter;

import org.springframework.stereotype.Component;
import pr10.interface1.Magican;

@Component
public class Voldemort implements Magican {
    @Override
    public void doMagic() {
        System.out.println("Волдеморт использует заклинание АВАДА КЕДАВРА");
    }
}
