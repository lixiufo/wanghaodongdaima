package com.stu;
 
//��toString ��дһ����
public class Car {
     
   //��Ա����
    private String carNo;
    private String carName;
    private String color;
    private double price;
     
   //�вι��캯��
    Car(String carNo,String carName,String color,double price){
        this.carNo=carNo;
        this.carName=carName;
        this.color=color;
        this.price=price;
    }
     
    //get set����
    public String getCarNo(){
        return carNo;
    }
     
    public void setCarNo(String carNo){
        this.carNo=carNo;
    }
     
    public String getCarName() {
        return carName;
    }
 
    public void setCarName(String carName) {
        this.carName = carName;
    }
 
    public String getColor() {
        return color;
    }
 
    public void setColor(String color) {
        this.color = color;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
           //��дtoString();
    public String toString(){
        return "����������� "+carName+",�ͺ��� "+carNo+",������ɫ "+color+",�۸� "+price+"��Ӧ�ó��ܵ���";
    }
     
    
    public static void main(String[] args){
       //����һ��Car�Ķ���
    
    Car myCar=new Car("��A 4995","��������","����ɫ",70000.00);   //������ͷ��ĸ��д
        System.out.println(myCar);
    }
}