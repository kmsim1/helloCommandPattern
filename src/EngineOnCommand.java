
public class EngineOnCommand implements Command {
	private Car car;
	
	public EngineOnCommand(Car car) {
		this.car = car;
	}
	
	@Override
	public void execute() {
		car.engineOn();
	}
}
