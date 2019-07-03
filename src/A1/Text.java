package A1;

public class Text {
public static void main(String[] args) {
	t(5,5,0,0);
}
public static void t(int x,int y,int xstart,int ystart) {
	if(x>xstart) {
		System.out.println("*");
		t(x,y,++xstart,ystart);
	}else if(y>ystart) {
		System.out.println();
		t(x,y,0,ystart);
	}
}
	
}
