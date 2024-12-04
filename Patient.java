public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id ,String name , int birthYear ,double height ,double weight, String bloodGroup ,String phoneNumber){

        this.id = id;
        this.name = name;
        int currentYear = java.time.Year.now().getValue();
        if(birthYear < currentYear && birthYear > 0 ){

        this.birthYear = birthYear;

        }else{

            throw new IllegalArgumentException("BrithYear cannot be negative: " + birthYear);
        }
        if(height > 0 ) {

            this.height = height;
        }

        if(weight > 0 ){

            this.weight = weight;

        }
        if(!bloodGroup.equals("A") && !bloodGroup.equals("B") && !bloodGroup.equals("AB") && !bloodGroup.equals("O")){

            throw new IllegalArgumentException(bloodGroup + " is not bloodGroup");

        }else{

            this.bloodGroup = bloodGroup;

        }

            this.phoneNumber = phoneNumber;

    }
    public int getID(){
        return this.id;
    }
    public String getNAME(){
        return this.name;
    }
    public int getBirthYear(){
        return this.birthYear;
    }
    public double getHEIGHT(){
        return this.height;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getBloodGroup(){
        return this.bloodGroup;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public int getAge(int currentYear){
        if(currentYear <=  birthYear){
            throw new IllegalArgumentException("Year cannot be negative: " + currentYear);
        }

        return currentYear - birthYear;
    }
    public double getBMI(){
        if(height > 0 && weight > 0){

            return weight/(height*height);
        }else{

            return 0.0;
        }

    }
    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient BMI : " + getBMI());
        System.out.println("Patient BloodGroup : " + bloodGroup);
        System.out.println("Patient PhoneNumber : " + phoneNumber);
    }

}
