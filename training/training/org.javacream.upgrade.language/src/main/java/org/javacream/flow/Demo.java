package org.javacream.flow;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class Demo {
    static class SimpleStringSubscriber implements Flow.Subscriber<String>{

        private Flow.Subscription subscription;

        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            this.subscription = subscription;
            System.out.println("onSubscribe");
            subscription.request(1);
        }

        @Override
        public void onNext(String s) {
            System.out.println("onNext: " + s);
            subscription.request(1);
        }

        @Override
        public void onError(Throwable throwable) {
            System.out.println("onError: " + throwable);

        }

        @Override
        public void onComplete() {
            System.out.println("onComplete");

        }

    }
    public static void main(String[] args) throws Exception{
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>() ;
        publisher.subscribe(new SimpleStringSubscriber());
        publisher.submit("Hello World!");
        publisher.submit("Hello World!");
        publisher.submit("Hello World!");
        publisher.close();
        Thread.sleep(1000);
    }
}
