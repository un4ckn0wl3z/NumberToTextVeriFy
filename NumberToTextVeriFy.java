
import java.util.Scanner;
public class Test_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String userInput;
	
		
		String[] answer4 = new String[4];
		String[] answer3 = new String[3];
		String[] answer2 = new String[2];
		String[] answer1 = new String[1];
		char[] numlist = {'0','1','2','3','4','5','6','7','8','9'};
		String[] UnitED = {"","เอ็ด","สอง","สาม","สี่","ห้า","หก","เจ็ด","แปด","เก้า"};
		String[] Unit = {"","หนึ่ง","สอง","สาม","สี่","ห้า","หก","เจ็ด","แปด","เก้า"};
		String[] UnitTen = {"","สิบ","ยี่สิบ","สามสิบ","สี่สิบ","ห้าสิบ","หกสิบ","เจ็ดสิบ","แปดสิบ","เก้าสิบ"};
		String[] UnitHD = {"","หนึ่งร้อย","สองร้อย","สามร้อย","สี่ร้อย","ห้าร้อย","หกร้อย","เจ็ดร้อย","แปดร้อย","เก้าร้อย"};
		String[] UnitTS = {"","หนึ่งพัน","สองพัน","สามพัน","สี่พัน","ห้าพัน","หกพัน","เจ็ดพัน","แปดพัน","เก้าพัน"};
		
		
		for(;;){
			System.out.print("Enter number: ");
			userInput = sc.nextLine();
			System.out.println("Number is : " + userInput);
			//String CuserInput = Integer.toString(userInput);
		switch(userInput.length()){
		
		case 4 : {
					for(int i41=0;i41<userInput.length();i41++){
						for(int j41=0;j41<UnitTS.length;j41++){
							if(userInput.charAt(0) == numlist[j41]){
								answer4[0] = UnitTS[j41];
			
								
							}
						}
						//--------------------------------------------
						for(int j42=0;j42<UnitHD.length;j42++){
							if(userInput.charAt(1) == numlist[j42]){
								answer4[1] = UnitHD[j42];
			
								
							}
						}
						//--------------------------------------------
						for(int j43=0;j43<UnitTen.length;j43++){
							if(userInput.charAt(2) == numlist[j43]){
								answer4[2] = UnitTen[j43];
			
								
							}
						}
						//---------------------------------------------
						for(int j44=0;j44<UnitED.length;j44++){
							if(userInput.charAt(3) == numlist[j44]){
								answer4[3] = UnitED[j44];
			
								
							}
						}
					}
			
				  //---------------------------------------------------
				}break;
		case 3 :{
					for(int i31=0;i31<userInput.length();i31++){
						for(int j31=0;j31<UnitHD.length;j31++){
							if(userInput.charAt(0) == numlist[j31]){
								answer3[0] = UnitHD[j31];
							}
						}
						//-----------------------------------------------
						for(int j32=0;j32<UnitTen.length;j32++){
							if(userInput.charAt(1) == numlist[j32]){
								answer3[1] = UnitTen[j32];
							}
						}
						//-----------------------------------------------
						for(int j33=0;j33<UnitED.length;j33++){
							if(userInput.charAt(2) == numlist[j33]){
								answer3[2] = UnitED[j33];
							}
						}
			
					}
				}//-----------------------------------------------------------
				break;
		case 2 : {
					for(int i21=0;i21<userInput.length();i21++){
						for(int j21=0;j21<UnitTen.length;j21++){
							if(userInput.charAt(0) == numlist[j21]){
								answer2[0] = UnitTen[j21];
							}
						}
						//-----------------------------------------------
						for(int j22=0;j22<UnitED.length;j22++){
							if(userInput.charAt(1) == numlist[j22]){
								answer2[1] = UnitED[j22];
							}
						}
					}
			
			
				}
				break;
		case 1 :{
			for(int i11=0;i11<userInput.length();i11++){
				for(int j11=0;j11<Unit.length;j11++){
					if(userInput.charAt(0) == numlist[j11]){
						answer1[0] = Unit[j11];
						}
					}
				}
			
				}break;
			default:{
				System.out.println("Error....");
			}
		
		}
		
		if(userInput.length()==4){
			System.out.print("Text is : ");
			for(int x4=0;x4<answer4.length;x4++){
				System.out.print(answer4[x4]);
			}
			System.out.println();
			
		}else if(userInput.length()==3){
			System.out.print("Text is : ");
			for(int x3=0;x3<answer3.length;x3++){
				System.out.print(answer3[x3]);
			}
			System.out.println();
			
		}else if(userInput.length()==2){
			System.out.print("Text is : ");
			for(int x2=0;x2<answer2.length;x2++){
				System.out.print(answer2[x2]);
			}
			System.out.println();
		}else if(userInput.length()==1){
			System.out.print("Text is : ");
			for(int x1=0;x1<answer1.length;x1++){
				System.out.print(answer1[x1]);
			}
			System.out.println();
			
		}else{
			System.out.println("Error....");
		}

	
		}		
		
	}

}
