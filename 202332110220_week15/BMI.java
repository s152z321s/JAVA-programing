public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double METERS_PER_CM=0.01;

    public BMI(String name, int age, double weight, double height) 
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) 
    {
        this(name,20,weight,height);
    }

    

    public double getBMI() 
    {
        double bmi = weight / Math.pow(height*METERS_PER_CM,2);
        return bmi;
    }

    public String getStatus() 
    {
        double bmi=getBMI();
        if(bmi<18.5)
            return "Underweight";
        else if(bmi<25)
            return "Normal";
        else if(bmi<30)
            return "Overweight";
        else
            return "Obese";
    }

    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getHeight()
    {
        return height;
    }
}
