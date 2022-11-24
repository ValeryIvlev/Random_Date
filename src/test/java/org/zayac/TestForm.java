package org.zayac;


import org.junit.jupiter.api.Test;

import static pages.randomData.RandomGender.selectGender;
import static pages.randomData.RandomFakerDate.*;
import static pages.randomData.RandomHobbies.selectHobbies;
import static pages.randomData.RandomMonth.selectMonth;
import static pages.randomData.RandomSubjects.selectSubjects;


public class TestForm extends TestBase {

    String state = "NCR";
    String city = "Delhi";
    String File = "src/test/resources/File1.png";
    String picture = "File1.png";



    @Test
    void testFromV1() {


        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(selectGender)
                .setNumber(userNumber)
                .setSubjects(selectSubjects)
                .setHobbies(selectHobbies)
                .uploadPicture(File)
                .setCurrentAddress(currentAddress)
                .setBirthDate(day, selectMonth, year)
                .setState(state)
                .setCity(city);


        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", firstName+" "+lastName)
                .verifyResult("Student Email", userEmail)
                .verifyResult("Gender", selectGender)
                .verifyResult("Date of Birth", day+" "+selectMonth+","+year)
                .verifyResult("Subjects", selectSubjects)
                .verifyResult("Picture", picture)
                .verifyResult("Address", currentAddress)
                .verifyResult("State and City", state+" "+city);


    }

}