package datadriven;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class datatest {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		datadriventesting obt = new datadriventesting();
		ArrayList data = obt.getdata("passwords");
		System.out.println(data.get(0));

	}
}