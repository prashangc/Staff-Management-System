
public class PartTimeStaffHire
extends StaffHire
{ protected int Working_Hour;
  protected int WagesPerHour;
  protected String Staff_Name;
  protected String Joining_Date;
  protected String Qualification;
  protected String Appointed_By;
  protected String Shifts;
  protected boolean Joined;
  protected boolean Terminated;
  PartTimeStaffHire(int vacancy_number,String designation,String job_type,int WorkingHour,int
  WagesPerHour,String Shifts)
  {
    super(designation,vacancy_number,job_type); 
    this.Working_Hour=WorkingHour;
    this.WagesPerHour=WagesPerHour;
    this.Shifts=Shifts;
    this.Staff_Name="";
    this.Joining_Date="";
    this.Qualification="";
    this.Appointed_By="";
    this.Joined=false;
    this.Terminated=false;
  }
  public int getWorkingHour(String Shifts)
  { if(Joined==true)
    {
      System.out.println("Shift: "+Shifts);
    }
   else
    {
      this.Shifts=Shifts;
      System.out.println("New shift: "+Shifts);
    }
    return Working_Hour;
  }
  public int getWagesPerHour()
  {  return WagesPerHour;
  }
  public String getStaffName()
  {  return Staff_Name;
  }
  public String getJoiningDate()
  {  return Joining_Date;
  }
  public String getQualification()
  {  return Qualification;
  }
  public String getAppointedbBy()
  {  return Appointed_By;
  }
  public String getShifts()
  {  return Shifts;
  }
  public boolean getJoined()
  {  return Joined;
  }
  public boolean getTerminated()
  {  return Terminated;
  }
  public void Hire_PartTimeStaff(String Staff_Name,String Joining_Date,
  String Qualification,String Appointed_By)
  { if(Joined==true)
      { System.out.print("Staff name: "+Staff_Name+"\nJoin date"+Joining_Date);
      }
    else
      {this.Staff_Name=Staff_Name;
       this.Joining_Date=Joining_Date;
       this.Qualification=Qualification;
       this.Appointed_By=Appointed_By;
       this.Joined=true;
       this.Terminated=false;
    }
   }
  public void Terminate_Staff()
  { if(Terminated==true)
      { System.out.println("The staff is already terminated.");
      }
    else
      {this.Staff_Name=Staff_Name;
       this.Joining_Date=Joining_Date;
       this.Qualification=Qualification;
       this.Appointed_By=Appointed_By;
       this.Joined=false;
       this.Terminated=true;
      }
  }
  public void Display()
  { super.display();
    if(Joined==true)
      { System.out.println("Staff name: "+Staff_Name+"\nWager per hour: "
          +WagesPerHour+"\nWorking hour: "+Working_Hour+"\nJoining date: "
          +Joining_Date+"\nQualification: "+Qualification+"\nAppointed by: "
          +Appointed_By+"Income per day: "+Working_Hour*WagesPerHour);}
  } 
}