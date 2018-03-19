package com.CollectionQueue;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import static com.CollectionQueue.Enquiry.comparator;

/**
 * Created by Mallika Aruva on 2/16/2018.
 */
public class HelpDesk {


    private Queue<Enquiry> enquiryQueue = new ArrayDeque<>();

    private Queue<Enquiry> enquiryQueuePriority = new PriorityQueue<>(comparator);

    public void enquire(Customer customer, Category category) {
        //to add one element in the queue
        enquiryQueue.offer(new Enquiry(customer, category));
        enquiryQueuePriority.offer(new Enquiry(customer,category));
    }

    public void processEnquiries() {
        //  using remove() to remove ne element
        for (Enquiry enquiry : enquiryQueue) {
            enquiry = enquiryQueue.remove();
            enquiry.getCustomer().reply("Have you tried restarting it ?");
        }

        //Using poll to remove it
        Enquiry enquiry;
        while ((enquiry = enquiryQueuePriority.poll()) != null) {
            enquiry.getCustomer().reply("Hey , How can i help you");
        }

        // TO look through elements -peek()
        Enquiry enquiryitem = enquiryQueue.peek();
        System.out.println("---" + enquiryitem.getCustomer() + "---" + enquiryitem.getCategory() + "---");


    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire(Customer.TYLER, Category.COMPUTER);
        helpDesk.enquire(Customer.SANSA, Category.IPAD);
        helpDesk.enquire(Customer.JACK, Category.PHONE);

        helpDesk.processEnquiries();
    }


}
