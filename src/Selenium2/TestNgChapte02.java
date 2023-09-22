package Selenium2;

import org.testng.annotations.Test;

public class TestNgChapte02 {
   @Test(groups="regression")
   public void test01() {
	   System.out.println("This is regression 01");
   }
   @Test(groups="sanity")
   public void test02() {
	   System.out.println("This is sanity 01");
   } @Test(groups="regression")
   public void test03() {
	   System.out.println("This is regression 02");
   } @Test(groups="regression")
   public void test04() {
	   System.out.println("This is regression 04");
   } @Test(groups="sanity")
   public void test05() {
	   System.out.println("This is sanity 05");
   } @Test(groups="regression")
   public void test06() {
	   System.out.println("This is regression 06");
   } @Test(groups="sanity")
   public void test07() {
	   System.out.println("This is sanity 07");
   } @Test(groups="Smoke")
   public void test08() {
	   System.out.println("This is Smoke 08");
   }

}
