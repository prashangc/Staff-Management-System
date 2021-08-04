
public class StaffHire
{
  protected String designation;
  protected String job_type;
  protected int vacancy_number;
 
  StaffHire(String designation,int vacancy_number,String job_type){
    this.designation=designation;
    this.vacancy_number=vacancy_number;
    this.job_type=job_type;}
  
    public String getDesignation()
    {
        return designation;
    }
    
    public void setDesignation(String designation)
    {
        this.designation=designation;
    }
    
    public String getJob_type()
    {
        return job_type;}
     
    public void setJob_type(String job_type)
    {
        this.job_type=job_type;
    }
    
    public int getVacancy_number()
    {
        return vacancy_number;
    }
    
    public void setVacancy_number(int vacancy_number)
    {
        this.vacancy_number=vacancy_number;
    }
    
    public void display()
    {
        System.out.println("The designation is "+designation+" The job type is "+job_type+
        " The vacancy  number"+vacancy_number);
    }
   
}   