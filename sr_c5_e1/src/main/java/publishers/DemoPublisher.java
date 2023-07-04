package publishers;

import java.util.List;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import Subsriptions.DemoSubscription;

public class DemoPublisher<T> implements Publisher<Integer>{

	public final List<Integer> list;
	
	public DemoPublisher(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void subscribe(Subscriber<? super Integer> subscriber) {
		
		Subscription subscription = new Subscription() {
			
			private int lastRequestedElement=-1;
			
			@Override
			public void request(long l) {
				lastRequestedElement++;
				if (lastRequestedElement < list.size())
					subscriber.onNext(list.get(lastRequestedElement));
				else
					subscriber.onComplete();
			}
			
			@Override
			public void cancel() {
				
			}
		};
		subscriber.onSubscribe(subscription);
		
	}

}
