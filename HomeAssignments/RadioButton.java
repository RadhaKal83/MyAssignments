package week3.HomeAssignments;

public class RadioButton extends Button {
public void selectRadioButton() {
	System.out.println("Select radio Button");
}
public static void main(String[] args) {
	RadioButton rb = new RadioButton();
	rb.selectRadioButton();
	rb.click();
	rb.setText();
	rb.submit();
	
}
}
