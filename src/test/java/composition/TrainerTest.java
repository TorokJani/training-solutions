package composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {
    @Test
    void testCreate(){
        Trainer trainer = new Trainer("John Dow");

        String name = trainer.getName();

        assertEquals("John Dow",name);
    }

}