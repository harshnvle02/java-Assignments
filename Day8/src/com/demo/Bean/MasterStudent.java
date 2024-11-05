package com.demo.Bean;

public class MasterStudent extends Student{

	  private String thesisSub;
	   private int thesisMarks;
	   private String degree;

	   public MasterStudent() {
	   }

	   public MasterStudent(int pid, String pname, String address, int m1, int m2, String thesisSub, String degree, int thesisMarks) {
	      super(pid, pname, address,m1, m2);
	      this.thesisSub = thesisSub;
	      this.thesisMarks = thesisMarks;
	      this.degree = degree;
	   }

	   public String getThesisSub() {
	      return this.thesisSub;
	   }

	   public void setThesisSub(String thesisSub) {
	      this.thesisSub = thesisSub;
	   }

	   public int getThesisMarks() {
	      return this.thesisMarks;
	   }

	   public void setThesisMarks(int thesisMarks) {
	      this.thesisMarks = thesisMarks;
	   }

	   public String getDegree() {
	      return this.degree;
	   }

	   public void setDegree(String degree) {
	      this.degree = degree;
	   }

	   public String toString() {
	      String var = super.toString();
	      return var + "MasterStudent [thesisSub=" + this.thesisSub + ", thesisMarks=" + this.thesisMarks + ", degree=" + this.degree + "]";
	   }
}
