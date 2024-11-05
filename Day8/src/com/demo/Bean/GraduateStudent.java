// Source code is decompiled from a .class file using FernFlower decompiler.
package com.demo.Bean;


public class GraduateStudent extends Student {
   private int spsub;

   public GraduateStudent() {
   }

   public GraduateStudent(int pid, String pname, String address, int m1, int m2, int spsub) {
      super(pid, pname, address, m1,m2);
      this.spsub = spsub;
   }

   public int getSpsub() {
      return this.spsub;
   }

   public void setSpsub(int spsub) {
      this.spsub = spsub;
   }

//   public void calculateMarks() {
//      float result = (float)(this.getMarks()[0] + this.getMarks()[1]) * 0.5F + (float)this.spsub;
//      System.out.println(result);
//   }

   public String toString() {
      String var = super.toString();
      return var + "GraduateStudent [spsub=" + this.spsub + "]";
   }
}
