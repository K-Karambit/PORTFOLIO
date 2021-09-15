package BloodBank;
class BloodData { 
    String bloodtype;
    String rhFactor;

BloodData(){

    bloodtype = "O";
    rhFactor = "+";
    
}   
public void display(String bt, String rh){    
    bt = bloodtype;
    rh = rhFactor;       
}
public String getBloodType(){
    return bloodtype;
}
public void setBloodType(String bt){
    this.bloodtype = bt;
}
public String getRhFactor(){
    return rhFactor;
}
public void setRhFactor(String rh){
    this.bloodtype = rh;
}
}