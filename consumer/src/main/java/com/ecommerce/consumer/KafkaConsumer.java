//package com.ecommerce.consumer;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class KafkaConsumer {
//
//    @KafkaListener(topics = "my-topic", groupId = "my-new-group1")
//    public void listen1(String message) {
//        System.out.println("Received Message 1: " + message);
//    }
//
//    @KafkaListener(topics = "my-topic", groupId = "my-new-group2")
//    public void listen2(String message) {
//        System.out.println("Received Message 2: " + message);
//    }
//
//    @KafkaListener(topics = "my-topic-new", groupId = "my-new-group-rider")
//    public void listenRiderLocation(RiderLocation location) {
//        System.out.println("Received location: " + location.getRiderId()
//        + " : " + location.getLatitude() + " : " + location.getLongitude());
//    }
//
//
//}
//
//
////    Note:
////    Condition1: same topic + same groupId and no od consumer = 2
////    Consumer behaviour : Kafka message divide krega, Dono consumer load share krenge
////                         Ek message sirf ek consumer ko milega , called -> Load Balancing
////
////    Note:
////    Condition1: same topic + Different groupId and no od consumer = 2
////    Consumer behaviour : Kafka message dono group ko send  krega, No load share
////    Message Duplicate Consume hoga , called -> Publish subscribe Pattern
////
//
