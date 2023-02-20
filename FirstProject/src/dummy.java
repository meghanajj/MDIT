

import java.util.Collections;
import java.util.ArrayList;
public class dummy {
public static void main(String[] args) {
//define ArrayList to hold Integer objects
ArrayList numbers = new ArrayList();
for(int i = 0; i < 40; i++)
{
numbers.add(i+1);
System.out.println(numbers);
}
Collections.shuffle(numbers);
System.out.println(numbers);
System.out.print("This week's lottery numbers are: ");
for(int j =0; j < 6; j++)
{
System.out.print(numbers.get(j) + " ");
}
}
}