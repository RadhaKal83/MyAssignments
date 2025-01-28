package week3.HomeAssignments;

public class CheckBoxButton extends Button {
public void clickCheckButton() {
	System.out.println("Click Check Button");
}
public static void main(String[] args) {
	CheckBoxButton cbb = new CheckBoxButton();
	cbb.clickCheckButton();
	cbb.submit();
	cbb.click();
	cbb.setText();
}
}
