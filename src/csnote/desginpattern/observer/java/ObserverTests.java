package csnote.desginpattern.observer.java;

public class ObserverTests {
    public static void main(String[] args) {
        Topic topic = new Topic();

        Observer a = new TopicSubscriber("a",topic);
        Observer b = new TopicSubscriber("b",topic);
        Observer c = new TopicSubscriber("c",topic);
        Observer d = new TopicSubscriber("d",topic);
        Observer e = new TopicSubscriber("e",topic);
        topic.register(a);
        topic.register(b);
        topic.register(c);

        topic.postMessage("hdhdhdhdhhd");
    }
}
