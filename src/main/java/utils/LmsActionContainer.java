package utils;

import action.StepsAction;
import common.SharedDriver;

public class LmsActionContainer {
    private SharedDriver sharedDriver;
    public StepsAction TicketNewAction;

    public LmsActionContainer() {
        sharedDriver = new SharedDriver();
        initPages();
    }


    private void initPages()
    {
        TicketNewAction = new StepsAction(sharedDriver);
    }

}


