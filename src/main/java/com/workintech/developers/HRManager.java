package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private  MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, int salary){
        super(id, name, salary);
    }
    public HRManager(long id, String name, int salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers ){
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper junior){
       if(juniorDevelopers[index] == null){
           juniorDevelopers[index] = junior;
       }
    }

    public void addEmployee(int index, MidDeveloper mid){
        if(midDevelopers[index] == null){
            midDevelopers[index] = mid;
        }
    }

    public void addEmployee(int index, SeniorDeveloper senior){
        if(seniorDevelopers[index] == null){
            seniorDevelopers[index] = senior;
        }
    }


    @Override
    public void work() {
        System.out.println("HRManager");
        setSalary(45000);
    }
}
