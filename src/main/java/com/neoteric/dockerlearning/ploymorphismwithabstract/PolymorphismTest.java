package com.neoteric.dockerlearning.ploymorphismwithabstract;

public class PolymorphismTest {

    public static void main(String[] args) {
        AngularWebsite angularWebsite= new BookTicketPage();
        System.out.println(angularWebsite.page());
    }
}
