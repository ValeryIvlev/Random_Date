package org.zayac;


import org.junit.jupiter.api.Test;

import static pages.randomComponents.RandomGender.selectGender;
import static pages.randomComponents.RandomFakerDate.*;
import static pages.randomComponents.RandomHobbies.selectHobbies;
import static pages.randomComponents.RandomMonth.selectMonth;
import static pages.randomComponents.RandomSubjects.selectSubjects;


public class TestForm extends TestBase {

    String State = "NCR";
    String City = "Delhi";
    String File = "src/test/resources/File1.png";
    String Picture = "File1.png";



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
                .setState(State)
                .setCity(City);


        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", firstName+" "+lastName)
                .verifyResult("Student Email", userEmail)
                .verifyResult("Gender", selectGender)
                .verifyResult("Date of Birth", day+" "+selectMonth+","+year)
                .verifyResult("Subjects", selectSubjects)
                .verifyResult("Picture", Picture)
                .verifyResult("Address", currentAddress)
                .verifyResult("State and City", State+" "+City);


    }

}