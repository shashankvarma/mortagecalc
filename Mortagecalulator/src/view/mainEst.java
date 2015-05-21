package view;

import java.lang.Math;

public class mainEst {
	public double TotalGrossIncome;
	public double TotalMonthlyDebt;
	public double MortageInterestRate;
	public int Term;
	public double DownPayment;
	public double HousingRaw;
	public double HousingAll;
	public double Maximum;
	public double Mortage;
	
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
		return this.HousingRaw;	
	}
	
	public void setHousingRaw(double HousingRaw){
		this.HousingRaw = HousingRaw;
	}
	
	public double getHousingAll(){
		return this.HousingAll;	
	}
	
	public void setHousingAll(double HousingAll){
		this.HousingAll = HousingAll;
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
		this.HousingRaw = (this.TotalGrossIncome / 12) * 0.18;
	}
	
	public void calculateHousingAll(){
		this.HousingRaw = (this.TotalGrossIncome / 12) * 0.36 - this.TotalMonthlyDebt;
	}
	
	public void calculateMaximum(){
		this.Maximum = Math.min(this.HousingRaw, this.HousingAll);
	}
	
	public void calculateMortage(){
		this.Maximum = this.Maximum*Math.pow(1 +  MortageInterestRate/12, this.Term*12);
	}
}