public class FullTimeStaffHire extends StaffHire{
    private int salary;
    private int Working_Hour;
    private String Staff_Name;
    private String Joining_Date;
    private String Qualification;
    private String Appointed_By;
    private boolean Joined;
    
FullTimeStaffHire(int Vacancy_no, String Designation, String Job_Type, int salary, int Working_Hour){
        super(Designation,Vacancy_no,Job_Type);
        this.salary=salary;
        this.Working_Hour=Working_Hour;
        this.Staff_Name="";
        this.Joining_Date="";
        this.Qualification="";
        this.Appointed_By="";
        this.Joined=false;
}
   
int getsalary(){
    return salary;
}

int getWorking_Hour(){
    return Working_Hour;
}

String getStaff_Name(){
    return Staff_Name;
}

String getJoining_Date(){
    return Joining_Date;
}

String getQualification(){
    return Qualification;
}

String getAppointed_By(){
    return Appointed_By;
}

boolean getJoined(){
    return Joined;
}

public void setSalary(int Salary){
    if (Joined){
        System.out.println("Salary of the"+ Staff_Name+ " is not changeable"); 
    }
    else{
        this.salary=salary;
    }
}
    
public void setWorkingHour(int Working_Hour){
    this.Working_Hour=Working_Hour;
}

public void FullTimeStaff_Hire(String Staff_Name, String Joining_Date, String Qualification, String Appointed_By){
    if (Joined){
        System.out.println(Staff_Name+" has already joined the organization on "+ Joining_Date);
    }
    else{
        this.Staff_Name=Staff_Name;
        this.Joining_Date=Joining_Date;
        this.Qualification=Qualification;
        this.Appointed_By=Appointed_By;
        this.Joined=true;
    }
}

public void Display(){
        super.display();
        if(Joined==true){
            System.out.println("The staff name is: "+ Staff_Name);
            System.out.println("The salary of the "+ Staff_Name + " is: "+ salary);
            System.out.println("The working hour of "+ Staff_Name+ " is: "+ Working_Hour);
            System.out.println(Staff_Name+" has joined on: "+ Joining_Date);
            System.out.println("The qualification of "+Staff_Name+" is: "+Qualification);
            System.out.println(Staff_Name+" is appointed by: "+Appointed_By);
    }
}
    
}