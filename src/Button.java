/*
 *  Button클래스는 버튼의 기능이 변경됨에 따라서 변경되지 않음!!!!!
 */
public class Button {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressed() {
		command.execute();
	}
}
