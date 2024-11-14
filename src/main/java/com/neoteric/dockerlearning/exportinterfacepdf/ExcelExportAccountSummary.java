package com.neoteric.dockerlearning.exportinterfacepdf;

public class ExcelExportAccountSummary implements EditExportAccountSummary{

    int i=10;

    @Override
    public String export(AccountSummary accountSummary) {
        System.out.println("Export to excel is done");
        return "Data exported to excel is done";

    }


    @Override
    public void test(AccountSummary accountSummary) {

    }
}
