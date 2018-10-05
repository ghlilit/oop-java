import java.util.*;
 class Dcoder{ 
	public static void main(String args[]){ 
 	Scanner input=new Scanner(System.in);
 	int row=input.nextInt(), column=input.nextInt();
 	int[][]array=new int[row][column];
 	for(int i=0;i<row;i++){
 		for(int j=0;j<column;j++){
 			array[i][j]=input.nextInt();
 		}
 	}
		Boolean valid=valid(array);
		System.out.println(valid);
 	}
 	public static Boolean valid(int array[][]){
boolean row=true, col=true, diagonal=true, square=true, ifinal=false;
int row1=0, col1=0, rows=0, cols=0, sumd=0, sumd2=0;
for (int i=0;i<array.length;i++){
	if(array[i].length!=array.length){
		square=false;
	}
	row1+=array[0][i];
	col1+=array[i][0];
}
 for (int i=0;i<array.length;i++){
 	for(int j=0;j<array[i].length;j++){
 	if(col1!=array[i][j]){
 		col=false;
 	}
 	if(row1!=array[j][i]){
 		row=false;
 	}
 	if(i==j){
 		sumd+=array[i][j];
 	}
 	if(i==array.length-j){
 		sumd2+=array[i][j];
 	}
	if (sumd!=sumd2){
		diagonal=false;
 	}
 }
 if(row&&col&&diagonal&&square){
 	ifinal=true;
 }
 	}
 	return ifinal;
 }
 }
