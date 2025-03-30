package Whoriskey.Leigh.React_Spring_api.model;

public class Member {

    private final int memberId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String dob;
    private final String sex;
    private final String eligibility;

    

    public Member(final int memberId, final String firstName, final String lastName,
                    final String email, final String dob, final String sex, final String eligibility){
        
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.sex = sex;
        this.eligibility = eligibility;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }

    public String getSex() {
        return sex;
    }

    public String getEligibility() {
        return eligibility;
    }

}
