package trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void EqualsTest(){
        Trainer trainer = new Trainer("Jani",2000);
        Trainer trainer1 = new Trainer("Jani", 2000);
        System.out.println(trainer1.hashCode());
        System.out.println(trainer.hashCode());
        assertEquals(trainer.equals(trainer1),true);
        assertEquals(trainer.hashCode(),trainer1.hashCode());

        Trainer trainer2 = new Trainer("Jani",2001);
        assertNotEquals(trainer.equals(trainer2),true);

    }

}