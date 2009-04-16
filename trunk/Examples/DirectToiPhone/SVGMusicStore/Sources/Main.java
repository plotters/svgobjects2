// Generated by the WebObjects Assistant Mon Mar 13 16:33:45 US/Pacific 2006

import com.webobjects.foundation.*;
import com.webobjects.directtoweb.*;
import com.webobjects.appserver.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;

public class Main extends WOComponent {
    protected String visibleEntityName;
    int index = 0;

    public Main(WOContext context) {
        super(context);
    }
    
    /*
     * accessors
     */
    public NSArray visibleEntityNames() {
        return D2W.factory().visibleEntityNames(session());
    }
    
    public String menuTitle() {
        return visibleEntityName + "s";
    }

    /*
     * actions
     */
    public WOComponent list() {
        D2WListPage nextPage = (D2WListPage) D2W.factory().listPageForEntityNamed(visibleEntityName, session());
        WODisplayGroup displayGroup = nextPage.displayGroup();
        EODataSource dataSource = new EODatabaseDataSource(session().defaultEditingContext(), visibleEntityName);

        // Initialize your component here
        nextPage.setDataSource(dataSource);
        
        return nextPage;
    }
}