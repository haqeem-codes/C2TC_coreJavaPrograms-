package com.tnsif.Day4.package1;

public class Base {
	    int varDefault = 100;
	    public int varPublic = 250;
	    private int varPrivate = 370;
	    protected int varProtected = 480;

	    void methodDefault() {
	        System.out.println("Default access Base class");
	        System.out.println("Default Variable : " + varDefault);
	    }

	    public void methodPublic() {
	        System.out.println("Public access Base class");
	        System.out.println("Public Variable : " + varPublic);
	    }

	    protected void methodProtected() {
	        System.out.println("Protected access Base class");
	        System.out.println("Protected Variable : " + varProtected);
	    }

	    public int getVarPrivate() {
	        return varPrivate;
	    }

	    public void setVarPrivate(int varPrivate) {
	        this.varPrivate = varPrivate;
	    }
	}


