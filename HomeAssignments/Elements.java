package week3.HomeAssignments;

public class Elements extends Button {
public void named() {
	System.out.println("TestLeaf");
}
public static void main(String[] args) {
	Elements el = new Elements();
	el.named();
	el.click();
	el.setText();
	el.submit();
	}
}
