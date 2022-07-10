import java.util.*;

//x 좌표가 증가하는 순, x좌표가 같은 경우 y좌표가 감소하는 순
class Point implements Comparable<Point> {
	int x,y;
	Point (int x, int y) {
		this.y=y;
		this.x=x;
	}
	@Override
	public int compareTo (Point p) {
		//x좌표가 같은 경우 y좌표가 감소하는 순
		if (this.x==p.x) { 
			if (this.y<p.y) return 1;
		}
		//x좌표가 
		else if (this.x>p.x) return 1;	
		return -1;
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Point> pl=new ArrayList<>();
		pl.add(new Point(1,1));
		pl.add(new Point(1,2));
		pl.add(new Point(1,3));
		pl.add(new Point(1,1));
		pl.add(new Point(0,1));	
		Collections.sort(pl);	
		for (int i=0; i<pl.size(); i++) {
			int x=pl.get(i).x;
			int y=pl.get(i).y;		
			System.out.println(x+" "+y);
		}
	}

}
