package com.neoteric.dockerlearning.exportinterfacepdf;

public class PolymorphismWithInterfaceTest {


     public static void main(String[] args) {
          ExportAccountSummary exportAccountSummary= new ExcelExportAccountSummary();

           exportAccountSummary.export(new AccountSummary());


           ExportAccountSummary pdfExportAccountSummart= new PDFExportAccountSummary();
           pdfExportAccountSummart.export(new AccountSummary());

     }


}
