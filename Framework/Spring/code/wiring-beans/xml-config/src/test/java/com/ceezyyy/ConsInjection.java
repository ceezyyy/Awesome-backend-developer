package com.ceezyyy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:cons.xml")
public class ConsInjection {

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void cdShouldNotBeNull() {
        cdPlayer.play();
    }
}
