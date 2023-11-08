package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JobTest {
//TODO: Declare (but don't initialize) two jobs
    Job job1;
    Job job2;

    //things i need help with:
    //not able to add msg - is this my junit version?
    //can't import all assertions?
    //can't before each?
    //are all of these tests in job class or is job class parent and the tests extend the class?

    //TODO: testSettingId
    @Test
    public void testSettingId(){
 String msg = "tests that unique ids are created yadda yadda";
 job1 = new Job("Lunch Lady","Springfield Elementary", "Springfield, USA", "Food Service", "Surliness");
 job2 = new Job("System Inspector", "Mr. Burns", "Springfield, USA", "Network Security","Luck");
 int job1Id = job1.getId();
 int job2Id = job2.getId();
assertNotEquals(job1Id, job2Id);
    }

    //TODO: testJobConstructorSetsAllFields
    //assertnotnull? do i test for this, too?


    //TODO: testJobsForEquality
    //test that the id's have identical everything but ids


    //TODO: testToStringStartsAndEndsWithNewLine
    //TDD part
    //going to need to call the toString (like job1.toString to test t the output)
}


