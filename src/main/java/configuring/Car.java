package configuring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import configuring.CarEvent.CarEventType;

@Component
@Configurable
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Car {

	@Autowired
	ApplicationEventPublisher publisher;

	Engine engine = new Engine();

	public String start() {
		publisher.publishEvent(new CarEvent(this, Thread.currentThread(), CarEventType.STARTED));
		return null;
	}

}
