package view;

import java.lang.Math;

import javafx.fxml.FXML;

public class mainEst {
	@FXML
	public double TotalGrossIncome;
	@FXML
	private double TotalMonthDebt;
	@FXML
	private double MortageInterestRate;
	@FXML
	private int Term;
	@FXML
	private double DownPayment;
	@FXML
	private double Housingcost;
	@FXML
	private double Housingall;
	@FXML
	private double max;
	@FXML
	private double Mortage;
	@FXML
	
	public double getTotalGrossIncome(){
		return this.TotalGrossIncome;	
	}
	
	public void setTotalGrossIncome(double TotalGrossIncome){
		this.TotalGrossIncome = TotalGrossIncome;
	}
	
	public double getTotalMonthlyDebt(){
		return this.TotalMonthDebt;	
	}
	
	public void setTotalMonthlyDebt(double TotalMonthDebt){
		this.TotalMonthDebt = TotalMonthDebt;
	}
	
	public double getMortageInterestRate(){
		return this.MortageInterestRate;	
	}
	
	public void setMortageInterestRate(double MortageInterestRate){
		this.MortageInterestRate = MortageInterestRate;
	}
	
	public int getTerm(){
		return this.Term;	
	}
	
	public void setTerm(int Term){
		this.Term = Term;
	}
	
	public double getDownPayment(){
		return this.DownPayment;	
	}
	
	public void setDownPayment(double DownPayment){
		this.DownPayment = DownPayment;
	}
	
	public double getHousingcost(){
		return this.Housingcost;	
	}
	
	public void setHousingRaw(double HousingRaw){
		this.Housingcost = HousingRaw;
	}
	
	public double getHousingAll(){
		return this.Housingall;	
	}
	
	public void setHousingAll(double HousingAll){
		this.Housingall = HousingAll;
	}
	
	public double getmax(){
		return this.max;	
	}
	
	public void setmax(double max){
		this.max = max;
	}
	
	public double getMortage(){
		return this.Mortage;	
	}
	
	public void setMortage(double Mortage){
		this.Mortage = Mortage;
	}

	public void calculateHousingcost(){
		this.Housingcost = (this.TotalGrossIncome / 365) * 0.18;
	}
	
	public void calculateHousingAll(){
		this.Housingcost = (this.TotalGrossIncome / 365) * 0.36 - this.TotalMonthDebt;
	}
	
	public void calculatemax(){
		this.max = Math.min(this.Housingcost, this.Housingall);
	}
	
	public void calculateMortage(){
		this.max = this.max*Math.pow(1 +  MortageInterestRate/12, this.Term/12);
	}
}