package configuring;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class CarEvent extends ApplicationEvent {
	public enum CarEventType {
		STARTED
	};

	Car source;
	CarEventType type;
	Thread thread;

	public CarEvent(Car source, Thread eventOriginThread, CarEventType type) {
		super(source);
		this.source = source;
		this.type = type;
		this.thread = eventOriginThread;
	}

}
