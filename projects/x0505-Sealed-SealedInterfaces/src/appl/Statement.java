package appl;

public sealed interface Statement permits Assignment, Loop, Choice, Call {
	public abstract void execute();
}
