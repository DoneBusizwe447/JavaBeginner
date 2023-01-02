for (int i = 0; i < nums.size(); i++)
 System.out.println(nums.get(i));

for (String s : nums)
 System.out.println(s);

for (String s : nums)
{
 int i = nums.indexOf(s);
 System.out.println("Item " + i + ": " + s);
}

nums.add("Four");
String s;
Iterator e = nums.iterator();
while (e.hasNext())
{
 s = (String)e.next();
 System.out.println(s);
}

