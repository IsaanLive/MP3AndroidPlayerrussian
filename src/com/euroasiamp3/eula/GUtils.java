package com.euroasiamp3.eula;

import android.content.Context;

import com.euroasia.ru.GooTracker;

public class GUtils {

	 private static GooTracker                       GTRACKER ;
	    
	    public static GooTracker getGTRACKER ( Context context ) {
	        if ( GTRACKER == null ) {
	            GTRACKER = new GooTracker ( context ) ;
	        }
	        return GTRACKER ;
	    }
	    
	    public static void setGTRACKER ( GooTracker gTRACKER ) {
	        GTRACKER = gTRACKER ;
	    }

}
