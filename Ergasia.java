class Pelatis_Trapezas {
	
 private	String name;
 private	double ypol;
 private	double poso_kin;
 private	int kod_kin;
 private	double neo_ypol;




 
 /*Pelatis_Trapezas(String name, double ypol, int kod_kin, double poso_kin, double neo_ypol){
	this.name=name;
	this.ypol=ypol;
	this.poso_kin=poso_kin;
	this.kod_kin=kod_kin;
	this.neo_ypol=neo_ypol;
 } //AFTOS INE ENAS DOKIMASTIKOS CONSTRUCTOR*/
 
 
 
 
 void setName(String NAME) {
	 name=NAME;
 }
 
void setYpol(double YPOL) {
	ypol=YPOL;
}
 
 void setPosokin(double POSO_KIN) {
	 poso_kin=POSO_KIN;
 }
 
 void setKodkin(int KOD_KIN) {
	 kod_kin=KOD_KIN;
 }
 
 void setNeoypol(double NEO_YPOL) {
	 neo_ypol=NEO_YPOL;
 }
 
 String getName() {
 return name; }
 
 double getYpol() {
 return ypol; }
     
 double getPosokin() {
 return poso_kin; }
 
 int getKodkin() {
 return kod_kin; }
 
 
 double getgetNeoypol() {
 return neo_ypol;
 }
  
 public static double withdraw(double ypol, double poso_kin){
	double neo_ypol=ypol-poso_kin;
	return neo_ypol;}

 public static double deposit(double ypol, double poso_kin){
	double neo_ypol=ypol+poso_kin;
	return neo_ypol;}


 public String toString(){
	String emf;
	emf="-----------------------------"+ "\n";
	emf+=" " +"\n";
	emf+="Name:        " +name+"\n";
	emf+=" " +"\n";
	emf+="Balance:     " +ypol+ "\n";
	emf+=" " +"\n";
	emf+="Trans. Code: " +kod_kin+ "\n";
	emf+=" " +"\n";
	emf+="Amoount:     " +poso_kin+ "\n";
	emf+=" " +"\n";
	emf+="New Balance: " +neo_ypol+ "\n";
	emf+=" " +"\n";
	emf+="-----------------------------" +"\n";
	return emf;}
 

}


class Ergasia{
 public static void main(String args[]){
 	String name;
	double ypol, poso_kin, neo_ypol;
	int kod_kin;


	System.out.println("Type Your Name: ");
	name=UserInput.getString();
	System.out.println("Type Your Current Balance: ");
	ypol=UserInput.getDouble();
	System.out.println("Type 1 for withdraw, 2 for deposit: ");
	kod_kin=UserInput.getInteger();
	System.out.println("Type the transaction...: ");
	poso_kin=UserInput.getDouble();


  switch(kod_kin){
	case 1:
		neo_ypol=Pelatis_Trapezas.withdraw(ypol, poso_kin);
		break;
 	default:
		neo_ypol=Pelatis_Trapezas.deposit(ypol, poso_kin);
	}

 
 Pelatis_Trapezas pel_tr=new Pelatis_Trapezas(setName(name), setYpol(ypol), setKodkin(kod_kin), setPosokin(poso_kin), setNeoypol(neo_ypol) );

 System.out.println(pel_tr);
 } 
}
