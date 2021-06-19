package com.company.MicrosoftDEV277xOOPJAVA.companyStructure;

public class SoftwareEngineer extends TechnicalEmployee{

    TechnicalLead manager;
    boolean codeAccess;

    public SoftwareEngineer(String name) {
        super(name);
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean access) {
        this.codeAccess = access;
    }

    public int getSuccessfulCheckIns(){
        return super.checkins;
    }
    public boolean checkInCode(){
        if(manager.checkins == getSuccessfulCheckIns() ) {
            checkins++;
            return true;
        }
        return false;
    }
}
