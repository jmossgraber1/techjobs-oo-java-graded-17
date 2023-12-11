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

        job1 = new Job("coder1", new Employer("biz1"),  new Location("place1"), new PositionType("position1"), new CoreCompetency("skill1"));
        job2 = new Job("coder2", new Employer("biz2"), new Location("place2"), new PositionType("position2"),new CoreCompetency("skill2"));

        int job1Id = job1.getId();
        int job2Id = job2.getId();
        assertNotEquals(job1Id, job2Id);
    }

    //TODO: CREATE TEST 2
    // and call it testJobConstructorSetsAllFields
    //don't forget to assertnotnull
@Test
    public void testJobConstructorSetsAllFields(){

        job1 = new Job("coder1", new Employer("biz1"),  new Location("place1"), new PositionType("position1"), new CoreCompetency("skill1"));

String expectedName = "coder1";
String actualName = job1.getName();
assertEquals(expectedName, actualName);

Employer expectedEmployer = new Employer("biz1");
Employer actualEmployer = job1.getEmployer();
assertEquals(expectedEmployer, actualEmployer);
assertNotNull(actualEmployer);

Location expectedLocation = new Location("place1");
Location actualLocation = job1.getLocation();
assertEquals(expectedLocation, actualLocation);
assertNotNull(actualLocation);

PositionType expectedPosition = new PositionType("position1");
PositionType actualPosition = job1.getPositionType();
assertEquals(expectedPosition, actualPosition);
assertNotNull(actualPosition);

CoreCompetency expectedCore = new CoreCompetency("skill1");
CoreCompetency actualCore = job1.getCoreCompetency();
assertEquals(expectedCore, actualCore);
assertNotNull(actualCore);
}


    //TODO: testJobsForEquality
    //test that the id's have identical everything but ids
   @Test
   public void testJobsForEquality(){
    job1 = new Job("coder1", new Employer("biz1"),  new Location("place1"), new PositionType("position1"), new CoreCompetency("skill1"));
    job2 = new Job("coder1", new Employer("biz1"), new Location("place1"), new PositionType("position1"),new CoreCompetency("skill1"));
    assertNotEquals(job1, job2);
    }

    //TODO: testToStringStartsAndEndsWithNewLine
    //TDD part
    //going to need to call the toString (like job1.toString to test the output)
    //1. When passed a Job object, it should return a string that
    // contains a blank line before and after the job information.
    //can use System.lineSeparator(),
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        job1 = new Job("coder1", new Employer("biz1"),  new Location("place1"), new PositionType("position1"), new CoreCompetency("skill1"));
      String expectedString = System.lineSeparator() + "ID: " + job1.getId() + System.lineSeparator() +"Name: coder1" + System.lineSeparator() +"Employer: biz1" + System.lineSeparator() +"Location: place1" +System.lineSeparator() + "Position Type: position1" + System.lineSeparator() + "Core Competency: skill1" + System.lineSeparator();
      String actualString = job1.toString();
      assertEquals(expectedString, actualString);
    }


    //2. The string should contain a label for each field,
    // followed by the data stored in that field. Each field should be on its own line.


    //3. If a field is empty, the method should add, “Data not available” after the label.
    // use conditionals, print error message - message replaces the what's in the value field
    @Test
    public void testDataNotAvailable(){
        job1 = new Job("coder1", new Employer(""),  new Location("place1"), new PositionType("position1"), new CoreCompetency("skill1"));
        String expectedString = System.lineSeparator() + "ID: " + job1.getId() + System.lineSeparator() +"Name: coder1" + System.lineSeparator() +"Employer: Data not available" + System.lineSeparator() +"Location: place1" +System.lineSeparator() + "Position Type: position1" + System.lineSeparator() + "Core Competency: skill1" + System.lineSeparator();
        String actualString = job1.toString();
        assertEquals(expectedString, actualString);
    }


    //4. (Optional) If a Job object ONLY contains data for the id field,
    // the method should return, “OOPS! This job does not seem to exist.”

    //Be sure to use System.lineSeparator() to declare a new line.
    // This is an universal line break that works on a variety of operating systems (OS).
    //You will need to use the lineSeparator() in the Job class and the JobTests.
}


