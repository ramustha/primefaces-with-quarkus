package com.ramusthastudio.sample.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class GetStartedBacking {
    private static final Logger LOG = LoggerFactory.getLogger(GetStartedBacking.class);

    private String data = "Loading...";

    @PostConstruct
    public void init() {
        LOG.debug("init...");
//        onLongRunning();
    }

    public void onLongRunning() {
        LOG.debug("long running...");

        try {
            data = "This Data Loaded";

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LOG.debug("long running done");
    }

    public String getData() {
        return data;
    }
}
