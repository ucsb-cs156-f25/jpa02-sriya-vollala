package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team obj;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
       assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equalsTo_returns_correct_value() {
       assertEquals(false, team.equals(obj));
       assertEquals(true, team.equals(team));
    }

    @Test
    public void equalsTo_thirdCase_TT() {
        Team newTeam = new Team("t1");
        newTeam.addMember("Sriya V.");

        Team newTeam2 = new Team("t1");
        newTeam2.addMember("Sriya V.");
        assertEquals(true, newTeam2.equals(newTeam));
    }

    @Test
    public void equalsTo_thirdCase_FT() {
        Team newTeam = new Team("t1");
        newTeam.addMember("Sriya V.");

        Team newTeam2 = new Team("t2");
        newTeam2.addMember("Sriya V.");
        assertEquals(false, newTeam2.equals(newTeam));
    }

    @Test
    public void equalsTo_thirdCase_TF() {
        Team newTeam = new Team("t1");
        newTeam.addMember("Sriya V.");

        Team newTeam2 = new Team("t1");
        newTeam2.addMember("Sriya");
        assertEquals(false, newTeam2.equals(newTeam));
    }

    @Test
    public void equalsTo_thirdCase_FF() {
        Team newTeam = new Team("t1");
        newTeam.addMember("Lucy");

        Team newTeam2 = new Team("t2");
        newTeam2.addMember("Sriya V.");
        assertEquals(false, newTeam2.equals(newTeam));
    }

    @Test
    public void hash_test_case() {
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
