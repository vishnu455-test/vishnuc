package create;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sheet {

	public static void main(String[] args) throws Exception {
		try(Workbook workbook = new XSSFWorkbook()){
			

			 Sheet sheet = workbook.createSheet("TestNG edit profile Report");
	    	  Row headerRow = sheet.createRow(0);
	    	  headerRow.createCell(0).setCellValue("Testcase");
	    	  headerRow.createCell(1).setCellValue("status");
	    	  
	    		Row dataRow1 = sheet.createRow(1);
				dataRow1.createCell(0).setCellValue("click menu");
				dataRow1.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow2 = sheet.createRow(2);
	    	  dataRow2.createCell(0).setCellValue("click on profile");
	    	  dataRow2.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow3 = sheet.createRow(3);
	    	  dataRow3.createCell(0).setCellValue("should navigate to the profile page");
	    	  dataRow3.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow4 = sheet.createRow(4);
	    	  dataRow4.createCell(0).setCellValue("click edit icon");
	    	  dataRow4.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow5 = sheet.createRow(5);
	    	  dataRow5.createCell(0).setCellValue("should navigate to the complete your profile page");
	    	  dataRow5.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow6 = sheet.createRow(6);
	    	  dataRow6.createCell(0).setCellValue("edit and update details");
	    	  dataRow6.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow7 = sheet.createRow(7);
	    	  dataRow7.createCell(0).setCellValue("click save and next button");
	    	  dataRow7.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow8 = sheet.createRow(8);
	    	  dataRow8.createCell(0).setCellValue("Details should get updated");
	    	  dataRow8.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow9 = sheet.createRow(9);
	    	  dataRow9.createCell(0).setCellValue("update the details");
	    	  dataRow9.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow10 = sheet.createRow(10);
	    	  dataRow10.createCell(0).setCellValue("Don't click save and next button, instead click back button");
	    	  dataRow10.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow11 = sheet.createRow(11);
	    	  dataRow11.createCell(0).setCellValue("details should remian same, should navigate to the profile screen");
	    	  dataRow11.createCell(1).setCellValue("pass");
	    	  
	    	 //ikon last icon
	    	  
	    	  Row dataRow12 = sheet.createRow(12);
	    	  dataRow12.createCell(0).setCellValue("click last icon");
	    	  dataRow12.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow13 = sheet.createRow(13);
	    	  dataRow13.createCell(0).setCellValue("profile, commitments, media, history icons screen should display");
	    	  dataRow13.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow14 = sheet.createRow(14);
	    	  dataRow14.createCell(0).setCellValue("click profile icon");
	    	  dataRow14.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow15 = sheet.createRow(15);
	    	  dataRow15.createCell(0).setCellValue("profile screen should display");
	    	  dataRow15.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow16 = sheet.createRow(16);
	    	  dataRow16.createCell(0).setCellValue("click back icon");
	    	  dataRow16.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow17 = sheet.createRow(17);
	    	  dataRow17.createCell(0).setCellValue("previous screen should display");
	    	  dataRow17.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow18 = sheet.createRow(18);
	    	  dataRow18.createCell(0).setCellValue("click commitments icon");
	    	  dataRow18.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow19 = sheet.createRow(19);
	    	  dataRow19.createCell(0).setCellValue("commitments screen should display");
	    	  dataRow19.createCell(1).setCellValue("pass");
			  
	    	  Row dataRow20 = sheet.createRow(20);
	    	  dataRow20.createCell(0).setCellValue("click back icon");
	    	  dataRow20.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow21 = sheet.createRow(21);
	    	  dataRow21.createCell(0).setCellValue("previous screen should display");
	    	  dataRow21.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow22 = sheet.createRow(22);
	    	  dataRow22.createCell(0).setCellValue("click media icon");
	    	  dataRow22.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow23 = sheet.createRow(23);
	    	  dataRow23.createCell(0).setCellValue("media screen should open");
	    	  dataRow23.createCell(1).setCellValue("pass");
	    	  
	    	  Row dataRow24 = sheet.createRow(24);
	    	  dataRow24.createCell(0).setCellValue("click back button");
	    	  dataRow24.createCell(1).setCellValue("pass");
	    	  
	    	  
				try(FileOutputStream fileout = new FileOutputStream("/home/tvisha/Documents/ikon edit profile .xlsx")){
					
					workbook.write(fileout);
		    		  System.out.println("Excel report generated successfully!");    		  	
				}
				catch(IOException e) {
		    		  e.printStackTrace();
			}
		
	}

}
}
