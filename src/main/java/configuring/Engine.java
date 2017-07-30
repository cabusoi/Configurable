package configuring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import configuring.CarEvent.CarEventType;

@Component
@Configurable
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Engine implements ApplicationListener<CarEvent> {

	public String start(CarEvent event) {
		String result = "Engine.start " + this + " origin " + event.thread + " current " + Thread.currentThread();
		System.out.println("\n" + result);
		return result;
	}

	@Override
	public void onApplicationEvent(CarEvent event) {
		if (event.type == CarEventType.STARTED) {
			this.start(event);
		}
	}

}
