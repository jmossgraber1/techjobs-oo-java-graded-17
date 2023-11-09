package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.Assert.*;

public class JobTest {
//TODO: Declare (but don't initialize) two jobs
    Job job1;
    Job job2;

    //things i need help with:
    //not able to add msg - is this my junit version?
    //can't import all assertions?
    //can't before each?
    //are all of these tests in job class or is job class parent and the tests extend the class?

    //TODO: CREATE TEST 1
    // and call it testSettingId
    @Test
    public void testSettingId(){
 String msg = "tests that unique ids are created yadda yadda";
 job1 = new Job("coder1","biz1", "place1", "position1", "skill1");
 job2 = new Job("coder2", "biz2", "place2", "position2","skill2");
 int job1Id = job1.getId();
 int job2Id = job2.getId();
assertNotEquals(job1Id, job2Id);
    }

    //TODO: CREATE TEST 2
    // and call it testJobConstructorSetsAllFields
    //don't forget to assertnotnull
@Test
    public void testJobConstructorSetsAllFields(){
    job1 = new Job("coder1","biz1", "place1", "position1", "skill1");

String expectedName = "coder1";
String actualName = job1.getName();
assertEquals(expectedName, actualName);

Employer expectedEmployer = "biz1";
Employer actualEmployer = job1.getEmployer();
assertEquals(expectedEmployer, actualEmployer);

Location expectedLocation = "place1";
Location actualLocation = job1.getLocation();
assertEquals(expectedLocation, actualLocation);

PositionType expectedPosition = "position1";
PositionType actualPosition = job1.getPositionType();
assertEquals(expectedPosition, actualPosition);

CoreCompetency expectedCore = "skill1";
CoreCompetency actualCore = job1.getCoreCompetency();
assertEquals(expectedCore, actualCore);
assertNotNull(actualCore);
}


    //TODO: testJobsForEquality
    //test that the id's have identical everything but ids


    //TODO: testToStringStartsAndEndsWithNewLine
    //TDD part
    //going to need to call the toString (like job1.toString to test t the output)
}


