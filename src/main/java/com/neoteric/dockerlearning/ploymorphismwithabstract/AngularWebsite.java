package com.neoteric.dockerlearning.ploymorphismwithabstract;

public abstract class AngularWebsite implements WebSite {


    @Override
    public String header(){

        return "Header";

    }

//    @Override
//    public String body(){
//
//        return "body";
//
//    }


   public abstract  String  body();

    @Override
    public String footer(){
        return  "footer";
    }

    public String  page(){
        StringBuilder builder = new StringBuilder();

        builder.append(header());
        builder.append(body());

        builder.append(footer());
        return  builder.toString();

    }

}
