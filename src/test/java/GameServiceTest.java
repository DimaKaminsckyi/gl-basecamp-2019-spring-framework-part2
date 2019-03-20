import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import study.basecamp.service.impl.GameServiceImpl;

public class GameServiceTest {

    private GameServiceImpl service;

    @Before
    public void init(){
        this.service = new GameServiceImpl();
    }

    @Test
    public void When_NumberEqulasGuess_Expected_GameWonAsTrue(){

        int number = service.getNumber();

        Assert.assertEquals("WIN" , service.isGameWon(number));
    }

    @Test
    public void When_NumberEqulasGuess_Expected_GameWonAsFalse(){

        int number = service.getNumber();

        Assert.assertEquals("Loose" , service.isGameWon(number + 1));
    }
}
