
public class Main {
	public static void main(String[] args) {
		Button button = new Button();
		
		Lamp lamp = new Lamp();
		LampOnCommand loc = new LampOnCommand(lamp);
		LampOffCommand loffc = new LampOffCommand(lamp);
		
		button.setCommand(loc);
		button.pressed();
		
		button.setCommand(loffc);
		button.pressed();
		
		Alarm alarm = new Alarm();
		AlarmStartCommand asc = new AlarmStartCommand(alarm);
		
		button.setCommand(asc);
		button.pressed();
		
		
	}
}
