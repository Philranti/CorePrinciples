package za.ac.cput.project;

public class InsuranceApproval {                    // Violation
    public void approveInsurance(PersonalInsurance insured) {
        if (insured.isValid()) {
            System.out.println("Process the Insurance");
        }
    }

    public void vehicleInsurance(VehicleInsurance validator) {
        if (validator.isValid()) {
            System.out.println("Process the Vehicle Insurance");
        }
    }


    public class VehicleInsurance {
        public boolean isValid() {
            System.out.println("Vehicle Insurance approved");
            return isValid();
        }
    }

    public class PersonalInsurance {
        public boolean isValid() {
            System.out.println("Personal Insurance approved");
            return isValid();
        }
    }
}

