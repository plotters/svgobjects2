// Generated by the WOLips Templateengine Plug-in at Mar 20, 2008 11:37:22 PM


import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WODirectAction;
import com.webobjects.appserver.WORequest;
import com.webobjects.directtoweb.D2W;

public class DirectAction extends WODirectAction {

    public DirectAction(WORequest aRequest) {
        super(aRequest);
    }

    public WOActionResults defaultAction() {
        return D2W.factory().defaultPage(session());
    }

}