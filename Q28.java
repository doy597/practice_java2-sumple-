import java.io.*;
import java.util.*;

class Q28{
	public static void main(String[] args){
		ArrayList<String>branches = new ArrayList<String>();
		branches.add("東京");
		branches.add("大阪");
		branches.add("名古屋");

		for(String branchName : branches){
			System.out.println(branchName);
		}
	}
}