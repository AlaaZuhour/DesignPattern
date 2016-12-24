/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepattern;

/**
 *
 * @author alazh
 */
public abstract class HRManger {
    public void interviewApplicants(){
        personalQuestions();
        specializationQuestions();
        puzzelQuestions();
    }

    public void personalQuestions() {
        System.out.println("the Applicant is asked personal questions");
    }

    public abstract void specializationQuestions();
        
        
public void puzzelQuestions() {
        System.out.println("the Applicant is asked puzzel questions");
    }
}
