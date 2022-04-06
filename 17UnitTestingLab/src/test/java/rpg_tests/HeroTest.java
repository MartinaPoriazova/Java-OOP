package rpg_tests;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class HeroTest {
    private final static int TARGET_EXP = 10;

    @Test
    public void testHeroGainsXPWhenTargetDies(){
        Weapon weaponMock = Mockito.mock(Weapon.class);
        Target targetMock = Mockito.mock(Target.class);
        //когато те питам дали си убит, връщай ми да

        Mockito.when(targetMock.isDead()).thenReturn(true);
        Mockito.when(targetMock.giveExperience()).thenReturn(TARGET_EXP);

        Hero hero = new Hero("Pesho", weaponMock);
        //Act
        hero.attack(targetMock);
        //Assert
        Assert.assertEquals(TARGET_EXP, hero.getExperience());
    }

}