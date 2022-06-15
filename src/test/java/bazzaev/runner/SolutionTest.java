package bazzaev.runner;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
class SolutionTest {
    String human = "huMan";
    String swamper = "swaMper";
    String woodman = "wooDman";
    @Test
    void getResultHuman() {
        assertEquals(Solution.getResult("SSSSWwwWTTTTPPPP", human), 9);
    }
    @Test
    void getResulSwamper() {
        assertEquals(Solution.getResult("SSSSWWWWTTttPPPP", swamper), 15);
    }
    @Test
    void getResulWoodman() {
        assertEquals(Solution.getResult("SSSSWWWWTTTTPppP", woodman), 13);
    }
    @Test
    void getResultHumanS() {
        assertEquals(Solution.getResult("SSSSSSSSsSSSSSSS", human), 30);
    }
    @Test
    void getResultHumanW() {
        assertEquals(Solution.getResult("WWWWWWWWwWWWWWWW", human), 12);
    }
    @Test
    void getResultHumanT() {
        assertEquals(Solution.getResult("TTTTTTTtTTTTTTTT", human), 18);
    }
    @Test
    void getResultHumanP() {
        assertEquals(Solution.getResult("PPPPPPPpPPPPPPPP", human), 6);
    }
    @Test
    void getResultWoodmanS() {
        assertEquals(Solution.getResult("sSSSSSSSSSSSSSSS", woodman), 18);
    }
    @Test
    void getResultWoodmanW() {
        assertEquals(Solution.getResult("wWWWWWWWWWWWWWWW", woodman), 18);
    }
    @Test
    void getResultWoodmanT() {
        assertEquals(Solution.getResult("tTTTTTTTTTTTTTTT", woodman), 12);
    }
    @Test
    void getResultWoodmanP() {
        assertEquals(Solution.getResult("PPPPPPPPpPPPPPPP", woodman), 12);
    }
    @Test
    void getResultSwamperS() {
        assertEquals(Solution.getResult("SSSSSSSSsSSSSSSS", swamper), 12);
    }
    @Test
    void getResultSwamperW() {
        assertEquals(Solution.getResult("WWWWWWWWWWWWWWWW", swamper), 12);
    }
    @Test
    void getResultSwamperT() {
        assertEquals(Solution.getResult("TTTTTTTtTTTTTTTT", swamper), 30);
    }
    @Test
    void getResultSwamperP() {
        assertEquals(Solution.getResult("PPPPPPPpPPPPPPPP", swamper), 12);
    }
}