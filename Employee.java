public class Employee {
    String name;
    double salary;
    int hireYear ;
    int workHours;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary =salary;
        this.hireYear=hireYear;
        this.workHours=workHours;
    }
    double tax(double salary){
        if (this.salary >1000){
            return salary*(0.03);
        }
        return 0;
    }
    int bonus(int workHours){
        int moreHourse ;
        int totalBonus = 0;
        if (workHours>40){
            moreHourse= workHours  - 40;
            totalBonus = moreHourse*30;
            return totalBonus;
        }
        return totalBonus ;
    }
    double raiseSalary(int hireYear) {
        int todaysYear = 2021;
        if ((todaysYear - hireYear) < 10) {
            return (this.salary * 0.05);
        } else if ((todaysYear - hireYear > 9) && (todaysYear - hireYear < 20)) {
            return (this.salary * 0.10);
        } else if ((todaysYear - hireYear) > 19) {
            return (this.salary * 0.15);
        }
        return 0;
    }

    void tooString(){
        System.out.println(this.name+"\n"+"Base Salary :"+this.salary+"\n"+"Work hours :"+this.workHours+"\n"+
                "Hire Year : "+this.hireYear+"\n"+"Taxes : "+tax(this.salary)+"\n"+
                "Bonus : "+bonus(this.workHours)+"\n"+"Raise Salary :"+raiseSalary(this.hireYear)+"\n"+
                "Taxes and bonus included :"+(this.salary-tax(this.salary)+bonus(this.workHours))+"\n"+"Salary :"+(this.salary+tax(this.salary)+bonus(this.workHours)+raiseSalary(this.hireYear)));


    }
}












