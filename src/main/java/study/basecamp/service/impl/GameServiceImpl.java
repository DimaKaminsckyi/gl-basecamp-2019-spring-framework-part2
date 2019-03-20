package study.basecamp.service.impl;

import org.springframework.stereotype.Service;
import study.basecamp.service.GameService;

import javax.annotation.PostConstruct;
import java.util.Random;

@Service
public class GameServiceImpl implements GameService {

    private int number;
    private final Random random = new Random();


    @PostConstruct
    @Override
    public void reset() {
        number = random.nextInt(100);
    }

    @Override
    public String isGameWon(int guess) {
        return guess == number ? "WIN" : "Loose" ;
    }

    public int getNumber() {
        return number;
    }
}
