package javaProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumbersusingHashset {

	public static void main(String[] args) {
		int a[] = {1,4,4,5,5,8,2,4,4};
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		Integer b[] =set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(b));
		
		

}}
