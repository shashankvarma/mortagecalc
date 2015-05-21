package view;

import java.lang.Math;

import javafx.fxml.FXML;

public class mainEst {
	@FXML
	public double TotalGrossIncome;
	@FXML
	private double TotalMonthlyDebt;
	@FXML
	private double MortageInterestRate;
	@FXML
	private int Term;
	@FXML
	private double DownPayment;
	@FXML
	private double Housingraw;
	@FXML
	private double Housingall;
	@FXML
	private double Maximum;
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
		return this.TotalMonthlyDebt;	
	}
	
	public void setTotalMonthlyDebt(double TotalMonthlyDebt){
		this.TotalMonthlyDebt = TotalMonthlyDebt;
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
	
	public double getHousingRaw(){
		return this.Housingraw;	
	}
	
	public void setHousingRaw(double HousingRaw){
		this.Housingraw = HousingRaw;
	}
	
	public double getHousingAll(){
		return this.Housingall;	
	}
	
	public void setHousingAll(double HousingAll){
		this.Housingall = HousingAll;
	}
	
	public double getMaximum(){
		return this.Maximum;	
	}
	
	public void setMaximum(double Maximum){
		this.Maximum = Maximum;
	}
	
	public double getMortage(){
		return this.Mortage;	
	}
	
	public void setMortage(double Mortage){
		this.Mortage = Mortage;
	}

	public void calculateHousingRaw(){
		this.Housingraw = (this.TotalGrossIncome / 12) * 0.18;
	}
	
	public void calculateHousingAll(){
		this.Housingraw = (this.TotalGrossIncome / 12) * 0.36 - this.TotalMonthlyDebt;
	}
	
	public void calculateMaximum(){
		this.Maximum = Math.min(this.Housingraw, this.Housingall);
	}
	
	public void calculateMortage(){
		this.Maximum = this.Maximum*Math.pow(1 +  MortageInterestRate/12, this.Term*12);
	}
}