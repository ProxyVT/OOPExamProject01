package by.itstep.tiknyus.examproject.model.entity;

public class Orange {
    private int diameter;
    private int vitaminC;
    private double coast;

    public Orange() {
    }

    public Orange(int diameter, int vitaminC, double coast) {
        this.diameter = diameter;
        this.vitaminC = vitaminC;
        this.coast = coast;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        if(vitaminC > 0) {
            this.vitaminC = vitaminC;
        }
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        if(coast > 0){
            this.coast = coast;
        }
        this.coast = coast;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "diameter=" + diameter +
                ", vitaminC =" + vitaminC +
                ", coast=" + coast +
                '}';
    }
}
