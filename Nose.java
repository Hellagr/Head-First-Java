interface Nose {
public int iMethod();
}
abstract class Picasso implements Nose{
public int iMethod(){
return 7;
}
}
class Clowns implements Nose { }
class Acts implements Nose {
public int iMethod(){
return 5;
}
}
public class Of76 extends Clowns {
public static void main(String [] args) {
Nose[] i=new Nose[3];
i[0] = new Nose();
i[1] = new Nose();
i[2] = new Nose();
for(int x = 0; x < 3; x++) {
System.out.println(i[x].iMethod()
+ " " + i.getClass( ) );
}
}
}