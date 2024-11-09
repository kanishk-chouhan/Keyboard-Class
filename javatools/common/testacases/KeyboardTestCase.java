import com.thinking.machines.util.*;
class KeyboardTestCase
{
static public void main(String gg[])
{
Keyboard k=new Keyboard();
String a;
System.out.print("Enter a string : ");
a=k.getString();
System.out.println(a);

char c;
System.out.print("Enter a character : ");
c=k.getCharacter();
System.out.println(c);

String b;
b=k.getString("Enter a string : ");
System.out.println(b);

char d;
d=k.getCharacter("Enter a character : ");
System.out.println(d);

short s;
s=k.getShort("Enter a short type value : ");
System.out.println(s);

float f;
f=k.getFloat("Enter a float type value : ");
System.out.println(f);

double e;
e=k.getDouble("Enter a double type value : ");
System.out.println(e);

boolean z;
z=k.getBoolean("Enter a boolean type value : ");
System.out.println(z);



}
}